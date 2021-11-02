package Implementation;
import java.text.SimpleDateFormat;
/**
 *  구현 : 시뮬레이션 & 완전 탐색
 *  <문제> 시각
 */
import java.util.Scanner;

public class JavaAlgorism5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// count
		int cnt = 0;
		
		// 시간
		int N;
		System.out.println("시간(정수) N을 입력하세요");
		N = sc.nextInt();
		
		// 00시 00분 00초 ~ N시 59분 59초 사이 시간에 3이 포함된 시간의 count
		
		if (N >=0 && N <=23) {
			System.out.print("로직 진행!!!!!");
			for(int h = 0; h < N+1; h++) {
				for(int m = 0; m < 60; m++) {
					for(int s = 0; s < 60; s++) {
						if (h%10==3 || m%10==3 || m / 10 == 3 || s / 10 == 3 || s%10==3) {
							cnt++;
						}
					}
				}
			}
			
		}
		else {
			System.out.print(" 0 <= N <= 23 사이의 숫자를 입력하세요.");
		}
		System.out.print(cnt);
	}
}	

// 답지
//// 특정한 시각 안에 '3'이 포함되어 있는지의 여부
//public static boolean check(int h, int m, int s) {
//    if (h % 10 == 3 || m / 10 = 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
//        return true;
//    return false;
//}
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    // H를 입력받기
//    int h = sc.nextInt();
//    int cnt = 0;
//    for (int i = 0; i <= h; i++) {
//        for (int j = 0; j < 60; j++) {
//            // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
//            if (check(i, j, k)) cnt++;
//        }
//    }
//    System.out.println(cnt);
//}
//}
	



