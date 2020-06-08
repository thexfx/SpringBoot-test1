package com.test.demo.service;

import com.test.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author thexfx
 * @since 2020-06-07
 */
public interface USERservice extends IService<User> {

    List<User> all();

}
