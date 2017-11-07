package me.soulyana;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDate {

    public String getDay(String givenDate) {
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("EEEE");

        LocalDate dateIn = LocalDate.parse(givenDate, dTF);
        String day = dateIn.format(dayOfWeek);
        String name;
        switch (day.toLowerCase()) {
            case "monday":
                name = "Adjoa & Kojo";
                break;
            case "tuesday":
                name = "Abena & Kwabena";
                break;
            case "wednesday":
                name = "Akua & Kweku";
                break;
            case "thursday":
                name = "Yaa & Yaw";
                break;
            case "friday":
                name = "Afua & Kofi";
                break;
            case "saturday":
                name = "Ama & Kwame";
                break;
            case "sunday":
                name = "Akosua & Kwesi";
                break;
            default:
                name = "NO NAME";
                break;
        }
        return name;
    }
}