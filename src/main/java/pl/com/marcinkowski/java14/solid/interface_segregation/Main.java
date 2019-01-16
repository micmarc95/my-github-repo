package pl.com.marcinkowski.java14.solid.interface_segregation;

public class Main {

    public static void main(String[] args) {


        WashMachine polishEngineWashMachine = new WashMachine(new PolishWrapperEngine(new RadomEngine()));
        polishEngineWashMachine.beginWash();

        WashMachine chineseEngineWashMachine = new WashMachine(new ChineseWrapperEngine(new ChineseEngine()));
        chineseEngineWashMachine.beginWash();

        WashMachine hindiEngineWashMachine = new WashMachine(new HindiWrapperEngine(new HindiEngine()));
        hindiEngineWashMachine.beginWash();

        WashMachine russianEngineWashMachine = new WashMachine(new RussianEngineWrapper(new RussianEngine()));
        russianEngineWashMachine.beginWash();
        russianEngineWashMachine.endWash();
    }
}
