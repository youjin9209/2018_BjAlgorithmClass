import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] d = new int[N+1];
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 1; i <= N; i++) {
			d[i] = A[i];
			for (int j = 1; j < i; j++) {
				if (A[i] > A[j] && d[i] < d[j] + A[i])
					 d[i] = d[j] + A[i];
			}
		}
		int max = 0;
		for(int i = 1; i <= N; i++) {
			if (max < d[i])
				max = d[i];
		}
		System.out.println(max);
	}
}
