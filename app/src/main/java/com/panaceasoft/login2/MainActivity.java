package com.panaceasoft.login2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.panaceasoft.utils.Utils;

public class MainActivity extends AppCompatActivity {

    TextView createTextView;
    LinearLayout facebookLinearLayout, twitterLinearLayout, googlePlusLinearLayout;
    Button loginButton, forgotButton;
    ImageView bgImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feature_login_general_login_2_activity);

        initUI();

        initDataBindings();

        initActions();

    }

    //region Init Functions
    private void initUI() {

        forgotButton = findViewById(R.id.forgotButton);
        createTextView = findViewById(R.id.createTextView);

        facebookLinearLayout = findViewById(R.id.facebookLinearLayout);
        twitterLinearLayout = findViewById(R.id.twitterLinearLayout);
        googlePlusLinearLayout = findViewById(R.id.googlePlusLinearLayout);

        loginButton = findViewById(R.id.loginButton);

        bgImageView = findViewById(R.id.bgImageView);

    }

    private void initDataBindings() {
        int id = R.drawable.login_background;
        Utils.setImageToImageView(getApplicationContext(), bgImageView, id);
    }

    private void initActions() {
        forgotButton.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Clicked Forgot Password", Toast.LENGTH_SHORT).show();
        });

        createTextView.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Clicked Create Account", Toast.LENGTH_SHORT).show();
        });

        facebookLinearLayout.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Clicked Facebook", Toast.LENGTH_SHORT).show();
        });

        twitterLinearLayout.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Clicked Twitter", Toast.LENGTH_SHORT).show();
        });

        googlePlusLinearLayout.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Clicked Google Plus", Toast.LENGTH_SHORT).show();
        });

        loginButton.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Clicked Login", Toast.LENGTH_SHORT).show();
        });

    }
    //endregion
}
