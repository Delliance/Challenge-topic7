package com.danieltesting.challenge7.controller;

import com.danieltesting.challenge7.controller.dto.AddMeteorologyForm;
import com.danieltesting.challenge7.entities.Location;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

@RequestMapping("/meteorologies")
public class MeteorologyController {

    public static List<Meteorology> NEW_METEOROLOGY = new ArrayList<Meteorology>() {
        float[] temperatures = {82, 84, 86, 87};
        {
            add(new Meteorology(0, LocalDate.of(2022, 01, 18), new Location( 3.4669, -76.5382, "Cali", "Valle" ), temperatures));
            add(new Meteorology(1, LocalDate.of(2022, 01, 19), new Location( 3.4669, -76.5382, "Cali", "Valle" ), temperatures));
            add(new Meteorology(2, LocalDate.of(2022, 01, 20), new Location( 3.4669, -76.5382, "Cali", "Valle" ), temperatures));
            add(new Meteorology(3, LocalDate.of(2022, 01, 21), new Location( 3.4669, -76.5382, "Cali", "Valle" ), temperatures));
        }
    };

    @GetMapping
    private String getAll(Model model) {
        model.addAttribute("meteorologies", NEW_METEOROLOGY);
        model.addAttribute("addMeteorologyForm", new AddMeteorologyForm());
        return "meteorologies";
    }

    private void add(@ModelAttribute AddMeteorologyForm addMeteorologyForm, Model model){
        model.addAttribute("meteorologies", NEW_METEOROLOGY);

        NEW_METEOROLOGY.add(new Meteorology(RandomGenerator.getDefault().nextInt(100), addMeteorologyForm.getDate(),addMeteorologyForm.getLocation(), addMeteorologyForm.getTemperature()));
        throw new NewException();

    }

}
