import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("1.登陆系统");
		System.out.println("2.退出");
		int loginChoose = input.nextInt();
		switch (loginChoose) {
		case 1:
			System.out.println("1.客户信息管理");
			System.out.println("2.购物结算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销购物结算");
			int SecondChoose = input.nextInt();
			switch (SecondChoose) {
			case 1:

				System.out.println("购物管理系统>客户信息管理");
				System.out.println("1.显示所有客户信息");
				System.out.println("2.添加客户信息");
				System.out.println("3.修改客户信息");
				System.out.println("4.查询客户信息");
				break;
			case 2:
				System.out.println("购物结算");
				break;
			case 3:
				System.out.println("购物管理系统>真情回馈");
				System.out.println("1.幸运大放送");
				System.out.println("2.幸运抽奖");
				System.out.println("3.生日问候");
				break;
			case 4:
				System.out.println("注销购物结算");
				break;

			}
			break;
		case 2:
			System.out.println("退出");
			break;
		}
	}

}
