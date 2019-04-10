//checked
package model.persoon;

public class Student extends Persoon {
	private int studentNummer;
	private String groepId;
	private boolean aanwezig;
	private String reden;

	public Student(String pVoornaam,
				   String pTussenvoegsel,
				   String pAchternaam,
				   String pWachtwoord,
				   String pGebruikersnaam,
				   int sStudentNummer,
				   boolean aanwezig,
				   String reden) {
		super(pVoornaam, pTussenvoegsel, pAchternaam, pWachtwoord, pGebruikersnaam);
		this.studentNummer = sStudentNummer;
		this.aanwezig = aanwezig;
		this.reden = reden;
		this.setGroepId("");
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj) && obj instanceof Student) {
			Student s = (Student) obj;
			return this.studentNummer == s.studentNummer;
		} else {
			return false;
		}
	}

	public String getGroepId() {
		return this.groepId;
	}

	public void setGroepId(String pGroepId) {
		this.groepId = pGroepId;
	}

	public int getStudentNummer() {
		return this.studentNummer;
	}

	public boolean getAanwezig() {
		return aanwezig;
	}

	public void setAanwezig(boolean aanwezig) {
		this.aanwezig = aanwezig;
	}
	
	public String getReden() {
		return reden;
	}

	public void setReden(String reden) {
		this.reden = reden;
	}

}
