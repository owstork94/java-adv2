package io.member.impl;

import io.member.Member;
import io.member.MemberRepository;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectMemberRepository implements MemberRepository {

    private static final String FILE_PATH = "temp/members-obj.dat";
    @Override
    public void add(Member member) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))){
//            new Member
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
