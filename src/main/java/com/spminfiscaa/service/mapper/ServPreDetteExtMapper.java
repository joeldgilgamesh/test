package com.spminfiscaa.service.mapper;


import com.spminfiscaa.domain.*;
import com.spminfiscaa.service.dto.ServPreDetteExtDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ServPreDetteExt} and its DTO {@link ServPreDetteExtDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ServPreDetteExtMapper extends EntityMapper<ServPreDetteExtDTO, ServPreDetteExt> {



    default ServPreDetteExt fromId(Long id) {
        if (id == null) {
            return null;
        }
        ServPreDetteExt servPreDetteExt = new ServPreDetteExt();
        servPreDetteExt.setId(id);
        return servPreDetteExt;
    }
}
