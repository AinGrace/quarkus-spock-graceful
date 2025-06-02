package com.aingrace.test.spock;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MockTestService {

    @Inject
    InjectTestService testService;

    public String getSuffix() {
        return testService.getSuffix();
    }

    public String getSuffix(String value) {
        return testService.getSuffix(value);
    }
}
