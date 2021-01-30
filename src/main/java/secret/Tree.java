package secret;

import org.apache.poi.ss.usermodel.Row;

public class Tree {
    Row row;

    public Tree(Row row) {
        this.row = row;
    }

    public String getName() {
        return row.getCell(0).getStringCellValue();
    }

    public boolean isOak() {
        return row.getCell(1).getStringCellValue().equals("true");
    }

    public double getHeight() {
        return row.getCell(2).getNumericCellValue();
    }
}
