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
        
    }

    @And("Рейтинг отеля {string}")
    public void рейтингОтеля(String rating) {
    }
}
