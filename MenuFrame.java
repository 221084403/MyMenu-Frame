/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import javax.swing.*;
/**
 *
 * @author MNCEDISI
 */
public class MenuFrame extends JFrame
{
    private JMenuBar menuBarMB;
    
    private JMenu fileMn;
    private JMenu editMn;
    private JMenu formatMn;
    private JMenu viewMn;
    private JMenu helpMn;
    
    private JMenuItem helpViewMnI;
    private JMenuItem helpSendMnI;
    private JMenuItem helpAboutMnI;

    public MenuFrame()
    {
        setTitle("Menu");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        
        //Creating menu bar
        menuBarMB = new JMenuBar();
        setJMenuBar(menuBarMB);
        
        //Creating menu
        fileMn = new JMenu("File");    
        editMn = new JMenu("Edit");
        formatMn = new JMenu("Format");
        viewMn = new JMenu("View");
        helpMn = new JMenu("Help");
        
        //Creating a menu item
        helpViewMnI = new JMenuItem("View Help");
        helpSendMnI = new JMenuItem("Send Feedback");
        helpAboutMnI = new JMenuItem("About Notepad");
        
        //Adding
        helpMn.add(helpViewMnI);
        helpMn.add(helpSendMnI);
        helpMn.add(helpAboutMnI);
      
        menuBarMB.add(fileMn);
        menuBarMB.add(editMn);
        menuBarMB.add(formatMn);
        menuBarMB.add(viewMn);
        menuBarMB.add(helpMn);
        
        setVisible(true);
    } 
}
