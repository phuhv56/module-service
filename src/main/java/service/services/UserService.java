package service.services;

import common.exceptions.CommonException;
import common.models.User;

public interface UserService
{
    User create(User user) throws CommonException;
}
