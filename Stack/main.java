package Stack;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		stack obj=new stack(5);
		obj.push('a');
		obj.push('b');
		obj.push('c');
		obj.push('d');
		obj.push('e');
		

		
		//remove all objects by 
		while(!obj.isEmpty()) {
			System.out.println(obj.pop());
		}
		
		
		  System.out.print("Enter Your algorthgm :");
		  Scanner myObj = new Scanner(System.in); 
		  String algo=myObj.next();
	  
		
		checkBrackets test=new checkBrackets(algo);
        test.validationMethod();
	}

}
