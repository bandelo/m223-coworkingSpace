package ch.zli.m223.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * @author Andelo Batinic
 * @date 26.09 2022
 * This is the model for the User
 */

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    @Size(min = 2, max = 30)
    private String vorname;

    @Column(nullable = false)
    @Size(min = 2, max = 30)
    private String nachname;

    @Column(nullable = false)
    @Email
    @NotEmpty
    private String email;

    @Column(nullable = false)
    @NotEmpty
    private String password;

    @ManyToOne
    @JsonIgnore
    private Role role;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Buchung> buchung;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "selecta_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "selecta_id"))
    private Set<Selecta> selecta;


    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "kaffe_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "kaffee_id"))
    private Set<Kaffee> kaffee;

    public Kaffee getKaffee() {
        return (Kaffee) this.kaffee;
    }

    public void setKaffee(Object kaffee) {
        this.kaffee = (Set<Kaffee>) kaffee;
    };

    public Selecta getSelecta() {
        return (Selecta) this.selecta;
    }

    public void setSelecta(Object selecta) {
        this.selecta = (Set<Selecta>) selecta;
    };

    public Buchung getBuchung() {
        return (Buchung) this.buchung;
    }

    public void setBuchung(Object buchung) {
        this.buchung = (Set<Buchung>) buchung;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Object role) {
        this.role = (Role) role;
    };
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
