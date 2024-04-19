package com.example.tienda

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class LoginActivityTest {

    @get:Rule
    var activityRule: ActivityTestRule<LoginActivity> = ActivityTestRule(LoginActivity::class.java)

    @Test
    fun testLoginSuccess() {
        val email = "usuario@example.com"
        val password = "contraseña"

        onView(withId(R.id.editTextEmail)).perform(typeText(email), closeSoftKeyboard())
        onView(withId(R.id.editTextPassword)).perform(typeText(password), closeSoftKeyboard())

        onView(withId(R.id.buttonLogin)).perform(click())

        onView(withId(R.id.ACTIVITY_PRODUCTOS)).check(matches(isDisplayed()))
    }
}