package com.spminfiscaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolEngNonDecMapperTest {

    private SolEngNonDecMapper solEngNonDecMapper;

    @BeforeEach
    public void setUp() {
        solEngNonDecMapper = new SolEngNonDecMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(solEngNonDecMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(solEngNonDecMapper.fromId(null)).isNull();
    }
}
