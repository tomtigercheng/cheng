import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Myshopping管理系统>购物结算");
		System.out.println("***********************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤   2.网球鞋  3.网球拍");
		System.out.println("***********************");
		String answer = "y";
		while (answer.equals("y") || answer.equals("Y")) {
			System.out.print("请输入商品编号：");
			int ProNum = input.nextInt();
			switch (ProNum) {
			case 1:
				System.out.println("T恤    ￥245.0");
				break;
			case 2:
				System.out.println("网球鞋  ￥570.0");
				break;
			case 3:
				System.out.println("网球拍  ￥120.0");
				break;
			}

			System.out.println("程序结束!");
		}
	}
}
