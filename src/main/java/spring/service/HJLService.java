package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.HJLMapper;

import javax.annotation.Resource;

@Service
public class HJLService {
    @Resource
    private HJLMapper hjlMapper;
}
