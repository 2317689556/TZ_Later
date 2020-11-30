package spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spring.pojo.PbUser;
import spring.service.CJLService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("cjl")
public class CJLController {

    @Resource
    private CJLService cjlService;

    @RequestMapping("findByid")
    @ResponseBody
    public void findByid(Integer userId, HttpServletRequest request) {
        PbUser pbUser = (PbUser)request.getSession().getAttribute("USER");
        Integer id= pbUser.getUserId();
        System.out.println(id);
        //int i = cjlService.findByid(id);
        //return i;
    }
}
