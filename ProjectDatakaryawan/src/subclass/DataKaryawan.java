/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subclass;
/**
 *
 * @author lanja
 */
public interface DataKaryawan {
    public void TambahData(Karyawan dataKrywn);
    public void HapusData(String kodeKaryawan);
    public void CariData(String kodeKarywaan);
    public void LihatData();
}
