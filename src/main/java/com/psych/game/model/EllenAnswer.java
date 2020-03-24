package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ellen_answers")
public class EllenAnswer extends Auditable{
    @ManyToOne
    @Getter
    @Setter
    private Question question;

    @ManyToOne
    @Getter
    @Setter
    private String answer;

    @Getter
    @Setter
    private Long votes = 0L;
}
