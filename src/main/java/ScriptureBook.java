import java.util.HashMap;
import java.util.Map;

public class ScriptureBook {
    String name;
    int numberOfChapters;
    Map<Integer, Integer> firstNephi = new HashMap<>();
    Map<Integer, Integer> secondNephi = new HashMap<>();
    Map<Integer, Integer> jacob = new HashMap<>();
    Map<Integer, Integer> enos = new HashMap<>();
    Map<Integer, Integer> jarom = new HashMap<>();
    Map<Integer, Integer> omni = new HashMap<>();
    Map<Integer, Integer> wordsOfMormon = new HashMap<>();
    Map<Integer, Integer> mosiah = new HashMap<>();
    Map<Integer, Integer> alma = new HashMap<>();
    Map<Integer, Integer> helaman = new HashMap<>();
    Map<Integer, Integer> thirdNephi = new HashMap<>();
    Map<Integer, Integer> fourthNephi = new HashMap<>();
    Map<Integer, Integer> mormon = new HashMap<>();
    Map<Integer, Integer> ether = new HashMap<>();
    Map<Integer, Integer> moroni = new HashMap<>();

    public ScriptureBook(String name, int numberOfChapters) {
        this.name = name;
        this.numberOfChapters = numberOfChapters;

        populateChapters();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    public void populateChapters() {

        // 1 Nephi
        firstNephi.put(1, 20);
        firstNephi.put(2, 24);
        firstNephi.put(3, 31);
        firstNephi.put(4, 38);
        firstNephi.put(5, 22);
        firstNephi.put(6, 6);
        firstNephi.put(7, 22);
        firstNephi.put(8, 38);
        firstNephi.put(9, 6);
        firstNephi.put(10, 22);
        firstNephi.put(11, 36);
        firstNephi.put(12, 23);
        firstNephi.put(13, 42);
        firstNephi.put(14, 30);
        firstNephi.put(15, 36);
        firstNephi.put(16, 39);
        firstNephi.put(17, 55);
        firstNephi.put(18, 25);
        firstNephi.put(19, 24);
        firstNephi.put(20, 22);
        firstNephi.put(21, 26);
        firstNephi.put(22, 31);

        // 2 Nephi
        secondNephi.put(1, 32);
        secondNephi.put(2, 30);
        secondNephi.put(3, 25);
        secondNephi.put(4, 35);
        secondNephi.put(5, 34);
        secondNephi.put(6, 18);
        secondNephi.put(7, 11);
        secondNephi.put(8, 25);
        secondNephi.put(9, 54);
        secondNephi.put(10, 25);
        secondNephi.put(11, 8);
        secondNephi.put(12, 22);
        secondNephi.put(13, 26);
        secondNephi.put(14, 6);
        secondNephi.put(15, 30);
        secondNephi.put(16, 13);
        secondNephi.put(17, 25);
        secondNephi.put(18, 22);
        secondNephi.put(19, 21);
        secondNephi.put(20, 34);
        secondNephi.put(21, 16);
        secondNephi.put(22, 6);
        secondNephi.put(23, 22);
        secondNephi.put(24, 32);
        secondNephi.put(25, 30);
        secondNephi.put(26, 33);
        secondNephi.put(27, 35);
        secondNephi.put(28, 32);
        secondNephi.put(29, 14);
        secondNephi.put(30, 18);
        secondNephi.put(31, 21);
        secondNephi.put(32, 9);
        secondNephi.put(33, 15);

        // Jacob
        jacob.put(1, 19);
        jacob.put(2, 35);
        jacob.put(3, 14);
        jacob.put(4, 18);
        jacob.put(5, 77);
        jacob.put(6, 13);
        jacob.put(7, 27);

        // Enos
        enos.put(1, 27);

        // Jarom
        jarom.put(1, 15);

        // Omni
        omni.put(1, 30);

        // Words of Mormon
        wordsOfMormon.put(1, 18);

        // Mosiah
        mosiah.put(1, 18);
        mosiah.put(2, 41);
        mosiah.put(3, 27);
        mosiah.put(4, 30);
        mosiah.put(5, 15);
        mosiah.put(6, 7);
        mosiah.put(7, 33);
        mosiah.put(8, 21);
        mosiah.put(9, 19);
        mosiah.put(10, 22);
        mosiah.put(11, 29);
        mosiah.put(12, 37);
        mosiah.put(13, 35);
        mosiah.put(14, 12);
        mosiah.put(15, 31);
        mosiah.put(16, 15);
        mosiah.put(17, 20);
        mosiah.put(18, 35);
        mosiah.put(19, 29);
        mosiah.put(20, 26);
        mosiah.put(21, 36);
        mosiah.put(22, 16);
        mosiah.put(23, 39);
        mosiah.put(24, 25);
        mosiah.put(25, 24);
        mosiah.put(26, 39);
        mosiah.put(27, 37);
        mosiah.put(28, 20);
        mosiah.put(29, 47);

        // Alma
        alma.put(1, 33);
        alma.put(2, 38);
        alma.put(3, 27);
        alma.put(4, 20);
        alma.put(5, 62);
        alma.put(6, 8);
        alma.put(7, 27);
        alma.put(8, 32);
        alma.put(9, 34);
        alma.put(10, 32);
        alma.put(11, 46);
        alma.put(12, 37);
        alma.put(13, 31);
        alma.put(14, 29);
        alma.put(15, 19);
        alma.put(16, 21);
        alma.put(17, 39);
        alma.put(18, 43);
        alma.put(19, 36);
        alma.put(20, 30);
        alma.put(21, 23);
        alma.put(22, 34);
        alma.put(23, 18);
        alma.put(24, 30);
        alma.put(25, 17);
        alma.put(26, 37);
        alma.put(27, 30);
        alma.put(28, 14);
        alma.put(29, 17);
        alma.put(30, 60);
        alma.put(31, 38);
        alma.put(32, 43);
        alma.put(33, 23);
        alma.put(34, 41);
        alma.put(35, 16);
        alma.put(36, 30);
        alma.put(37, 47);
        alma.put(38, 15);
        alma.put(39, 19);
        alma.put(40, 26);
        alma.put(41, 15);
        alma.put(42, 31);
        alma.put(43, 54);
        alma.put(44, 24);
        alma.put(45, 24);
        alma.put(46, 41);
        alma.put(47, 36);
        alma.put(48, 25);
        alma.put(49, 30);
        alma.put(50, 40);
        alma.put(51, 37);
        alma.put(52, 40);
        alma.put(53, 23);
        alma.put(54, 24);
        alma.put(55, 35);
        alma.put(56, 57);
        alma.put(57, 36);
        alma.put(58, 41);
        alma.put(59, 13);
        alma.put(60, 26);
        alma.put(61, 21);
        alma.put(62, 52);
        alma.put(63, 17);

        // Helaman
        helaman.put(1, 34);
        helaman.put(2, 14);
        helaman.put(3, 37);
        helaman.put(4, 26);
        helaman.put(5, 52);
        helaman.put(6, 41);
        helaman.put(7, 29);
        helaman.put(8, 28);
        helaman.put(9, 41);
        helaman.put(10, 19);
        helaman.put(11, 38);
        helaman.put(12, 26);
        helaman.put(13, 39);
        helaman.put(14, 31);
        helaman.put(15, 17);
        helaman.put(16, 25);

        // 3 Nephi
        thirdNephi.put(1, 30);
        thirdNephi.put(2, 19);
        thirdNephi.put(3, 26);
        thirdNephi.put(4, 33);
        thirdNephi.put(5, 26);
        thirdNephi.put(6, 30);
        thirdNephi.put(7, 26);
        thirdNephi.put(8, 25);
        thirdNephi.put(9, 22);
        thirdNephi.put(10, 19);
        thirdNephi.put(11, 41);
        thirdNephi.put(12, 48);
        thirdNephi.put(13, 34);
        thirdNephi.put(14, 27);
        thirdNephi.put(15, 24);
        thirdNephi.put(16, 20);
        thirdNephi.put(17, 25);
        thirdNephi.put(18, 39);
        thirdNephi.put(19, 36);
        thirdNephi.put(20, 46);
        thirdNephi.put(21, 29);
        thirdNephi.put(22, 17);
        thirdNephi.put(23, 14);
        thirdNephi.put(24, 18);
        thirdNephi.put(25, 6);
        thirdNephi.put(26, 21);
        thirdNephi.put(27, 33);
        thirdNephi.put(28, 40);
        thirdNephi.put(29, 9);
        thirdNephi.put(30, 2);

        // 4 Nephi
        fourthNephi.put(1, 49);

        // Mormon
        mormon.put(1, 19);
        mormon.put(2, 29);
        mormon.put(3, 22);
        mormon.put(4, 23);
        mormon.put(5, 24);
        mormon.put(6, 22);
        mormon.put(7, 10);
        mormon.put(8, 41);
        mormon.put(9, 37);

        // Ether
        ether.put(1, 43);
        ether.put(2, 25);
        ether.put(3, 28);
        ether.put(4, 19);
        ether.put(5, 6);
        ether.put(6, 30);
        ether.put(7, 27);
        ether.put(8, 26);
        ether.put(9, 35);
        ether.put(10, 34);
        ether.put(11, 23);
        ether.put(12, 41);
        ether.put(13, 31);
        ether.put(14, 31);
        ether.put(15, 34);

        // Moroni
        moroni.put(1, 4);
        moroni.put(2, 3);
        moroni.put(3, 4);
        moroni.put(4, 3);
        moroni.put(5, 2);
        moroni.put(6, 9);
        moroni.put(7, 48);
        moroni.put(8, 30);
        moroni.put(9, 26);
        moroni.put(10, 34);
    }
}
