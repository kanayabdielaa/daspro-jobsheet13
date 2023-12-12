public class Kubus14 {
    private double sisi;

    public Kubus14(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        double volume = sisi * sisi * sisi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Kubus14 kubus = new Kubus14(5);

        System.out.println("Volume Kubus: " + kubus.hitungVolume());

        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
