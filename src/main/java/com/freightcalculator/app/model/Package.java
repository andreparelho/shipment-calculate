package com.freightcalculator.app.model;

public class Package {
    private float weight;
    private float distance;
    private PackageVolume packageVolume;

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
}
