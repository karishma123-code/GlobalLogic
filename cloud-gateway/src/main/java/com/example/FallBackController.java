package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackController {
	
	@RequestMapping("/orderFallBack")
	public Mono<String> orderServiceFallBack(){
		return Mono.just("Order Service is down. Please Try Later");
	}
	
	@RequestMapping("/paymentFallBack")
	public Mono<String> paymentServiceFallBack(){
		return Mono.just("Payment Service is down");
		
	}

}
