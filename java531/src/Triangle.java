import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����������߳���");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if ((side1 + side2 > side3) && (side1 + side3 > side2)
				&& (side2 + side3 > side1)) {
			System.out.println("���������ֿ������һ��������");
		} else
			System.out.println("�������������");
	}

}
