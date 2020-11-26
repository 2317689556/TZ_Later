package spring.controller;

import org.springframework.web.bind.annotation.RestController;
import spring.service.ZFService;

import javax.annotation.Resource;

@RestController
public class ZFController {

    @Resource
    private ZFService zfService;
}
