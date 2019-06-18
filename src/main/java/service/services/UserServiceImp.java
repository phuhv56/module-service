package service.services;

import common.exceptions.CommonException;
import common.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.repositories.UserRepository;

@Service
public class UserServiceImp implements UserService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) throws CommonException
    {
        User checkExistPhoneNumber = userRepository.findByPhoneNumber(user.getPhoneNumber());

        if (checkExistPhoneNumber!= null) {
            throw new CommonException().setData("Phone number " + user.getPhoneNumber() + " already exists!");
        }

        User checkExistEmail = userRepository.findByEmail(user.getEmail());

        if (checkExistEmail!= null) {
            throw new CommonException().setData("Email " + user.getEmail() + " already exists!");
        }
        User userResult = userRepository.save(user);
        return userResult;
    }
}
