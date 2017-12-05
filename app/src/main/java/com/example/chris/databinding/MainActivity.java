package com.example.chris.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chris.databinding.databinding.ActivityMainBinding;
import com.example.chris.databinding.model.Person;

public class MainActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        
        binding.setPerson(new Person("John Doe", "34"));
        binding.setViewmodel(new MainViewModelImplementation(this));
    }
}
