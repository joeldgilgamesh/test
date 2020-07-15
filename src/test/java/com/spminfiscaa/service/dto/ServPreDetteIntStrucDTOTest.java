package com.spminfiscaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.spminfiscaa.web.rest.TestUtil;

public class ServPreDetteIntStrucDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(ServPreDetteIntStrucDTO.class);
        ServPreDetteIntStrucDTO servPreDetteIntStrucDTO1 = new ServPreDetteIntStrucDTO();
        servPreDetteIntStrucDTO1.setId(1L);
        ServPreDetteIntStrucDTO servPreDetteIntStrucDTO2 = new ServPreDetteIntStrucDTO();
        assertThat(servPreDetteIntStrucDTO1).isNotEqualTo(servPreDetteIntStrucDTO2);
        servPreDetteIntStrucDTO2.setId(servPreDetteIntStrucDTO1.getId());
        assertThat(servPreDetteIntStrucDTO1).isEqualTo(servPreDetteIntStrucDTO2);
        servPreDetteIntStrucDTO2.setId(2L);
        assertThat(servPreDetteIntStrucDTO1).isNotEqualTo(servPreDetteIntStrucDTO2);
        servPreDetteIntStrucDTO1.setId(null);
        assertThat(servPreDetteIntStrucDTO1).isNotEqualTo(servPreDetteIntStrucDTO2);
    }
}
