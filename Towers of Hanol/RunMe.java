import java.util.ArrayList;

public class RunMe {
    public static void main(String[] args) {
        ArrayList<Integer> rod1 = new ArrayList<Integer>();
        ArrayList<Integer> rod2 = new ArrayList<Integer>();
        ArrayList<Integer> rod3 = new ArrayList<Integer>();

        addDisksToRod(rod1, 3);

        
    }

    private static void addDisksToRod(ArrayList<Integer> rod, int diskNum) {
        for (int i = diskNum+1; i > 1; i--) {
            rod.add(i);
        }
    };

    private static void move(ArrayList<Integer> rod1, ArrayList<Integer> rod2, ArrayList<Integer> rod3, int moveAmount,int start, int moveLocation) {
        if (moveAmount == 1) {
            rod1.remove(0);
            rod3.add(1);
            return;
        }

        
    }
}