package spring.controller;

import org.springframework.web.bind.annotation.RestController;
import spring.service.FZYService;

import javax.annotation.Resource;

@RestController
public class FZYController {

    @Resource
    private FZYService fzyService;
}
