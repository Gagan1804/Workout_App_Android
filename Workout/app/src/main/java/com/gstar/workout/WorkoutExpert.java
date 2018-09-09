package com.gstar.workout;


import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert
{
    List <String> getWorkouts (String workouttype)
    {
        List <String> workout = new ArrayList<String>();

        if(workouttype.equals("Chest"))
        {
            workout.add("Barbell Bench Press");
            workout.add("Flat Bench Dumbbell Press");
            workout.add("Seated Machine Chest Press ");
            workout.add("Incline Bench Cable Fly");
            workout.add("Dips For Chest");
            workout.add("Pec-Deck Machine");
        }
        else if(workouttype.equals("Biceps"))
        {
            workout.add("Incline Dumbbell Hammer Curl");
            workout.add("Standing Concentration Dumbbell Curl");
            workout.add("EZ-Bar Curl");
            workout.add("Wide-Grip Standing Barbell Curl");
            workout.add("Zottman Curl");
            workout.add("Overhead Cable Curl");
        }
        else if(workouttype.equals("Shoulders"))
        {
            workout.add("Barbell Shoulder Press");
            workout.add("Reverse Machine Flyes");
            workout.add("Arnold Dumbbell Press");
            workout.add("Front Cable Raise");
            workout.add("Seated Bent-Over Rear Delt Raise");
            workout.add("Side Lateral Raise");
        }
        else if(workouttype.equals("Triceps"))
        {
            workout.add("Dip Machine");
            workout.add("EZ-Bar Skullcrusher");
            workout.add("V-Bar Pulldown");
            workout.add("Triceps Overhead Extension with Rope");
            workout.add("Triceps Pushdown - V-Bar Attachment");
            workout.add("Tricep Dumbbell Kickback");
        }
        else if(workouttype.equals("Legs"))
        {
            workout.add("Barbell Squat");
            workout.add("Dumbbell Lunges");
            workout.add("Leg Press");
            workout.add("Leg Extensions");
            workout.add("Standing Calf Raises");
            workout.add("Dumbbell Step Ups");
        }
        else if(workouttype.equals("Abs"))
        {
            workout.add("Planks");
            workout.add("Ballet Twist");
            workout.add("Crunches");
            workout.add("The Cobra");
            workout.add("Squat Thrust with Twist");
            workout.add("Weighted planks");
        }
        else if(workouttype.equals("Traps"))
        {
            workout.add("The Shrug");
            workout.add("Single-Arm Dumbbell Upright Row");
            workout.add("The High Pull");
            workout.add("Low-Cable Face Pull");
            workout.add("Modified Bent-Over Duel Cable Low Pulley Shoulder Fly");
        }
        else if(workouttype.equals("Back"))
        {
            workout.add("Barbell Deadlift");
            workout.add("Wide-Grip Pull-Up");
            workout.add("Standing T-Bar Row");
            workout.add("Wide-Grip Seated Cable Row");
            workout.add("Close-Grip Pull-Down");
            workout.add("Single-Arm Dumbbell Row");
            workout.add("Decline Bench Dumbbell Pull-Over");
        }
        else if(workouttype.equals("-Select-"))
        {
            workout.add("Please select something");
        }
        return workout;
    }
}



