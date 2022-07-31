import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {
    @BeforeEach
    void openBrowser() {
        open("http://localhost:9999/");
    }

<<<<<<< HEAD

=======
 
>>>>>>> e88fc076dc0f6a82af9493550e3aebcdea04c354
    @Test
    void shouldSendForm() {
        SelenideElement form = $(".form");
        form.$("[data-test-id='name'] input").setValue("Иванов Иван");
        form.$("[data-test-id='phone'] input").setValue("+79271520804");
        form.$("[data-test-id='agreement']").click();
        form.$("button").click();
        $("[data-test-id='order-success']").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
