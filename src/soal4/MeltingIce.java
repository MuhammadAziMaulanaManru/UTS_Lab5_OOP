/*
 *
 *      Q=m⋅Lf
 *      dimana :
 *      Q adalah jumlah kalor yang diperlukan (Joule, J).
 *      m adalah massa es yang akan dilelehkan (kilogram, kg).
 *      Lf adalah kalor lebur es (kalor laten peleburan), yang untuk air adalah 334,000 J/kg
 *
 *      1. Cara kerja:
 *      Massa Es:
 *      Tentukan massa es yang ingin dilelehkan. Misalnya,𝑚 = 0.5
 *
 *      2. Kalor lebur es
 *      Nilai kalor lebur untuk es adalah 𝐿𝑓 = 334,000 J/kg
 *
 *      3. Menghitung Kalor yang Diperlukan:
 *      Gunakan rumus 𝑄 = 𝑚⋅𝐿𝑓 Q=m⋅Lf.
 *
 *      Masukkan nilai massa es dan kalor lebur:
 *      Q=0.5kg×334,000J/kg=167,000J
 *
 */

package soal4;

public class MeltingIce {
    private double mass;
    private double latentHeat;

    public MeltingIce(double mass) {
        this.mass = mass;
        this.latentHeat = 334000;
    }

    public MeltingIce(double mass, double latentHeat) {
        this.mass = mass;
        this.latentHeat = latentHeat;
    }

    public double calculateEnergy() {
        return this.mass * this.latentHeat;
    }

    public double calculateEnergy(double newMass) {
        return newMass * this.latentHeat;
    }

    public double calculateEnergy(double newMass, double newLatentHeat) {
        return newMass * newLatentHeat;
    }
}
