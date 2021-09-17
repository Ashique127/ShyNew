package com.hy.shy.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "com.hy.shy.stepdef",

		tags = { "@UATTesting" }, monochrome = true)

public class TestttRunn extends AbstractTestNGCucumberTests {
//	private TestNGCucumberRunner testNGCucumberRunner;
//
//	@BeforeClass(alwaysRun = true)
//
//	public void setUpClass() {
//		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//	}
//
//	@Test(dataProvider = "Features")
//	public void feature(CucumberFeatureWrapper cucumberFeature) {
//		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//	}
//
//	@AfterClass(alwaysRun = true)
//
//	public void tearDownClass() {
//		testNGCucumberRunner.finish();
}
