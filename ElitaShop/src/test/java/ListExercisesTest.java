import main.java.Exercises;
import main.java.ListExercises;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ListExercisesTest {

    @Test
    public void sumElementsTest(){
        //Given
        var obj = new ListExercises();
        var list = List.of(3,5,7,1,2);
        var expected = 18;
        //When
        var result = obj.sumElements(list);
        //Then
        assertEquals(expected,result);
    }

    @Test
    public void addEvenElementsOfListTest(){
        //Given
        var obj = new ListExercises();
        obj.getArrL().add(1);
        obj.getArrL().add(2);
        obj.getArrL().add(5);
        obj.getArrL().add(4);
        obj.getArrL().add(2);
        var expected = List.of(1,2,5,4,2,2,4,2);
        //When
        obj.addEvenElementsOfList();
        //Then
        assertEquals(expected,obj.getArrL());
    }

    @Test
    public void getElementsLessThanTest(){
        //Given
        var obj = new ListExercises();
        obj.getArrL().add(1);
        obj.getArrL().add(2);
        obj.getArrL().add(5);
        obj.getArrL().add(4);
        obj.getArrL().add(2);
        var expected = new int[] {1,2,2,0,0,0,0,0,0,0};
        //When
        var result = obj.getElementsLessThan(3);
        //Then
        assertTrue(Arrays.equals(expected,result));
    }

    @Test
    public void deleteAndReturnElementsLessThanTest(){
        //Given
        var obj = new ListExercises();
        var expected = List.of(3,4,1,2);
        //When
        var result = obj.deleteAndReturnElementsLessThan(5);
        //Then
        assertEquals(expected,result);
    }

    public static Stream<Arguments> addAtSpecifiedPositionConditions() {
        return Stream.of(
                Arguments.arguments(10, 0, List.of(10,3,4,7,1,2)),
                Arguments.arguments(2, 2, List.of(3,4,2,7,1,2)),
                Arguments.arguments(-2, 5, List.of(3,4,7,1,2,-2)),
                Arguments.arguments(-2, 6, List.of(3,4,7,1,2,-2)),
                Arguments.arguments(3, -1, List.of(3,3,4,7,1,2)),
                Arguments.arguments(1, 1, List.of(3,1,4,7,1,2))
        );
    }

    @ParameterizedTest
    @MethodSource("addAtSpecifiedPositionConditions")
    public void addAtSpecifiedPositionTest(int value, int position, List<Integer> expected){
        //Given
        var obj = new ListExercises();
        //When
        var actual = obj.addAtSpecifiedPosition(value, position);
        //Then
        assertEquals(expected, actual);
    }
}
