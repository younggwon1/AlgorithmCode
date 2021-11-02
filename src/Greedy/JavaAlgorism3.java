package Greedy;
/**
 * 그리디 알고리즘
 * <문제> 곱하기 혹은 더하기
 */
import java.util.Scanner;

public class JavaAlgorism3 {

	public static void main(String[] args) {

		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 str을 입력하세요");
		str = sc.next();
		
		String[] digits = str.split("(?<=.)");

		int strToInt = Integer.valueOf(digits[0]);
		
        for(int i = 1; i < digits.length; i++) {
        	
//        	System.out.println(Integer.valueOf(digits[i]));
        	
            if (Integer.valueOf(digits[i]) == 0 || Integer.valueOf(digits[i]) == 1 || strToInt == 0 || strToInt == 1) {
            	strToInt += Integer.valueOf(digits[i]);
            }
            else {
            	strToInt *= Integer.valueOf(digits[i]);
            }
            System.out.println(strToInt);
        }
        
        
// 답지    
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
//        // 첫 번째 문자를 숫자로 변경한 값을 대입
//        long result = str.charAt(0) - '0';
//        for (int i = 1; i < str.length(); i++) {
//            // 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
//            int num = str.charAt(i) - '0';
//            if (num <= 1 || result <= 1) {
//                result += num;
//            }
//            else {
//                result *= num;
//            }
//            System.out.println(result);
//        }
		
	}

}
