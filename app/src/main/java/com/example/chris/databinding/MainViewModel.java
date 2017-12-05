package com.example.chris.databinding;

import android.view.View;

import com.example.chris.databinding.model.Person;

/**
 * Created by chris on 12/5/2017.
 */

public interface MainViewModel
{
    void onClick(View view);
    void updatePerson(View view, Person person);
}
