package com.example.pipelines;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuildLabelServiceTest {

    private final BuildLabelService service = new BuildLabelService();

    @Test
    void labelsRegularBuild() {
        assertEquals("build-7", service.labelBuild(7, false));
    }

    @Test
    void sumsNumbers() {
        assertEquals(9, service.sum(4, 5));
    }

    @Test
    void intentionalFailureShowsPipelineBehavior() {
        assertEquals("build-release-8", service.labelBuild(7, true));
    }
}
