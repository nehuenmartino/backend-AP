
package com.myApiG114.SpringBoot.Repository;

import com.myApiG114.SpringBoot.Model.Project;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
    public List<Project> findByIdPerson(Long idPerson);
}
