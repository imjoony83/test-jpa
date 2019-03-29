package com.github.imjoony83.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.imjoony83.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
