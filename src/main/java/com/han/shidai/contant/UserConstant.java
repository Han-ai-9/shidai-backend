package com.han.shidai.contant;

/**
 * 用户常量
 *

 */
public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "userLoginState";

    /**
     * 主页用户推荐
     */
    String SHIDAI_USER_RECOMMEND="shidai_user_recommend";


    String SHIDAI_PRECACHEJOB_DOCACHE_LOCK="shidai:precachejob:docache:lock";

    String SHIDAI_JOIN_TEAM="shidai_join_ream";

    //  ------- 权限 --------

    /**
     * 默认权限
     */
    int DEFAULT_ROLE = 0;


    /**
     * 管理员权限
     */
    int ADMIN_ROLE = 1;

}
