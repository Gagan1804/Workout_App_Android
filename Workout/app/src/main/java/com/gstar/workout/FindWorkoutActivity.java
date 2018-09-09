package com.gstar.workout;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkoutActivity extends AppCompatActivity
{

    //    we will be adding a splash screen to our app now and remember that we define time in milli seconds for e.g. we have given 4000 means 4 seconds
    private static int SPLASH_TIME_OUT = 4000;

//    now we have created a class of WorkoutExpert to make it run
    private WorkoutExpert expert = new WorkoutExpert();

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);


        btn=(Button)findViewById(R.id.findworkout);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view)
            {
                TextView workouts = (TextView) findViewById(R.id.workout);
                Spinner workout_type = (Spinner) findViewById(R.id.workouttype);
//                now we will store the value of the selected item of spinner in a string as shown below:-
                String workout_selected = String.valueOf(workout_type.getSelectedItem());

                List<String> workoutList = expert.getWorkouts(workout_selected);

                StringBuilder workoutsFormatted= new StringBuilder();

                for(String work : workoutList)
                {
                    workoutsFormatted.append(work).append('\n');
                }

                workouts.setText(workoutsFormatted);
            }
        });



    }

}
