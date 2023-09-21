package com.test.string;

public class StringBufferExam {
    public static void main(String[] args) {
        // StringBuffer는 대용량 데이터 처리와 멀티 쓰래드 환경에서 우수한 성능을 발휘
        // StringBuilder 는 StringBuffer보다는 멀티쓰래드 환경에서의 안정성은 다소 낮이만 StringBuffer보다 성능이 우수
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("My World");
        String result1 = stringBuffer.toString();
        System.out.println(result1);

        stringBuffer.insert(0, "Everyone,");
        String result2 = stringBuffer.toString();
        System.out.println(result2);

        String result3 = stringBuffer.substring(0, 8);
        System.out.println(result3);
    }
}
