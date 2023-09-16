package session14.challenge14.hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class _HashSetPractice {

    public static void main(String[] args) {
        HashSet<String> plants = new HashSet<>();
        HashSet<String> plants1 = new HashSet<>();

        /*
        1. Spider Plant (Chlorophytum comosum)
        2. Snake Plant (Sansevieria trifasciata)
        3. Pothos (Epipremnum aureum)
        4. Peace Lily (Spathiphyllum)
        5. Aloe Vera (Aloe barbadensis miller)
        6. Rubber Plant (Ficus elastica)
        7. Jade Plant (Crassula ovata)
        8. ZZ Plant (Zamioculcas zamiifolia)
        9. Philodendron (Philodendron spp.)
        10. Monstera Deliciosa (Swiss Cheese Plant)
        11. Boston Fern (Nephrolepis exaltata)
        12. Snake Plant (Sansevieria trifasciata)
        13. African Violet (Saintpaulia)
        14. Fiddle Leaf Fig (Ficus lyrata)
        15. Golden Pothos (Epipremnum aureum)
                 */

        AppendElementToHashSet appendEl = new AppendElementToHashSet();
        IterateThroughHashSet iterateHashSetEl = new IterateThroughHashSet();
        GetNumberOfElementsInHashSet getNumberOfEl = new GetNumberOfElementsInHashSet();
        EmptyHashSet emptyHashSet = new EmptyHashSet();
        TestHashSetIsEmpty isEmpty = new TestHashSetIsEmpty();
        CloneHashSet cloneHashSet = new CloneHashSet();
        ConvertHashSetToArray convertHashSetToArray = new ConvertHashSetToArray();
        ConvertHashSetToTreeSet convertHashSetToTreeSet = new ConvertHashSetToTreeSet();
        ConvertHashSetToList convertHashSetToList = new ConvertHashSetToList();
        CompareTwoHashSets compareTwoHashSets = new CompareTwoHashSets();
        RetainCommonElements retainCommonElements = new RetainCommonElements();
        RemoveAllElementsFromHashSet removeAllEl = new RemoveAllElementsFromHashSet();

        appendEl.appendElementToHashSet(plants, "Spider Plant");
        appendEl.appendElementToHashSet(plants, "Monstera Deliciosa");
        appendEl.appendElementToHashSet(plants, "African Violet");
        appendEl.appendElementToHashSet(plants1, "Peace Lily");
        appendEl.appendElementToHashSet(plants1, "Aloe Vera");
        appendEl.appendElementToHashSet(plants1, "Golden Pothos");


        iterateHashSetEl.iterateThroughHashSet(plants);
        int length = getNumberOfEl.getNumberOfElementsInHashSet(plants);
        System.out.println(length);

        emptyHashSet.emptyHashSet(plants);

        boolean isHashSetEmpty = isEmpty.testHashSetIsEmpty(plants);
        System.out.println(isHashSetEmpty);

        HashSet<String> clonedSet = cloneHashSet.cloneHashSet(plants1);
        System.out.println("Cloned HashSet: " + clonedSet);

        String[] arr = convertHashSetToArray.convertHashSetToArray(clonedSet);
        System.out.println("Array from HashSet: " + Arrays.toString(arr));

        TreeSet<String> treeSet = convertHashSetToTreeSet.convertHashSetToTreeSet(plants1);
        System.out.println("TreeSet from HashSet: " + treeSet);

        ArrayList<String> arrayList = convertHashSetToList.convertHashSetToList(plants1);
        System.out.println("ArrayList from HashSet: " + arrayList);

        boolean areHashSetsTheSame = compareTwoHashSets.compareTwoHashSets(clonedSet, plants1);
        System.out.println(areHashSetsTheSame);

        appendEl.appendElementToHashSet(plants, "Aloe Vera");
        HashSet<String> commonElSet = retainCommonElements.retainCommonElements(clonedSet, plants);
        System.out.println(commonElSet);

        removeAllEl.removeAllElementsFromHashSet(commonElSet);
        System.out.println(commonElSet);
    }
}
