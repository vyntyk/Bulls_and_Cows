class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder sb = new StringBuilder();
        char letter = 'A';
        for (letter = 'A'; letter <= 'Z'; letter++) {
            sb.append(" ").append(letter);
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}