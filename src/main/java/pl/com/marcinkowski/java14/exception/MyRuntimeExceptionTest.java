package pl.com.marcinkowski.java14.exception;

public class MyRuntimeExceptionTest {
    public static void main(String[] args) {
        //3 levels
        // level 3 - throw MyRuntimeException
        //catch in main()

        try{level1();}
        catch (MyRuntimeException exc)
        {exc.printStackTrace();}
    }

    public static void level1() {
        level2();
    }
    public static void level2() {
        level3();
    }
    /**
     * @throws MyRuntimeException
     */
    public static void level3() throws MyRuntimeException{
        throw new MyRuntimeException("Problem on level 3");

    }
}
