import java.io.*;

public class FileStreamIO {
	public static void thing() { // Just to test calling...
		System.out.println("thing");
		System.out.println(thang(22));
	}
	
	private static int thang(int myParm) {
		return myParm;
	}

	public static void charThing() throws IOException {
	    FileReader inputStream = null;
	    FileWriter outputStream = null;
	    System.out.println("In charThing");
	    try {
	        inputStream = new FileReader("xanadu.txt");
	        outputStream = new FileWriter("characteroutput.txt");
	    int c;
	    while ((c = inputStream.read()) != -1) {
	    	System.out.println(c);
	    	System.out.println((char)c);
            outputStream.write(c);
	    }
	    } finally {
	        if (inputStream != null) {
	            inputStream.close();
	        }
	        if (outputStream != null) {
	            outputStream.close();
	        }
	    }
	}
	
	public static void fileThing() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
	    System.out.println("In fileThing");
        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
	            while ((c = in.read()) != -1) {
	            	System.out.println(c);
	            	out.write(c);
            }
	        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

	public static void lineThing() throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = 
                new BufferedReader(new FileReader("xanadu.txt"));
            outputStream = 
                new PrintWriter(new FileWriter("characteroutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println(l);
            	outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}	

