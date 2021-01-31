package com.tognyp.creatingumldiagrams.dao;

import com.tognyp.creatingumldiagrams.entity.Diagrams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin(origins = "http://uml-create-project.s3-website.us-east-2.amazonaws.com")
@RepositoryRestResource(collectionResourceRel = "diagrams", path = "diagrams")
public interface DiagramsRepository extends JpaRepository<Diagrams, Long> {

    List<Diagrams> findByUserId(@RequestParam("id") String id);
    Diagrams findByUserIdAndDiagramName(String id, String diagramName);

}
