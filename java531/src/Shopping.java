import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Myshopping����ϵͳ>�������");
		System.out.println("***********************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��   2.����Ь  3.������");
		System.out.println("***********************");
		String answer = "y";
		while (answer.equals("y") || answer.equals("Y")) {
			System.out.print("��������Ʒ��ţ�");
			int ProNum = input.nextInt();
			switch (ProNum) {
			case 1:
				System.out.println("T��    ��245.0");
				break;
			case 2:
				System.out.println("����Ь  ��570.0");
				break;
			case 3:
				System.out.println("������  ��120.0");
				break;
			}

			System.out.println("�������!");
		}
	}
}
