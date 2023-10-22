package pl.jcw.example.bddmutation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestBddAndMutationTestingApplication {

  //	@Bean
  //	@ServiceConnection
  //	PostgreSQLContainer<?> postgresContainer() {
  //		return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
  //	}

  public static void main(String[] args) {
    SpringApplication.from(BddAndMutationTestingApplication::main)
        .with(TestBddAndMutationTestingApplication.class)
        .run(args);
  }
}
