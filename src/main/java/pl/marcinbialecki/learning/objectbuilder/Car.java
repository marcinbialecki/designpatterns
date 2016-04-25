package pl.marcinbialecki.learning.objectbuilder;

import com.google.common.base.MoreObjects;
import pl.marcinbialecki.learning.builder.model.Color;
import pl.marcinbialecki.learning.objectbuilder.model.TypeCoupe;

/**
 * Car.
 */
public class Car {

    /**
     * Registration number.
     */
    private String registrationNumber;

    /**
     * Model.
     */
    private String model;

    /**
     * Year of production.
     */
    private int yearofProduction;

    /**
     * Power in hp.
     */
    private int power;

    /**
     * Number of seats.
     */
    private int seats;

    /**
     * Type coupe.
     */
    private TypeCoupe typeCoupe;

    /**
     * Color.
     */
    private Color color;

    /**
     * Default contructor marked as private.
     */
    private Car() {
    }

    /**
     * Constructor with builder.
     *
     * @param builder Car builder instance.
     */
    private Car(final Builder builder) {
        this.color = builder.color;
        this.model = builder.model;
        this.power = builder.power;
        this.registrationNumber = builder.registrationNumber;
        this.seats = builder.seats;
        this.typeCoupe = builder.typeCoupe;
        this.yearofProduction = builder.yearofProduction;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public int getYearofProduction() {
        return yearofProduction;
    }

    public int getPower() {
        return power;
    }

    public int getSeats() {
        return seats;
    }

    public TypeCoupe getTypeCoupe() {
        return typeCoupe;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).toString();
    }

    public static class Builder {

        private String registrationNumber;
        private String model;
        private final int yearofProduction;
        private int power;
        private int seats;
        private TypeCoupe typeCoupe;
        private Color color;

        public Builder(final int yearofProduction) {
            this.yearofProduction = yearofProduction;
        }

        public Builder setRegistrationNumber(final String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public Builder setModel(final String model) {
            this.model = model;
            return this;
        }

        public Builder setPower(final int power) {
            this.power = power;
            return this;
        }

        public Builder setSeats(final int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setTypeCoupe(final TypeCoupe typeCoupe) {
            this.typeCoupe = typeCoupe;
            return this;
        }

        public Builder setColor(final Color color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}