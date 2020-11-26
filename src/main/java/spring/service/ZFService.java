package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.ZFMapper;

import javax.annotation.Resource;

@Service
public class ZFService {
    @Resource
    private ZFMapper zfMapper;
}
