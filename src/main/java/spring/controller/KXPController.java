package spring.controller;

import org.springframework.stereotype.Controller;
import spring.service.KXPService;

import javax.annotation.Resource;

@Controller
public class KXPController {
    @Resource
    private KXPService kxpService;
}
