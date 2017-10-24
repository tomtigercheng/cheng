import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三个边长：");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if ((side1 + side2 > side3) && (side1 + side3 > side2)
				&& (side2 + side3 > side1)) {
			System.out.println("这三个数字可以组成一个三角形");
		} else
			System.out.println("不能组成三角形");
	}

}
