package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BlockingFilter implements Filter{
	
	Logger LOG=LoggerFactory.getLogger(BlockingFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httprequest=(HttpServletRequest)request;
		if(httprequest.getRequestURL().toString().equals("http://localhost:8080/blockedsample"))
		{
			LOG.info("request blocked");
			return;
		}
		chain.doFilter(request, response);
	}
	
}
