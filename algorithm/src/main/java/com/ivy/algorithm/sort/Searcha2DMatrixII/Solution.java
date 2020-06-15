package com.ivy.algorithm.sort.Searcha2DMatrixII;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int startX = 0, startY = 0;
        int endX = matrix[0].length-1,endY = matrix.length-1;
        return search(matrix, target, startX, startY, endX, endY);
    }

    private boolean search(int[][] matrix, int target, int startX, int startY, int endX, int endY) {
        if (startX < 0 || startY < 0 || endY > matrix.length - 1 || endX > matrix[0].length - 1) {
            return false;
        }
        if (startX > endX || startY > endY) {
            return false;
        }
        int middleX = startX + (endX -startX)/2;
        int middleY = startY + (endY -startY)/2;
        if (matrix[middleY][middleX] == target) {
            return true;
        } else if (matrix[middleY][middleX] < target) {
            return search(matrix,target,middleX+1,startY,endX,middleY)
                    ||search(matrix,target,startX,middleY+1,endX,endY);
        }else{
            return search(matrix,target,startX,startY,endX,middleY-1)
                    ||search(matrix,target,startX,middleY,middleX-1,endY);
        }
    }
}
