package name.junnikym.learningtdd.member.repository;

import name.junnikym.learningtdd.member.repository.MemberRepository;
import name.junnikym.learningtdd.util.TestContainerIntegrationTest;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @DataJpaTest : JPA Repository 에 대한 빈들을 등록
 *
 * 테스트를 하기 위해 테스트 컨텍스트를 잡아 주어야한다
 *  |
 *  |  @DataJpaTest는 내부적으로 @ExtendWith(SpringExtension.class) Annotation을 가지고있다.
 *  |  따라서 아래 코드에는 따로 테스트 컨텍스트에 관한 선언이 없음.
 *  |
 *  |  @DataJpaTest는 @Transactional Annotation이 존재한다.
 *  |  별도로 Transaction Annotation을 선언이 없어도 작동
 *
 */

@DataJpaTest
public class MemberRepositoryTest extends TestContainerIntegrationTest {

	@Autowired
	private MemberRepository memberRepository;

	@Test
	@DisplayName("Member Repository가 Null이 아닐 경우")
	public void MemeberRepositoryIsNotNull() {
		assertThat(memberRepository).isNotNull();
	}

}
