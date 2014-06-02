package com.loginLileto.app;

import android.widget.Toast;

/**
 * Created by INTEC-4606 on 01/06/2014.
 */
public class Login {


    public Login(String user, String pass) {
        setLogin();
    }

    private int setLogin() {

        if (user.equals("lileto")&& pass.equals("1234")){
            Toast.makeText(getBaseContext(), "usuario correcto", Toast.LENGTH_SHORT).show();
         return 1;
        }else{
            Toast.makeText(getBaseContext(), "usuario incorrecto", Toast.LENGTH_SHORT).show();
            return 0;
        }


    }
}
