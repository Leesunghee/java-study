package ch08.book.Enum;

/**
 * Created by sunghee on 2015. 5. 5..
 */
public enum Month {

    JANUARY(1) , FEBRUARY(2) , MARCH(3) , APRIL( 4) , MAY(5) ,JUNE(6) , JULY(7) , AUGUST(8) , SEPTEMBER(9) , OCTOBER(10) ,
    NOVEMBER(11) , DECEMBER(12);

    private int num;
    private Month(int num) {
        this.num = num;
    }

    public int getNumber() {
        return num;
    }

    public static void main (String[] args) {
        for (Month month : Month.values()) {
            System.out.println(month.getNumber() + "월");
       }
    }
}

