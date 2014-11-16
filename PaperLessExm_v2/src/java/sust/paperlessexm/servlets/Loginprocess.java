package sust.paperlessexm.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sust.paperlessexm.entity.Student;
import sust.paperlessexm.exception.GenericBusinessException;
import sust.paperlessexm.session.StudentService;

/**
 *
 * @author Rajib-pc
 */
public class Loginprocess extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String registration_no = request.getParameter("registration_no");
        String password = request.getParameter("password");
        String radiobutton = request.getParameter("radiobutton");

//        writer.println("Hello " + registration_no + "Your pass is: " + password + "Profession is: " + radiobutton);

        Student student = new Student();
        StudentService studentService = new StudentService();
        List<Student> list=new ArrayList<>();

        try {
//            writer.println("IN TRY BLOCK");
            list =  studentService.findStudentByRegistrationNo(registration_no);
            
            if( list.size() == 0 ){
                writer.println("Invalied Registration Number.");
            }
            else{
                student = list.get(0);

                if( student.getRegistrationNo().equals(registration_no) && student.getPassword().equals(password)  )
                {
                    writer.println("Login Succeed");
                }
                else if(student.getRegistrationNo().equals(registration_no) && (student.getPassword() == null ? password != null : !student.getPassword().equals(password)) )
                {
                    writer.println("Invalied Password");
                }
                else if( student.getPassword().equals(password) && (student.getRegistrationNo() == null ? registration_no != null : !student.getRegistrationNo().equals(registration_no)) )
                {
                    writer.println("Invalied Registration Number.");
                }
                else{
                    writer.println("Login Failed");
                }
            }
            
        } catch (GenericBusinessException ex) {
            Logger.getLogger(Loginprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
