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
