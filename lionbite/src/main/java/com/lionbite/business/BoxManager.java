package com.lionbite.business;

import com.lionbite.dao.BoxDao;
import com.lionbite.dao.UserDao;
import com.lionbite.model.LionBox;
import com.lionbite.model.User;

import java.util.List;

public class BoxManager {



    public static List<LionBox> getAll(){
        BoxDao dao = new BoxDao();
        List<LionBox> boxes = dao.getAll();
        dao.close();
        return  boxes;
    }

    public static Long save(LionBox lionBox){
        BoxDao dao = new BoxDao();
        dao.save(lionBox);
        dao.close();
        return lionBox.getId();
    }

}
