package src.day10.BookMarket;

import java.util.Scanner;

public class Welcome {

    static final int Book_NUM = 3;
    static final int ITEM_NUM = 7;
    //static String mBookList[][] = new String[Book_NUM][Book_NUM];
    static CartItem[] mCarItem = new CartItem[Book_NUM];
    static int mCartCount = 0;

    public static void BookList(String[][] book) {
        book[0][0] = "ISBN1234"; //ISBN
        book[0][1] = "쉽게 배우는 jsp 웹 프로그래밍"; //도서명
        book[0][2] = "27000"; // 정가
        book[0][3] = "송미영"; //저자
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 jsp 웹프로그래밍"; // 도서설명
        book[0][5] = "IT 전문서"; // 도서분야
        book[0][6] = "2018/10/08"; //출간일

        book[1][0] = "ISBN1235";
        book[1][1] = "자바 초보 나도 할 수 있다";
        book[1][2] = "12000";
        book[1][3] = "고윤아";
        book[1][4] = "자비초보가 자바초보에게 해주는 이야기";
        book[1][5] = "IT 기초서적";
        book[1][6] = "2025/01/20";

        book[2][0] = "ISBN1236";
        book[2][1] = "채식주의자";
        book[2][2] = "15000";
        book[2][3] = "한강";
        book[2][4] = "한국최초 노벨문학상 수상작가의 대표작";
        book[2][5] = "장편소설";
        book[2][6] = "2019/06/10";
    }

    public static void menulntroduction() {
        System.out.println("*".repeat(50));
        System.out.println("1. 고객 정보 확인 \t\t4. 바구니에 항목 추가하기      ");
        System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기  ");
        System.out.println("3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기    ");
        System.out.println("7" + ". 영수증 표시하기 \t\t8. 종료                    ");
        System.out.println("*".repeat(50));
    }

    public static void menu1(String name, String mobile) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + name + " 연락처 " + mobile);
    }

    public static void menu2() {
        System.out.println("2.장바구니 상품 목록 보기");
        if (mCarItem == null) {
            System.out.println("장바구니가 비어있습니다.");
        } else {
            for (int i = 0; i < Book_NUM; i++) {
                System.out.print(mCarItem[i] + " | ");
            }
            System.out.println();
        }
    }
    public static void menu3() {
        Scanner input = new Scanner(System.in);
        System.out.println("3. 장바구니 비우기");
        System.out.println("정말로 장바구니를 비우시겠습니까? Y | N ");
        boolean quit = false;
        while (!quit) {
            String an = input.nextLine();
            if (an.toUpperCase().equals("Y")) {
                for(int i = 0; i<Book_NUM;i++){{
                        mCarItem[i] = null;
                    }
                }
                System.out.println("장바구니를 비웠습니다.");
                quit = true;
            } else {
                System.out.println("취소합니다.");
                break;
            }
        }
    }

    public static void menu4(String[][] book) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        System.out.println("4.장바구니의 항목 추가하기");

        BookList(book);
        for (int i = 0; i < Book_NUM; i++) {
            for (int j = 0; j < ITEM_NUM; j++) {
                System.out.print(book[i][j] + " | ");
            }
            System.out.println();
        }
        while (!quit) {
            boolean flag = false;
            int numId = 0;
            System.out.println("장바구니에 추가할 도서의 ID를 입력하세요. ");
            String str = input.nextLine();

            for (int i = 0; i < Book_NUM; i++) {
                if (str.equals(book[i][0])) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("장바구니에 추가 하겠습니까? Y | N");
                str = input.nextLine();


                if (str.toUpperCase().equals("Y")) {
                    System.out.println("\"" + book[numId][1] + "\"" + " 도서가 장바구니에 추가되었습니다.");
//                    for (int i = 0; i < Book_NUM; i++) {
//                        if(mCarItem[i] == null){
//                            mCarItem[i] = new CartItem(book[numId]);//비어있는 CartItem[i]에 book[numId](bookList[numId]를 통으로 입력)
//                            break;
//                        }
//
//                    if (!isCartInBook(book[numId][0]))
//                    mCarItem[mCartCount++] = CartItem(book[numId]);
//                }
                    quit = true;
                }
                else System.out.println("다시 입력해주세요.");
            }
        }
    }
    public static void menu5() {
        System.out.println("5.장바구니 항목 수량 줄이기");
    }

    public static void menu6() {
        System.out.println("6.장바구니 항목 삭제하기");
    }

    public static void menu7() {
        System.out.println("7. 영수증 표시하기");
    }

    public static void menu8() {
        System.out.println("8.종료");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] mBook = new String[Book_NUM][ITEM_NUM];

        String greeting = " Welcome to Shopping Mall";
        String tagline = " Welcome to book Market!";

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = input.nextLine();

        boolean quit = false;

        while (!quit) {

            System.out.println("*".repeat(50));
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagline);
            menulntroduction();

            System.out.print("메뉴 번호를 선택해주세요. ");
            int menunum = input.nextInt();
            if (menunum < 1 || menunum > 8) {
                System.out.println("1부터 8까지의 숫자를 입력하세요.");
            } else {
                switch (menunum) {
                    case 1:
                        menu1(userName, userMobile);
                        break;
                    case 2:
                        menu2();
                        break;
                    case 3:
                        menu3();
                        break;
                    case 4:
                        menu4(mBook);
                        break;
                    case 5:
                        menu5();
                        break;
                    case 6:
                        menu6();
                        break;
                    case 7:
                        menu7();
                        break;
                    case 8:
                        menu8();
                        quit = true;
                        break;


                }
            }
        }
    }
}






