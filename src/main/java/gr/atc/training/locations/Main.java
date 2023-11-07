package gr.atc.training.locations;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ReadFromExcel r = new ReadFromExcel(
				"C:\\Users\\ivasili\\eclipse-workspace-new\\douleia\\excelPrj\\src\\main\\java\\excelPrj\\Καλλικρατικές_Δομές.xlsx");
		r.readFromSheets();
		//r.closeFile();

		LocationService ls = new LocationService();
		ls.setMunicipalities(r.municipalities);
		ls.setMunicipalityUnits(r.municipalityUnits);
		ls.setPrefectures(r.prefectures);
		ls.setPrefectureUnits(r.prefectureUnits);
		
	}
}
