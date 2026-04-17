/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 import java.util.*;
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peak(target, mountainArr);
        int ans = leftSide(target, mountainArr, peak);

        if(ans == -1)
            ans = rightSide(target, mountainArr, peak);

        return ans;
    }

    static int peak(int target, MountainArray mountainArr){
        int start = 1;
        int end = mountainArr.length() - 2;
        int peak = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            int leftOfMidValue = mountainArr.get(mid - 1);
            int rightOfMidValue = mountainArr.get(mid + 1);

            if(midValue > leftOfMidValue && midValue > rightOfMidValue){
                peak = mid;
                break;
            }

            else if(midValue < rightOfMidValue){
                start = mid + 1;
            }

            else if(midValue > rightOfMidValue){
                end = mid - 1;
            }
        }

        return peak;
    }

    static int leftSide(int target, MountainArray mountainArr, int peak){
        int start = 0;
        int end = peak;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if(midValue == target){
                ans = mid;
                break;
            }

            else if(midValue < target){
                start = mid + 1;
            }

            else if(midValue > target){
                end = mid - 1;
            }
        }

        return ans;
    }

    static int rightSide(int target, MountainArray mountainArr, int peak){
        int start = peak;
        int end = mountainArr.length() - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if(midValue == target){
                ans = mid;
                break;
            }

            else if(midValue < target){
                end = mid - 1;
            }

            else if(midValue > target){
                start = mid + 1;
            }
        }

        return ans;
    }
}