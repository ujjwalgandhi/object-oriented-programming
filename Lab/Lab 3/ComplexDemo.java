class Complex {
	
	private double realPart, imaginaryPart;
	
	public Complex(){
		realPart = 0;
		imaginaryPart = 0;
	}
	
	public Complex (double realPart, double imaginaryPart){
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex (Double ...c){
		if (c.length == 1){
			this.realPart = c[1];
		}
		if (c.length == 2){
			this.realPart = c[1];
			this.imaginaryPart = c[2];
		}
	}
	
	public Complex add(Complex other){
		Complex c = new Complex(realPart+other.realPart, imaginaryPart+other.imaginaryPart);
		return c;
	}

	public Complex subtract(Complex other){
		Complex c = new Complex(realPart-other.realPart, imaginaryPart-other.imaginaryPart);
		return c;
	}
	
	public double getRealPart() {
		return realPart;
	}

	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
}

class ComplexDemo{
	public static void main(String[] args) {
		Complex c1 = new Complex(2,3);
		System.out.println(c1.getRealPart());
		c1.setImaginaryPart(6);
		System.out.println(c1.getImaginaryPart());
	}
}
