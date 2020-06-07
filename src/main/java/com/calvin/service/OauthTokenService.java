package com.calvin.service;

/**
 * @author Calvin
 * @date 2020/6/7 0:31
 *
 * 授权码模式
 *
 * 1.用户访问客户端，客户端通过用户代理向认证服务器请求授权码；
 * 2.用户同意授权；
 * 3.认证服务器通过用户代理返回授权码给客户端；
 * 4.客户端携带授权码向认证服务器请求访问令牌（AccessToken）；
 * 5.认证服务器返回访问令牌；
 * 6.客户端携带访问令牌向资源服务器请求资源；
 * 7.资源服务器返回资源。
 */
public interface OauthTokenService {

}
