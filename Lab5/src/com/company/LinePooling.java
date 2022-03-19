package com.company;

import java.util.ArrayList;
import java.util.Random;

public class LinePooling {
    ArrayList<Line> lines;
    Line[] linesCross = new Line[]{};
    Line[] linesSim = new Line[]{};
    Line[] l;
    public void Full() {
        l = new Line[9];
        lines = new ArrayList<Line>();
        for (int i = 0; i < 9; i++) {
            int x1 = new Random().nextInt(90);
            int y1 = new Random().nextInt(70);
            int x2 = new Random().nextInt(50);
            int y2 = new Random().nextInt(20);
            l[i] = new Line(x1, y1, x2, y2);
        }
    }
    private static int vector_mult(int ax,int ay,int bx,int by) //векторное произведение
    {
        return ax*by-bx*ay;
    }

    public static boolean Cross(Line ln1, Line ln2){

        int v1 = vector_mult(ln2.x2 - ln2.x1, ln2.y2 - ln2.y1, ln1.x1 - ln2.x1, ln1.y1 - ln2.y1);
        int v2 = vector_mult(ln2.x2 - ln2.x1, ln2.y2 - ln2.y1, ln1.x2 - ln2.x1, ln1.y2 - ln2.y1);
        int v3 = vector_mult(ln1.x2 - ln1.x1, ln1.y2 - ln1.y1, ln2.x1 - ln1.x1, ln2.y1 - ln1.y1);
        int v4 = vector_mult(ln1.x2 - ln1.x1, ln1.y2 - ln1.y1, ln2.x2 - ln1.x1, ln2.y2 - ln1.y1);
        if ( (v1*v2)<0 && (v3*v4)<0 ) return true;
        return  false;
    }
    public static boolean Equal(Line ln1, Line ln2){
        boolean result = false;
        if(ln1.a == ln2.a && ln1.b == ln2.b && ln1.c == ln2.c) {result = true;}
        return  result;
    }

    public static Line[] LinesForDrawing(Line[] lines){
        ArrayList<Line> result = new ArrayList<Line>();
        for(int i = 0;i<lines.length/2;i++){
            for( int j = lines.length/2;j>0;j--){
                if(Cross(lines[i], lines[j]) ==true ){
                    result.add(lines[i]);
                    result.add(lines[j]);
                }
            }
        }
        return result.toArray(Line[]::new);
    }

    public static Line[] LinesSim(Line[] lines){
        ArrayList<Line> result = new ArrayList<Line>();
        for(int i = 0;i<lines.length/2;i++){
            for( int j = lines.length/2;j>0;j--){
                if((lines[j].a % lines[i].a != 0) && (lines[j].b % lines[i].b != 0) ){
                    result.add(lines[i]);
                    result.add(lines[j]);
                }
            }
        }
        return result.toArray(Line[]::new);
    }
}
