package com.concretepage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.concretepage.dao.PageDao;
public class SpringDemo {
    public static void main(String... args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
            PageDao pd=(PageDao) context.getBean("pageDao");
            pd.persist();
    } 
}
 