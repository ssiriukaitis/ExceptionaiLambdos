package Dalyba;

public class ArgumentIsZeroException extends Throwable {

    String message;

    public ArgumentIsZeroException(String additional1){
        message = "Negalime dalinti, nes " + additional1 + " skaicius/iai yra nulis";
    }

    public ArgumentIsZeroException(String additional1, String additional2) {
        message =
                String.format("Negalime dalinti, nes %s ir %s skaiciai turi po Nuli",
                        additional1,
                        additional2);
    }


    @Override
    public String toString() {
        return message;
    }
}
