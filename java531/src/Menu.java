import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("1.��½ϵͳ");
		System.out.println("2.�˳�");
		int loginChoose = input.nextInt();
		switch (loginChoose) {
		case 1:
			System.out.println("1.�ͻ���Ϣ����");
			System.out.println("2.�������");
			System.out.println("3.�������");
			System.out.println("4.ע���������");
			int SecondChoose = input.nextInt();
			switch (SecondChoose) {
			case 1:

				System.out.println("�������ϵͳ>�ͻ���Ϣ����");
				System.out.println("1.��ʾ���пͻ���Ϣ");
				System.out.println("2.��ӿͻ���Ϣ");
				System.out.println("3.�޸Ŀͻ���Ϣ");
				System.out.println("4.��ѯ�ͻ���Ϣ");
				break;
			case 2:
				System.out.println("�������");
				break;
			case 3:
				System.out.println("�������ϵͳ>�������");
				System.out.println("1.���˴����");
				System.out.println("2.���˳齱");
				System.out.println("3.�����ʺ�");
				break;
			case 4:
				System.out.println("ע���������");
				break;

			}
			break;
		case 2:
			System.out.println("�˳�");
			break;
		}
	}

}
