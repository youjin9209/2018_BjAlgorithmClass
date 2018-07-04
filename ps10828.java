import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps_10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int size = 0;
		int[] stack = new int[N];
		while(N-- > 0) {
			String[] token = bf.readLine().split(" ");
			String cmd = token[0];
			if (cmd.equals("push")) {
				int num = Integer.parseInt(token[1]);
				stack[size++] = num;
				//size++;
			} else if (cmd.equals("pop")) {
				if (size == 0) {
					System.out.println("-1");
				} else {
					System.out.println(stack[size-1]);
					size--;
				}
			} else if (cmd.equals("size")) {
				System.out.println(size);
			} else if (cmd.equals("empty")) {
				if (size == 0)
					System.out.println("1");
				else 
					System.out.println("0");
			} else if (cmd.equals("top")) {
				if (size == 0)
					System.out.println("-1");
				else
					System.out.println(stack[size-1]);
			}
		}
	}

}
