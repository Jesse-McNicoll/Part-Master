package com.example.partmaster.Controller;

import com.example.partmaster.Model.Part;
import com.example.partmaster.Repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/home")
public class PartController {

    @Autowired
    private PartRepository partRepository;

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("")
    public String home(@ModelAttribute Part part, Model model){
        model.addAttribute("appName", appName);
        model.addAttribute("part", part);
        return "home";
    }

    @PostMapping("/add")
    public String add_part(@ModelAttribute Part part, Model model){
        model.addAttribute("part", part);
        partRepository.save(part);
        return "result";
    }


}
