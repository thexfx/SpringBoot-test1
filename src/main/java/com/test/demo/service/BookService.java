package com.test.demo.service;

import com.test.demo.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;
import com.test.demo.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author thexfx
 * @since 2020-06-08
 */
public interface BookService extends IService<Book> {

    List<Book> findall();

}
