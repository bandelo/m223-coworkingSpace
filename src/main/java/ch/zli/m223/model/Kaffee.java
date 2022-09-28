package ch.zli.m223.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.smallrye.common.constraint.NotNull;

/*
 * @author Andelo Batinic
 * @date 26.09 2022
 * This is the model for the Kaffee
 */

@Entity
public class Kaffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    @Min(value = 2)
    private String type;

    @Column(nullable = false)
    @NotNull
    private Float price;

    @ManyToMany(mappedBy = "kaffee")
    private Set<User> user;

    public Object getUser() {
        return this.user;
    }

    public void setUser(Object user) {
        this.user = (Set<User>) user;
    };

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}
