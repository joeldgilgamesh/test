package com.spminfiscaa.service.dto;

import java.time.LocalDate;
import java.io.Serializable;

/**
 * A DTO for the {@link com.spminfiscaa.domain.SolEngNonDec} entity.
 */
public class SolEngNonDecDTO implements Serializable {
    
    private Long id;

    private String bailleur;

    private String type_cooperation;

    private String type_fond;

    private Integer solde;

    private Integer commission;

    private LocalDate date;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBailleur() {
        return bailleur;
    }

    public void setBailleur(String bailleur) {
        this.bailleur = bailleur;
    }

    public String getType_cooperation() {
        return type_cooperation;
    }

    public void setType_cooperation(String type_cooperation) {
        this.type_cooperation = type_cooperation;
    }

    public String getType_fond() {
        return type_fond;
    }

    public void setType_fond(String type_fond) {
        this.type_fond = type_fond;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SolEngNonDecDTO)) {
            return false;
        }

        return id != null && id.equals(((SolEngNonDecDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "SolEngNonDecDTO{" +
            "id=" + getId() +
            ", bailleur='" + getBailleur() + "'" +
            ", type_cooperation='" + getType_cooperation() + "'" +
            ", type_fond='" + getType_fond() + "'" +
            ", solde=" + getSolde() +
            ", commission=" + getCommission() +
            ", date='" + getDate() + "'" +
            "}";
    }
}
