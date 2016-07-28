package p048;

public class Main {

	public static void main(String[] args) {
		// 1-1
		{
			StringBuilder sb = new StringBuilder();
			for(int i=1; i<=100;++i)
			{
				String	s =Integer.toString(i) + ',';
				sb.append(s);
			}
			String allNumber = sb.toString();
			System.out.println(allNumber);

			String[] a = allNumber.split(",");
			for(String word: a)
			{
				System.out.println(word);
			}
		}
	}

}
