package com.example.demo.restapis;


import com.example.demo.entities.Assurance;
import com.example.demo.services.AssuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assurance")
public class AssuranceRestApi {

    private AssuranceService assuranceService;
    public AssuranceRestApi(AssuranceService assuranceService) {
        this.assuranceService = assuranceService;
    }
    @GetMapping("/all")
    public List<Assurance> getAssurancesApi(){
        return assuranceService.findAssurances();
    }
    @GetMapping("/{id}")
    public Assurance getAssuranceApi(@PathVariable Long id){
        return assuranceService.findAssurance(id);
    }
    @PostMapping("/add")
    public String addAssuranceApi(@RequestBody Assurance assurance){
        return assuranceService.addAssurance(assurance);
    }
    @PostMapping("/update")
    public String updateAssuranceApi(@RequestBody Assurance assurance){
        return assuranceService.updateAssurance(assurance);
    }


}
