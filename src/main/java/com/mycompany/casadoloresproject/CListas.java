/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.casadoloresproject;

import entities.CAdministrador;
import entities.CBartender;
import entities.CBebida;
import entities.CCocinero;
import entities.CMesero;
import entities.CPlatillo;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class CListas {

    public ArrayList<CAdministrador> administradorList = new ArrayList();
    public ArrayList<CMesero> meseroList = new ArrayList();
    public ArrayList<CCocinero> cocineroList = new ArrayList();
    public ArrayList<CBartender> bartenderList = new ArrayList();

    // Listas de productos
    public ArrayList<CPlatillo> platilloList = new ArrayList();
    public ArrayList<CBebida> bebidaList = new ArrayList();

    public void createUsers() {
        for (int i = 0; i < 1; i++) {
            administradorList.add(new CAdministrador("administrador1", "administrador1", i));
        }
    }

    public int createIdAdministrador() {
        return administradorList.get(administradorList.size() - 1).getiID() + 1;
    }

    public int createIdCocinero() {
        return cocineroList.get(cocineroList.size() - 1).getiID() + 1;
    }

    public int createIdBartender() {
        return bartenderList.get(bartenderList.size() - 1).getiID() + 1;
    }

    public int createIdMesero() {
        return meseroList.get(meseroList.size() - 1).getiID() + 1;
    }

    public void createProducts() {
        for (int i = 0; i < 3; i++) {
            platilloList.add(new CPlatillo("Platillo " + i, "Entrada", 43, "Manana", true));
            bebidaList.add(new CBebida("Bebida " + i, "Cocteles", 43, "Manana", true));
        }
    }

    public void showBebidas() {
        for (CBebida bebida : bebidaList) {
            System.out.println(bebida.getsNombre());

        }
    }

    public void crearBebida(CBebida bebida) {
        bebidaList.add(bebida);
    }

    public void showPlatillo() {
        for (CPlatillo platillo : platilloList) {
            System.out.println(platillo.getsNombre());

        }
    }

    public void crearPlatillo(CPlatillo platillo) {
        platilloList.add(platillo);
    }

    public void crearMesero(CMesero mesero) {
        meseroList.add(mesero);
    }

    public void crearCocinero(CCocinero cocinero) {
        cocineroList.add(cocinero);

    }

    public void crearBartender(CBartender bartender) {
        bartenderList.add(bartender);

    }

    public void crearAdministrador(CAdministrador administrador) {
        administradorList.add(administrador);
    }

    public int BuscarIdAdministrador(int ID) {
        int Index = 0;

        if (administradorList.isEmpty()) return -1;

        for (CAdministrador usuario : administradorList) {
            if (usuario.getiID() == ID) {
                return Index;
            }
            Index++;
        }
        return -1;
    }

    public int BuscarIdBartender(int ID) {
        int Index = 0;
        if (bartenderList.isEmpty()) {
            return -1;
        }

        for (CBartender usuario : bartenderList) {
            if (usuario.getiID() == ID) {
                return Index;
            }
            Index++;
        }
        return -1;
    }

    public int BuscarIdMesero(int ID) {
        int Index = 0;
        
        if (meseroList.isEmpty()) return -1;
        for (CMesero usuario : meseroList) {
            if (usuario.getiID() == ID) {
                return Index;
            }
            Index++;
        }
        return -1;
    }

    public int BuscarIdCocinero(int ID) {
        int Index = 0;
        if (cocineroList.isEmpty()) return -1; 
        for (CCocinero usuario : cocineroList) {
            if (usuario.getiID() == ID) {
                return Index;
            }
            Index++;
        }
        return -1;
    }

    public void removeAdministrador(int index) {
        administradorList.remove(index);
    }

    public void removeBartender(int index) {
        bartenderList.remove(index);
    }

    public void removeMesero(int index) {
        meseroList.remove(index);
    }

    public void removeCocinero(int index) {
        cocineroList.remove(index);
    }
}