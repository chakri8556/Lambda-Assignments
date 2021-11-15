package lambda;

public interface Intref {
	public void cal(int a, int b) ;
	

}

package lambda;

public class Caluculator {

	public static void main(String[] args) {
		System.out.println("Addition of Numbers");
		Intref i = (a,b)->System.out.println(a+b);
		i.cal(5, 6);
		i.cal(5, 5);
		System.out.println("Subtraction of Numbers");
		Intref i1 = (a,b)->System.out.println(a-b);
		i1.cal(6, 5);
		i1.cal(5, 5);
		System.out.println("Multiplication of Numbers");
		Intref i2 = (a,b)-> System.out.println(a*b);
		i2.cal(5, 6);
		i2.cal(5, 5);
		System.out.println("Division of Numbers");
		Intref i3 = (a,b)->System.out.println(a/b);
		i3.cal(10, 2);
		i3.cal(100, 10);

	}


}
