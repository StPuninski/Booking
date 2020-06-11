package pages;

import java.util.List;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class SearchPage {

    String searchInputCss = "#ss";
    String searchButtonCss = ".sb-searchbox__button";

    public void openPage() {
        open("https://www.booking.com/searchresults.en-gb.html");
    }

    public void search(String hotelName) {
        $(searchInputCss).sendKeys(hotelName);
        $(searchButtonCss).click();
    }

    public List<String> getAllHotels() {
        //TODO реализовать метод по получению и возврату имен всех отелей (GO!)
        return null;
    }

    public void validateHotelRating(String hotelName, String rating) {
        //TODO получить рейтинг по имени отеля и сравнить его с ожидаемым

    }
}