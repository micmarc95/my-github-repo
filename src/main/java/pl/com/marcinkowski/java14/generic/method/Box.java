package pl.com.marcinkowski.java14.generic.method;

public class Box {
    private String string;
    private Object object;
    private Integer integer;
    private Double aDouble;

    public Box(String string, Object object, Integer integer, Double aDouble) {
        this.string = validate(string);
        this.object = validate(object);
        this.integer = validate(integer);
        this.aDouble = validate(aDouble);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = validate(string);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = validate(object);
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = validate(integer);
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = validate(aDouble);
    }

    @Override
    public String toString() {
        return "Box{" +
                "string='" + string + '\'' +
                ", object=" + object +
                ", integer=" + integer +
                ", aDouble=" + aDouble +
                '}';
    }

    private <T> T validate (T value){
        if (value == null){
            throw new IllegalArgumentException("String cannot be null");
        }
        return value;
    }

//    private Object validateObject (Object object){
//        if (object == null){
//            throw new IllegalArgumentException("Object cannot be null");
//        }
//        return object;
//    }
//
//    private Integer validateInteger (Integer integer){
//        if (integer == null){
//            throw new IllegalArgumentException("Integer cannot be null");
//        }
//        return integer;
//    }
//
//    private Double validateDouble (Double aDouble){
//        if (aDouble == null){
//            throw new IllegalArgumentException("aDouble cannot be null");
//        }
//        return aDouble;
//    }

}
