import java.util.Scanner;

public class Prize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������λ��Ա�ţ�");
		int Num = input.nextInt();
		int Sum = Num % 10 + Num / 10 % 10 + Num / 100 % 10 + Num / 1000 % 10;
		if (Sum > 24)
			System.out.println("��ϲ�������н��ˣ���Ʒ��һ̨�ʵ�");
		else if (Sum > 20)
			System.out.println("��ϲ�������н��ˣ���Ʒ��һ���紵��");
		else if (Sum > 16)
			System.out.println("��ϲ�������н��ˣ���Ʒ��һ���ͽ�ֽ");
		else
			System.out.println("�´μ���Ŭ��");
	}

}
