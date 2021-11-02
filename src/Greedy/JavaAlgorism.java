package Greedy;
/**
 * 그리디 알고리즘
 * 당신은 음식점의 계산을 도와주는 점원입니다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정합니다.
   손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어야 할 동전의 최소 개수를 구하세요.
   단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.
 */
import java.util.Scanner;

public class JavaAlgorism {

	public static void main(String[] args) {

		int N;
		int cnt = 0; // 동전의 최소 개수를 나타내는 변수
		int[] coinTypes = {500, 100, 50, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 N을 입력하세요");
		N = sc.nextInt();
		if ((N % 10 == 0) && (N > 1)) {
			for (int i = 0; i < 4; i++) {
				cnt += N/coinTypes[i];
				N %= coinTypes[i];
			}
		System.out.println(cnt);
		}
		else {
			System.out.print("정수 N은 10의 배수가 아니거나 1보다 크지 않습니다.");
		}
		
	}

}
