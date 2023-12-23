package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserLoginReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     * @param username 用户名
     * @return 用户名存在返回True， 不存在返回False
     */
    Boolean hasUsername(String username);

    /**
     * 用户注册
     * @param requestParam 注册用户信息
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户信息
     * @param requestParam 修改用户请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     * @param requestParam 登录用户请求参数
     * @return  登录用户返回信息
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     * @param username 用户名
     * @param token 用户登录凭证
     * @return 用户已登录返回True, 未登录返回False
     */
    Boolean checkLogin(String username, String token);

    /**
     * 用户退出登录
     * @param username 用户名
     * @param token 用户登录凭证
     */
    void logout(String username, String token);
}

