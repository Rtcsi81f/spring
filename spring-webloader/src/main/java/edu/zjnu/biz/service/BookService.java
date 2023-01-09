package edu.zjnu.biz.service;

import edu.zjnu.biz.dao.IBookDao;
import edu.zjnu.biz.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: 杨海波
 * @date: 2023-01-09 14:34:46
 * @description: BookService
 */
@Service
public class BookService implements IBookService {

    private IBookDao bookDao;

    @Transactional
    @Override
    public Book getBookById(Long id) {
        return bookDao.getBookById(id);
    }
}
