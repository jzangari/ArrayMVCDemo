import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


/**
* UI Tests
*
*/
public class UserInterfaceTest {


    @Test
    public void renderInputPersonDetails() {
        Content html = views.html.inputPersonDetails.render();
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("First Name");
        assertThat(contentAsString(html)).contains("Last Name");
        assertThat(contentAsString(html)).contains("Age");
    }
  
   
}
