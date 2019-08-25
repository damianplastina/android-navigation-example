package com.example.navigationexample;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(AndroidJUnit4.class)
public class NavigationScreenTest {

    @Test
    public void sendMoneyButtonShouldGoToSendMoneyScreenAfterClicked() {

        // Create a mock NavController
        NavController mockNavController = mock(NavController.class);

        // Create a graphical FragmentScenario for the TitleScreen
        FragmentScenario<MainFragment> mainFragmentScenario = FragmentScenario.launchInContainer(MainFragment.class);

        // Set the NavController property on the fragment
        mainFragmentScenario.onFragment(fragment ->
                Navigation.setViewNavController(fragment.requireView(), mockNavController)
        );

        // Verify that performing a click prompts the correct Navigation action
        onView(withId(R.id.button_send_money)).perform(click());
        verify(mockNavController).navigate(R.id.action_mainFragment_to_sendMoney);

    }

}