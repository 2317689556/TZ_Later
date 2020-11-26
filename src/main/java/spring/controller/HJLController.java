package spring.controller;

import org.springframework.web.bind.annotation.RestController;
import spring.service.HJLService;

import javax.annotation.Resource;

@RestController
public class HJLController {

    @Resource
    private HJLService hjlService;
}
