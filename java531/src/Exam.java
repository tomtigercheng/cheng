import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入赵本山考试成绩：");
		Double score = input.nextDouble();
		if (score > 100 || score < 0) {
			System.out.println("输入错误");
		} else if (score == 100)
			System.out.println("爸爸给他买辆车");
		else if (score >= 90)
			System.out.println("妈妈给他买MP4");
		else if (score >= 60)
			System.out.println("妈妈给他买本参考书");
		else
			System.out.println("没有奖励");

	}

}
