class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5=0;
        int count10=0;
        for(int i:bills){
            switch(i){
                case 5:
                    count5++;
                    break;
                case 10:
                    count10++;
                    if(count5==0) return false;
                    else count5--;
                    break;
                case 20:
                    if(count10==0 && count5<3 || count10>0 && count5<1) return false;
                    else{
                        if(count10>0) {
                            count10--;
                            count5--;
                        }
                        else count5-=3;
                    }
                    break;
            }
        }
        return true;
    }
}