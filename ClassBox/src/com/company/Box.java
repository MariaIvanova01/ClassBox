package com.company;

public class Box {
   private double length;
   private double width;
   private double height;

   public Box(double length, double width, double height){
       setLength(length);
       setWidth(width);
       setHeight(height);
   }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }else{
            this.length = length;
        }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }else{
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }else{
            this.height = height;
        }
    }

    public String calculateSurfaceArea(double length, double width, double height){
       double surfaceArea = (2 * length * width) + (2 * length * height) + (2 * width * height);
       return String.format("Surface Area - %.2f",surfaceArea);
    }
    public String calculateLateralSurfaceArea(double length, double width, double height){
       double lateralSurfaceArea = (2 * length * height) + (2 * width * height);
       return String.format("Lateral Surface Area - %.2f",lateralSurfaceArea);
    }
    public String calculateVolume(double length, double width, double height){
        double volume = length * width * height;
        return String.format("Volume - %.2f", volume);
    }
}
