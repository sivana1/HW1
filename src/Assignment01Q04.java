import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array== null || array.length <=1 || move ==0){
            return array;
        }
        if (direction != 'R' && direction != 'L'){
            return array;
        }
        int n =array.length;
        if (move < 0) {
        move = -move;
        if (direction == 'R') {
            direction = 'L';
        } else {
            direction = 'R';
        }
        }

        move = move % n;
        if (move==0){
            return array;
        }
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
        if (direction == 'R') {
            int newIndex = (i + move) % n;
            temp[newIndex] = array[i];
        } else { // direction == 'L'
            int newIndex = (i - move + n) % n;
            temp[newIndex] = array[i];
        }
        }
        for (int i = 0; i < n; i++) {
        array[i] = temp[i];
        }
        // TODO: implement
         return array;
        
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}