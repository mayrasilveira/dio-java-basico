public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

       smartTv.ligar ();
       System.out.println("Novo status >> A TV está ligada? " + smartTv.ligada);

       smartTv.desligar ();
       System.out.println("Novo status >> A TV está ligada? " + smartTv.ligada);

       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.diminuirVolume();
       System.out.println("Volume atual: " + smartTv.volume);

       smartTv.aumentarCanal();
       System.out.println("Canal atual: " + smartTv.canal);

       smartTv.escolherCanal(3);
       System.out.println("Canal atual: " + smartTv.canal);




    }
}
