package sust.paperlessexm.Main;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sust.paperlessexm.api.impl.CourseApiImpl;
import sust.paperlessexm.api.impl.DepartmentApiImpl;
import sust.paperlessexm.api.impl.StudentApiImpl;
import sust.paperlessexm.bean.CourseBean;
import sust.paperlessexm.bean.DepartmentBean;
import sust.paperlessexm.bean.StudentBean;
import sust.paperlessexm.entity.Department;
import sust.paperlessexm.entity.Student;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.DepartmentService;
import sust.paperlessexm.session.StudentService;

/**
 *
 * @author Sm19
 */
public class UpdateTable {

    public static void main(String[] args) throws GenericBusinessException {

        System.out.println("Start Journey From Here Now!");

        /// ------- Update Department Table -------- ///
        /*
                 
         DepartmentApiImpl depService = new DepartmentApiImpl();
         DepartmentBean depBean = new DepartmentBean();

         for (int i = 2; i <= 20; i++) {
            
         String depCode="CSE"+Integer.toString(i);
         String depName="Computer Science "+Integer.toString(i);
            
         depBean.setDepartmentId(null);
         depBean.setDeptCode(depCode);
         depBean.setDeptName(depName);
         depService.addDepartment(depBean);
         }
         */
        // ------API Check ----
        /*
        
         DepartmentApiImpl depService1 = new DepartmentApiImpl();
         List<DepartmentBean> list1=depService1.getDepartmentList();
        
         for(int i=0;i<list1.size();i++) {
         System.out.println("Pailam: "+list1.get(i).getDeptCode());
         }
         */
        /// ------ Teachers Update --------- ///
        /*
         TeachersApiImpl tecService = new TeachersApiImpl();
         TeachersBean tecBean = new TeachersBean();
         //TeachersBean t = new TeachersBean(null, "ABC DEF GHI0", "CSE0", "ABC0@sust.edu", "01710337220", "teimg1.jpg", "1230", "ABC_00");
         //tecService.addTeachers(t);

         for (int i = 1; i < 30; i++) {
         String tecName = "ABC DEF GHI" + Integer.toString(i);
         String tecDep = "CSE" + Integer.toString(i);
         String tecEmail = "ABC" + Integer.toString(i) + "@sust.edu";
         String tecCon = null;
         if (i < 10) {
         tecCon = "0" + Integer.toString(017100000) + "0" + Integer.toString(i);
         } else {
         tecCon = "0" + Integer.toString(01710100000) + Integer.toString(i);
         }
         String photo = "D:\\Academic\\ThesisAndProject\\DatabaseProject_3_1\\ProjectWorke\\PaperLessExm\\PaperLessExm_v1\\image\\teachers\\teimg1";

         String tecPass = "0123" + Integer.toString(i);
         String tecEmCode = "ABC_" + Integer.toString(i);

         tecBean.setTeachersId(null);
         tecBean.setContactNo(tecCon);
         tecBean.setEmailAddress(tecEmail);
         tecBean.setEmployeeCode(tecEmCode);
         tecBean.setPassword(tecPass);
         tecBean.setPhoto(photo);
         tecBean.setTeachersDept(tecDep);
         tecBean.setTeachersName(tecName);
         tecService.addTeachers(tecBean);
         }
         */
        // ---- Course Update ------- // 
        /*
         CourseApiImpl coService=new CourseApiImpl();
         CourseBean coBean=new CourseBean();
        
         //CourseBean now=new CourseBean(null,"Project Worke 000","CSE000","CSE","CSE",2.5,6,2014);
         //coService.addCourse(now);
        
         for(int i=1;i<=30;i++) {
            
         String coTitle="Project Work "+Integer.toString(i);
         String coCode="CSE"+Integer.toString(i);
         String OfDep="CSE";
         String acDep="CSE";
         double credit=(i*2.5)%4;
         if(credit<=0.0) credit+=1.5;
            
         int semester=(i*7)%8;
         if(semester==0) semester=2;
            
         int session=(i+2000);
            
         coBean.setAcceptingDept(acDep);
         coBean.setOfferingDept(OfDep);
         coBean.setCourseCode(coCode);
         coBean.setCourseId(null);
         coBean.setCourseTitle(coTitle);
         coBean.setCredit(credit);
         coBean.setSemester(semester);
         coBean.setSession(session);
            
         coService.addCourse(coBean);
            
         }
         */
        ///-------- Course Save Api implement ---- // 
        /*
         CourseApiImpl cs = new CourseApiImpl();
         CourseBean cb = new CourseBean();
        
         List<CourseBean> list1=new ArrayList<>();
         list1=cs.getCourseList();
        
         //cb=cs.getCourse(33);
         //System.out.println("CourseSemester: "+cb.getSemester());
         //cb.setSemester(3);
         //cs.saveCourse(cb);
        
        
         for(int i=0;i<list1.size();i++) {
         //System.out.println("CourseId: "+list1.get(i).getCourseId()+" CourseCode: "+list1.get(i).getCourseCode()+"  CourseSemester: "+list1.get(i).getSemester());
            
         int session=2000+i;
         cb=list1.get(i);
         cb.setSession(session);
         cs.saveCourse(cb);
         }
         */
        // ------------teaches update ----- //
        /*
        
         CourseApiImpl courseService=new CourseApiImpl();
         TeachersApiImpl teachersService=new TeachersApiImpl();
         TeachesApiImpl teachesService =new TeachesApiImpl();
         TeachesBean teachesBean=new TeachesBean();
                
         List<TeachersBean> listTeachers=new ArrayList<>();
         List<CourseBean> listCourse=new ArrayList<>();
        
         listTeachers=teachersService.getTeachersList();
         listCourse=courseService.getCourseList();
        
         System.out.println(listCourse.get(0).getCourseCode()+"  --- "+listTeachers.get(0).getTeachersName());
        
        
         //        teachesBean.setCourseId(listCourse.get(0));
         //        teachesBean.setTeachersId(listTeachers.get(0));
         //        teachesBean.setTeachesId(null);  
         //       
         //        teachesService.addTeaches(teachesBean);
        
        
         for(int i=0;i<listCourse.size();i++) {
         for(int j=0;j<listTeachers.size();i++) {
                
         teachesBean.setCourseId(listCourse.get(i));
         teachesBean.setTeachersId(listTeachers.get(i));
         teachesBean.setTeachesId(null);
                
         teachesService.addTeaches(teachesBean);
         }
         }
         */
        /// ---- student update ----- //
        
//        StudentApiImpl studentService = new StudentApiImpl();
//        StudentBean studentBean = new StudentBean();
//        List<DepartmentBean> departmentBeans = new DepartmentApiImpl().getDepartmentList();
//        int len = departmentBeans.size() - 1;
//        
//        
//        for (int i = 5; i <= 50; i++) {
//            String name = "ABC" + Integer.toString(i);
//            String regNo = "20103310" + Integer.toString(i + 10);
//            String pass = name;
//            int session = (2000 + i) % 2029;
//            String email = name + "@sust.edu";
//            String contacNum = "01710337220";
//            int dept_id = (i + 50) % len;
//            String photo = "image/imp1.jpg";
//
//            studentBean.setContactNo(contacNum);
//            studentBean.setDepartmentId(departmentBeans.get(dept_id));
//            studentBean.setEmailAddress(email);
//            studentBean.setPassword(pass);
//            studentBean.setRegistrationNo(regNo);
//            studentBean.setPhoto(photo);
//            studentBean.setStudentName(name);
//            studentBean.setSession(session);
//            studentBean.setStudentId(null);
//
//            studentService.addStudent(studentBean);
//        }
        
        /// ---- Course_registration --- //
        
        List<StudentBean> listst=new StudentApiImpl().getStudentList();
        List<CourseBean> listco=new CourseApiImpl().getCourseList();
        
            
        

        System.out.println("May be This is the End with Success/Deny");
    }
}
