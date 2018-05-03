package com.codev.coreandroidmvp.presentation.auth;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.codev.coreandroidmvp.R;
import com.codev.coreandroidmvp.core.BaseActivity;
import com.codev.coreandroidmvp.utils.ActivityUtils;

/**
 * Created by kath on 3/05/18.
 */

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clear);

        LoginFragment fragment = (LoginFragment) getSupportFragmentManager()
                .findFragmentById(R.id.body);

        if (fragment == null) {
            fragment = LoginFragment.newInstante();

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    fragment, R.id.body);
        }

        // Create the presenter
        //new LoginPresenter(fragment,this);

    }
}
