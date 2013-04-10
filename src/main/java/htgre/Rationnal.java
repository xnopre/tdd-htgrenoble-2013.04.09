package htgre;

public class Rationnal {

	final int numer;

	final int denom;

	public Rationnal(int numer, int denom) {
		this.numer = numer;
		this.denom = denom;
	}

	public Rationnal add(Rationnal b) {
		return new Rationnal(numer * b.denom + b.numer * denom, denom * b.denom);
	}

	public Rationnal neg() {
		return new Rationnal(-numer, denom);
	}

	public Rationnal sub(Rationnal b) {
		return add(b.neg());
	}

	@Override
	public String toString() {
		int gcd = gcd(numer, denom);
		return numer / gcd + "/" + denom / gcd;
	}

	private int gcd(int a, int b) {
		// Greatest common divisor = PGCD (Plus Grand Commun Diviseur)
		return b == 0 ? a : gcd(b, a % b);
	}
}
