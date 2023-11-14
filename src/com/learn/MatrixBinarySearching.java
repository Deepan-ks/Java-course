package com.learn;

import java.util.Arrays;

public class MatrixBinarySearching {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,7)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(target > matrix[row][mid]){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1) ){ // while this is true it will have more than 2 rows
            int rMid = rStart + (rEnd - rStart) / 2;
            if(target == matrix[rMid][cMid]){
                return new int[]{rMid,cMid};
            }
            if(target > matrix[rMid][cMid]){
                rStart = rMid;
            }else{
                rEnd = rMid;
            }
        }

        // now we have 2 rows
        if(target == matrix[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        if(target == matrix[rStart + 1][cMid]){
            return new int[]{rStart + 1,cMid};
        }

        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix,rStart,0,cMid - 1,target);
        }
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix,rStart,cMid + 1,cols - 1,target);
        }
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix,rStart + 1,0,cMid - 1,target);
        }
        else{
            return binarySearch(matrix,rStart + 1,cMid + 1,cols - 1,target);
        }
    }
}
