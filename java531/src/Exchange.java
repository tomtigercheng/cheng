import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ѽ�");
		double total = input.nextDouble();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1:��50Ԫ����2Ԫ�������¿�������ƿ");
		System.out.println("2:��100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3:��100Ԫ����10Ԫ����5�������");
		System.out.println("4:��200Ԫ����10Ԫ����1���ղ������˹�");
		System.out.println("5:��200Ԫ����20Ԫ����ŷ����ˬ��ˮ1ƿ");
		System.out.println("0:������");
		System.out.print("��ѡ��");
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			if (total >= 50) {
				System.out.println("���������ܽ�" + (total + 2));
				System.out.println("�ɹ����������¿���1ƿ");
			} else
				System.out.println("δ�ﵽ��������");
			break;
		case 2:
			if (total >= 100) {
				System.out.println("���������ܽ�" + (total + 3));
				System.out.println("�ɹ�������500ml����һƿ");
			} else
				System.out.println("δ�ﵽ��������");
			break;
		case 3:
			if (total >= 100) {
				System.out.println("���������ܽ�" + (total + 10));
				System.out.println("�ɹ�������5�������");
			} else
				System.out.println("δ�ﵽ��������");
			break;
		case 4:
			if (total >= 200) {
				System.out.println("���������ܽ�" + (total + 10));
				System.out.println("�ɹ�������1���ղ������˹�");
			} else
				System.out.println("δ�ﵽ��������");
			break;
		case 5:
			if (total >= 200) {
				System.out.println("���������ܽ�" + (total + 20));
				System.out.println("�ɹ�������ŷ����ˬ��ˮ1ƿ");
			} else
				System.out.println("δ�ﵽ��������");
			break;
		case 0:
			System.out.println("������");
			break;
		default:
			System.out.println("ѡ����ȷ");

		}

	}

}
