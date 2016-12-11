public class labw03 implements var03 {
	public double logika(double d1, double d2, double d3) {
		if ( d1 > d2 ){
			if ( d1 > d3 ){
				if ( d2 > d3) {
					return d1+d2;
				}
				else {
					return d1+d3;
				}
			}
			else {
				return d1+d3;
			}
		}
		else {
			if (d1 > d3){
				return d1+d2;
			}
			else {
				return d2+d3;
			}
		}
	}

	public void poka(double N) {
		double sum = 1;
		int i;
		for(i = 2; sum < N ; i++) {
			sum += (1 / (double)i);
			}
		System.out.println( i - 1 );
		System.out.println(sum - (1 / (double)i) );
	}

	
	public void massivy(double[] A, int K, int L){
		double sum = 0;
		for(int i = 0; i < A.length ; i++) {
			if (i >= K && i <= L ) continue;
			sum += A[i];
		}
		System.out.println(sum);
	}

}
