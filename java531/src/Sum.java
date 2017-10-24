public class Sum {

	public static void main(String[] args) {

		int i = 0, sum = 0;

		while (i <= 40) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println(i + "是偶数,当前和是" + sum);

			} else
				System.out.println(i + "是奇数");
			i++;
		}

	}

}
