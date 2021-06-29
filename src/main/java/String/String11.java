package String;

public class String11 {

    private int getDigitFromRight(String str, int position) {
        if (str.length() > position) {
            return str.charAt(str.length() - position - 1) - '0';
        }
        return 0;
    }

    private String removeZeroPadding(String str){
        int foundIndex = 0;
        while (foundIndex < str.length() - 1 && str.charAt(foundIndex) == '0'){
            foundIndex ++;
        }
        return str.substring(foundIndex);
    }

    public String subtract(String a, String b) {
        a = removeZeroPadding(a);
        b = removeZeroPadding(b);

        if(b.length() > a.length()){
            return  "-" + internalSubtract(b, a);
        }
        else if((a.length() == b.length() && a.compareTo(b) < 0)){
            return  "-" + internalSubtract(b, a);
        }

        return internalSubtract(a, b);
    }

    private String internalSubtract(String max, String min) {

        StringBuilder result = new StringBuilder();
        int memory = 0;
        for (int i = 0; i < max.length(); i++) {
            int currentMinus = getDigitFromRight(max, i) - getDigitFromRight(min, i) - memory;
            memory = 0;
            if (currentMinus < 0) {
                currentMinus += 10;
                memory = 1;
            }
            result.insert(0, currentMinus);
        }

        return removeZeroPadding(result.toString());
    }
}