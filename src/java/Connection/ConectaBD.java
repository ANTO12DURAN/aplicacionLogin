/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author antonieta
 */
public class ConectaBD {
      public static Connection con=null; 
     // private static String bd = "sistemalogin";    
      public static String usuario = "system";   
      public static String passw = "system";   
      public static String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
      
     public static Connection abrir(){      
         try{            
             Class.forName("oracle.jdbc.OracleDriver");         
             con = DriverManager.getConnection(url,usuario,passw);   
             System.out.println("Conexión exitosa:"+con);      
         } catch (Exception e) {          
             System.out.println("Error en la conexion...");     
             e.printStackTrace();     
             return null;     
         }         return con;   
         
     }          public static void cerrar(){    
         try{     
             if(con != null)   
                 con.close();  
         } catch (Exception e){      
             System.out.println("Error: No se logro cerrar  la conexion:\n"+e); 
         }
     }
}
