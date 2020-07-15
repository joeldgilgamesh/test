package com.spminfiscaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.spminfiscaa.web.rest.TestUtil;

public class ServPreDetteIntNoStrucDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(ServPreDetteIntNoStrucDTO.class);
        ServPreDetteIntNoStrucDTO servPreDetteIntNoStrucDTO1 = new ServPreDetteIntNoStrucDTO();
        servPreDetteIntNoStrucDTO1.setId(1L);
        ServPreDetteIntNoStrucDTO servPreDetteIntNoStrucDTO2 = new ServPreDetteIntNoStrucDTO();
        assertThat(servPreDetteIntNoStrucDTO1).isNotEqualTo(servPreDetteIntNoStrucDTO2);
        servPreDetteIntNoStrucDTO2.setId(servPreDetteIntNoStrucDTO1.getId());
        assertThat(servPreDetteIntNoStrucDTO1).isEqualTo(servPreDetteIntNoStrucDTO2);
        servPreDetteIntNoStrucDTO2.setId(2L);
        assertThat(servPreDetteIntNoStrucDTO1).isNotEqualTo(servPreDetteIntNoStrucDTO2);
        servPreDetteIntNoStrucDTO1.setId(null);
        assertThat(servPreDetteIntNoStrucDTO1).isNotEqualTo(servPreDetteIntNoStrucDTO2);
    }
}
