package org.app.medical.Repository;

import org.app.medical.Model.Gen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface GenRepository extends JpaRepository<Gen, Long> {

    @Query("SELECT g FROM Gen g WHERE g.geneensembl = :value OR g.ensemblID = :value")
    public Gen findByGeneensembl(@Param("value") String ensembl);

    public List<Gen> findAllByGeneensemblIn(List<String> ensembl);
}
