package org.example;

public class Telephone {
    private String marka;
    private int gb;
    private String renk;

    private static Telephone instance;

    private Telephone() {}

    public static Telephone getInstance() {
        if (instance == null) {
            instance = new Telephone();
        }
        return instance;
    }


    public static final class TelephoneBuilder {
        private String marka;
        private int ram;
        private String renk;

        private TelephoneBuilder() {
        }

        public static TelephoneBuilder aTelephone() {
            return new TelephoneBuilder();
        }

        public TelephoneBuilder withMarka(String marka) {
            this.marka = marka;
            return this;
        }

        public TelephoneBuilder withGb(int gb) {
            this.ram = gb;
            return this;
        }

        public TelephoneBuilder withRenk(String renk) {
            this.renk = renk;
            return this;
        }

        public Telephone build() {
            Telephone telephone = new Telephone();
            telephone.marka = this.marka;
            telephone.gb = this.ram;
            telephone.renk = this.renk;
            return telephone;
        }

    }
    public String toString() {
        return "Telephone{" +
                "marka='" + marka + '\'' +
                ", ram=" + gb +
                ", renk='" + renk + '\'' +
                '}';
    }
}
