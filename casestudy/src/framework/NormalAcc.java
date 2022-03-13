package framework;


	

	public abstract class NormalAcc extends shopAcc {
		private final float deliveryCharges = 50;

		public NormalAcc(int accNo, String accNm, float charges) {
			super(accNo, accNm, charges);
		}

		public float getDeliveryCharges() {
			return deliveryCharges;
		}

		@Override
		public void bookProduct(float bp) {
			getDeliveryCharges();
			super.bookProduct(bp);
		}

		@Override
		public String toString() {
			return super.toString();
		}
	}

