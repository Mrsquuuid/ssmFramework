package com.yyz.service;

import com.yyz.dao.BookMapper;
import com.yyz.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //业务层调用dao层:组合dao
    private BookMapper bookMapper;

    //生成set方法，让spring托管
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    //业务层在调dao层。这些事务可以用aop横切
    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public List<Books> queryBookByName(String bookName){
        return bookMapper.queryBookByName(bookName);
    }
}
