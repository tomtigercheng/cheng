import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭʹ��Myshopping�������ϵͳ");
		System.out.println("************************");
		System.out.println("1.�ͻ���Ϣ����\n2.�������\n3.�������\n4.ע��");
		System.out.println("************************");
		int choose = 0;
		boolean flag = false;
		do {

			System.out.print("��ѡ���������֣�");
			choose = input.nextInt();
			if (choose < 1 || choose > 4) {
				flag = true;

				System.out.println("���������������������");
			} else
				break;

		} while (flag == true);
		switch (choose) {
		case 1:
			System.out.println("�ͻ���Ϣ����");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("�������");
			break;
		case 4:
			System.out.println("ע��");
			break;
		}
		System.out.println("�������");

	}

}
