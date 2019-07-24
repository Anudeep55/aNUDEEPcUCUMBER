package latchnig;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaFolder",glue="stepDef22july",tags= {"@Smoke"},
plugin={"html:target/cucumber-htmlreport.html"})
public class Appg {

}
