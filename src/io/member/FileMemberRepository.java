package io.member;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileMemberRepository implements MemberRepository{

    private static final String FILE_PATH = "temp/members-txt.dat";
    private static final String DELIMITER = ",";

    @Override
    public void add(Member member) {
    try(
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH,StandardCharsets.UTF_8, true));
            )
    {
        bw.write(member.getId()+DELIMITER+member.getName()+DELIMITER+member.getAge());
        bw.newLine();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
