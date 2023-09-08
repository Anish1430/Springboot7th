package org.Anish;

/*
  What is Annotation ??
  1=Annotation is used to provide extra information about a program.
  2=Annotation starts with "@".
  3=Annotation provides MetaData to class/method.{Meta-data means data about data   Or you can
       SAY THIS INFORMATION ABOUT OTHER INFORMATION}
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.util.Date;

//This Annotation is used to mark the Main class of SpringBootApplication.
// It is Equivalent to 3 annotation(@SpringBootConfiguration,,@ComponentScan,,@EnableAutoConfiguration)
@SpringBootApplication  //
public class Main  implements CommandLineRunner {
    @Autowired
    private Student student;

    @Autowired
    private Appling appling;

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
     this.student.Studying();
       this.appling.uks();
    }

}