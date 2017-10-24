import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用Myshopping购物管理系统");
		System.out.println("************************");
		System.out.println("1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销");
		System.out.println("************************");
		int choose = 0;
		boolean flag = false;
		do {

			System.out.print("请选择输入数字：");
			choose = input.nextInt();
			if (choose < 1 || choose > 4) {
				flag = true;

				System.out.println("输入错误，请重新输入数字");
			} else
				break;

		} while (flag == true);
		switch (choose) {
		case 1:
			System.out.println("客户信息管理");
			break;
		case 2:
			System.out.println("购物结算");
			break;
		case 3:
			System.out.println("真情回馈");
			break;
		case 4:
			System.out.println("注销");
			break;
		}
		System.out.println("程序结束");

	}

}
