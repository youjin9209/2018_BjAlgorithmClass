import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ps_1912 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] a = new int[N+1];
		String[] token = bf.readLine().split(" ");
		for(int i = 1; i <= N; i++) {
			a[i] = Integer.parseInt(token[i-1]);
		}
		int[] d = new int[N+1];
		d[1] = a[1];
		for (int i = 2; i <= N; i++) {
			d[i] = a[i];
			if (a[i] < d[i-1] + a[i])
				d[i] = d[i-1] + a[i];
		}
		int max = -1000;
		for (int i = 1; i <= N; i++) {
			if (max < d[i])
				max = d[i];
		}
		System.out.println(max);
	}
}
