import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入工资：");
		double income = input.nextDouble();
		if (income < 3500)
			System.out.println("你不用交税");
		else if (income <= 8000)
			System.out.println("你需要交的税是：" + (income - 3500) * 0.05);
		else if (income <= 15000)
			System.out.println("你需要交的税是:"
					+ ((income - 8000) * 0.1 + 4500 * 0.05));
		else
			System.out.println("你需要交的税是："
					+ ((income - 15000) * 0.15 + 7000 * 0.1 + 4500 * 0.05));

	}

}
