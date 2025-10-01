package be.ucll.crafsmanship.singleton.basic;

public class BasicSingleton {
        private static BasicSingleton instance;
        public String value;

        private BasicSingleton(String value) {
            // The following code emulates slow initialization.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            this.value = value;
        }

        public static BasicSingleton getInstance(String value) {
            if (instance == null) {
                instance = new BasicSingleton(value);
            }
            return instance;
        }
    }
