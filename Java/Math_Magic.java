public class Math_Magic
{
    public static void main(String[] args)
    {
        /**
         *  No matter what value you put for myNumber,
         *  The output would always be the same!!
         *  MATH MAGIIIIICCCCC!!!!
         * 
         */

        int myNumber = 20;   //original number
        int stepOne = myNumber * myNumber;
        int stepTwo = myNumber + stepOne;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive/6;

        System.out.println(stepSix);    

    }
    

}