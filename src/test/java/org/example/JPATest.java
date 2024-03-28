package org.example;

import static com.google.common.truth.Truth.assertThat;
import org.example.entity.Users;
import org.example.repository.UsersRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
    classes = App.class,
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class JPATest {
  @Autowired private UsersRepository usersRepository;
  private static final String userId = "userId";

  @Test
  public void case_0_JPA_providedServerId_shouldReturnSameSeverIdItem() {
    Users user = usersRepository.findByEmail("test@helloai.ink");
    assertThat(userId).isEqualTo(user.getUserid());
  }
}
