package org.example._2023_06_20;

public enum Permission {
    USD,
    EUR,
    RUB,
    CAD,
    MEDIUM;


}

class Security {
    private String name;
    private Permission permission;

    public Security(String name, Permission permission) {
        this.name = name;
        this.permission = permission;
    }

}

class Main {
    public static void main(String[] args) {
        Security p1 = new Security("Nam", Permission.MEDIUM);
    }
}