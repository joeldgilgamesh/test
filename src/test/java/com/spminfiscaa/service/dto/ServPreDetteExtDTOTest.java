package com.spminfiscaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.spminfiscaa.web.rest.TestUtil;

public class ServPreDetteExtDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(ServPreDetteExtDTO.class);
        ServPreDetteExtDTO servPreDetteExtDTO1 = new ServPreDetteExtDTO();
        servPreDetteExtDTO1.setId(1L);
        ServPreDetteExtDTO servPreDetteExtDTO2 = new ServPreDetteExtDTO();
        assertThat(servPreDetteExtDTO1).isNotEqualTo(servPreDetteExtDTO2);
        servPreDetteExtDTO2.setId(servPreDetteExtDTO1.getId());
        assertThat(servPreDetteExtDTO1).isEqualTo(servPreDetteExtDTO2);
        servPreDetteExtDTO2.setId(2L);
        assertThat(servPreDetteExtDTO1).isNotEqualTo(servPreDetteExtDTO2);
        servPreDetteExtDTO1.setId(null);
        assertThat(servPreDetteExtDTO1).isNotEqualTo(servPreDetteExtDTO2);
    }
}
