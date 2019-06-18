package service.repositories;

import common.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByPhoneNumber(String phoneNumber);

    User findByEmail(String email);
}
