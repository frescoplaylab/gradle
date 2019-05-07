public class StringWeaver {
	public static void main(String[] arg) {
		System.out.println("Gradle integration with jenkins\n"
				+ "-Gradle is an advanced general purpose build management system based on Groovy and Kotlin.\n"
				+ "-Gradle supports the automatic download and configuration of dependencies or other libraries.\n"
				+ "-It supports Maven and Ivy repositories for retrieving these dependencies which are specified in build.gradle file. This allows reusing the artifacts of existing build systems.\n"
				+ "Here is a String Weaver java program built using gradle which is to be integrated with jenkins."
				+ "-Strings must not be blank. If yes, then it returns -1 as string.\n"
				+ "-If s1 is greater than s2 in length, then it returns a concatenated string which looks like s2+s1+s2.\n" 
				+ "-If s1 is smaller than s2 in length, then it returns a concatenated string which looks like s1+s2+s1.\n"
				+ "-If s1 equal to s2 in length, then it returns a concatenated string which contains each character from both the Strings at the same position. "
				+ "For e.g.if s1= Hello  and s2 = Hello then result = HHeelloo");
		String s1 = "hlogal";
		String s2 = "el rde";
		StringWeaver sw = new StringWeaver();
		System.out.println("Output: "+sw.getWeavedString(s1, s2));
	}

	public String getWeavedString(String s1,String s2)
	{
		String res = "";
		if(s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0)
		{
			res = "-1";
		}
		else if(s1.length() > s2.length())
		{
			res = ""+s2+s1+s2;
		}
		else if(s1.length() < s2.length())
		{
			res = ""+s1+s2+s1;
		}
		else
		{
			for(int i = 0; i < s2.length(); i++)
			{	
					res += ""+s1.charAt(i) + s2.charAt(i);
			}
		}
		return res;
	}
}
