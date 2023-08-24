package session8.challenge8.PersonalDiaryHw;

import java.util.*;

public class DiarySystem {
    private static List<Diary> diaryEntryList = new ArrayList<>();

    public void addEntry() {
        System.out.println("Enter the date for diary entry: ");
        Scanner scanner = new Scanner(System.in);
        String newDate = scanner.next();
        if (isValidDate(newDate)) {
            System.out.println("A diary entry for this date already exists.");
        } else {
            System.out.println("Enter the diary entry for: " + newDate);
            String entry = scanner.next();
            Diary newEntry = new Diary(newDate, entry);
            diaryEntryList.add(newEntry);
            diaryEntryList.sort(Comparator.comparing(Diary::getDate).reversed());

            System.out.println("Entry added successfully");
            System.out.println(diaryEntryList);
        }
    }

    public void editEntry() {
        System.out.println("To edit the diary entry, enter the date: ");
        Scanner scanner = new Scanner(System.in);
        String pastDate = scanner.next();
        int entryIndex = findEntryIndex(pastDate);
        if (entryIndex == -1) {
            System.out.println("No entry found for this date.");
        } else {
            System.out.println("Enter edited diary entry: ");
            String editedEntry = scanner.next();
            diaryEntryList.get(entryIndex).setEntry(editedEntry);
            System.out.println("Entry is edited successfully");
        }
    }

    public void deleteEntry() {
        System.out.println("Enter diary entry date (YYYY-MM-DD) for deletion: ");
        Scanner scanner = new Scanner(System.in);
        String selectedDate = scanner.next();
        int entryIndex = findEntryIndex(selectedDate);
        if (entryIndex != -1) {
            diaryEntryList.remove(entryIndex);
            System.out.println("Diary entry deleted successfully");
        } else {
            System.out.println("Diary entry not found");
        }
    }

    public void displayEntries() {
        if (diaryEntryList.isEmpty()) {
            System.out.println("No diary entries to display");
        } else {
            System.out.println("Diary entries (latest first): ");
            for (Diary diaryEntry : diaryEntryList) {
                System.out.println(diaryEntry);
            }
        }
    }

    public boolean isValidDate(String date) {
        for (Diary entry : diaryEntryList) {
            if (entry.getDate().equals(date)) {
                return true;
            }
        }
        return false;
    }

    private int findEntryIndex(String date) {
        for (int index = 0; index < diaryEntryList.size(); index++) {
            if (diaryEntryList.get(index).getDate().equals(date)) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        DiarySystem diarySystem = new DiarySystem();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Please select an option to continue:");
            System.out.println("1. Add new diary entry");
            System.out.println("2. Edit a diary entry");
            System.out.println("3. Delete a diary entry");
            System.out.println("4. Display diary entries (latest first)");
            System.out.println("5. Exit");

            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1:
                    diarySystem.addEntry();
                    break;
                case 2:
                    diarySystem.editEntry();
                    break;
                case 3:
                    diarySystem.deleteEntry();
                    break;
                case 4:
                    diarySystem.displayEntries();
                    break;
                case 5:
                    System.out.println("Exiting diary");
                    isRunning = false;
                    scanner.close();
                default:
                    System.out.println("Please select a valid option");
            }
        }
    }
}

