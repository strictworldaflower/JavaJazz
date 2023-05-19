package ch0203;

public class Switch {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("곰팡이");
    }

    static void whoIsIt(String bio) {
        String kind = switch (bio) {
        case "호랑이", "사자" -> "포유류";
        case "독수리", "참새" -> "조류";
        case "고등어", "연어" -> "어류";
            default -> {
                System.out.println("어이쿠");
                yield "...";
            }

        };
        System.out.printf("%s는 %s이다.\n",bio, kind);

    }
}
