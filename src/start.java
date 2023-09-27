////import java.io.IOException;
////
////
////условия
////class start {
////
////
////    public static void main(String[] args) throws IOException {
////
////        char ch, answer = 'B';
////
////        System.out.println("игра");
////        System.out.print("попробуй угадать: ");
////
////        ch = (char) System.in.read();
////
////        if (ch == answer) {
////            System.out.println("sad");
////        } else if (ch > answer) {
////            System.out.println("перестарался брат");
////        } else {
////            System.out.println("недосторался");
////        }
////    }
////}
////
////FOR AND WHILE
////
////
////class start {
////    public static void main(String[] args) {
////        int i;
////        for (i = 0; i < 3; ) {
////            System.out.println("привет" + i);
////            i++;
////        }
////    }
////}
////
////
////class start {
////    public static void main(String[] args) {
////        int count = 0;
////
////        while (count < 25)
////        {
////            count++;
////            if ((count % 2) != 0) continue;
////            System.out.println(count);
////        }
////    }
////}
////
////LIST
//
//class start {
//    public static void main(String[] args) {
//        int[] nums = new int[4];
//
//        for (int i = 0; i < 4; i++) {
//            nums[i] = i;
//        }
//
//        nums[1] = 100;
//
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("элемент " + i + nums[i]);
//        }
//        for (int e : nums) {
//            System.out.println(e);
//        }
//
//
//        int list[][] = new int[5][2];
//        list[2] = new int[3];
//
//        for (int asd[]: list) {
//            System.out.println(asd);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list);
//        }
//    }
//}
//
//
