package org.fasttrackit.forum;

import org.fasttrackit.forum.domain.Shop;
import org.fasttrackit.forum.domain.User;
import org.fasttrackit.forum.service.ShopService;
import org.fasttrackit.forum.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ttritean
 * @since 11/13/2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ForumApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class UserIntegrationTest {


    @Autowired
    private UserService userService;


    @Test
    public void testSave() {

        User user =new User();
        user.setUserName("tania");
        user.setFirstName("Tania");
        user.setLastName("Tritean");
        userService.saveUser(user);

    }

}
