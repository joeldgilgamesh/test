package com.spminfiscaa.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.spminfiscaa.web.rest.TestUtil;

public class SolEngNonDecDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(SolEngNonDecDTO.class);
        SolEngNonDecDTO solEngNonDecDTO1 = new SolEngNonDecDTO();
        solEngNonDecDTO1.setId(1L);
        SolEngNonDecDTO solEngNonDecDTO2 = new SolEngNonDecDTO();
        assertThat(solEngNonDecDTO1).isNotEqualTo(solEngNonDecDTO2);
        solEngNonDecDTO2.setId(solEngNonDecDTO1.getId());
        assertThat(solEngNonDecDTO1).isEqualTo(solEngNonDecDTO2);
        solEngNonDecDTO2.setId(2L);
        assertThat(solEngNonDecDTO1).isNotEqualTo(solEngNonDecDTO2);
        solEngNonDecDTO1.setId(null);
        assertThat(solEngNonDecDTO1).isNotEqualTo(solEngNonDecDTO2);
    }
}
