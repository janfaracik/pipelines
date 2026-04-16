package com.example.pipelines;

import java.util.*;

public class BuildLabelService {

    public String labelBuild(int buildNumber, boolean release) {
        List<String> labels = new ArrayList<>();
        labels.add("build");

        if (release)
            labels.add("release");

        return String.join("-", labels) + "-" + buildNumber;
    }

    public int sum(int left, int right) {
        return left + right;
    }
}
