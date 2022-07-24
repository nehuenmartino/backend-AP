
package com.myApiG114.SpringBoot.Repository;

import com.myApiG114.SpringBoot.Model.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {
    public SocialMedia findByIdPerson(Long idPerson);
}
