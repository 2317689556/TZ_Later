package spring.service;

import org.springframework.stereotype.Service;
import spring.dao.FZYMapper;

import javax.annotation.Resource;

@Service
public class FZYService {

    @Resource
    private FZYMapper fzyMapper;
}
