package com.codev.coreandroidmvp.presentation.auth;

import android.content.Context;
import android.support.annotation.NonNull;
/**
 * Created by kath on 3/05/18.
 */

public class LoginPresenter implements LoginContract.Presenter{

     private Context context;
     private LoginContract.View mView;


    public LoginPresenter(@NonNull LoginContract.View mView, @NonNull Context context) {
        this.context = context;
        this.mView = mView;
        this.mView.setPresenter(this);
    }

    @Override
    public void login(String user, String pass) {

        // código conexion remoto o local
            if(user.equals("kath@gmail.com")&& pass.equals("12345")){
                mView.loginSucess("Login Correcto");
            }else{
                mView.errorLogin("Login incorrecto");
            }
    }

    @Override
    public void start() {

    }
}
