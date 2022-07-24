
package com.myApiG114.SpringBoot.Repository;

import com.myApiG114.SpringBoot.Model.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    public List<Skill> findByIdPerson(Long idPerson);
}
