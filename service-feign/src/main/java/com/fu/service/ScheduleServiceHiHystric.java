package com.fu.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fuxiaozhi on 2018\8\24 0024.
 */
@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
        }

}
