package j17_컬렉션;

public class CustomList {

	public static void main(String[] args) {
		String[] names = new String[0];
		
		names = new String[1];
		
		names[0] = "김준일";
		
		printNames(names);
		
		
		String[] tempNames = new String[2];
		tempNames[0] = names[0];
		
		names = new String[2];
		names[0] = tempNames[0];
		names[1] = "김준이";
		
		printNames(names);

	}
	
	public static void printNames(String[] names) {
		for(String name : names) {
			System.out.println(name);
		}
	}

}





