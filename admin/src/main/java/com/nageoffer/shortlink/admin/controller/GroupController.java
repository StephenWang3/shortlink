package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * 短链接分组控制层
 */
@Controller
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;
}
