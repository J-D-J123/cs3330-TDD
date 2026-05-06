package edu.oop.guild.seal;

import java.util.Objects;

public class SkyRibbonSeal implements PackageSeal {
    @Override
    public String apply(String label) {
        Objects.requireNonNull(label);
        return "\u2601 " + label + " \u2601";
    }

    @Override
    public int durability() {
        return 7;
    }
}
