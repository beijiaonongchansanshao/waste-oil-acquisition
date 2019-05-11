package com.gy.oil.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
/**
 * 
 * 这里用一句话描述这个类的作用  
 * @ClassName:  开启mybatis事务控制
 * @author: Mr.叶云
 * @date:   2019年5月11日 下午1:13:36
 */
@Configuration
@EnableTransactionManagement
public class MyBatisConfig implements TransactionManagementConfigurer{
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
         return new DataSourceTransactionManager();
    }
}
