/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtugasakhir;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @irgantara
 */
public final class Tabel{
    
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public Tabel()
    {
        getTabel().addColumn("No");
        getTabel().addColumn("Nama Pemesan");
        getTabel().addColumn("Lapangan");
        getTabel().addColumn("Tanggal");
        getTabel().addColumn("Jam");
        getTabel().addColumn("No Telepon");  
        getTabel().addColumn("Sisa"); 
        getTabel().addColumn("Keterangan"); 
        
    }
    
    public DefaultTableModel getTabel()
    {
        return tabel;
    }
    
    public void setTabel(DefaultTableModel Tabel)
    {
        this.tabel = Tabel;
    }
        
}
