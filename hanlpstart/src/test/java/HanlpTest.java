import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import org.junit.Test;

import java.util.List;

/**
 * @author Leslie Lee
 * CreateOn 2018/7/31
 */
public class HanlpTest {

    @Test
    public void should_nlp() {
        List<Term> terms = HanLP.segment("今天天气不错哦，一起来玩吧");
        terms.forEach(System.out::println);
    }
}
