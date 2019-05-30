public class ReverseMessageService {

    private static final String SEPARATOR = " ";

    String reverseLettersInWords(String textForReverse) {

        String[] sSplitString = textForReverse.split(SEPARATOR);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < sSplitString.length; i++) {

            int k = 0;

            char[] lineArray = sSplitString[i].toCharArray();
            char[] anagramaArray = new char[lineArray.length];

            for (int j = 0; j < lineArray.length; j++) {
                if(!(Character.isLetter(lineArray[j]))) {
                    anagramaArray[j] = lineArray[j];
                }
            }

            for (int j = lineArray.length - 1; j >= 0; j--) {
                if(Character.isLetter(lineArray[j])) {
                    while(anagramaArray[k] != '\u0000') {
                        k = k + 1;
                    }

                    anagramaArray[k] = lineArray[j];
                    k = k + 1;
                }
            }

            String string = new String(anagramaArray);
            stringBuilder.append(string).append(SEPARATOR);
        }
        return stringBuilder.toString();
    }
}
