public class Sum {

	public static void main(String[] args) {

		int i = 0, sum = 0;

		while (i <= 40) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println(i + "��ż��,��ǰ����" + sum);

			} else
				System.out.println(i + "������");
			i++;
		}

	}

}
