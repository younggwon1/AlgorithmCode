package Implementation;
/**
 *  구현 : 시뮬레이션 & 완전 탐색
 */
import java.util.Scanner;

public class JavaAlgorism6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 공간의 크기 
		int N;
		System.out.println("공간의 크기 N을 입력하세요");
		N = sc.nextInt();
		// 이동할 계획서 작성
		System.out.println("이동할 계획서를 입력하세요");
		String plans = sc.next();
		
		// String -> Char 배열 선언
		char[] charArray = new char[plans.length()];
        for (int i = 0; i < plans.length(); i++) {
            charArray[i] = plans.charAt(i);
        }
		// 첫 위치
		int x=1, y=1;
		
		char[] moveTypes = {'L', 'R', 'U', 'D'};
		
		for(int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < moveTypes.length; j++) {
				if (charArray[i] == moveTypes[j]) {
					switch (moveTypes[j]) {
						case 'L':
							x = x;
							y = y-1;
							break;
						case 'R':
							x = x;
							y = y+1;
							break;	
						case 'U':
							x = x-1;
							y = y;
							break;
						case 'D':
							x = x+1;
							y = y;
							break;
					}
					if (x < 1 || y < 1 || x > N || y > N) {
						if(x < 1) {
							x+=1;
							y=y;
						}
						else if (y < 1) {
							x=1;
							y+=1;
						}
						else if (x > N) {
							x= N-1;
							y=y;
						}
						else if (y > N) {
							x=x;
							y=N-1;
						}
						continue;
					}
				}
			}

		}
		System.out.print("최종 x,y 좌표 : " + x + "," + y);	
	}
}	
	
//	  답지
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // N을 입력받기
//        int n = sc.nextInt();
//        sc.nextLine(); // 버퍼 비우기
//        String[] plans = sc.nextLine().split(" ");
//        int x = 1, y = 1;
//
//        // L, R, U, D에 따른 이동 방향 
//        int[] dx = {0, 0, -1, 1};
//        int[] dy = {-1, 1, 0, 0};
//        char[] moveTypes = {'L', 'R', 'U', 'D'};
//
//        // 이동 계획을 하나씩 확인
//        for (int i = 0; i < plans.length; i++) {
//            char plan = plans[i].charAt(0);
//            // 이동 후 좌표 구하기 
//            int nx = -1, ny = -1;
//            for (int j = 0; j < 4; j++) {
//                if (plan == moveTypes[j]) {
//                    nx = x + dx[j];
//                    ny = y + dy[j];
//                }
//            }
//            // 공간을 벗어나는 경우 무시 
//            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
//            // 이동 수행 
//            x = nx;
//            y = ny;
//        }
//
//        System.out.println(x + " " + y);
//    }
//}

