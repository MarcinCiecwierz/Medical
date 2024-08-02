package org.app.medical.Controller;

import org.app.medical.Model.Gen;
import org.app.medical.Service.GenService;
import org.app.medical.Service.GenTransposedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
public class GenController {

    private GenService genService;
    private GenTransposedService genTransposedService;

    public GenController(GenService genService, GenTransposedService genTransposedService) {
        this.genService = genService;
        this.genTransposedService = genTransposedService;
    }

    @GetMapping("/")
    public String getGens(Model model){
        model.addAttribute("listOfGens", genService.getGens());
        model.addAttribute("genTransposedList", genTransposedService.genTransposedList());
        return "index";
    }

    @GetMapping("about")
    public String about(){
        return "about";
    }

}
