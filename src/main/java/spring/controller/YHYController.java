package spring.controller;

import org.springframework.web.bind.annotation.RestController;
import spring.service.YHYService;

import javax.annotation.Resource;

@RestController
public class YHYController {

    @Resource
    private YHYService yhyService;
}
