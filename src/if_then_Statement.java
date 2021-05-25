public class if_then_Statement {
    public static void main(String[] args){
        //if-then Statement is to execute a certain section of code only only
        //

        boolean subjectfail = false;
        //if clause:Student has to fail subject
        if(subjectfail=true){
            //then clause:Print You failed subject
            System.out.println("You Failed");
        }

        //if-then-else
        //else clause: Print you passed Statement
        else{
            System.out.println("You passed");
        }

        //Ternary Operator

        int a = 10;
        int b = 2;
        int division = a/b;
        boolean remainder_value = (division==0)?true:false;
        //Conditional
        if(!remainder_value){
            System.out.println("Remainder is 0 ");
        }
        else
        {
            System.out.println("Remainder is Not 0");
        }
    }
}
