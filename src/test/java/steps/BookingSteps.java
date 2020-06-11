package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class BookingSteps {

    String hotelName;
    private SearchPage searchPage;

    @Given("Название отеля {string}")
    public void названиеОтеля(String hotelName) {
        this.hotelName = hotelName;
        searchPage = new SearchPage();

    }

    @When("Пользователь ищет")
    public void пользовательИщет() {
        searchPage.openPage();
        searchPage.search(hotelName);
        
    }

    @Then("Отель с {string} отображается на странице")
    public void отельОтображаетсяНаСтранице(String resultHotelName) {
//  data-hotelid="770781"
    }

    @And("Рейтинг отеля {string}")
    public void рейтингОтеля(String rating) {

//        arial-label="Scored 7.0"
//        привести к нормальному виду
//        /html[1]/body[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[7]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]

    }
}
