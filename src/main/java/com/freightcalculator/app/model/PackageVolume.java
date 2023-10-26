package com.freightcalculator.app.model;

public class PackageVolume {
    private float length;
    private float width;
    private float height;

    public PackageVolume(float length, float width, float height) throws Exception {
        if (length <= 0.0) throw new Exception("Invalid length");
        if (width <= 0.0) throw new Exception("Invalid width");
        if (height <= 0.0) throw new Exception("Invalid height");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getVolume (){
        return this.height * this.length * this.width;
    }
}
