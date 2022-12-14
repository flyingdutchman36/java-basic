import java.util.*;

public class Main {

    private static Set<String> skills = new HashSet<>(Arrays.asList("Java", "HTML5", "CSS3"));
    private static Map<String, Set<String>> applicants = new TreeMap<>();

    public static void main(String[] args) {
        createApplicants();
        System.out.println("List of applicants");
        displayApplicants();

        System.out.println("\nSkills required");
        System.out.println(skills);

        System.out.println("\nResult");
        findApplicantsWithMatchSkills();
    }

    public static void createApplicants(){
        applicants.put("Peter", new HashSet<>(Arrays.asList("C++", "Ruby")));
        applicants.put("Bruce", new HashSet<>(Arrays.asList("HTML5", "Java", "CSS3", "Python")));
        applicants.put("Clark", new HashSet<>(Arrays.asList("c#", "IIS", "Java", "CSS3")));
        applicants.put("Linda", new HashSet<>(Arrays.asList("HTML5", "JavaScript", "CSS3", "Ruby", "Python", "Java")));
    }

    public static void displayApplicants(){
        for (Map.Entry<String, Set<String>> item: applicants.entrySet()) {
            String key = item.getKey();
            Set value = item.getValue();
            System.out.printf("%s => %s \n", key, value);
        }
    }

    public static void findApplicantsWithMatchSkills(){
        for (Map.Entry<String, Set<String>> item: applicants.entrySet()) {
            String key = item.getKey();
            Set value = item.getValue();

            Set<String> setA = new HashSet<>(skills);
            setA.retainAll(value);
            if(setA.size() == skills.size()){
                System.out.printf("%s => %s \n", key, value);
            }
        }
    }
}