package com.spminfiscaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.spminfiscaa.web.rest.TestUtil;

public class ServPreDetteIntStrucTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ServPreDetteIntStruc.class);
        ServPreDetteIntStruc servPreDetteIntStruc1 = new ServPreDetteIntStruc();
        servPreDetteIntStruc1.setId(1L);
        ServPreDetteIntStruc servPreDetteIntStruc2 = new ServPreDetteIntStruc();
        servPreDetteIntStruc2.setId(servPreDetteIntStruc1.getId());
        assertThat(servPreDetteIntStruc1).isEqualTo(servPreDetteIntStruc2);
        servPreDetteIntStruc2.setId(2L);
        assertThat(servPreDetteIntStruc1).isNotEqualTo(servPreDetteIntStruc2);
        servPreDetteIntStruc1.setId(null);
        assertThat(servPreDetteIntStruc1).isNotEqualTo(servPreDetteIntStruc2);
    }
}
