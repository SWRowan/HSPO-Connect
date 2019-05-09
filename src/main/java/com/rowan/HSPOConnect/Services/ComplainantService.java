package com.rowan.HSPOConnect.Services;


import com.rowan.HSPOConnect.Models.Complainant;
import com.rowan.HSPOConnect.Repos.ComplainantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplainantService {

    private ComplainantRepo repo;

    @Autowired
    public ComplainantService(ComplainantRepo repo) {
        this.repo = repo;
    }

    public Complainant addComplainant(Complainant complainant){
        return repo.save(complainant);
    }
    public Complainant findById(long id){
        return repo.findById(id).get();
    }
}
