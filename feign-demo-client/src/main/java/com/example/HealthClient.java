package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "${health.feign.name}", url = "${health.feign.url}")
interface HealthClient {

    @RequestMapping(method = RequestMethod.GET, value = "/health")
    Health health();
}
