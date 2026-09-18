class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {  
    List<Integer> list = new ArrayList<>();  
    if (matrix.length == 0 || matrix[0].length == 0) return list;  
    int lcol = 0, rcol = matrix[0].length - 1;  
    int trow = 0, brow = matrix.length - 1;  
    while (lcol <= rcol && trow <= brow) {   
        for (int i = lcol; i <= rcol; i++) {  
            list.add(matrix[trow][i]);  
        }  
        trow++;  
        for (int i = trow; i <= brow; i++) {  
            list.add(matrix[i][rcol]);  
        }  
        rcol--;  
        if (trow <= brow) {  
            for (int i = rcol; i >= lcol; i--) {  
                list.add(matrix[brow][i]);  
            }  
            brow--;  
        }    
        if (lcol <= rcol) {  
            for (int i = brow; i >= trow; i--) {  
                list.add(matrix[i][lcol]);  
            }  
            lcol++;  
        }  
    }  
    return list;  
}
}