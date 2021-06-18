public class KontoBankowe {

        public KontoBankowe(){
            saldo = 1000;
        }
        private int saldo;

        int getSaldo(){
            return saldo;
        }
        private boolean setSaldo(int saldo){
            // warunki
            this.saldo = saldo;
            return true;
        }
        boolean wyplac(int ile){
            if (saldo<ile)
                return false;
            else
                setSaldo(saldo-ile);
            return true;
        }
        boolean wplac(int ile){
            setSaldo(saldo+ile);
            return true;
        }
}
