package ch04;

class GolfClub {
    String kind;
    int number;

    GolfClub(int number) {
        this.kind = "아이언";
        this.number = number;
    }

    GolfClub(String kind) {
        this.kind = kind;
        this.number = 0;
    }

    GolfClub() {
        this.kind = "아이언";
        this.number = 7;

    }

    void print() {
        if (number == 0)
            System.out.printf("%s입니다.\n", kind);
            else
            System.out.printf("%d번 아이언입니다.\n", number);

        }
    }

    public class GolfClubTest {
        public static void main(String[] args) {
            GolfClub g1 = new GolfClub();
            g1.print();

            GolfClub g2 = new GolfClub(8);
            g2.print();

            GolfClub g3 = new GolfClub("퍼터");
            g3.print();
        }
    }

