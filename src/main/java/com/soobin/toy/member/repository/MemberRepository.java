package com.soobin.toy.member.repository;


import com.soobin.toy.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Member findByEmail(String email);
    List<Member> findAll();
}
