/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package responsipbo;

public class ResponsiMain {
public static void main(String[] args) {
    PegawaiView pegawaiview = new PegawaiView();
    PegawaiModel pegawaimodel = new PegawaiModel();
    PegawaiDAO pegawaiDAO = new PegawaiDAO();
    GajiView gajiview = new GajiView();
    DataView dataview = new DataView();
    LoginView loginview = new LoginView();
    PegawaiController pegawaicontroller = new PegawaiController(pegawaimodel,pegawaiview,pegawaiDAO,gajiview,dataview,loginview);
    }
}
