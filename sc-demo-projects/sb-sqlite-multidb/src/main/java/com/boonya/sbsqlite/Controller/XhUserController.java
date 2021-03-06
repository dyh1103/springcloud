package com.boonya.sbsqlite.Controller;

import com.boonya.sbsqlite.service.XhUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class XhUserController {
    @Autowired
    private  XhUserService xhUserService;

    @RequestMapping("/list.do")
    public List< Map<String,Object>> getList() {
        return xhUserService.selectAll();
    }

    @RequestMapping("/{id}")
    public Map<String,Object> getById(@PathVariable("id") long id) {
        return xhUserService.select(id);
    }

}
