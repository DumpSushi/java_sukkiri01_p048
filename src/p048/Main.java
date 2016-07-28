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

		// 1-2
		{
			String[] folders = new String[2];
			folders[0] = new String("c:\\javadev");
			folders[1] = new String("c:\\user\\");
			String file = new String("readme.txt");
			for(String s: folders)
			{
				String path = s;
				String fullPath = null;
				if(path.endsWith("\\"))
				// これダメだった。if(path.matches("\\$"))
				{
				}
				else
				{
					fullPath = path + "\\";
				}
				fullPath = fullPath + file;
				System.out.println(fullPath);
			}
		}
	}

}
