package fbniRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/FBNIGroupFeatures",
		tags = "@CurrentTest",
		glue = "",
//		glue = "SideBarMenu",
		strict = true,
		plugin = { "pretty", "html:C:/Users/TezzaSolutions/Desktop/Prime/Tezza/FBNI/UAT/rpt" },
		 monochrome = true
		)

 
public class FbniGroupRunner {

}
