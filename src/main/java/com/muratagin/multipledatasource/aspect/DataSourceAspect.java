package com.muratagin.multipledatasource.aspect;

import com.muratagin.multipledatasource.util.DataSourceContextHolder;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect {

    @Before("@annotation(dataSource)")
    public void switchDataSource(DataSource dataSource) {
        DataSourceContextHolder.setDataSourceKey(dataSource.value());
    }

    @After("@annotation(dataSource)")
    public void clearDataSource(DataSource dataSource) {
        DataSourceContextHolder.clear();
    }
}
