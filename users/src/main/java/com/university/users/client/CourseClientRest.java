package com.university.users.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="users", url="${courses.service.url}")
public interface CourseClientRest {

    @GetMapping("/")
    String list();
}
