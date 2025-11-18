package h3;

public class H3_main {
	public static void main(String[] args) {
		int[][] einheiten = { { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		int input = 50000;
		int i = 0;
		int z = 0;
		while (input > 0) {
			if (input - einheiten[0][i] >= 0) {
				input -= einheiten[0][i];
				z++;
				einheiten[1][i] = z;
			} else {
				i++;
				z = 0;
			}
		}
	/*	i = 0;
		while (i <= 14) {
			System.out.println(einheiten[1][i]);
			i++;
		}*/
	}
}
