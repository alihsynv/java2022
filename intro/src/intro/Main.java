package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		String ortaMetin = "Ilginizi çekebilir";
		String altMetin = "Vade süresi'";

		System.out.println(ortaMetin);

		int vade = 12;

		double dolarDun = 18.20;
		double dolarBugun = 18.20;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.jpg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.jpg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.jpg";
			System.out.println(okYonu);
		}

		String[] krediler = { "Hızlı kredi", "Maaşını HalkBanktan", "Mutlu Emekli" };

//		System.out.println(krediler[0]);
//		System.out.println(krediler[1]);
//		System.out.println(krediler[2]);

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
