import java.util.*;

public class Main {

    static ScriptureBook FirstNephi = new ScriptureBook("1 Nephi", 22);
    static ScriptureBook SecondNephi = new ScriptureBook("2 Nephi", 33);
    static ScriptureBook Jacob = new ScriptureBook("Jacob", 7);
    static ScriptureBook Enos = new ScriptureBook("Enos", 1);
    static ScriptureBook Jarom = new ScriptureBook("Jarom", 1);
    static ScriptureBook Omni = new ScriptureBook("Omni", 1);
    static ScriptureBook WordsOfMormon = new ScriptureBook("Words of Mormon", 1);
    static ScriptureBook Mosiah = new ScriptureBook("Mosiah", 29);
    static ScriptureBook Alma = new ScriptureBook("Alma", 63);
    static ScriptureBook Helaman = new ScriptureBook("Helaman", 16);
    static ScriptureBook ThirdNephi = new ScriptureBook("3 Nephi", 30);
    static ScriptureBook FourthNephi = new ScriptureBook("4 Nephi", 1);
    static ScriptureBook Mormon = new ScriptureBook("Mormon", 9);
    static ScriptureBook Ether = new ScriptureBook("Ether", 15);
    static ScriptureBook Moroni = new ScriptureBook("Moroni", 10);

    static List<ScriptureBook> allBooks = new ArrayList<>();
    static Scanner keyboard = new Scanner(System.in);
    static List<UserTime> availableTimes = new ArrayList<>();

    public static void main(String[] args) {
        addAllBooks();

        System.out.println("Hi! Welcome to the Daily Verses Goal Maker");
        System.out.println("Please enter your name: ");

        String name = keyboard.nextLine();

        System.out.println("Hi " + name + ", please enter your top 5 available times during today below.\n");

        getTime();

        System.out.println("Here is your requested goal for today: ");
        for (UserTime t : availableTimes) {
            ScriptureBook randomBook = getRandomBook();
            int randomChapter = getRandomChapter(randomBook);
            int randomVerse = getRandomVerse(randomBook, randomChapter);

            if (t.getMinute() == 0) {
                System.out.println("At " + t.getHour() + ":" + t.getMinute() + "0 " + t.getTimeOfDay() + " -- read: " + randomBook.getName() + " " + randomChapter);
            }
            else if (t.getMinute() < 10) {
                System.out.println("At " + t.getHour() + ":0" + t.getMinute() + " " + t.getTimeOfDay() + " -- read: " + randomBook.getName() +  " " + randomChapter);
            }
            else {
                System.out.println("At " + t.getHour() + ":" + t.getMinute() + " " + t.getTimeOfDay() + " -- read: " + randomBook.getName() + " " + randomChapter);
            }
        }
    }

    private static void getTime() {
        int hour;
        int minute;
        String timeOfDay;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your #" + i + " available time: ");

            System.out.println("Hour (1 through 12): ");
            hour = keyboard.nextInt();
            while (hour < 1 || hour > 12) {
                System.out.println("Error. Please enter a valid hour: ");
                System.out.println("Hour (1 through 12):");
                hour = keyboard.nextInt();
            }

            System.out.println("Minute (0 to 59): ");
            minute = keyboard.nextInt();

            keyboard.nextLine();
            while (minute < 0 || minute > 59) {
                System.out.println("Error. Please enter a valid minute: ");
                System.out.println("Minute (0 through 59):");
                minute = keyboard.nextInt();
                keyboard.nextLine();
            }

            System.out.println("AM or PM: ");
            timeOfDay = keyboard.nextLine();

            boolean validType = false;

            while (validType != true) {
                if (!timeOfDay.equalsIgnoreCase("am")) {
                    if (!timeOfDay.equalsIgnoreCase("pm")) {
                        System.out.println("Error. Please enter a valid time: ");
                        System.out.println("AM or PM: ");
                        timeOfDay = keyboard.nextLine();
                    } else {
                        validType = true;
                    }
                } else {
                    validType = true;
                }
            }

            System.out.println("You entered: ");
            if (minute == 0) {
                System.out.println(hour + ":" + minute + "0 " + timeOfDay);
            }
            else if (minute < 10) {
                System.out.println(hour + ":0" + minute + " " + timeOfDay);
            }
            else {
                System.out.println(hour + ":" + minute + " " + timeOfDay);
            }

            availableTimes.add(new UserTime(hour, minute, timeOfDay.toUpperCase(Locale.ROOT)));
        }
    }

    private static void addAllBooks() {
        allBooks.add(FirstNephi);
        allBooks.add(SecondNephi);
        allBooks.add(Jacob);
        allBooks.add(Enos);
        allBooks.add(Jarom);
        allBooks.add(Omni);
        allBooks.add(WordsOfMormon);
        allBooks.add(Mosiah);
        allBooks.add(Alma);
        allBooks.add(Helaman);
        allBooks.add(ThirdNephi);
        allBooks.add(FourthNephi);
        allBooks.add(Mormon);
        allBooks.add(Ether);
        allBooks.add(Moroni);
    }

    private static ScriptureBook getRandomBook() {

        Random randomNumber = new Random();
        int max = 15;
        int min = 1;

        int randomNum = randomNumber.nextInt((max - min) + 1) + min;

        return allBooks.get(randomNum);
    }

    private static int getRandomChapter(ScriptureBook scriptureBook) {
        Random randomNumber = new Random();

        int max = scriptureBook.getNumberOfChapters();
        int min = 1;

        int randomNum = randomNumber.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    private static int getRandomVerse(ScriptureBook scriptureBook, int chapter) {
        return 0;
    }
}
