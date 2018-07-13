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
		int[] d1 = new int[N+1]; // incresing
		int[] d2 = new int[N+1]; // decreasing
		
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			d1[i] = 1;
			for (int j = 1; j < i; j++) {
				if (A[i] > A[j] && d1[i] < d1[j] + 1)
					d1[i] = d1[j] + 1;
			}
		}
		for (int i = N; i >= 1; i--) {
			d2[i] = 1;
			for (int j = N; j > i; j--) {
				if (A[i] > A[j] && d2[i] < d2[j] + 1)
					d2[i] = d2[j] + 1;
			}
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			if (max < d1[i] + d2[i] - 1)
				max = d1[i] + d2[i] - 1;
		}

		System.out.println(max);
	}
}
