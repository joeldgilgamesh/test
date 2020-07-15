package com.spminfiscaa.service.mapper;


import com.spminfiscaa.domain.*;
import com.spminfiscaa.service.dto.ServPreDetteIntStrucDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ServPreDetteIntStruc} and its DTO {@link ServPreDetteIntStrucDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ServPreDetteIntStrucMapper extends EntityMapper<ServPreDetteIntStrucDTO, ServPreDetteIntStruc> {



    default ServPreDetteIntStruc fromId(Long id) {
        if (id == null) {
            return null;
        }
        ServPreDetteIntStruc servPreDetteIntStruc = new ServPreDetteIntStruc();
        servPreDetteIntStruc.setId(id);
        return servPreDetteIntStruc;
    }
}
