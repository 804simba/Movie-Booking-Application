package org.mytheatre.enums;

public enum Genre {
    ACTION, ROMANCE, THRILLER, SCI_FI, CARTOON, ANIME;

    @Override
    public String toString() {
        return switch (this) {
            case ANIME -> "Anime";
            case ACTION -> "Action";
            case SCI_FI -> "Sci-Fi";
            case CARTOON -> "Cartoon";
            case ROMANCE -> "Romance";
            case THRILLER -> "Thriller";
            default -> "None";
        };
    }
}
