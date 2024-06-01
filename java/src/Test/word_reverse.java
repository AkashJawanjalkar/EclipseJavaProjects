package Test;

public class word_reverse {
	public static void main(String[] args) {

		String str = " abcd is best programing language";

		StringBuffer bf = new StringBuffer(str);

		int start = 0, end = bf.length() - 1, next;
		// bf.reverse()

		while (start < end) {
			char temp = bf.charAt(start);
			bf.setCharAt(start, bf.charAt(end));
			bf.setCharAt(end, temp);
			start++;
			end--;

		}

		System.out.println("Reverse String :" + bf);
		start = 0;
		 
		for (int i = 0;  i<str.length(); i++) {
			if (bf.charAt(i) == ' '|| i==bf.length()) {
				end = i - 1;
				next = i + 1;

				while (start < end) {
					char temp = bf.charAt(start);
					bf.setCharAt(start, bf.charAt(end));
					bf.setCharAt(end, temp);
					start++;
					end--;
				}
				start = next;
			}
		}
		System.err.println("Word reverse String is :" + bf);

	}
}
