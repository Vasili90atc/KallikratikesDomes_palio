package gr.atc.training.locations;

public class Prefecture {
	String prefectureCode;
	String description;
	String municipalityUnitCode;
	
	
	public Prefecture(String prefectureCode, String description, String municipalityUnitCode) {
		this.prefectureCode = prefectureCode;
		this.description = description;
		this.municipalityUnitCode = municipalityUnitCode;
	}
	
	public String getPrefectureCode() {
		return prefectureCode;
	}
	public void setPrefectureCode(String prefectureCode) {
		this.prefectureCode = prefectureCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMunicipalityUnitCode() {
		return municipalityUnitCode;
	}
	public void setMunicipalityUnitCode(String municipalityCode) {
		this.municipalityUnitCode = municipalityCode;
	}
}
