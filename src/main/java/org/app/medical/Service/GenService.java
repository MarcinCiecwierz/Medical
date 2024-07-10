package org.app.medical.Service;

import org.app.medical.Model.Gen;
import org.app.medical.Repository.GenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenService {

    private GenRepository genRepository;

    public GenService(GenRepository genRepository) {
        this.genRepository = genRepository;
    }

    public List<Gen> getGens(){
        return genRepository.findAll();
    }
}
