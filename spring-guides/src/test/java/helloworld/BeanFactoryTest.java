package helloworld;

import com.luo.spring.guides.helloworld.common.TestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.lang.Nullable;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : archer
 * @date : Created in 2022/9/28 17:41
 * @description :
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

    private static final String START_COMMENT = "<!--";
    private static final String END_COMMENT = "-->";
    private boolean inComment;

    @Test
    public void testSimpleLoad() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanfactory-test.xml"));
        TestBean testBean = (TestBean) beanFactory.getBean("testBean");
        assertEquals("helloworld", testBean.getTestStr());
    }

    @Test
    public void test(){
        this.inComment = false;
        String line = "<!-- 321321321";
        String s = consumeCommentTokens(line);
        System.out.println();
    }

    private String consumeCommentTokens(String line) {
        int indexOfStartComment = line.indexOf(START_COMMENT);
        if (indexOfStartComment == -1 && !line.contains(END_COMMENT)) {
            return line;
        }

        String result = "";
        String currLine = line;
        if (!this.inComment && (indexOfStartComment >= 0)) {
            result = line.substring(0, indexOfStartComment);
            currLine = line.substring(indexOfStartComment);
        }

        if ((currLine = consume(currLine)) != null) {
            result += consumeCommentTokens(currLine);
        }
        return result;
    }

    /**
     * Consume the next comment token, update the "inComment" flag,
     * and return the remaining content.
     */
    @Nullable
    private String consume(String line) {
        int index = (this.inComment ? endComment(line) : startComment(line));
        return (index == -1 ? null : line.substring(index));
    }

    /**
     * Try to consume the {@link #START_COMMENT} token.
     * @see #commentToken(String, String, boolean)
     */
    private int startComment(String line) {
        return commentToken(line, START_COMMENT, true);
    }

    /**
     * Try to consume the {@link #END_COMMENT} token.
     * @see #commentToken(String, String, boolean)
     */
    private int endComment(String line) {
        return commentToken(line, END_COMMENT, false);
    }

    /**
     * Try to consume the supplied token against the supplied content and update the
     * "in comment" parse state to the supplied value.
     * <p>Returns the index into the content which is after the token or -1 if the
     * token is not found.
     */
    private int commentToken(String line, String token, boolean inCommentIfPresent) {
        int index = line.indexOf(token);
        if (index > - 1) {
            this.inComment = inCommentIfPresent;
        }
        return (index == -1 ? index : index + token.length());
    }
}
