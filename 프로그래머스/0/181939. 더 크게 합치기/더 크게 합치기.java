class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String f = a + "" + b;
        String s = b+""+a;
        if (Integer.parseInt(f) > Integer.parseInt(s)){
            answer = Integer.parseInt(f);
            
        }else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}