package com.niit.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.BaseDomain;
import com.niit.model.Blog;
import com.niit.model.ChatbizBlog;
import com.niit.model.ChatbizFriend;
import com.niit.model.ChatbizJob;
import com.niit.model.ChatbizUsers;
import com.niit.model.Friend;
import com.niit.model.Job;
import com.niit.model.Message;
import com.niit.model.Userdetails;



@Configuration
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	/*@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder lsf=
				new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		lsf.addProperties(hibernateProperties);
		Class classes[]={ChatbizJob.class,ChatbizUsers.class,ChatbizFriend.class,ChatbizBlog.class};
		return lsf.addAnnotatedClasses(classes)

		   .buildSessionFactory();
	}
	@Bean(name="dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
	    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	    dataSource.setUsername("RAM");
	    dataSource.setPassword("ram");
	    return dataSource;
	}
	@Autowired
	@Bean
	public HibernateTransactionManager hibTransManagement(){
		return new HibernateTransactionManager(sessionFactory());
	}*/
	@Autowired
	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder lsf = new LocalSessionFactoryBuilder(getDataSource());
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		hibernateProperties.setProperty("hibernate.use_sql_commnets", "true");
		lsf.addProperties(hibernateProperties);
		return lsf.addAnnotatedClass(BaseDomain.class).addAnnotatedClass(ChatbizBlog.class).addAnnotatedClass(Blog.class)
				.addAnnotatedClass(ChatbizFriend.class).addAnnotatedClass(ChatbizJob.class).addAnnotatedClass(ChatbizUsers.class)
				.addAnnotatedClass(Friend.class).addAnnotatedClass(Job.class).addAnnotatedClass(Userdetails.class).addAnnotatedClass(Message.class).buildSessionFactory();

	}

	@Bean(name="dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/collabration1");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
	@Autowired
	@Bean
	public HibernateTransactionManager hibTransManager() {
		return new HibernateTransactionManager(sessionFactory());
	}

}
