package npe;

import org.junit.jupiter.api.Test;

public class NPEShould {
    @Test
    void be_helpful() {
        String s = null;
        s.toLowerCase().replaceAll("a","b").isBlank(); //NPE
    }
}
