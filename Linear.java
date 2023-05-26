
/**
 *
 * @author 4715
 */
public class Linear {
        public static void main(String[] args) {
            //menemukan bilangan bulat maksimum dengan panjang yang tidak diketahui.
            int[] arr = {33, -1, 0, 89, 9, 62, 8, 2, 97};
            int max = maxNum(arr);
            System.out.println(max);
        }

        static int maxNum(int[] arr){
            // returns -1 if length of array is zero
            if(arr.length == 0){
                return -1;
            }
            // making the first element constant for comparison
            int temp = arr[0];

            // loop running  through the entire array
            for (int i = 0; i < arr.length; i++) {

                // checking the specific element greater than constant
                if(arr[i] > temp) {
                    temp = arr[i]; // setting the max element to the constant
                }
            }
            // returning the max at the end
            return temp;

        }
    }
