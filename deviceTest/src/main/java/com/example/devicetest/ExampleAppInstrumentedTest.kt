package com.example.devicetest

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.testonlymodule.MainActivity
import org.junit.Rule
import org.junit.Test


class ExampleAppInstrumentedTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testAppModuleActivity() {
        Espresso.onView(ViewMatchers.withId(com.example.testonlymodule.R.id.main_activity_view))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}