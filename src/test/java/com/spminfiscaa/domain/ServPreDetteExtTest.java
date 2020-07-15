package com.spminfiscaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.spminfiscaa.web.rest.TestUtil;

public class ServPreDetteExtTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ServPreDetteExt.class);
        ServPreDetteExt servPreDetteExt1 = new ServPreDetteExt();
        servPreDetteExt1.setId(1L);
        ServPreDetteExt servPreDetteExt2 = new ServPreDetteExt();
        servPreDetteExt2.setId(servPreDetteExt1.getId());
        assertThat(servPreDetteExt1).isEqualTo(servPreDetteExt2);
        servPreDetteExt2.setId(2L);
        assertThat(servPreDetteExt1).isNotEqualTo(servPreDetteExt2);
        servPreDetteExt1.setId(null);
        assertThat(servPreDetteExt1).isNotEqualTo(servPreDetteExt2);
    }
}
