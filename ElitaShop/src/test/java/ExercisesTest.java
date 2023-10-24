import main.java.Exercises;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ExercisesTest {

    public static Stream<Arguments> newZerosArraysConditions() {
        return Stream.of(
                Arguments.arguments(-2, 0),
                Arguments.arguments(0, 0),
                Arguments.arguments(5, 5),
                Arguments.arguments(9, 9),
                Arguments.arguments(10, 10),
                Arguments.arguments(11, 10)
                );
    }

    @ParameterizedTest
    @MethodSource("newZerosArraysConditions")
    public void newZerosArrayTest(int actualSize, int expectedSize){
        //Given
        var obj = new Exercises();
        //When
        var expected = new int[expectedSize];
        var actual = obj.newZerosArray(actualSize);
        //Then
        assertArrayEquals(expected, actual);
    }


    public static Stream<Arguments> arrayFrom0ToSizeTestConditions() {
        return Stream.of(
                Arguments.arguments(-2, new int[]{}),
                Arguments.arguments(0, new int[]{}),
                Arguments.arguments(5, new int[]{0,1,2,3,4}),
                Arguments.arguments(1, new int[]{0}),
                Arguments.arguments(2, new int[]{0,1})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayFrom0ToSizeTestConditions")
    public void arrayFrom0ToSizeTest(int size, int[] expected){
        //Given
        var obj = new Exercises();
        //When
        var actual = obj.arrayFrom0ToSize(size);
        //Then
        assertArrayEquals(expected, actual);
    }

    public static Stream<Arguments> arrayWithMultipliedElementsConditions() {
        return Stream.of(
                Arguments.arguments(-2, 3, new int[]{}),
                Arguments.arguments(0, 2, new int[]{}),
                Arguments.arguments(5, 1, new int[]{0,1,2,3,4}),
                Arguments.arguments(1, 4, new int[]{0}),
                Arguments.arguments(2, 0, new int[]{0,0}),
                Arguments.arguments(5, 2, new int[]{0,2,4,6,8}),
                Arguments.arguments(3, 4, new int[]{0,4,8})
        );
    }

    @ParameterizedTest
    @MethodSource("arrayWithMultipliedElementsConditions")
    public void arrayWithMultipliedElementsTest(int size, int multiply,  int[] expected){
        //Given
        var obj = new Exercises();
        //When
        var actual = obj.arrayWithMultipliedElements(size, multiply);
        //Then
        assertArrayEquals(expected, actual);
    }


    public static Stream<Arguments> fibonacciArrayConditions() {
        return Stream.of(
                Arguments.arguments(-2, new int[]{}),
                Arguments.arguments(0, new int[]{}),
                Arguments.arguments(5, new int[]{0,1,1,2,3}),
                Arguments.arguments(1, new int[]{0}),
                Arguments.arguments(2, new int[]{0,1}),
                Arguments.arguments(9, new int[]{0,1,1,2,3,5,8,13,21}),
                Arguments.arguments(7, new int[]{0,1,1,2,3,5,8})
        );
    }

    @ParameterizedTest
    @MethodSource("fibonacciArrayConditions")
    public void fibonacciArrayTest(int size, int[] expected){
        //Given
        var obj = new Exercises();
        //When
        var actual = obj.fibonacciArray(size);
        //Then
        assertArrayEquals(expected, actual);
    }
}
