package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="demoproject")
public interface IFeignClient {

	
}
