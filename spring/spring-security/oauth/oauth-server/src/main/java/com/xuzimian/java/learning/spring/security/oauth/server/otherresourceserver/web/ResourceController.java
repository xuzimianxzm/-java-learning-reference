package com.xuzimian.java.learning.spring.security.oauth.server.otherresourceserver.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 获得认证信息，认证通过后，第三方应用可以请求的资源
 */
@Profile("otherResourceServer")
@RestController
public class ResourceController {
    private static final Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @RequestMapping("/me")
    public Principal me(Principal principal) {
        logger.debug(principal.toString());
        return principal;
    }

    @GetMapping("/phone")
    public String phone() {
        return "phone: 1234567890";
    }
}
