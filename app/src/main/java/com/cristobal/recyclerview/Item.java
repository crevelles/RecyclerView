package com.cristobal.recyclerview;

/**
 * Esta clase representa el objeto de lo que añado en el Layout
 *
 */

public class Item {

    private int idImagen;
    private String txtSuperior;
    private String txtInferior;

    public Item(int idImagen, String txtSuperior, String txtInferior) {
        this.idImagen = idImagen;
        this.txtSuperior = txtSuperior;
        this.txtInferior = txtInferior;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getTxtSuperior() {
        return txtSuperior;
    }

    public String getTxtInferior() {
        return txtInferior;
    }
}
