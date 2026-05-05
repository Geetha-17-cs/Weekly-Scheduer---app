import java.util.Scanner;

public class WeeklySchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1=Monday to 7=Sunday): ");
        int day = sc.nextInt();

        if (day < 1 || day > 7) {
            System.out.println("Invalid! Enter a number between 1 and 7.");
            return;
        }

        // Enhanced Switch - Day Name
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

        // Enhanced Switch - Activity
        String activity = switch (day) {
            case 2, 5     -> "Visit Temple";
            case 1, 6     -> "Attend Meetings";
            case 3, 4     -> "Complete Tasks";
            case 7        -> "Relax";
            default       -> "No Activity";
        };

        // Enhanced Switch - Detailed Plan
        String plan = switch (day) {
            case 2, 5 -> "Wake up early, take a bath, visit the temple, "
                       + "pray and seek blessings for the day!";
            case 1, 6 -> "Prepare your notes, attend scheduled meetings, "
                       + "discuss goals and review progress!";
            case 3, 4 -> "Focus on pending tasks, complete assignments, "
                       + "meet deadlines and stay productive!";
            case 7    -> "Take rest, spend time with family, "
                       + "enjoy hobbies and recharge yourself!";
            default   -> "Invalid Day!";
        };

        // Enhanced Switch - Motivation Quote
        String quote = switch (day) {
            case 2, 5 -> "Faith is the strength by which a shattered "
                       + "world shall emerge into light!";
            case 1, 6 -> "Coming together is a beginning, staying together "
                       + "is progress, working together is success!";
            case 3, 4 -> "The secret of getting ahead is getting started. "
                       + "Focus and finish your tasks!";
            case 7    -> "Rest when you are weary. Refresh and renew "
                       + "yourself, your body and your mind!";
            default   -> "Stay positive every day!";
        };

        // Enhanced Switch - Emoji
        String emoji = switch (day) {
            case 2, 5 -> "🙏";
            case 1, 6 -> "📋";
            case 3, 4 -> "✅";
            case 7    -> "😴";
            default   -> "❓";
        };

        // Display Output
        System.out.println("=========================================");
        System.out.println("        WEEKLY SCHEDULE PLANNER         ");
        System.out.println("=========================================");
        System.out.println("Day      : " + dayName + " " + emoji);
        System.out.println("Activity : " + activity);
        System.out.println("-----------------------------------------");
        System.out.println("Plan     : " + plan);
        System.out.println("-----------------------------------------");
        System.out.println("Quote    : " + quote);
        System.out.println("=========================================");

        sc.close();
    }
}