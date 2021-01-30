package secret;

import kotlin.Triple;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Library {

    public static Land fileToLand(FileInputStream fileInputStream) {
        try {
            return new Land(new XSSFWorkbook(fileInputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Forest landToForest(Land land) {
        return new Forest(land.workbook.getSheetAt(0));
    }

    public static Land createForestAndSaveAsLand(List<TreeRepresentation> data) {

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Meglepi");
        for (int i = 0; i < data.size(); i++) {
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(data.get(i).getName());
            row.createCell(1).setCellValue(data.get(i).isOak());
            row.createCell(2).setCellValue(data.get(i).getHeight());
        }
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        String fileLocation = path.substring(0, path.length() - 1) + "temp.xlsx";

        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(fileLocation);
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Land(workbook);
    }
}
