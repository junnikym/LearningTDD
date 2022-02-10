package name.junnikym.learningtdd.member.repository;

import name.junnikym.learningtdd.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {

}
