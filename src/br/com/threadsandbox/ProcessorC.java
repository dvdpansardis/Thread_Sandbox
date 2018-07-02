package br.com.threadsandbox;

import java.util.concurrent.Callable;

public class ProcessorC implements  Callable<Void>  {

	private Request request;
	private Response response;

	public ProcessorC(Request request, Response response) {
		this.request = request;
		this.response = response;
	}

	@Override
	public Void call() throws Exception {
		System.out.println("ProcessorC");
		try {
			Thread.sleep(6300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setValorB(request.getParametroB() * 10);
		return null;
	}

}
