package com.ickream.test;
import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xf on 2017/7/3.
 */
public class ReadExcel {

    public Sheet importExcel(String dir){
        Workbook book=null;
       // InputStream
        Sheet sheet;
        File file=new File(dir);
        try{
            book=Workbook.getWorkbook(file);
            sheet=book.getSheet(0);
            return sheet;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    public List<String> compare(Sheet sheet1,Sheet sheet2){
        List<String> list=new ArrayList<String>();
        //List<Array> li=new ArrayList<Array>();
        for(int i=0;i<sheet2.getRows();i++){
            for(int j=0;j<sheet1.getRows();j++){
                String str1=sheet1.getCell(2,j).getContents();
                String str2=sheet2.getCell(0,i).getContents();
               if( str1.indexOf(str2)!=-1){
                   System.out.println(str2 +"->"+str1);
                   list.add(str1+","+sheet1.getCell(0,i).getContents()+","+str2);
               }
//                System.out.println("fff");
            }
        }
        return list;
    }
    public void exportExcel(String dir,List<String> list){
        WritableWorkbook book=null;
        try{
            book=Workbook.createWorkbook(new File(dir));
            WritableSheet sheet=book.createSheet("equipment",0);
//            sheet.addCell(new Label(0,0,"equipname"));
//            sheet.addCell(new Label(1,0,"equipcode"));
            for(int i=0;i<list.size();i++){
                String [] arr= list.get(i).split(",");
                System.out.println(arr[0]+"------"+arr[1]+"---------"+i);
                for(int j=0;j<3;j++){
                    Label label=new Label(j,i+1,arr[j]);
                    sheet.addCell(label);
                }
            }
            book.write();
            book.close();// 关闭
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public String transfer(Sheet sheet){
        String str="[";
        for(int j=1;j<sheet.getRows()-1;j++){
            str=str+"\""+sheet.getCell(0,j).getContents()+"\""+",";
            System.out.println(str);
        }
        str=str+"\""+sheet.getCell(0,sheet.getRows()-1).getContents()+"\"" +"]";
        System.out.println(str);
        return str;
    }
    public static void main(String [] args){
        List<String> list;
        ReadExcel read=new ReadExcel();
//        Sheet sheet1=read.importExcel("C:\\Users\\xf\\Desktop\\equipment.xls");
//        Sheet sheet2=read.importExcel("C:\\Users\\xf\\Desktop\\01.xls");
        Sheet sheet3=read.importExcel("C:\\Users\\xf\\Desktop\\03.xls");
        String str=read.transfer(sheet3);
        //list=read.compare(sheet1,sheet2);
        //read.exportExcel("C:\\Users\\xf\\Desktop\\02.xls",list);
    }
}
