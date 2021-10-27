package com.example.labtaskviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextID;
    EditText editTextName;
    EditText editTextEmail;

    MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextID = findViewById(R.id.editTextID);
        editTextName  = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);

        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
    }

    public void saveButtonClick(View v){
        int id = Integer.parseInt(editTextID.getText().toString());
        String name = editTextName.getText().toString();
        String email = editTextEmail.getText().toString();

        myViewModel.setModel(id,name,email);

        Toast.makeText(this, "Data Sotred", Toast.LENGTH_SHORT).show();

        editTextID.setText("");
        editTextName.setText("");
        editTextEmail.setText("");
    }

    public void getButtonClick(View v){
        if(myViewModel.getModel()!=null) {
            editTextID.setText("" + myViewModel.getModel().getId());
            editTextName.setText(myViewModel.getModel().getName());
            editTextEmail.setText(myViewModel.getModel().getEmail());
        }
    }
}