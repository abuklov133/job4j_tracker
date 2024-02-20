package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("The index cannot be less then 0");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] value = {"A", "B", "C"};
        try {
            int index = indexOf(value, "E");
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
