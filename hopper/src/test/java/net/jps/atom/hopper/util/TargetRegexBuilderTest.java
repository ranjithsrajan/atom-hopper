package net.jps.atom.hopper.util;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @author zinic
 */
@RunWith(Enclosed.class)
public class TargetRegexBuilderTest {

    public static class WhenCopyingTargetRegexBuilders extends TargetRegexBuilderTestParent {

        @Test
        public void shouldCopyBuilderElements() {
            final TargetRegexBuilder expected = feedRegexBuilder();
            final TargetRegexBuilder actual = new TargetRegexBuilder(expected);            
            
            assertEquals("TargetRegexBuilder copy must populate the context path", expected.getContextPath(), actual.getContextPath());
            assertEquals("TargetRegexBuilder copy must populate the workspace path", expected.getWorkspace(), actual.getWorkspace());
            assertEquals("TargetRegexBuilder copy must populate the feed path", expected.getFeed(), actual.getFeed());
        }
    }
}