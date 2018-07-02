package br.com.threadsandbox;

import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Teste {


	public static void main(String[] args) throws InterruptedException {
		Request request = new Request(2.0, 3.0);
		Response response = new Response();
		
//		Thread threadA = new Thread(new ProcessorA(request, response));
//		Thread threadB = new Thread(new ProcessorB(request, response));
		
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		
//		threadA.start();
//		threadB.start();
//		
//		threadB.join();
		
		Collection<Callable<Void>> tasks = new LinkedList<>();
		
		tasks.add(new ProcessorA(request, response));
		tasks.add(new ProcessorB(request, response));
		tasks.add(new ProcessorC(request, response));
		
		fixedThreadPool.invokeAll(tasks);
		
		System.out.println("Valor de A:" + response.getValorA());
		System.out.println("Valor de B:" + response.getValorB());
	}
	
}
