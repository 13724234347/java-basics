package com.tzh.io;

import java.io.*;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IoFlow {



    private static final String SUT_PATH = "F:\\test\\io\\tzh.txt";

    public static void main(String[] args) throws IOException {
        List<Students> students=new ArrayList<>();
        update();
    }
    /**
     * 读出文件中所有的内容,放进list中 输入要修改的学生的ID
     * 到list中找到修改的学生的对象 将信息修改到对象中 将list覆盖写进到文件中
     */
    public static void update() {
        // 读出文件中所有的内容,放进list中
        List<Students> list = readFile();
        Scanner scan = new Scanner(System.in);
        System.out.println("输入要修改的学生的ID");
        String id = scan.nextLine();
        // 到list中找到修改的学生的对象
        Students updateStu = null;
        for (Students stu : list) {
            if (id.equals(stu.getStudentsId())) {
                updateStu = stu;
                break;
            }
        }for (Students stu : list) {
            if (id.equals(stu.getStudentsId())) {
                updateStu = stu;
                break;
            }
        }
        // 将对象的信息修改掉
        System.out.println("name");
        String name = scan.nextLine();
        System.out.println("sex");
        String sex = scan.nextLine();
        System.out.println("age");
        String age = scan.nextLine();
        System.out.println("addr");
        String addr = scan.nextLine();
        System.out.println("tel");
        String tel = scan.nextLine();
        updateStu.setName(name);
        updateStu.setAddr(addr);
        updateStu.setAge(age);
        updateStu.setSex(sex);
        updateStu.setTel(tel);
        // 将list覆盖写进到文件中
        writeFile(list);
        scan.close();
    }
    /**
     * 将集合中的内容写到文件中,覆盖写
     *
     * @param list
     */
    public static void writeFile(List<Students> list) {
        String filePathAndName = SUT_PATH;
        try {
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(new File(filePathAndName)),"utf-8");
            BufferedWriter writer = new BufferedWriter(write);
            for (Students stu : list) {
                StringBuffer sb = new StringBuffer();
                sb.append(stu.getStudentsId()).append(",").append(stu.getName()).append(",").append(stu.getSex()).append(",")
                        .append(stu.getAge()).append(",").append(stu.getAddr()).append(",").append(stu.getTel());
                writer.write(sb.toString());
                writer.newLine();
                writer.flush();
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("写文件内容操作出错");
            e.printStackTrace();
        }
    }
    /**
     * 将一行内容追加到文件中
     *
     * @param fileContent
     */
    public static void writeFile(String fileContent) {
        String filePathAndName = SUT_PATH;
        // String fileContent = "1004,lily,女,19,深圳,13659559854";
        try {
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(new File(filePathAndName), true));
            BufferedWriter writer = new BufferedWriter(write);
            writer.write(fileContent);
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("写文件内容操作出错");
            e.printStackTrace();
        }
    }
    /**
     * 将一行内容追加到文件中
     *
     * @param fileContent
     */
    public static void writerFile(String fileContent) {
        String filePathAndName = SUT_PATH;
        // String fileContent = "1004,lily,女,19,深圳,13659559854";
        try {
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(new File(filePathAndName), true));
            BufferedWriter writer = new BufferedWriter(write);
            writer.write(fileContent);
            writer.newLine();
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.out.println("写文件内容操作出错");
            e.printStackTrace();
        }
    }
    /**
     * 用BufferedReader读取文件中的内容,并装进list
     */
    public static List<Students> readFile() {
        String filePathAndName = SUT_PATH;
        List<Students> list = new ArrayList<>();
        try {
            File f = new File(filePathAndName);
            if (f.isFile() && f.exists()) {
                InputStream is = new FileInputStream(f);
                InputStreamReader read = new InputStreamReader(is,"utf-8");
                BufferedReader reader = new BufferedReader(read);
                String line = "";
                while ((line = reader.readLine()) != null) {
                    String lineArr[] = line.split(",");
                    Students stu = new Students();
                    stu.setStudentsId(lineArr[0]);
                    stu.setName(lineArr[1]);
                    stu.setSex(lineArr[2]);
                    stu.setAge(lineArr[3]);
                    stu.setAddr(lineArr[4]);
                    stu.setTel(lineArr[5]);
                    list.add(stu);
                }
                reader.close();
                read.close();
            }
        } catch (Exception e) {
            System.out.println("读取文件内容操作出错");
            e.printStackTrace();
        }
        return list;
    }

	/*  public void test() throws IOException { // 字节流写文件 FileOutputStream ops =
	  new FileOutputStream(new File("C:/Users/Administrator/Desktop/b.txt"));

	  // 字节流读取文件 FileInputStream ins = new FileInputStream(new
	  File("C:/Users/Administrator/Desktop/a.txt")); int tempbyte;
	  System.out.println("一次读一个字节: "); while ((tempbyte = ins.read()) != -1) {
	  System.out.println(tempbyte); ops.write(tempbyte); }
	   System.out.println("写入文件b.txt成功");

	  // 关闭文件流 ins.close(); ops.close(); }


	  public void test() throws IOException { // 字节流写文件 FileOutputStream ops =
	  new FileOutputStream(new File("C:/Users/Administrator/Desktop/b.txt"));

	  // 字节流读取文件 FileInputStream ins = new FileInputStream(new
	  File("C:/Users/Administrator/Desktop/a.txt")); int tempbyte;
	  System.out.println("一次读一个字节: "); while ((tempbyte = ins.read()) != -1) {
	  System.out.println(tempbyte); ops.write(tempbyte); }
	  System.out.println("写入文件b.txt成功");
	  // 关闭文件流 ins.close();
	   	 ops.close();
	   	}


	  public void test() throws IOException { // 字节流写文件 FileOutputStream ops =
	  new FileOutputStream(new File("C:/Users/Administrator/Desktop/b.txt"));

	  // 字节流读取文件 FileInputStream ins = new FileInputStream(new
	  File("C:/Users/Administrator/Desktop/a.txt")); int tempbyte;
	  System.out.println("一次读一个字节: "); while ((tempbyte = ins.read()) != -1) {
	  System.out.println(tempbyte); ops.write(tempbyte); }
	  System.out.println("写入文件b.txt成功");

	  // 关闭文件流 ins.close(); ops.close(); }*/
}
