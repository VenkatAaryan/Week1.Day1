package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] test = text.split(" ");
		int length = test.length;
		for (int i = 0; i < length; i++) {
			count=0;
			for (int j = i+1; j < length; j++) {
				if(test[i].equals(test[j])) 
					count++;
				if(count>1)
				text = text.replace(test[i], "");
			}
		}System.out.println(text);
	}
}
