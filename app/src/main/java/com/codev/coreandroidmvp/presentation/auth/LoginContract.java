package com.codev.coreandroidmvp.presentation.auth;

import com.codev.coreandroidmvp.core.BasePresenter;
import com.codev.coreandroidmvp.core.BaseView;

/**
 * Created by kath on 3/05/18.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {
        void loginSucess(String msg);
        void errorLogin(String msg);
    }

    interface Presenter extends BasePresenter {
        void login(String user, String pass);
    }
}
