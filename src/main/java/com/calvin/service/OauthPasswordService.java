package com.calvin.service;

/**
 * @author Calvin
 * @date 2020/6/7 1:29
 *
 * 密码模式
 *
 * 1.用户向客户端提供用户名密码；
 * 2/客户端将用户名和密码发给认证服务器请求令牌；
 * 3.认证服务器确认无误后，向客户端提供访问令牌；
 * 4.客户端携带令牌向资源服务器请求访问资源；
 * 5.资源服务器返回资源。
 */
public interface OauthPasswordService {
}
