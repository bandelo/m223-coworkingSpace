package ch.zli.m223.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * @author Andelo Batinic
 * @date 26.09 2022
 * This is the model for the Bereiche
 */

@Entity
public class Bereiche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    @Min(value = 2)
    private String name;

    @Column(nullable = false)
    @Min(value = 2)
    private String category;

    @Column(nullable = false)
    @NotBlank
    private Boolean isFree;

    @OneToMany(mappedBy = "bereiche")
    @JsonIgnore
    private Set<Buchung> buchung;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
