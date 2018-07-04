/*
괄호 9012
stack 구현안하고 zerosum 방식으로 품 
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		while(N-- > 0) {
			String[] token = bf.readLine().split("");
			int size = token.length;
			int count = 0;
			for (int i = 0; i < size; i++) {
				if (token[i].equals("(")) { // push
					count++;
				} else if (token[i].equals(")")) { // pop
					if (count == 0) {
						count++;
						break;
					} else {
						count--;
					}
				}
			}
			if (count == 0) // only if zero sum
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
