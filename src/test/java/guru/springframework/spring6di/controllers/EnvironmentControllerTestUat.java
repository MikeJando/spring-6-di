package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class EnvironmentControllerTestUat {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void sayEnvironment() {System.out.println(environmentController.getEnvironment());}
}