package com.jit.controller;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/restapi.feature"},
        dryRun = false,
        glue = "com.ecs.googleuat")
public class CucumberTest {
}
