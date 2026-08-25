package br.edu.faculdade.serie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SerieController {

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "API de series!";
    }
    @GetMapping("/destaque")
    public Serie destaque() {
        return new Serie("The Big Bang Theory", "Comédia", 2012);
    }
    @GetMapping("/series")
    public List<Serie> series() {
        List<Serie> series = new ArrayList<>();
        series.add(new Serie("The Big Bang Theory", "Comédia", 2012));
        series.add(new Serie("Friends", "Comédia", 2012));
        series.add(new Serie("The Pitt", "Suspense", 2026));
        return series;
    }
}

