package JavaPracticeSessions;

public class ConditionOperators {
    public static void main(String[] args) {
        int i = 15;
        int j = 15;
        System.out.println(i==j);

        //Switch-case
        String browser = "Safari";
        switch (browser){
            case "Chrome":
                System.out.println("Launch chrome browser");
                break;
            case "Firefox":
                System.out.println("Launch Firefox browser");
                break;
            case "Safari":
                System.out.println("Launch safari browser");
                break;
            case "IE":
                System.out.println("Launch IE browser");
                break;
            default:
                System.out.println("Please provide correct browser value");
                break;
        }
    }
}
