package me.soulyana;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage() {
        return "formtemplate";
    }

    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("date") String date, Model model) {
       String givenDate = date;
       MyDate myDate = new MyDate();
       model.addAttribute("dateIn", myDate.getDay(givenDate));

       return "confirm";
    }

}
