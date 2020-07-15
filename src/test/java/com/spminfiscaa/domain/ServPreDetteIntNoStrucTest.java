package com.spminfiscaa.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.spminfiscaa.web.rest.TestUtil;

public class ServPreDetteIntNoStrucTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(ServPreDetteIntNoStruc.class);
        ServPreDetteIntNoStruc servPreDetteIntNoStruc1 = new ServPreDetteIntNoStruc();
        servPreDetteIntNoStruc1.setId(1L);
        ServPreDetteIntNoStruc servPreDetteIntNoStruc2 = new ServPreDetteIntNoStruc();
        servPreDetteIntNoStruc2.setId(servPreDetteIntNoStruc1.getId());
        assertThat(servPreDetteIntNoStruc1).isEqualTo(servPreDetteIntNoStruc2);
        servPreDetteIntNoStruc2.setId(2L);
        assertThat(servPreDetteIntNoStruc1).isNotEqualTo(servPreDetteIntNoStruc2);
        servPreDetteIntNoStruc1.setId(null);
        assertThat(servPreDetteIntNoStruc1).isNotEqualTo(servPreDetteIntNoStruc2);
    }
}
