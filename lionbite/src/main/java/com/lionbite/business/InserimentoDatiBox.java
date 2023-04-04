package com.lionbite.business;



import com.lionbite.dao.UtilityDao;
import com.lionbite.model.LionBox;
import com.lionbite.model.User;

import java.math.BigDecimal;

public class InserimentoDatiBox {

    public static void main(String[] args) {
        UtilityDao.init();

        LionBox lionBox = new LionBox();
        lionBox.setPrezzo(new BigDecimal(1499));
        lionBox.setFoto("bella foto");


        BoxManager.save(lionBox);
        //EditoreManager.save(editore);


    }
}
