package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] str = test.toCharArray();
		for (int i = 0; i < str.length; i++) {

			if(i % 2 != 0) {
				char odd = Character.toUpperCase(str[i]);
				str[i] = odd;
				System.out.println(str[i]);
			}

		}System.out.println(String.valueOf(str));

	}

}
	