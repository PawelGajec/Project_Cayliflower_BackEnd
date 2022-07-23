package com.inqoo.project_cayliflower_backend;

import com.inqoo.project_cayliflower_backend.configuration.controller.CauliflowerRestController;
import com.inqoo.project_cayliflower_backend.model.CategoryDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Collections;

@SpringBootApplication
public class ProjectCauliflowerBackEndApplication {

    CauliflowerRestController controller;

    public ProjectCauliflowerBackEndApplication(CauliflowerRestController controller) {
        this.controller = controller;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectCauliflowerBackEndApplication.class, args);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        controller.addCategory(new CategoryDTO("IT", "IT Categoty", Collections.emptyList()));
        controller.addCategory(new CategoryDTO("Sales", "Sales Categoty", Collections.emptyList()));
        controller.addCategory(new CategoryDTO("Marketing", "Marketing Categoty", Collections.emptyList()));
        controller.addCategory(new CategoryDTO("Other", "Other Categoty", Collections.emptyList()));
    }
}