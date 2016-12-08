/**
 * Created by sontx on 12/8/2016.
 * Contact www.sontx.in
 */
public class MyString implements CharSequence {
    private char value[];

    public MyString(char[] _value) {
        value = new char[_value.length];
        System.arraycopy(_value, 0, value, 0, value.length);
        // reverse chars array :|
        for(int i = 0; i < value.length / 2; i++)
        {
            char temp = value[i];
            value[i] = value[value.length - i - 1];
            value[value.length - i - 1] = temp;
        }
    }

    private MyString() {}

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        return value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        char[] subValue = new char[end - start + 1];
        System.arraycopy(value, start, subValue, 0, subValue.length);
        MyString sequence = new MyString();
        sequence.value = subValue;
        return sequence;
    }

    @Override
    public String toString() {
        return new String(value);
    }

    public static void main(String[] args) {
        String testString = "son dep trai";
        char[] chars = new char[testString.length()];
        testString.getChars(0, chars.length, chars, 0);
        MyString myString = new MyString(chars);
        System.out.println("length() = " + myString.length());
        System.out.println("charAt[4] = " + myString.charAt(3));
        System.out.println("subSequence(4, 7) = " + myString.subSequence(3, 7));
        System.out.println("toString() = " + myString.toString());
    }
}
