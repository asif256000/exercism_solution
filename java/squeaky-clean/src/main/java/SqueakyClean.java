class SqueakyClean {

    static String clean(String identifier) {
        identifier = identifier.replace(' ', '_').replace('4', 'a').replace('3', 'e')
        .replace('0', 'o').replace('1', 'l').replace('7', 't');

        StringBuilder cleaned = new StringBuilder();
        boolean toUpper = false;
        for (char c: identifier.toCharArray()) {
            if (!(Character.isLetter(c) || Character.isDigit(c) || c == '_' || c == '-')) {
                continue;
            }
            if (c == '-') {
                toUpper = true;
            } else {
                if (toUpper) {
                    cleaned.append(Character.toUpperCase(c));
                    toUpper = false;
                } else {
                    cleaned.append(c);
                }
            }
        }
        return cleaned.toString();
    }
}
