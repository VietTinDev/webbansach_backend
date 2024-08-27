package com.viettin.webbansach_backend.repository;

import com.viettin.webbansach_backend.entity.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Component
public class MethodRestConfig implements RepositoryRestConfigurer {

    //private String url = "http://localhost:8080";
    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] disabled= {HttpMethod.DELETE,HttpMethod.PATCH,HttpMethod.POST,HttpMethod.PUT};

        //allowed info id
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
        //config.exposeIdsFor(Category.class);

        //disabled method
        disabledHttpMethod(Category.class,config,disabled);
    }

    private void disabledHttpMethod(Class c, RepositoryRestConfiguration config, HttpMethod[] methods){
        config.getExposureConfiguration().forDomainType(c)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(methods))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(methods));
    }
}
