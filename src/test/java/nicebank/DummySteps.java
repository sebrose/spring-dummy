package nicebank;

import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:cucumber.xml")
public class DummySteps {

    private Dummy dummy;

    @Autowired
    public DummySteps(Dummy dummy) {
        this.dummy = dummy;
    }

    @Given("^I am a dummy$")
    public void iAmADummy() throws Throwable {
    dummy.beClever();
  }
}