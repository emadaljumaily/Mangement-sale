/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.awt.Color;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author emada
 */
public class Srcc {
  
   splash ss;
     public void Start() {
                ss = new splash(); // Create a new progress window
                worker.execute(); // Start the swingworker
                
  
                
                
                
        }
     
     
     
    private SwingWorker<Boolean, Integer> worker = new SwingWorker<Boolean, Integer>() {
                
                protected Boolean doInBackground() throws Exception {
                         
                        ss.setVisible(true); // Show the window
                       ss.progressBar.setMaximum(45); // Set max. value of the progress bar
                         
                        // Do processing tasks here. Example      
 
                        for (int i = 0; i <= 100; i++) {
                                Thread.sleep(20);
                                ss.progressBar.setValue(i); // Update the progress bar
                                if (i==3){
                                    
                                    ss.jarea.setText("Loading....");
                                }
                                if (i==10){
                                    
                                    ss.jarea.setText("Loading....\nLoading DateBase Complete");
                                }
                                
                                 if (i==40){
                                    
                                    ss.jarea.setText("Loading....\nLoading DateBase Complete\nLoading Library");
                                }
                                if (i==70){
                                    
                                    ss.jarea.setText("Loading....\nLoading DateBase Complete\nLoading Library\nFinished");
                                }
                        }
 
                        return false;
                }
                 
                
                protected void done() { // Process completed
                        ss.setVisible(false); // Hide the progress window
                        page1 ppage1=new page1();
  
                        
                        
                        ppage1.setVisible(true);
                }
        };
}


