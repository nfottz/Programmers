class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0, length = seoul.length; i < length; i++){
            if(seoul[i].contains("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}