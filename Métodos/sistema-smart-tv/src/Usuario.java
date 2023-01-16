public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Está ligada? " + smartTv.ligada);
        System.out.println("Canal da tv: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Está ligada? " + smartTv.ligada);

        smartTv.mudarCanal(9);
        System.out.println("Canal da tv: " + smartTv.canal);
    }
}
