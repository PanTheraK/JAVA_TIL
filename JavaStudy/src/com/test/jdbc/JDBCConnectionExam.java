package com.test.jdbc;

import java.sql.*;
import java.util.*;

import com.test.member.Member;

public class JDBCConnectionExam {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String uri = "jdbc:oracle:thin:@localhost:1521:xe";
        String userid = "springdev";
        String userpw = "1234";
        String query = "select id, name, gender, age from tbl_test order by id desc";

        Connection con;
        Statement stmt;
        ResultSet rs;

        Class.forName("oracle.jdbc.driver.OracleDriver");// JDBC 드라이버를 로딩
        con = DriverManager.getConnection(uri, userid, userpw);// uri,userid,userpw 값으로 DB 연결 시도
        stmt = con.createStatement();// SQL이 실행 될수 있는 환경 생성
        rs = stmt.executeQuery(query); // SQL문을 실행해서 그 결과를 ResultSet이란 Colletion 객체에 담는다

        List<Member> list = new ArrayList<>();

        // rs.netx() --> DB에서 읽어와서 ResultSet에 저장된 값들을 한줄씩 읽고 더 이상 읽을 줄이 없으면 false를 리턴
        while (rs.next()) {
            list.add(new Member(rs.getInt("id"), rs.getString("name"), rs.getString("gender"), rs.getInt("age")));
        }
        for (Member member : list) {
            System.out.println(member.getId() + member.getName() + "\t" + member.getGender() + "\t" + member.getAge());
        }
    }
}
