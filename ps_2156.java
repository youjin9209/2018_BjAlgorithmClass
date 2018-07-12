import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[10001];
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		int[] d = new int[10001];
		d[1] = a[1];
		d[2] = a[1] + a[2];
		for (int i = 3; i <= n; i++) {
			if (d[i] < d[i-1]);
				d[i] = d[i-1];
			if (d[i] < d[i-2] + a[i])
				d[i] = d[i-2] + a[i];
			if (d[i] < d[i-3] + a[i-1] + a[i])
				d[i] = d[i-3] + a[i-1] + a[i];
			
		}
		System.out.println(d[n]);
	}
}
