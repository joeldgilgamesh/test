package com.spminfiscaa.repository;

import com.spminfiscaa.domain.ServPreDetteExt;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ServPreDetteExt entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ServPreDetteExtRepository extends JpaRepository<ServPreDetteExt, Long> {
}
