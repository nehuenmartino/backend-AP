
package com.myApiG114.SpringBoot.Repository;

import com.myApiG114.SpringBoot.Model.Education;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
    public List<Education> findByIdPerson(Long idPerson);
}
