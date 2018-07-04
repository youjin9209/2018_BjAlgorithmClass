import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ps_1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] line = bf.readLine().split("");
		int len = line.length;
		int N = Integer.parseInt(bf.readLine());
		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		for(int i = 0; i < len; i++) {
			left.push(line[i]);
		}
		while(N-- > 0) {
			String[] token = bf.readLine().split(" ");
			String cmd = token[0];
			if (cmd.equals("L")) {
				if (left.isEmpty())
					continue;
				else
					right.push(left.pop());
			} else if (cmd.equals("D")) {
				if (right.isEmpty())
					continue;
				else
					left.push(right.pop());
			} else if (cmd.equals("B")) {
				if (left.isEmpty())
					continue;
				else
					left.pop();
			} else if (cmd.equals("P")) {
				String a = token[1];
				left.push(a);
			}
		}
		// left -> right
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		StringBuilder sb = new StringBuilder();
		// right 
		while(!right.isEmpty()) {
			sb.append(right.pop());
		}
		System.out.println(sb);
	}
}
