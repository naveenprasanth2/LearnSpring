package com.dailycodebuffer.learnspring.calculation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private final DataService dataService;

    public BusinessCalculationService(@Qualifier("com.dailycodebuffer.learnspring.calculation.mongoDBDataService") DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        System.out.println("Entered findMax method");
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
