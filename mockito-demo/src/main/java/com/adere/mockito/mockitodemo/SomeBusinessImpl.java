package com.adere.mockito.mockitodemo;

/**
 * Created by adere on 1.11.2018.
 */
public class SomeBusinessImpl {

    private DataService dataService;

    int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();

        int maxValue = Integer.MIN_VALUE;
        for (int i: data) {
            if (i > maxValue) {
                maxValue = i;
            }
        }

        return maxValue;
    }

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }
}