package com.spminfiscaa.service.mapper;


import com.spminfiscaa.domain.*;
import com.spminfiscaa.service.dto.SolEngNonDecDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link SolEngNonDec} and its DTO {@link SolEngNonDecDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface SolEngNonDecMapper extends EntityMapper<SolEngNonDecDTO, SolEngNonDec> {



    default SolEngNonDec fromId(Long id) {
        if (id == null) {
            return null;
        }
        SolEngNonDec solEngNonDec = new SolEngNonDec();
        solEngNonDec.setId(id);
        return solEngNonDec;
    }
}
