package com.saurabh.HibernateMappingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * All Mapping Example of Hibernate
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Laptop laptop=new Laptop();
        laptop.setLid(102);
        laptop.setLname("Hp");
        
        Student student=new Student();
        student.setRollno(2);
        student.setName("Vijay");
        student.setMarks(90);
        //student.setLaptop(laptop);
        student.getLaptop().add(laptop);
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf=con.buildSessionFactory(reg);
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(laptop);
        session.save(student);
        session.getTransaction().commit();
    }
}
