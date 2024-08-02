package org.app.medical.Service;

import org.app.medical.Model.Gentransposed;
import org.app.medical.Repository.GenTransposedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenTransposedService {

    private GenTransposedRepository genTransposedRepository;

    public GenTransposedService(GenTransposedRepository genTransposedRepository) {
        this.genTransposedRepository = genTransposedRepository;
    }

    public List<Gentransposed> genTransposedList(){
        return genTransposedRepository.findAll();
    }
}
