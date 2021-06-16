public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        char ch;
        boolean captial = false;
        for(int i = 0; i < myString.length(); i++) {
            ch = myString.charAt(i);
            if (Character.isUpperCase(ch)) {
                captial = true;
            }
        }
        return captial;
    }

}

