package spring.controller;

import org.springframework.web.bind.annotation.RestController;
import spring.service.CJLService;

import javax.annotation.Resource;

@RestController
public class CJLController {

    @Resource
    private CJLService cjlService;
}
