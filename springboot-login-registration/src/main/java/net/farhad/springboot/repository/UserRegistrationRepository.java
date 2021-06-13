package net.farhad.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.farhad.springboot.model.User;

@Repository
public interface UserRegistrationRepository extends JpaRepository<User, Long>{

}
