class Util {
    public static String capitalize(String str) {
        System.out.println("Before: " + str);
        if (str == null || str.isBlank()) {
            return str;
        }

        if (str.length() == 1) {
            return str.toUpperCase();
        }

        String ret = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println("After: " + ret);
        return ret;
    }
}