package com.hsevimli.repository;

public interface Repository {
	public void Kaydet();
	public boolean Duzenle();
	public void Sil();
	public void Ara();
	public void Listele();
	public boolean Guncelle(Object o);

}
