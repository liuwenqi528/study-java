package com.java.study.work;


import java.io.*;

public class UpdateFileContent {
    public static void main(String[] args) throws Exception {
        String filePath = "/Users/lwq/upload/download/a.sql";
        String newFilePath = "/Users/lwq/upload/download/a_new.sql";
        File f = new File(filePath);
        File newFile = new File(newFilePath);
        BufferedReader br = new BufferedReader(new FileReader(f));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        String line = "";
        String regex = "AND(.*?);";
        String regex2 = "\"id(.*?),";
        while((line = br.readLine())!=null){
            String newLine = line.replaceAll(regex,";");
             newLine = newLine.replaceAll(regex2,"");
            bw.write(newLine);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
//        String str = "UPDATE \"\" SET \"id\" = 3373280616513551195, \"publish_time\" = '2019-09-30 14:12:46.685' WHERE \"id\" = 3373280616513551195 AND \"publish_time\" = '2019-09-30 14:12:46.685';";
//        System.out.println(str.replaceAll(regex,";"));
    }


}
