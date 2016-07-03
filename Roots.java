import java.util.Scanner;


public class Roots {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		double Number  = userinput.nextDouble();
		
		double SquareRoot = Math.sqrt(Number);
		System.out.println("Square Root= " + SquareRoot);
		
		double CubeRoot = Math.cbrt(Number);
		System.out.println("Cube Root= " + CubeRoot);
		
		// TODO Auto-generated method stub
      
      
	}

}
