package edu.oop.guild.model;

public enum RealmType implements EnumLabel {

    SKY("Sky Kingdom"),
    UNDERGROUND("Underground Market");

    private final String displayName;

    RealmType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String displayName() {
        return displayName;
    }

    @Override
    public String label() {
        return displayName();
    }
}
