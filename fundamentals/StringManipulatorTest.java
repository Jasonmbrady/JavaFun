public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator manipulator1 = new StringManipulator();
        String str1 = manipulator1.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str1);

        StringManipulator manipulator2 = new StringManipulator();
        char letter2 = 'o';
        Integer a2 = manipulator2.getIndexOrNull("Coding", letter2);
        Integer b2 = manipulator2.getIndexOrNull("Hello World", letter2);
        Integer c2 = manipulator2.getIndexOrNull("Hi", letter2);
        System.out.println(a2); // 1
        System.out.println(b2); // 4
        System.out.println(c2); // null

        StringManipulator manipulator3 = new StringManipulator();
        String word3 = "Hello";
        String subString3 = "llo";
        String notSubString3 = "world";
        Integer a3 = manipulator3.getIndexOrNull(word3, subString3);
        Integer b3 = manipulator3.getIndexOrNull(word3, notSubString3);
        System.out.println(a3); // 2
        System.out.println(b3); // null

        StringManipulator manipulator4= new StringManipulator();
        String word4= manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word4);
            }
}