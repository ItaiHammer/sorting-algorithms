import Interfaces.SearchingAlgorithm;

public class BinarySearchRecursive implements SearchingAlgorithm {
    public int search(int[] arr, int target, int left, int right) {
        if (right == left) return -1;
        int mid = (left + right)/2;

        if (arr[mid] == target) {
            return mid;
        }else if (arr[mid] > target) {
            left = mid + 1;
        }else {
            right = mid-1;
        }

        return search(arr, target, left, right);
    }
    
}
