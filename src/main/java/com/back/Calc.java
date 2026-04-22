package com.back;

public class Calc {


    public static int run(String mathEx) { // mathEx 계산할 문자열
        // 내부 재귀 계산 함수 호출
        return calc(mathEx);
    }

    private static int calc(String exp) {

        if (!exp.contains(" + ") && !exp.contains(" - ")) {  // 종료조건 : 더이상 + 가 없으면 정수로 변환해서 반환해라
            return Integer.parseInt(exp);
        }
        if (exp.contains(" + ")) {
            String[] parts = exp.split(" \\+ ", 2);
            // 처음 " + " 기준으로 문자열을 두개로 분리
            // ex)   1 + 2 + 3 -> 1, 2 + 3
            int left = Integer.parseInt(parts[0]); // 1

            int right = calc(parts[1]);

            return left + right;
        }

        if (exp.contains(" - ")) {
            String[] parts = exp.split(" \\- ", 2);
            // 처음 " + " 기준으로 문자열을 두개로 분리
            // ex)   1 + 2 + 3 -> 1, 2 + 3
            int left = Integer.parseInt(parts[0]); // 1

            int right = calc(parts[1]);

            return left - right;
        }
        return 0;
    }

}