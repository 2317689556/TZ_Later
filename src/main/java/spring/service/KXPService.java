package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.KXPMapper;

import javax.annotation.Resource;

@Service
public class KXPService {
    @Resource
    private KXPMapper kxpMapper;
}
