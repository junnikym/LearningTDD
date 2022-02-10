package name.junnikym.learningtdd.util;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;

@SpringBootTest
@Testcontainers
@ActiveProfiles("junit-test")
public abstract class TestContainerIntegrationTest {

	static final DockerComposeContainer composeContainer;

	static {
		composeContainer = new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"));
		composeContainer.start();
	}

}
