package com.example.demo.services;


import com.example.demo.entities.Assurance;
import com.example.demo.repositories.AssuranceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssuranceService {
    private AssuranceRepository assuranceRepository;
    public AssuranceService(AssuranceRepository assuranceRepository) {
        this.assuranceRepository = assuranceRepository;
    }

    public List<Assurance> findAssurances(){
        return assuranceRepository.findAll();
    }
    public Assurance findAssurance(Long id){
        return assuranceRepository.findAssuranceById(id);
    }
    public String addAssurance(Assurance assurance){
        assuranceRepository.save(assurance);
        return "assurance added succesfully";
    }

    public String updateAssurance(Assurance assurance){
        Assurance updateAssurance = assuranceRepository.findAssuranceById(assurance.getId());

        if(updateAssurance == null){
            return "Assurance not found";
        }
        updateAssurance.setMatricule(assurance.getMatricule());
        updateAssurance.setValidite(assurance.getValidite());
        assuranceRepository.save(assurance);
        return "Assurance Updated succesfully!!";
    }
}
