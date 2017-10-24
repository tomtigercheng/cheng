import java.util.Scanner;

public class Prize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入四位会员号：");
		int Num = input.nextInt();
		int Sum = Num % 10 + Num / 10 % 10 + Num / 100 % 10 + Num / 1000 % 10;
		if (Sum > 24)
			System.out.println("恭喜您，您中奖了，奖品是一台彩电");
		else if (Sum > 20)
			System.out.println("恭喜您，您中奖了，奖品是一部电吹风");
		else if (Sum > 16)
			System.out.println("恭喜您，您中奖了，奖品是一包餐巾纸");
		else
			System.out.println("下次继续努力");
	}

}
