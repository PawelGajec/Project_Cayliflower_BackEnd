package com.inqoo.project_cayliflower_backend.controller;

import com.inqoo.project_cayliflower_backend.model.Category;
import com.inqoo.project_cayliflower_backend.model.CategoryDTO;
import com.inqoo.project_cayliflower_backend.service.CauliflowerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CauliflowerRestController {

    private final CauliflowerService cauliflowerService;

    public CauliflowerRestController(CauliflowerService cauliflowerService) {
        this.cauliflowerService = cauliflowerService;
    }

    @PostMapping("/category/add")
    public ResponseEntity<CategoryDTO> addCategory(@RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok().body(cauliflowerService.addCategory(categoryDTO));
    }

    @GetMapping("/category/all")
    public ResponseEntity<List<CategoryDTO>> getAllCategory() {
        return ResponseEntity.ok().body(cauliflowerService.getAllCategories());
    }
}