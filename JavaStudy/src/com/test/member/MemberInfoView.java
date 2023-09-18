package com.test.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberInfoView {
    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();// 동적 배열을 지원하는 Collector Framework
        list.add(new Member("김동규", "남성", 25));
        list.add(new Member("이동규", "여성", 26));
        list.add(new Member("박동규", "중성", 27));
        list.add(new Member("최동규", "삼성", 28));
        list.add(new Member("문동규", "가성", 29));

        for (Member member : list) {
            System.out.println(member.getName() + "\t" + member.getGender() + "\t" + member.getAge());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "\t" + list.get(i).getGender() +
                    "\t" + list.get(i).getAge());
        }

        List<Map<Integer, Integer>> listFruits = new ArrayList<>();

        int aa = 0;
        for (int i = 0; i < 3; i++) {
            Map<Integer, Integer> map = new HashMap<>();

            map.put(i, aa * 10);
            aa++;
            listFruits.add(map);
            System.out.println(listFruits.get(i).toString());
        }
    }
}
