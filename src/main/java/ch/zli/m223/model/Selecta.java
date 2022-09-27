package ch.zli.m223.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/*
 * @author Andelo Batinic
 * @date 26.09 2022
 * This is the model for the Selecta
 */

@Entity
public class Selecta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    @Min(value = 2)
    private String name;

    @Column(nullable = false)
    @NotBlank
    @Max(value = 8)
    private Float price;

    @ManyToMany(mappedBy = "selecta")
    private Set<User> user;

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

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
}
