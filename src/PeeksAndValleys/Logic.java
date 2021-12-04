package PeeksAndValleys;
public class Logic {

    private static final int GROUND_LEVEL = 0;


    public int getLevel(String str) {
        int level= 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'C') {
                level++;
            } else if (c == 'B') {
                level--;
            }
        }
        return level;
    }

    public String convertIntLevelToStringLevel(int level){
        if(level == GROUND_LEVEL){
            return "Ground";
        }else if(level > GROUND_LEVEL){
            return level +" Peek(s) Above Ground";
        }else {
            return level +" Valley(s) Below Ground";
        }
    }
}
