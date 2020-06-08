package com.test.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.test.demo.entity.Book;
import com.test.demo.entity.User;
import com.test.demo.mapper.BookMapper;
import com.test.demo.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author thexfx
 * @since 2020-06-08
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Override
    public List<Book> findall() {
        Wrapper<Book> wrapper = new QueryWrapper<>();
        return baseMapper.selectList(wrapper);
    }

}
