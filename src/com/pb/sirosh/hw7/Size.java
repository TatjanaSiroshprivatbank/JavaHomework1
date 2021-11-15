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

}
