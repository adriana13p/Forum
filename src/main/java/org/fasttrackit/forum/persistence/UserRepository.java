package org.fasttrackit.forum.persistence;


import org.fasttrackit.forum.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository   extends
        PagingAndSortingRepository<User, Long> {

}
