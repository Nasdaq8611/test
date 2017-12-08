package realCodilityTest;

import java.util.Stack;

public class StackMachineEmulatorReady {

	public static void main(String[] args) {
		String input0 = "13 DUP 4 POP 5 DUP + DUP + -";
		String input1 = "5 6 + -";
		String input2 = "3 DUP 5 - -";
		String input3 = "-";
		String[] splittedList0 = input0.split(" ");
		String[] splittedList1 = input1.split(" ");
		String[] splittedList2 = input2.split(" ");
		String[] splittedList3 = input3.split(" ");
		System.out.println("Stack Machine : " + stack_machine_emulator(splittedList0));
		System.out.println("Stack Machine : " + stack_machine_emulator(splittedList1));
		System.out.println("Stack Machine : " + stack_machine_emulator(splittedList2));
		System.out.println("Stack Machine : " + stack_machine_emulator(splittedList3));
	}

	public static int stack_machine_emulator(String[] splittedList) {
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < splittedList.length; i++) {
			String curr = splittedList[i];
			if (isInteger(curr, 10)) {
				st.push(Integer.valueOf(curr));
			} else {
				if (st.size() >= 1) {
					if (curr.equals("POP")) {
						st.pop();
					} else if (curr.equals("DUP")) {
						Integer duplicate = st.pop();
						st.push(duplicate);
						st.push(duplicate);
					}
				}
				if (st.size() > 1) {
					if (curr.equals("+")) {
						st.push(st.pop() + st.pop());
					} else if (curr.equals("-")) {
						st.push(st.pop() - st.pop());
					}
				} else {
					return -1;
				}
			}

		}

		return st.pop();

	}

	public static boolean isInteger(String s, int radix) {
		if (s.isEmpty())
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) == '-') {
				if (s.length() == 1)
					return false;
				else
					continue;
			}
			if (Character.digit(s.charAt(i), radix) < 0)
				return false;
		}
		return true;
	}

}
