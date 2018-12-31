import  java.io.*; //  header  file  -- package  import

public  class  FizzBuzz {
	
public static  BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

public  static  void  main(String [] args) throws NumberFormatException , IOException {

int  f = 0, b = 0, startNum = 0, endNum=0;  //values will be inputted by user

// get  user input

boolean valid=true;

while (valid) {

System.out.println("   JAVA FIZZBUZZ PROGRAM");

System.out.print("Enter Fizz number: ");
		
		f = Integer.parseInt(cin.readLine ());
		
		while (f<0) {  //handling negative num error
			System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
			f = Integer.parseInt(cin.readLine ());
		}
		
		if (f==0) {  //if f =0, quit
			System.out.print("\nThe end.\n");
			System.exit(0);
		}

System.out.print("Enter Buzz number: ");

		b = Integer.parseInt(cin.readLine ());
			
		while (b<0) {  //handling negative num error
			System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
			b = Integer.parseInt(cin.readLine ());
		}
		
		if (b==0) {  //if b = 0, quit
			System.out.print("\nThe end.\n");
			System.exit(0);
		}
		
System.out.print("Enter starting number: ");
	startNum = Integer.parseInt(cin.readLine ());
	
	System.out.print("Enter ending number: ");
	endNum = Integer.parseInt(cin.readLine ());

	while ((endNum - startNum) <0) {
		System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
		endNum = Integer.parseInt(cin.readLine ());
	}

System.out.println("");	
	
for (int i = startNum;i <= endNum; i++) {

	System.out.print(i+". ");
	
	if (i % f == 0 && i % b == 0) {
		System.out.println("FizzBuzz");
	}

	else if (i % f == 0) {
		System.out.println("Fizz");
	}
	
	else if (i % b == 0) {
		System.out.println("Buzz");
	}
	
	else {
		System.out.println(i);
	}
}

System.out.println("");

} // end of infinite while loop

} // end of main

} // end of class

