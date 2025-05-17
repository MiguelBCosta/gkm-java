package gkm.events.mouse.scroll;

public enum GkmScrollDirection {
    UP,
    DOWN,
    UNKNOWN;

    public static GkmScrollDirection fromInt(int direction) {
        switch (direction) {
            case 1:
                return UP;
            case -1:
                return DOWN;
            default:
                return UNKNOWN;
        }
    }
}
