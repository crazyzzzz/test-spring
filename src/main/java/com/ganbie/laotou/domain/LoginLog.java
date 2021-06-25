/*
 * Copyright (C), 2002-2019, 苏宁易购电子商务有限公司
 * FileName: LoginLog.java
 * Author:   0707529
 * Date:     2021-06-25 下午19:59
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间       版本号       描述
 */
package com.ganbie.laotou.domain;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 07075929
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class LoginLog {
    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}