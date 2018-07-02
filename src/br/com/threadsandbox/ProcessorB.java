package br.com.threadsandbox;

import java.util.concurrent.Callable;

public class ProcessorB implements  Callable<Void>  {
	
	private Request request;
	private Response response;

	public ProcessorB(Request request, Response response) {
		this.request = request;
		this.response = response;
	}

	@Override
	public Void call() throws Exception {
		System.out.println("ProcessorB");
		try {
			Thread.sleep(5300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setValorB(request.getParametroB() * 20);
		return null;
	}

}
