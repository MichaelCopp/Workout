package com.example.mbcoppol.myapplication;

/**
 * Created by mbcoppol on 9/28/2016.
 */
public class Workout {
        private String name;
        private String description;

        public static final Workout [] workouts = {
            new Workout ("The Limb Loosener",
                "5 Handstand pushups\n10 1-legged squats \n15 pull-ups"),
            new Workout ("Core Agony",
                "100 pullups\n100 push-ups\n100 Sit-ups\n100 squats"),
            new Workout ("The Wimp Special",
                "5 pullups\n10 push-ups\n15 squats"),
            new Workout ("Strength and Length",
                "500 meter running\n21 x 1.4 pound kettball swing\n21 x pull-ups"),
            new Workout ("Wii Fit Special",
                "Boxing\nYoga\n5000 Steps\n30 Thrusts")
            };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return  description;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name;
    }
}
