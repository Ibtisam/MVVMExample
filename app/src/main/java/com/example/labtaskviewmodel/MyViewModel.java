package com.example.labtaskviewmodel;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    MyModel myModel;

    public void setModel(int id, String name, String email){
        if(myModel==null){
            myModel = new MyModel(id,name,email);
        }else{
            myModel.setId(id);
            myModel.setName(name);
            myModel.setEmail(email);
        }
    }

    public MyModel getModel(){
        return myModel;
    }
}
