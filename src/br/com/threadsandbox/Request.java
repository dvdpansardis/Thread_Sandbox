package br.com.threadsandbox;

public class Request {

	private Double parametroA;

	private Double parametroB;

	public Request(double a, double b) {
		parametroA = a;
		parametroB = b;
	}

	public Double getParametroA() {
		return parametroA;
	}

	public void setParametroA(Double parametroA) {
		this.parametroA = parametroA;
	}

	public Double getParametroB() {
		return parametroB;
	}

	public void setParametroB(Double parametroB) {
		this.parametroB = parametroB;
	}

}
