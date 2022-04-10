package com.example.chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.chat.databinding.ActivityMainBinding;
import com.example.chat.databinding.ActivityNumberVerificationBinding;

public class NumberVerification extends AppCompatActivity {

   ActivityNumberVerificationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityNumberVerificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.getOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(binding.phonebox.getText().toString().isEmpty() ){

                    Toast.makeText( NumberVerification.this, "Pleas enter correct number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(NumberVerification.this,GetOtp.class);
                    intent.putExtra("mobile",binding.phonebox.getText().toString());
                    startActivity(intent);
                    finish();
                }

            }
        });



    }
}