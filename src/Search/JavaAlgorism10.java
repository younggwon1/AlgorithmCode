package Search;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Queue;
/**
 *  그래프 탐색 알고리즘: DFS/BFS
 *  큐
 */
import java.util.Scanner;
import java.util.Stack;

public class JavaAlgorism10 {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		
		// 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
		
		queue.offer(5);
		queue.offer(2);
		queue.offer(3);
		queue.offer(7);
		queue.poll();
		queue.offer(1);
		queue.offer(4);
		queue.poll();
		
		// 큐의 먼저들어온 원소부터 추출
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
		
	}
}	


	



