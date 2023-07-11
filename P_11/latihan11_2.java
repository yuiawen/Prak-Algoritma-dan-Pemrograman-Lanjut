public class latihan11_2 {
	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}

	public static void main(String[] args) {
		int x = 24;
		int y = 56;
		int hasil = gcd(x, y);
		System.out.println("GCD dari " + x + " dan " + y + " adalah : " + hasil);
	}
}
