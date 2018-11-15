package org.sopt.report3.service;

import org.sopt.report3.model.DefaultRes;
import org.sopt.report3.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    DefaultRes<String> getCurrentTime();
    DefaultRes<List<User>> getUserListandSearchByNameOrName(final Optional<String>name,
                                                            final Optional<String>part);
    DefaultRes<List<User>>searchSameId(final int user_idx);
    DefaultRes<List<User>>saveUser(final User user);
    DefaultRes<List<User>>updateUser(final int user_idx,final User user);
    DefaultRes<List<User>>deleteUser(final int user_idx);

}
