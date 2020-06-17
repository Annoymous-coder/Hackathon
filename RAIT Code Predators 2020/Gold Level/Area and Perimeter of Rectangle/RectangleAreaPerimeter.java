import java.util.*;

public class RectangleAreaPerimeter {

	private float len = 0, wid = 0;

	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		len = sc.nextFloat();
		System.out.println("Enter width");
		wid = sc.nextFloat();
	}

	public Float getArea() {
		return (len * wid);
	}

	public Float getPerimeter() {
		return (2 * (len + wid));
	}

	public static void main(String args[]) {

		RectangleAreaPerimeter obj = new RectangleAreaPerimeter();
		obj.getData();
		System.out.println("The area of rectangle is " + obj.getArea());
		System.out.println("The perimeter of rectangle is "
				+ obj.getPerimeter());
	}

}
