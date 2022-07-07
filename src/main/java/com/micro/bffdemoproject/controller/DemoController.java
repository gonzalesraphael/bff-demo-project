package com.micro.bffdemoproject.controller;

import com.micro.bffdemoproject.data.request.SomeRequest;
import com.micro.bffdemoproject.service.SomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/controller")
public class DemoController implements DemoApi {

    private final SomeService someService;

    @PostMapping("input")
    public void inputSomething(@Valid @RequestBody SomeRequest someRequest) {
        someService.someOperation(someRequest);
    }
}
