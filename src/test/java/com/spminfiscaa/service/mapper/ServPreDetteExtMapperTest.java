package com.spminfiscaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ServPreDetteExtMapperTest {

    private ServPreDetteExtMapper servPreDetteExtMapper;

    @BeforeEach
    public void setUp() {
        servPreDetteExtMapper = new ServPreDetteExtMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(servPreDetteExtMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(servPreDetteExtMapper.fromId(null)).isNull();
    }
}
