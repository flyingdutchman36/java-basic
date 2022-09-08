import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

//    static PriorityQueue<Applicant> applicants = new PriorityQueue<>(new Comparator<Applicant>() {
//        @Override
//        public int compare(Applicant o1, Applicant o2) {
//            if (Integer.compare(o1.getScore(), o2.getScore()) == 0){
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            }else {
//                return -Integer.compare(o1.getScore(), o2.getScore());
//            }
//        }
//    });

    // Lambda Expression
//    static PriorityQueue<Applicant> applicants = new PriorityQueue<>(
//            (Applicant o1, Applicant o2) -> {
//                    if (Integer.compare(o1.getScore(), o2.getScore()) == 0){
//                       return o1.getName().compareToIgnoreCase(o2.getName());
//                    }else {
//                      return -Integer.compare(o1.getScore(), o2.getScore());
//                    }
//            }
//    );

    // Method reference
    static PriorityQueue<Applicant> applicants = new PriorityQueue<>(
            Comparator.comparing(Applicant::getScore).reversed().thenComparing(Applicant::getName)
    );

    public static void main(String[] args) {
        createData();
        pollQueue();
    }

    private static void pollQueue() {
        int q = 0;
        while (!applicants.isEmpty()){
            System.out.printf("queue #%d -> %s%n", ++q, applicants.poll());
        }
    }

    private static void createData() {
        applicants.offer(new Applicant("Jack",90));
        applicants.offer(new Applicant("April", 75));
        applicants.offer(new Applicant("Jill", 80));
        applicants.offer(new Applicant("Bruce", 95));
        applicants.offer(new Applicant("Lee", 100));
        applicants.offer(new Applicant("Linda",99));
    }

}