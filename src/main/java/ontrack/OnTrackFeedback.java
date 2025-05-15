package ontrack;

import java.util.*;

public class OnTrackFeedback {
    private static Map<String, String> feedbackStatusMap = new HashMap<>();

    static {
        feedbackStatusMap.put("task001", "Given");
        feedbackStatusMap.put("task002", "Pending");
    }

    public static String getFeedbackStatus(String taskId) {
        return feedbackStatusMap.getOrDefault(taskId, "Not Found");
    }
}
