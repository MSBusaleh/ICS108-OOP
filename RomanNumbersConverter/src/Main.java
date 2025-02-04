import static java.lang.Math.sqrt;

class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        double darea = area;
        if((sqrt(darea)) % 1.0 == 0){
            result[0]= (Int) (sqrt(darea)/1);
            result[1]= sqrt(darea);
        }
        else{
            result[0]= area;
            result[1]= 1;
            int diff = area - 1;
            for(int i = 2; i < area; i++){
                for(int j = i; j < area; j++){
                    if(i*j == area && j>=i && j-i<diff){
                        result[0]= j;
                        result[1]= i;
                        diff = j-i;
                    }
                }
            }
        }

        return result;
    }
}