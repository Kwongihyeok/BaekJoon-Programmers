class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int ex_name = 0;
        for (int i = 0; i < array.length-1; i++) {
			boolean flag = true;
			for (int j = 0; j < array.length-1; j++) {
				if(array[j]<array[j+1]) { 
					ex_name = array[j];
					array[j] = array[j+1];
					array[j+1] = ex_name;
					flag = false;
				}
			}
			if(flag) break;
		}
        answer = array[array.length/2];
        return answer;
    }
}