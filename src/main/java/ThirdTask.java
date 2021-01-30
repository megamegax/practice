import kotlin.Triple;
import secret.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ThirdTask {
    /**
     * Create a FileInputStream from fileLocation and by using the Library class convert the file to Land.
     * Then by using the Library class convert the land further to a Forest.
     *
     * @param fileLocation location to be used for the Land loading.
     * @return forest created from the Land
     */
    Forest fileLocationToForest(String fileLocation) {
        FileInputStream fileInputStream;
        Land land = null;
        try {
            fileInputStream = new FileInputStream(new File(fileLocation));
            land = Library.fileToLand(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Library.landToForest(land);
    }

    /**
     * Convert the forest to a list of trees represented by Triples.
     *
     * @param forest contains a lot of trees
     * @return list of Triple
     */
    List<TreeRepresentation> parseForestToListOfTree(Forest forest) {
        List<TreeRepresentation> result = new ArrayList<>();

        for (int i = 0; i <= forest.getNumberOfTrees(); i++) {
            result.add(treeToRepresentation(forest.getTree(i)));
        }

        return result;
    }

    /**
     * Convert a tree in to a TreeRepresentation. Pay attention to the Generic types.
     *
     * @param tree one tree of the forest. Has name, type and height.
     * @return a representation of a tree has the same values as a tree but is our own class.
     */
    TreeRepresentation treeToRepresentation(Tree tree) {
        return new TreeRepresentation(
                tree.getName(),
                tree.isOak(),
                tree.getHeight());
    }

    /**
     * modify the Trees so that Oak trees grow faster increase the height of every Oak tree by 10
     *
     * @param data a lots of trees
     */
    void grow(List<TreeRepresentation> data) {
        List<TreeRepresentation> result = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).isOak()) {
                result.add(new TreeRepresentation(
                        data.get(i).getName(),
                        data.get(i).isOak(),
                        data.get(i).getHeight() + 10));
            } else {
                result.add(data.get(i));
            }
        }
        Library.createForestAndSaveAsLand(result);
    }

}
