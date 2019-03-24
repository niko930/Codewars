public class CountingDuplicates {
    public static void main(String[] args) {

        String text = "Indivisibilities";

        int i = CountingDuplicates.duplicateCount(text);

        System.out.println(i);
    }

    private static int duplicateCount(String text) {
        text = text.toLowerCase();
        int count = 0;
        while(text.length() > 0){
            String checkStr = text.substring(0,1);
            text = text.substring(1);
            if(text.contains(checkStr)){
                count++;
                text = text.replace(checkStr,"");
            }
        }
        return count;
    }

}
