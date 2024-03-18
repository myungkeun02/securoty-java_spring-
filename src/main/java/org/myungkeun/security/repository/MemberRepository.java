package org.myungkeun.security.repository;

import org.myungkeun.security.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);

    Optional<Member> findByName(String name);

    Optional<Member> findByEmailOrName(String email, String name);

    Boolean existsByEmail(String email);

    Boolean existsByName(String name);
}
