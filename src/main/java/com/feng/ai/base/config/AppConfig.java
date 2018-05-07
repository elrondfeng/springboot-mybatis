package com.feng.ai.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
@ConfigurationProperties
@EnableJpaRepositories(basePackages = "com.feng.ai.base.mapper",
        entityManagerFactoryRef="fengAiEntityManager",
        transactionManagerRef="fengAiTransactionManager")

public class AppConfig {

/*
    @Value("$(spring.datasource.driver-class-name)")
    private String driverClassName;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Primary
    @Bean(name="fengDataSource")
    DataSource fengDataSource (Environment env) throws SQLException{
        DriverManagerDataSource mysql = new DriverManagerDataSource();
        mysql.setDriverClassName(driverClassName);
        mysql.setUrl(url);
        mysql.setUsername(userName);
        mysql.setPassword(password);
        return mysql;
    }

    @Primary
    @Bean(name = "fengEntityManager")
    LocalContainerEntityManagerFactoryBean fengManager(DataSource fengAiDatasource, Environment environment) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();

        em.setDataSource(fengAiDatasource);
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setPackagesToScan("com.feng.ai.entity");
        em.setJpaProperties(fengJpaProperties(environment));
        return em;
    }

    private Properties fengJpaProperties(Environment evn) {
        Properties properties = new Properties();
        properties.put("key", "value");
        return properties;
    }

    @Primary
    @Bean(name="fengTransactionManager")
    JpaTransactionManager fengTransactionManager(EntityManagerFactory fengEntityManager){
        JpaTransactionManager tm  = new JpaTransactionManager();
        tm.setEntityManagerFactory(fengEntityManager);
        return tm;
    }
*/

}
