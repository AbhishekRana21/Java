import java.util.Scanner;

class NoMatchException extends Exception{
	NoMatchException(String message){
		super(message);
	}
}

public class nme{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try{
			if(!s.equals("India")){
				throw new NoMatchException("Not matching!");
			}
			else{
				System.out.println("Matching!");
			}
		}
		catch(NoMatchException e){
			System.out.println("Caught Exception");
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Completed");
		}
	}
}
