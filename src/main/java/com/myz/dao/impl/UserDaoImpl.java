package com.myz.dao.impl;

import com.myz.dao.UserDao;
import com.myz.domain.User;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: todo
 * @author: myz
 * @createtime: 2019/2/26$ 13:28$
 */
public class UserDaoImpl implements UserDao {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;//注入sessionFactory

    @Override
    public List<User> selectUserList() {
        //hql语句
        String hql = "from User";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);

        return query.list();
    }
}
