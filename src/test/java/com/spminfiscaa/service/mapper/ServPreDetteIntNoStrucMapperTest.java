package com.spminfiscaa.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ServPreDetteIntNoStrucMapperTest {

    private ServPreDetteIntNoStrucMapper servPreDetteIntNoStrucMapper;

    @BeforeEach
    public void setUp() {
        servPreDetteIntNoStrucMapper = new ServPreDetteIntNoStrucMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(servPreDetteIntNoStrucMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(servPreDetteIntNoStrucMapper.fromId(null)).isNull();
    }
}
