public class People {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double people = 80000;
		int age = 2006;

		while (people < 200000) {

			people = people * 1.25;
			int pp = (int) people;
			age++;
			System.out.println(age + "年人口是" + pp);

		}
	}

}
