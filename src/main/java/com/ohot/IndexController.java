package com.ohot;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("Index")
@RestController
@AllArgsConstructor
public class IndexController {

    @ApiOperation("Health Checking")
    @GetMapping("/index")
    public String getHealthCheck() {
        return "ok";
    }
}
