package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class srtingShould {
    @Test
    void be_presented_by_text_blocks() {
        String s = "<HTML>"
                + "\n    <BODY>"
                + "\n        Hello World!"
                + "\n    </BODY>"
                + "\n</HTML>";
        String textBlock = """
                <HTML>
                    <BODY>
                        Hello World!
                    </BODY>
                </HTML>""";

        Assertions.assertThat(s).isEqualTo(textBlock);
    }
}
