package io.paulsbruce.dev.noodlesnowpos;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<LoginActivity> mRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void login() throws Exception {


        onView(withId(R.id.email))
                .perform(click(), clearText(), typeText("me@paulsbruce.io"));

        onView(withId(R.id.password))
                .perform(click(),clearText(),typeText("12345"));

        onView(withId(R.id.email_sign_in_button))
                .perform(click());

        onView(withId(R.id.home_screen_welcome))
                .check(matches(isDisplayed()));
    }
}
