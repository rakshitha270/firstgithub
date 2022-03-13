package framework;


	public abstract class CurrentAcc extends bankAcc {
		private final float creditLimit = 100;

		public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
			super(accNo, accNm, accBal);
		}

		synchronized public float getCreditLimit() {
			return creditLimit;
		}

		@Override
		public void withdraw(float wd) {
			super.withdraw(wd);
		}

		@Override
		public String toString() {
			return super.toString();
		}
	}

