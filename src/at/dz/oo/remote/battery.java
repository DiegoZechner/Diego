package at.dz.oo.remote;

public class battery {

        private int level;

        public battery() {
            this.level = 100;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public void consume(int percentage) {
            level -= percentage;
            if (level < 0) {
                level = 0;
            }
        }

        public void charge(int percentage) {
            level += percentage;
            if (level > 100) {
                level = 100;
            }
        }
    }

