import java.util.ArrayList;

public class Chapter5Problem41 {

    public static void main(String[] args) {
        ArrayList<Long>longPower5 = new ArrayList<Long>();
        ArrayList<Integer> solutions = new ArrayList<Integer>();

        for (int i = 0; i < 76; i++) {
            longPower5.add(Long.valueOf(i*i*i*i*i));
        }

        for (int A = 1; A <= 75; A++) {
            for (int B = A; B <= 75; B++) {
                for (int C = B; C <= 75; C++) {
                    for (int D = C; D <= 75; D++) {
                        for (int E = D; E <= 75; E++) {
                            int F = (int) (Math.pow(A, 5) + Math.pow(B, 5) + Math.pow(C, 5) + Math.pow(D, 5) + Math.pow(E, 5));
                            int index = searchArray(longPower5, F);
                            if (index != -1 && longPower5.get(index) == F) {
                                solutions.add(A);
                                solutions.add(B);
                                solutions.add(C);
                                solutions.add(D);
                                solutions.add(E);
                                solutions.add(F);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("The solutions are: ");
        for (int i = 0; i < solutions.size(); i++) {
            System.out.println(solutions.get(i));
        }
    }

    public static int searchArray(ArrayList<Long> list, int f){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == f) {
                return i;
            }
        }
        return -1;
    }

}