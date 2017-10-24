import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double total = input.nextDouble();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1:满50元，加2元换购百事可乐饮料瓶");
		System.out.println("2:满100元，加3元换购500ml可乐一瓶");
		System.out.println("3:满100元，加10元换购5公斤面粉");
		System.out.println("4:满200元，加10元换购1个苏泊尔炒菜锅");
		System.out.println("5:满200元，加20元换购欧莱雅爽肤水1瓶");
		System.out.println("0:不换购");
		System.out.print("请选择：");
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			if (total >= 50) {
				System.out.println("本次消费总金额：" + (total + 2));
				System.out.println("成功换购：百事可乐1瓶");
			} else
				System.out.println("未达到换购条件");
			break;
		case 2:
			if (total >= 100) {
				System.out.println("本次消费总金额：" + (total + 3));
				System.out.println("成功换购：500ml可乐一瓶");
			} else
				System.out.println("未达到换购条件");
			break;
		case 3:
			if (total >= 100) {
				System.out.println("本次消费总金额：" + (total + 10));
				System.out.println("成功换购：5公斤面粉");
			} else
				System.out.println("未达到换购条件");
			break;
		case 4:
			if (total >= 200) {
				System.out.println("本次消费总金额：" + (total + 10));
				System.out.println("成功换购：1个苏泊尔炒菜锅");
			} else
				System.out.println("未达到换购条件");
			break;
		case 5:
			if (total >= 200) {
				System.out.println("本次消费总金额：" + (total + 20));
				System.out.println("成功换购：欧莱雅爽肤水1瓶");
			} else
				System.out.println("未达到换购条件");
			break;
		case 0:
			System.out.println("不换购");
			break;
		default:
			System.out.println("选择不正确");

		}

	}

}
