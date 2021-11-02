package Greedy;
/**
 * 그리디 알고리즘
 * <문제> 1이 될 때까지
 */
import java.util.Scanner;

public class JavaAlgorism2 {

	public static void main(String[] args) {

		int n;
		int k;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 N을 입력하세요");
		n = sc.nextInt();

		System.out.println("정수 K을 입력하세요");
		k = sc.nextInt();
		
        while (true) {
            // N이 k로 나누어 떨어지는 수가 될 때까지 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }
        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println(result);

		
	}

}
