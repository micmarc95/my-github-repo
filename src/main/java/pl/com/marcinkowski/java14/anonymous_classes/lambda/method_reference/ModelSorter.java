package pl.com.marcinkowski.java14.anonymous_classes.lambda.method_reference;

public class ModelSorter {

    public static int modelOrder (String model1, String model2){
        return model2.compareTo(model1);
    }
}
