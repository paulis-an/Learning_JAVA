package Lession13;

public class Empoyee {
    public static void main(String[] args) {
        switch ("Sreda"){
            case "Ponedelnik":
                case "Vtornik":
                    case "Sreda":
                        case "Chetverg":
                            case "Pyatnica":
                System.out.println("Rabota do 18:00");break;
            case "Subbota":
                System.out.println("Rabota do 14:00");break;
            case "Voskresenie":
                System.out.println("Vyhodnoy");break;
            default:
                System.out.println("Error");
        }
    }
}
