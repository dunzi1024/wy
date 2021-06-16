package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

@RestController
@Controller
public class BookController {
    @GetMapping("books")
    public ModelAndView books(){
        List<Book> books=new ArrayList<Book>();
        Book b1=new Book();
        b1.setId("a");
        b1.setAuthor("a");
        b1.setName("a");
        books.add(b1);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("books",books);
        modelAndView.setViewName("books");
        return  modelAndView;

    }


}
