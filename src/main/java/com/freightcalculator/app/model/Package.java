package com.freightcalculator.app.model;

public class Package {
    private float weight;
    private float distance;
    private PackageVolume packageVolume;

    public Package(float weight, float distance, PackageVolume packageVolume) throws Exception {
        if (distance <= 0.0) throw new Exception("Invalid distance");
        if (weight <= 0.0) throw new Exception("Invalid weight");

        this.weight = weight;
        this.distance = distance;
        this.packageVolume = packageVolume;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public PackageVolume getPackageVolume() {
        return packageVolume;
    }

    public void setPackageVolume(PackageVolume packageVolume) {
        this.packageVolume = packageVolume;
    }

    public double getVolume(){
        return this.packageVolume.getVolume();
    }
}
