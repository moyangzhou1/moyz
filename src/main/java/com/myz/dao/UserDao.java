package com.myz.dao;

import com.myz.domain.User;

import java.util.List;

/**
 * @description: todo
 * @author: myz
 * @createtime: 2019/2/26$ 13:28$
 */
public interface UserDao {
    List<User> selectUserList();
}
