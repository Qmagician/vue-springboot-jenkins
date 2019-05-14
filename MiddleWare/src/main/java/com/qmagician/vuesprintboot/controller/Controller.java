package com.qmagician.vuesprintboot.controller;

import com.qmagician.vuesprintboot.domain.users;
import com.qmagician.vuesprintboot.domain.usersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    private usersMapper usersMap;

    @PostMapping("/accessTest")
    public Object accessTest(@RequestBody Map<String, String> reqMap) {
        Map<String,Object> result = new HashMap<String, Object>();
        System.out.println("reqPatams:"+reqMap);
        for (String key:reqMap.keySet()) {
            System.out.println(key + ":" + reqMap.get(key));
        }

        final users user = new users();
        user.setId(reqMap.get("id"));
        user.setName(reqMap.get("name"));
        usersMap.saveAndFlush(user);

        result.put("status", "success");
        result.put("msg", "用户新增成功！");
        return result;
    }
}
