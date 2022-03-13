package framework;

public class shopfact {
	
	public abstract class ShopFactory {
		public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
			return null;
		}

		public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges) {
			return null;
		}
	}
}
