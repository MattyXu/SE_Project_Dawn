package com.example.DAWN;

import android.graphics.*;
import java.lang.*;


import java.util.Vector;

public class Map {
    public static int unit =150;
    public static int size =100;

    public Vector<Role_simple> livingrole;
    public Vector<Prop> proplist;
    public int[][] m;



    Map() {

        livingrole = new Vector<Role_simple>();
        proplist = new Vector<Prop>();

    }

    public Boolean update(){
        //根据传回内容更新各角色数值以及道具情况
        return true;
    }



}
