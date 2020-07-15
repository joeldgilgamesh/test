package com.spminfiscaa.repository;

import com.spminfiscaa.domain.ServPreDetteIntNoStruc;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ServPreDetteIntNoStruc entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ServPreDetteIntNoStrucRepository extends JpaRepository<ServPreDetteIntNoStruc, Long> {
}
