package org.app.medical.Controller;

import org.app.medical.Model.Gen;
import org.app.medical.Service.GenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenController {

    private GenService genService;

    public GenController(GenService genService) {
        this.genService = genService;
    }

    @GetMapping("/")
    public List<Gen> getGens(){
        return genService.getGens();
    }
}
