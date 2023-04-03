package com.lionbite.business;



import com.lionbite.dao.UtilityDao;
import com.lionbite.model.User;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InserimentoDati {

    public static void main(String[] args) {
        UtilityDao.init();

        User user = new User();
        user.setCognome("Rossi");
        user.setNome("Mario");
        user.setMail("marioRossi@mario.it");
        user.setIndirizzo("Via delle Rose 34, Milano");
        user.setFoto("per ora testo");
        UserManager.save(user);
        //EditoreManager.save(editore);


    }
}
