package it.polito.tdp.nyc.model;

public class Arco implements Comparable<Arco>{
	private String v1 ;
	private String v2 ;
	private Integer peso ;
	
	public Arco(String v1, String v2, Integer peso) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.peso = peso;
	}
	public String getV1() {
		return v1;
	}
	public String getV2() {
		return v2;
	}
	public Integer getPeso() {
		return peso;
	}
	@Override
	
	// 
	public int compareTo(Arco other) {
		return other.peso - this.peso;
	}
	@Override
	public String toString() {
		return "(" + v1 + ", " + v2 + "): " + peso;
	}
	
	

}
