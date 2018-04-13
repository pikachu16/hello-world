class Test {
	
	public static void main(String args[])
	{
		System.out.println(getUpdatedMessage("Hello"));
		
	}
	
	public static String getUpdatedMessage(String s) {
		return s.concat(" World");
	}
}	