package codilityDemoTest;

import java.util.HashMap;
import java.util.Map;

public class BinaryGap {

	public static void main(String[] args) {
		//int n = 2147483646;
		//solution(n);
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 2);
		map.get(1);
		Integer i = new Integer(1);
		i.hashCode();
		Integer.hashCode(1);
		map.hashCode();
		
	}

	private static void solution(int n) {

		char[] strArray = Integer.toBinaryString(n).toCharArray();
		System.out.println(strArray);
		int buffCount = 0;
		int count = 0;
		for (int i = 0; i < strArray.length; i++) {
			char c = strArray[i];
			if(c=='0'){
				buffCount++;
			}else{
				if(count<buffCount){
					count = buffCount;
					buffCount = 0;
				}
			}
			
		}
		System.out.println(count);
	}

}
