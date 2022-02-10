package rakshitha;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReaderDemo{
	 public static void main(String[] args)throws IOException {

	        int sum;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter First Number: ");
	        int x = Integer.parseInt(br.readLine());
	        System.out.println("Enter Second Number: ");
	        int y = Integer.parseInt(br.readLine());
	        sum = x + y;
	        System.out.println("Sum of these numbers: "+sum);
	    }
} 
