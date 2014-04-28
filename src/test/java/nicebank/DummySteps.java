package nicebank;

import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:cucumber.xml")
public class DummySteps {

    // Uncomment next line to get this example to work
    //@Autowired
    private Dummy dummy;

    //* START Remove the following constructor to get this example to work
    @Autowired
    public DummySteps(Dummy dummy) {
        this.dummy = dummy;
    }
    // END Remove the preceding constructor to get this example to work */

    @Given("^I am a dummy$")
    public void iAmADummy() throws Throwable {
    dummy.beClever();
  }
}