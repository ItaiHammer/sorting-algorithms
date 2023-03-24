import java.util.ArrayList;

public class RunMe {
    static int diskNum = 3;
    static ArrayList<Integer> A = new ArrayList<Integer>();
    static ArrayList<Integer> B = new ArrayList<Integer>();
    static ArrayList<Integer> C = new ArrayList<Integer>();
    public static void main(String[] args) {
        addDisksToRod(A, diskNum);

        move(diskNum, A, C, B);
    }

    private static void addDisksToRod(ArrayList<Integer> rod, int diskNum) {
        for (int i = diskNum+1; i > 1; i--) {
            rod.add(i);
        }
    };

    public static void move(int n, ArrayList<Integer> source, ArrayList<Integer> target, ArrayList<Integer> auxiliary) {
        if (n == 1) {
            // Move the top disk from the source tower to the target tower
            int disk = source.remove(source.size() - 1);
            target.add(disk);
            System.out.println("Move disk " + disk + " from tower " + (source == A ? "A" : (source == B ? "B" : "C")) + " to tower " + (target == A ? "A" : (target == B ? "B" : "C")));
        } else {
            // Move n-1 disks from the source tower to the auxiliary tower
            move(n - 1, source, auxiliary, target);
            // Move the bottom disk from the source tower to the target tower
            int disk = source.remove(source.size() - 1);
            target.add(disk);
            System.out.println("Move disk " + disk + " from tower " + (source == A ? "A" : (source == B ? "B" : "C")) + " to tower " + (target == A ? "A" : (target == B ? "B" : "C")));
            // Move the n-1 disks from the auxiliary tower to the target tower
            move(n - 1, auxiliary, target, source);
        }
    }
}