package it.polito.tdp.meteo.bean;

public class CittaMedia {
	
	private String nomeCitta;
	private int mese;
	private float umidita;
	public CittaMedia(String nomeCitta, int mese, float umidita) {
		super();
		this.nomeCitta = nomeCitta;
		this.mese = mese;
		this.umidita = umidita;
	}
	public String getNomeCitta() {
		return nomeCitta;
	}
	public int getMese() {
		return mese;
	}
	public float getUmidita() {
		return umidita;
	}
	
	
	

}
