
package com.myApiG114.SpringBoot.Repository;

import com.myApiG114.SpringBoot.Model.Experience;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
    public List<Experience> findByIdPerson(Long idPerson);
}
