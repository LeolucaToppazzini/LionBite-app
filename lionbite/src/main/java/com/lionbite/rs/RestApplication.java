package com.lionbite.rs;



import com.lionbite.dao.UtilityDao;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classi = new HashSet<>();
        classi.add(UserResource.class);

        // @Provider
        classi.add(GenericExceptionMapper.class);
        classi.add(JacksonConfiguration.class);

        //metto qua la parte di inizializzazione di JPA perchè rest application parte all'inizio e ci va bene che
        //utility dao parta all'inizio anche lui
        UtilityDao.init();

        return classi;
    }
}
