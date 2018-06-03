package pers.weisg.annotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pers.weisg.annotion.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;

}
