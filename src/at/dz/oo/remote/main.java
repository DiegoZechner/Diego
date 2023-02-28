package at.dz.oo.remote;

public class main {
        public static void main(String[] args) {
                    battery battery1 = new battery();
                    battery battery2 = new battery();
                    remote remote = new remote(battery1, battery2);

                    // Turning on the remote
                    remote.turnOn();
                    System.out.println("Remote status: " + remote.getStatus());

                    // Turning off the remote
                    remote.turnOff();
                    System.out.println("Remote status: " + remote.getStatus());
                }
            }
