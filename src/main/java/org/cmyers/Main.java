package org.cmyers;

class Main {
    public static void main(String[] args) {
        for (People p : People.values()) {
            System.out.println("Hello, " + p + "!\n");

        }
        System.exit(0);
    }
}

