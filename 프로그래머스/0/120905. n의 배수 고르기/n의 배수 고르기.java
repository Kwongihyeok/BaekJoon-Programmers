class Solution {
    public int[] solution(int n, int[] numlist) {        
        int[] answer = {};
        int cnt = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i]%n == 0)
                cnt++;
        }
        int j = 0;
        answer = new int[cnt];
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i]%n == 0){
                answer[j] = numlist[i];
                j++;
            }
        }
        
        return answer;
    }
}