package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.YHYMapper;

import javax.annotation.Resource;

@Service
public class YHYService {

    @Resource
    private YHYMapper yhyMapper;
}
