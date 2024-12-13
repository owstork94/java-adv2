package io.member.impl;

import io.member.Member;

import java.util.ArrayList;
import java.util.List;

public class MemoryMemberRepository implements io.member.MemberRepository {

    private List<Member> members = new ArrayList<>();

    @Override
    public void add(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> findAll() {
        return members;
    }
}
