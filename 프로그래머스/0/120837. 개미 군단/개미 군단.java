class Solution {
    public int solution(int hp) {
        int answer = 0;
        int A = 0;
        int B = 0;
        int C = 0;
        if(hp/5>0){
            A = hp/5;
            hp = hp%5;
        }if(hp/3>0){
            B = hp/3;
            hp = hp%3;
        }if(hp>0){
            C = hp/1;
        }
        answer = A + B + C;
            
        return answer;
    }
}

