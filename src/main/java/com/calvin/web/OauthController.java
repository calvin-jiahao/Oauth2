package com.calvin.web;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Calvin
 * @date 2020/6/7 2:13
 */
@RestController
public class OauthController {

    @RequestMapping("/oauth/authorize")
    public Object getOauth() {
        return null;
    }
}
