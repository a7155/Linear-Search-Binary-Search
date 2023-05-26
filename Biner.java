
/**
 *
 * @author 4715
 */
public class Biner {
    //Tulis sebuah program untuk menemukan integer target dalam sebuah array. Dimana angka plafon adalah angka terkecil yang lebih besar atau sama dengan target yang diberikan. 
    //[2, 4, 6, 7, 9, 10, 16, 18, 21]dengan target 11
        public static void main(String[] args) {
            // given array for testing
            int[] arr = {2, 4, 6, 7, 9, 10, 16, 18, 21};

            int target = 12;

            int ans = ceiling(arr, target);

            System.out.println(ans); // prints 16
        }
    //    return smallest number >= target
        static int ceiling(int[] ar, int target){
            int start = 0;
            int end = ar.length - 1;

            // while start index is not greater than end index
            while(start <= end){
                int mid = start + (end - start) / 2;

                // if target is not found in ascending array, return -1
                if(target > ar[ar.length - 1] ) {
                    return -1;
                }

                // if target is greater than element at mid, shift end index to element before mid
                if(target < ar[mid]){
                    end = mid -1;
                }
                // else if target is less than element at mid, shift start index to element after mid
                else if(target > ar[mid]){
                    start = mid + 1;
                }
                // else mid element is the answer, return mid
                else {
                    return mid;
                }
            }
            // case when it remains only one element --> worst case where start > end
            return ar[start];

        }
    }
