package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Joshp\\eclipse-workspace\\cucumber1\\src\\test\\resource\\feature\\signinoutline.feature",
glue= {"stepdefinition"},
plugin= {"pretty","html:target/ourrecord/sigin.html"},
monochrome=true)






public class signinoutline {

}
