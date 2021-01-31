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
        return null;
    }

    /**
     * Convert the forest to a list of trees represented by Triples.
     *
     * @param forest contains a lot of trees
     * @return list of Triple
     */
    List<TreeRepresentation> parseForestToListOfTree(Forest forest) {
        return null;
    }

    /**
     * Convert a tree in to a TreeRepresentation. Pay attention to the Generic types.
     *
     * @param tree one tree of the forest. Has name, type and height.
     * @return a representation of a tree has the same values as a tree but is our own class.
     */
    TreeRepresentation treeToRepresentation(Tree tree) {
        return null;
    }

    /**
     * modify the Trees so that Oak trees grow faster increase the height of every Oak tree by 10
     *
     * @param data a lots of trees
     */
    List<TreeRepresentation> grow(List<TreeRepresentation> data) {
        return null;
    }

}
