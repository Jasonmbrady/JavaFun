public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        return str1.trim() + str2.trim();
    }

    public Integer getIndexOrNull(String str, char character){
        return str.indexOf(character);
    }

    public Integer getIndexOrNull(String str, String subStr){
        return str.indexOf(subStr);
    }

    public String concatSubstring(String str, int num1, int num2, String str2) {
        return str.substring(num1, num2) + str2;
    }
}   