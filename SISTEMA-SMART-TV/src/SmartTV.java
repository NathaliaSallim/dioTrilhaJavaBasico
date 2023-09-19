public class SmartTV {
       boolean ligada = false;
       int canal = 1;
       int volume = 25;

       public void mudarCanal (int novoCanal) {
        canal = novoCanal;
       }
       public void aumentarCanal() {
        canal++;
       }

        public void diminuirCanal() {
        canal--;
       }

       //metodo volume
       public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
       }

       //metodo diminuir volume
       public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
       }

       //metodo ligar
       public void ligar() {
        ligada = true;
       }
       //metodo desligar
       public void desligar() {
        ligada = false;
       }
    
}
