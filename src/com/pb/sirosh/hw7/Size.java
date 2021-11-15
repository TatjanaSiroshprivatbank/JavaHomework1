package com.pb.sirosh.hw7;

public enum Size {
    XXS,
    XS,
    S,
    M,
    L;

    Size arg;
    void getDescription() {
        switch (arg) {
            case XXS:
                System.out.println("Детский размер");
                break;
            case XS:
            case S:
            case M:
            case L:
                System.out.println("Взрослый размер");
                break;
        }
    }

    void getEuroSize() {
        switch (arg) {
            case XXS:
                System.out.println("Европейский размер: 32");
                break;
            case XS:
                System.out.println("Европейский размер: 34");
                break;
            case S:
                System.out.println("Европейский размер: 36");
                break;
            case M:
                System.out.println("Европейский размер: 38");
                break;
            case L:
                System.out.println("Европейский размер: 40");
                break;
        }
    }
}
