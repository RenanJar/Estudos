public class Cachorro extends Lobo{

    public void reagir(String Frase){
        if(Frase.equals("Toma comida")||Frase.equals("Olá")){
            System.out.println("abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora,int min){
        if(hora<12){
            System.out.println("Abanar");
        }
        else if(hora>=18){
            System.out.println("Ignorar");
        }
        else{
            System.out.println("Abanar e latir");

        }
    }

    public void reagir(boolean dono){
    if(dono==true){
        System.out.println("Abanar");
    }else {
        System.out.println("Rosnar e Latir");
    }
    }


    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }

}
