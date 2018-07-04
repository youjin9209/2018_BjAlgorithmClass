/*
쇠막대기 - 10799
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps_10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] token = bf.readLine().split("");
		int size = token.length;
		int count = 0;
		int s = 0;
		int temp = 1;
		for(int i = 1; i <= size; i++) {
			if (token[i-1].equals("(")) {
				temp = i;
				s++; //push
			} else if (token[i-1].equals(")")) {
				s--; //pop
				if (i-temp == 1)  // index dif == 1			
					count += s;
				else 
					count += 1;
			}
		}
		System.out.println(count);
	}
}
