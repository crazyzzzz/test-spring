/*
 * Copyright (C), 2002-2019, 苏宁易购电子商务有限公司
 * FileName: User.java
 * Author:   0707529
 * Date:     2021-06-25 下午19:51
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间       版本号       描述
 */
package com.ganbie.laotou.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 07075929
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class User implements Serializable {
    private int userId;
    private String userName;
    private String password;
    private int credits;
    private  String lastIp;
    private Date lastVisit;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }
}