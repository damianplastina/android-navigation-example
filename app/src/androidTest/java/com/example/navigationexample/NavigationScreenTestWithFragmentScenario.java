package com.example.navigationexample;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class NavigationScreenTestWithFragmentScenario {

    /*
    * just in case fragment and activity scenarios must be in separated classes as
    * ActivityScenarioRule is available for all test
    * */

    @Test
    public void mainScreenShouldHaveFourButtons() {

        FragmentScenario.launchInContainer(MainFragment.class);

        onView(withId(R.id.button_send_money))
                .check(matches(isDisplayed()));
        onView(withId(R.id.button_configuration_step_1))
                .check(matches(isDisplayed()));
        onView(withId(R.id.button_configuration_step_2))
                .check(matches(isDisplayed()));
        onView(withId(R.id.button_do_nothing_2))
                .check(matches(isDisplayed()))
                .check(matches(withText("do nothing")));
    }

}