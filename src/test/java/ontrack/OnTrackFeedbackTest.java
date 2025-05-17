package ontrack;

import org.junit.Test;
import static org.junit.Assert.*;

public class OnTrackFeedbackTest {

    @Test
    public void testFeedbackGiven() {
        assertEquals("Given", OnTrackFeedback.getFeedbackStatus("task001"));
    }

    @Test
    public void testFeedbackPending() {
        assertEquals("Pending", OnTrackFeedback.getFeedbackStatus("task002"));
    }

    @Test
    public void testFeedbackNotFound() {
        assertEquals("Not Found", OnTrackFeedback.getFeedbackStatus("task999"));
    }

    // ❌ Intentionally failing test for CI demonstration
    @Test
    public void testForceFail() {
        assertEquals("Given", OnTrackFeedback.getFeedbackStatus("task999"));  // Will fail
    }
}
