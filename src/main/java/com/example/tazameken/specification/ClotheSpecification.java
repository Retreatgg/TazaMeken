package com.example.tazameken.specification;


import com.example.tazameken.model.Clothe;
import org.springframework.data.jpa.domain.Specification;

public class ClotheSpecification {

    public static Specification<Clothe> hasCategory(Long categoryId) {
        return (r, q, cb) -> {
            if(categoryId == 0) return cb.conjunction();
            return cb.equal(r.get("category").get("id"), categoryId);
        };
    }
}
