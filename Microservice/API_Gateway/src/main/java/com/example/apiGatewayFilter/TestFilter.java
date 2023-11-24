package com.example.apiGatewayFilter;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class TestFilter implements GlobalFilter{
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {


		ServerHttpRequest request = exchange.getRequest(); //use to capture complete request structure
		
		HttpHeaders headers = request.getHeaders();
		Collection<List<String>> values = headers.values();
		
		Set<String> keySet = headers.keySet();
		
		for(String key : keySet) {
			
		}
		
		return chain.filter(exchange);
	}

}
