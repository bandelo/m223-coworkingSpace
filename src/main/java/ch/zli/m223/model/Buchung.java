package ch.zli.m223.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.hibernate.type.TrueFalseType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * @author Andelo Batinic
 * @date 26.09 2022
 * This is the model for the Buchung
 */

@Entity
public class Buchung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    @NotEmpty
    private Boolean status;

    @Column(nullable = false)
    @NotEmpty
    private Boolean halfDay;

    @Column(nullable = true)
    private Date date;

    @ManyToOne
    private Bereiche bereiche;

    @ManyToOne
    @JsonIgnore
    private User user;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getHalfDay() {
        return this.halfDay;
    }

    public void setHalfDay(Boolean halfDay) {
        this.halfDay = halfDay;
    }

}
