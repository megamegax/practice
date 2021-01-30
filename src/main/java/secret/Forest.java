package secret;

import kotlin.Triple;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.List;

public class Forest {
    Sheet sheet;

    public Forest(Sheet sheet) {
        this.sheet = sheet;
    }

    public int getNumberOfTrees() {
        return sheet.getLastRowNum();
    }

    public Tree getTree(int i) {
        return new Tree(sheet.getRow(i));
    }
}
