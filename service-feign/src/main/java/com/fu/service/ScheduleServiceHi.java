package com.fu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fuxiaozhi on 2018\8\23 0023.
 */

@Service
@FeignClient(value = "service-hi")
public interface ScheduleServiceHi {

    @RequestMapping(value = "/test/test",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
