package AIngang;

public class BigOAlgorism {

	public static void main(String[] args) {
		
		int n = 10;
		// 합을 기록할 변수를 만들고 0을 저장
		int sum = 0;
		
		// n을 1부터 1씩 증가하면서 반복
		for (int i = 1; i <= n; i++) {
			// 반복문 안에서 합을 기록할 변수에 1씩 증가된 값을 더함
			sum += i;
		}
		// 반복문이 끝나면 합을 출력
		System.out.println(sum);
	}
}
