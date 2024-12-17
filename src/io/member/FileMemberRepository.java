package io.member;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
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
        List<Member> memberList = new ArrayList<>();
        //읽어서 insert

        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH,StandardCharsets.UTF_8))
                ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] memberData = line.split(DELIMITER);
                System.out.println("member data : " + memberData[1]);
                memberList.add(new Member(memberData[0], memberData[1], Integer.parseInt(memberData[2])));
            }
            return memberList;
        }catch (FileNotFoundException e){
            return new ArrayList<>();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
