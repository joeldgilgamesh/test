package com.spminfiscaa.service.mapper;


import com.spminfiscaa.domain.*;
import com.spminfiscaa.service.dto.ServPreDetteIntNoStrucDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ServPreDetteIntNoStruc} and its DTO {@link ServPreDetteIntNoStrucDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ServPreDetteIntNoStrucMapper extends EntityMapper<ServPreDetteIntNoStrucDTO, ServPreDetteIntNoStruc> {



    default ServPreDetteIntNoStruc fromId(Long id) {
        if (id == null) {
            return null;
        }
        ServPreDetteIntNoStruc servPreDetteIntNoStruc = new ServPreDetteIntNoStruc();
        servPreDetteIntNoStruc.setId(id);
        return servPreDetteIntNoStruc;
    }
}
