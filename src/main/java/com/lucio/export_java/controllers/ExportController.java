package com.lucio.export_java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ExportController {

    public ModelAndView addPage(String view, String title) {
        ModelAndView modelAndView = new ModelAndView("layout/modele");
        modelAndView.addObject("view", view);
        modelAndView.addObject("title", title);

        return modelAndView;
    }
    @GetMapping
    public ModelAndView export_csv() {
        return this.addPage("pages/export/export_csv", "Export CSV");
    }

    @GetMapping("/export_json")
    public ModelAndView export_json() {
        return this.addPage("pages/export/export_json", "Export JSON");
    }

    @GetMapping("/export_pdf")
    public ModelAndView export_pdf() {
        return this.addPage("pages/export/export_pdf", "Export PDF");
    }
}
