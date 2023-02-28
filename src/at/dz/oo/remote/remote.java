package at.dz.oo.remote;


public class remote {
        private battery battery1;
        private battery battery2;

        public remote(battery battery1, battery battery2) {
            this.battery1 = battery1;
            this.battery2 = battery2;
        }

        public void turnOn() {
            battery1.consume(5);
            battery2.consume(5);
            System.out.println("Verbraucher angeschlossen");
        }

        public void turnOff() {
            System.out.println("Kein Verbraucher angeschlossen");
        }

        public int getStatus() {
            return (battery1.getLevel() + battery2.getLevel()) / 2;
        }
    }
