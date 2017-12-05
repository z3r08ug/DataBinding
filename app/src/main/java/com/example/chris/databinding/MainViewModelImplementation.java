package com.example.chris.databinding;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.chris.databinding.model.Person;

/**
 * Created by chris on 12/5/2017.
 */

public class MainViewModelImplementation implements MainViewModel
{
    private static final String TAG = MainViewModelImplementation.class.getSimpleName() + "_TAG";
    Context context;
    
    MainViewModelImplementation(Context context)
    {
        this.context = context;
    }
    @Override
    public void onClick(View view)
    {
        Toast.makeText(context, "SimpleOnClick", Toast.LENGTH_SHORT).show();
    
        Log.d(TAG, "onClick: ");
    }
    
    @Override
    public void updatePerson(View view, Person person)
    {
        Toast.makeText(context, person.getNameObs().get(), Toast.LENGTH_SHORT).show();
    }
}
