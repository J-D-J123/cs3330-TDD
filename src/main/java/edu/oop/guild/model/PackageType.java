package edu.oop.guild.model;

public enum PackageType implements EnumLabel {

    FOOD("Snack crate"),
    POTION("Potion case"),
    ARTIFACT("Ancient artifact");

    private final String label;

    PackageType(String label) {
        this.label = label;
    }

    @Override
    public String label() {
        return label;
    }

    @Override
    public String displayName() {
        return label();
    }
}
