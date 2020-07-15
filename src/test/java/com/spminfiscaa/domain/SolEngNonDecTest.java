package com.spminfiscaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.spminfiscaa.web.rest.TestUtil;

public class SolEngNonDecTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(SolEngNonDec.class);
        SolEngNonDec solEngNonDec1 = new SolEngNonDec();
        solEngNonDec1.setId(1L);
        SolEngNonDec solEngNonDec2 = new SolEngNonDec();
        solEngNonDec2.setId(solEngNonDec1.getId());
        assertThat(solEngNonDec1).isEqualTo(solEngNonDec2);
        solEngNonDec2.setId(2L);
        assertThat(solEngNonDec1).isNotEqualTo(solEngNonDec2);
        solEngNonDec1.setId(null);
        assertThat(solEngNonDec1).isNotEqualTo(solEngNonDec2);
    }
}
