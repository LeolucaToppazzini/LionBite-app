package com.lionbite.rs;

import com.lionbite.dao.UtilityDao;
import org.jboss.resteasy.plugins.interceptors.CorsFilter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {

    //private Set<Object> singletons = new HashSet<Object>();
    private HashSet<Class<?>> classes = new HashSet<Class<?>>();

    public RestApplication()
    {
       /* CorsFilter corsFilter = new CorsFilter();
        corsFilter.getAllowedOrigins().add("*");
        corsFilter.setAllowedMethods("OPTIONS, GET, POST, DELETE, PUT, PATCH");
        singletons.add(corsFilter);*/

        classes.add(UserResource.class);
        classes.add(LionBoxResource.class);

        // @Provider
        classes.add(GenericExceptionMapper.class);
        classes.add(JacksonConfiguration.class);
        classes.add(HeadersFilter.class);

        UtilityDao.init();
    }
    /*
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
*/
    @Override
    public HashSet<Class<?>> getClasses(){
        return classes;
    }
}
