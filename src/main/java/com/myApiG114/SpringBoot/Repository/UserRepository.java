
package com.myApiG114.SpringBoot.Repository;

import com.myApiG114.SpringBoot.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public boolean existsByUsuarioAndPwd(String usuario, String pwd);
}
