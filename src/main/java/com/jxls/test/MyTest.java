package com.jxls.test;

import com.jxls.bean.Student;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/8/3.
 */
public class MyTest {
public static void main(String[] args)throws Exception{
    List<Student> students = getStudentInfo();
    InputStream is = MyTest.class.getResourceAsStream("template_student.xlsx");
        OutputStream os = new FileOutputStream("target/object_collection_output.xls");
            Context context = new Context();
            context.putVar("students", students);
            JxlsHelper.getInstance().processTemplate(is, os, context);
        }

    private static List<Student> getStudentInfo() {
    List<Student> students = new ArrayList<Student>();
    for (int i=0;i<100;i++){
        students.add(new Student("zhangsan",(int)(Math.random()*100),(i%2==0?1:0),"10000000"+i));
    }
    return students;
    }
}
