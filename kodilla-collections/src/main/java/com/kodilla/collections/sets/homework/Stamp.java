package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private String stampSize;
    private String isStamped;

    public Stamp(String stampName, String stampSize, String isStamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.isStamped = isStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", isStamped='" + isStamped + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampSize, stamp.stampSize) &&
                Objects.equals(isStamped, stamp.isStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampSize, isStamped);
    }
}
