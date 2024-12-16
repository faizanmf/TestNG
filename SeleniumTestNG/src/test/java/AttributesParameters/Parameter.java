package AttributesParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
@Parameters({"name", "pass"})
	@Test

public void Parameter(String name, String pass)
{
	System.out.println(name);
	System.out.println(pass);
}
}
