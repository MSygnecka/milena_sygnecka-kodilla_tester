package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampHeight;
    private double stampWidth;
    private boolean stamped;

    public Stamp (String stampName, double stampHeight, double stampWidth, boolean stamped) {
        this.stampName = stampName;
        this.stampHeight = stampHeight;
        this.stampWidth = stampWidth;
        this.stamped = stamped;
    }
    public String getStampName() {
        return stampName;
    }
    public double getStampHeight() {
        return stampHeight;
    }
    public double getStampWidth() {
        return stampWidth;
    }
    public boolean getStamped() {
        return stamped;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampHeight, stampHeight) == 0 && Double.compare(stamp.stampWidth, stampWidth) == 0 && stamped == stamp.stamped && Objects.equals(stampName, stamp.stampName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampHeight, stampWidth, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampHeight=" + stampHeight +
                ", stampWidth=" + stampWidth +
                ", stamped=" + stamped +
                '}';
    }
}
