package codilityDemoTest;

import java.util.Stack;

public class StackMachineEmulatorReady {

	public static void main(String[] args) {
		String input0 = "13+62*7+*";

		String input1 = "13+62*7++";

		System.out.println("Stack Machine : " + stack_machine_emulator(input0));

		System.out.println("Stack Machine : " + stack_machine_emulator(input1));
	}

	public static int stack_machine_emulator(String s) {
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (curr - '0' >= 0)
			{
				st.push(curr - '0');
			} else if (st.size() >= 2)
			{
				if (curr - '0' == -5)// +
				{
					st.push(st.pop() + st.pop());
				} else// *
				{
					st.push(st.pop() * st.pop());
				}
			} else {
				return -1;
			}
		}

		if (st.size() == 1)
			return st.pop();

		return -1;
	}

}
