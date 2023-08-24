package session8.challenge8.PersonalDiaryHw;

public class Diary {
    private String date;
    private String entry;

    public Diary(String date, String entry){
        this.date = date;
        this.entry = entry;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String toString(){
        return date + " : " + entry;
    }
}
