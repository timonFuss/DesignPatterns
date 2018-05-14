package code;

public class Auto {
	private Farbe farbe;
	private Marke marke;
	private Treibstoff treibstoff;

	private Auto(Builder builder) {
		this.farbe = builder.farbe;
		this.treibstoff = builder.treibstoff;
		this.marke = builder.marke;
	}

	public static class Builder {
		private Treibstoff treibstoff;
		private Farbe farbe;
		private Marke marke;
		private int raeder = 4;

		public Builder(int raeder) {
			this.raeder = raeder;
		}

		public Builder vonDerMarke(Marke marke) {
			this.marke = marke;
			return this;
		}

		public Builder mitFarbe(Farbe farbe) {
			this.farbe = farbe;
			return this;
		}

		public Builder faehrtMit(Treibstoff treibstoff) {
			this.treibstoff = treibstoff;
			return this;
		}

		public Auto build() {
			return new Auto(this);
		}
	}

	@Override
	public String toString() {
		return "Auto [farbe=" + farbe + ", marke=" + marke + ", treibstoff="
				+ treibstoff + "]";
	}

}
