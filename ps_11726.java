/*
왜 d[2] = 2; 를 추가하면 런타임에러가 날까 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps_11726 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] d = new int[n+1];
		d[0] = 1;
		d[1] = 1;
		//d[2] = 2;
		for (int i = 2; i <= n; i++) {
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007;
		}
		System.out.println(d[n]);
	}
}
