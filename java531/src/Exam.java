import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա�ɽ���Գɼ���");
		Double score = input.nextDouble();
		if (score > 100 || score < 0) {
			System.out.println("�������");
		} else if (score == 100)
			System.out.println("�ְָ���������");
		else if (score >= 90)
			System.out.println("���������MP4");
		else if (score >= 60)
			System.out.println("��������򱾲ο���");
		else
			System.out.println("û�н���");

	}

}
