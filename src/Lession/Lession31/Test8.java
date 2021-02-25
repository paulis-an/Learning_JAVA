package Lession.Lession31;

public class Test8 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernutNoguException {
        if(tempBega > 12) {
            throw new PodvernutNoguException("Temp bega slishkom vysokiy: " + tempBega);
        }
        if (temperaturaVozduha > 29) {
            throw new SveloMyshcuException();
        }
        System.out.println("Vy probezhali marafon!!!");
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        try {
            t.marafon(31, 9);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Vy poluchite gramotu...");
        }
    }

    class PodvernutNoguException extends Exception {
        PodvernutNoguException (String message){
            super(message);
        }
    }

    class SveloMyshcuException extends RuntimeException {
        SveloMyshcuException (){
        }
    }



}
