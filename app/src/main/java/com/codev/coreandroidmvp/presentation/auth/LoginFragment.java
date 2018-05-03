package com.codev.coreandroidmvp.presentation.auth;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.codev.coreandroidmvp.R;
import com.codev.coreandroidmvp.core.BaseFragment;

/**
 * Created by kath on 3/05/18.
 */

public class LoginFragment extends BaseFragment implements LoginContract.View{

    private LoginContract.Presenter mPresenter;

    private EditText etEmail, etPassword;

    private Button mButton;

    private String user, pass;

    public LoginFragment() {
    }

    public static LoginFragment newInstante(){
        return new LoginFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.login_frag, container, false);
       // Crea presenter
        mPresenter = new LoginPresenter(this, getContext());
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etEmail = view.findViewById(R.id.etEmail);
        etPassword = view.findViewById(R.id.etPassword);
        mButton = view.findViewById(R.id.login);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //envío de información al presenter
                mPresenter.login(etEmail.getText().toString(),  etPassword.getText().toString());
            }
        });

    }

    // --- Respuesta de presenter ---

    @Override
    public void loginSucess(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void errorLogin(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }


    // -- Conexión con presenter --
    @Override
    public void setPresenter(LoginContract.Presenter presenter) {
        this.mPresenter = presenter;
    }


    // -- funciones adicionales

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showErrorMessage(String message) {

    }
}
