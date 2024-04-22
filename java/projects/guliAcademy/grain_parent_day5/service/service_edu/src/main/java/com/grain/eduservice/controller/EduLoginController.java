package com.grain.eduservice.controller;

import com.grain.commonutils.R;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin // 跨域
public class EduLoginController {
    // login
    @PostMapping("login")
    public R login() {
        // 返回token值
        return R.ok().data("token", "admin");
    }

    // info
    @GetMapping("info")
    public R info() {
        // 返回角色，名字和头像
        return R.ok().data("roles", "[admin]").data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }

}
