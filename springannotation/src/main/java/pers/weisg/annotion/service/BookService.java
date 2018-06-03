package pers.weisg.annotion.service;


import org.springframework.stereotype.Service;
import pers.weisg.annotion.dao.BookDao;

import javax.inject.Inject;


@Service
public class BookService {
	
	//@Qualifier("bookDao")
	//@Autowired(required=false)
	//@Resource(name="bookDao2")
	@Inject
	private BookDao bookDao;
	
	public void print(){
		System.out.println(bookDao);
	}

	@Override
	public String toString() {
		return "BookService [bookDao=" + bookDao + "]";
	}
	

}
