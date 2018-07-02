package br.com.threadsandbox;

import java.util.concurrent.Callable;

public class ProcessorA implements Callable<Void> {
	
	private Request request;
	private Response response;

	public ProcessorA(Request request, Response response) {
		this.request = request;
		this.response = response;
	}


	@Override
	public Void call()  {
		System.out.println("ProcessorA");
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setValorA(request.getParametroA() * 10);
		return null;
	}

	
}
