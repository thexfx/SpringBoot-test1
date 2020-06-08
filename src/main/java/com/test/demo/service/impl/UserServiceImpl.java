package com.test.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.demo.entity.User;
import com.test.demo.mapper.UserMapper;
import com.test.demo.service.USERservice;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author thexfx
 * @since 2020-06-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements USERservice {
    @Override
    public List<User> all() {
        Wrapper<User> wrapper = new QueryWrapper<>();
        return baseMapper.selectList(wrapper);
    }
}
