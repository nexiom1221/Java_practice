package chapter02;

public class SignOperatorExample {
public static void main(String[] args) {
	
	int x = -100;
	int result1 = +x;
	int result2 = -x;
	System.out.println("result1=" + result1);
	System.out.println("result2=" + result2);
	
	byte b = 100;
	
	int result3 = -b;
	System.out.println("result3=" + result3);
	
	//--------------------------------------------
	
	int y = 10;
	int z;
	System.out.println("----------------");
	x++;
	++x;
	System.out.println("x=" + x);
	System.out.println("--------------------");
	y--;
	--y;
	System.out.println("y=" + y);
	System.out.println("----------------");
	z = x++;
	System.out.println("z=" + z);
	System.out.println("x=" + x);
	System.out.println("----------------");
	z = ++x;
	System.out.println("z=" + z);
	System.out.println("x=" + x);
	System.out.println("----------------");
	z= ++x + y++;
	System.out.println("z=" +z);
	System.out.println("x=" +x);
	System.out.println("y=" +y);
	
}
}
