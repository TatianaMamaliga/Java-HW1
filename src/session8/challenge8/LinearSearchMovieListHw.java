package session8.challenge8;

public class LinearSearchMovieListHw {

    public static void main(String[] args) {
        String[] movieTitles = {"Pulp Fiction", "Breaking Bad", "Mission Impossible", "Les Miserables"};
        String searchItem = "Pulp Fiction";

        int foundIndex = linearSearch(movieTitles, searchItem);

        if (foundIndex != -1){
            System.out.println(searchItem + " is found at index: " + foundIndex);
        } else {
            System.out.println(searchItem + " is not in the list");
        }
    }

    public static int linearSearch(String[] list, String item){
        for (int index = 0; index < list.length; index++){
            if (list[index].equals(item)){
                return index;
            }
        }
        return -1;
    }
}
