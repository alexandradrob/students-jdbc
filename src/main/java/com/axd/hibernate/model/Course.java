package com.axd.hibernate.model;

import javax.persistence.*;

public class Course {


    @ManyToOne
   @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq_gen")
    @SequenceGenerator(name ="course_seq_gen", sequenceName = "course_sequence")



    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;
}
