/*
 * Copyright (C), 2002-2019, 苏宁易购电子商务有限公司
 * FileName: UserDao.java
 * Author:   0707529
 * Date:     2021-06-25 下午20:17
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名     修改时间       版本号       描述
 */
package com.ganbie.laotou.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author 07075929
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository
public class UserDao {
    @Autowired
  private JdbcTemplate jdbcTemplate;

  private  final static  String MATCH_COUNT_SQL=" SELECT  count(*) FROM t_user  " +"  WHERE user_name =? and password=? ";

    public int getMatchCount(String userId,String password){
        return jdbcTemplate.queryForObject(MATCH_COUNT_SQL,new Object[]{userId,password},Integer.class);
    }

}