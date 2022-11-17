package org.gft;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LeapYearTest {


    @ParameterizedTest(name = "Run: {index}  -  value: {arguments}")
    @ValueSource(ints = {5832,392,2528})
    void LeapYearDivisibleBy4(int years){
        Year year = new Year(years);

        assertTrue(year.isLeap());
    }

    @ParameterizedTest(name = "Run: {index}  -  Year: {arguments}")
    @ValueSource(ints = {333,6537,1254})
    void LeapYearNotDivisibleBy4(int years){
        Year year = new Year(years);

        assertFalse(year.isLeap());
    }

    @ParameterizedTest(name = "Run: {index}  -  value: {arguments}")
    @ValueSource(ints = {400,1200,2800})
    void LeapYearDivisibleBy400(int years){
        Year year = new Year(years);

        assertTrue(year.isLeap());
    }

    @ParameterizedTest(name = "Run: {index}  -  value: {arguments}")
    @ValueSource(ints = {200,1000,9000})
    void LeapYearNotDivisibleBy400(int years){
        Year year = new Year(years);

        assertFalse(year.isLeap());
    }
}
