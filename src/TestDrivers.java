import java.io.IOException;
import java.util.Random;
import java.lang.System;

public class TestDrivers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int KEYS = 88;
		int myKeys = 89;
		char myChar;
		System.out.println("Literal strings\n" +
				"in double quotes");
		System.out.println("I want\t" + (1 + 2) + "\tcarrots");
		System.out.println("A piano has " + KEYS + " keys...!");
        myKeys = 89;
		System.out.println("A piano has " + myKeys + " keys...!");
		myChar = 'q';
		System.out.println(myChar);
		System.out.println("Specials:" );
		System.out.println("Modulo: " + (float)(5 % 2));
		System.out.println("Division: " + ( 5 / 2.2));
		System.out.println("Unary +: " + ( -5));
        String name;
        name = new String("Here's the string...");    
        System.out.println(name);
        System.out.println(name.substring(0, 3));
        System.out.println(name.concat(" - Bob"));
        System.out.println(name.concat(" - Bob").toLowerCase());
        System.out.println(name.concat(" - Bob").equals("boob"));
        System.out.println(name.concat(" - Bob").length());
        System.out.println(name.concat(" - Bob").replace("o", "a"));
        String new_name;
        new_name = new String(name.concat(" - Bob").toLowerCase());
        System.out.println(new_name);
        int num1;
        float num2;
        Random generator = new Random();
        
        for(int i = 0; i < 0; i = i + 1)
        {
        	{
        		try {
        			num1 = generator.nextInt();
        			Thread.sleep(50);
        		    System.out.println("Next Integer: " + Math.abs(num1%10));
        		} catch (InterruptedException e) {
        		// TODO Auto-generated catch block
        		    e.printStackTrace();
        		}
        	}
        }
		FileStreamIO.thing();
		System.out.println(System.getProperty("user.dir"));
        System.out.println("End Program!");
        try {
			FileStreamIO.fileThing();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        try {
			FileStreamIO.charThing();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
        try {
			FileStreamIO.lineThing();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
	}

}
