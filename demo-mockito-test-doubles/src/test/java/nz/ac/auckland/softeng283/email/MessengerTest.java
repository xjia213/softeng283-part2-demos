package nz.ac.auckland.softeng283.email;

import static org.mockito.ArgumentMatchers.anyString;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MessengerTest {

  @Test
  // @Disabled("Replace this scaffold with Mockito tests")
  public void test() {
    // Create mocks for Client, Template, TemplateEngine, and MailServer.
    // Configure the prepared message, call Messenger.sendMessage, and verify interactions.
    MailServer mailServer = Mockito.mock(MailServer.class);
    Template template = Mockito.mock(Template.class);
    TemplateEngine templateEngine = Mockito.mock(TemplateEngine.class);
    Client client = Mockito.mock(Client.class);

    Messenger messenger = new Messenger(mailServer, templateEngine);
    //STUB
    Mockito.when(templateEngine.prepareMessage(template, client)).thenReturn("Hello, World!");
    Mockito.when(client.getEmail()).thenReturn("example@kk.com");
    //ACT
    messenger.sendMessage(client, template);

    //assert
    Mockito.verify(mailServer).send("example@kk.com", "Hello, World!");
  }
}
