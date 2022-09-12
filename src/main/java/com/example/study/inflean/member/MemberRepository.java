package com.example.study.inflean.member;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {

        // Command Query Separation 원칙에 따라 id값만 리턴함.
        // 커맨드와 쿼리를 분리해라.
        em.persist(member);
        return member.getId();
    }

    public Member findById(Long id) {
        return em.find(Member.class, id);

    }
}
