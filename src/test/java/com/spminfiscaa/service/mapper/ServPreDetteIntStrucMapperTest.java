package com.spminfiscaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ServPreDetteIntStrucMapperTest {

    private ServPreDetteIntStrucMapper servPreDetteIntStrucMapper;

    @BeforeEach
    public void setUp() {
        servPreDetteIntStrucMapper = new ServPreDetteIntStrucMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(servPreDetteIntStrucMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(servPreDetteIntStrucMapper.fromId(null)).isNull();
    }
}
