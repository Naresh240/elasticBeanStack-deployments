package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class helloworld
{
    public static void main( String[] args )
    {
        SpringApplication.run(helloworld.class,args);
        System.out.println(args[0]+args[1]);
    }

    //helllo wrold endpoint

    @GetMapping("/hello")
    public String hello(){
        return  "hello world";
    }
}
