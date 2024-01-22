package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.support.SpringBootServletInitializer

@SpringBootApplication
class DemoApplication : SpringBootServletInitializer() {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            System.out.printf("hello=" + Hello("王飞").hell)
            SpringApplication.run(DemoApplication::class.java, *args)
        }
    }

}
