package com.tognyp.creatingumldiagrams.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="diagrams")
@Data
public class Diagrams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="user_id")
    private String userId;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="diagram_type")
    private String diagramType;

    @Column(name="diagram_name")
    private String diagramName;

    @Column(name="diagram_elements",
            columnDefinition = "JSON")
    private String diagramElements;
}
