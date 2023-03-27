/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import GUI.content;
import GUI.innercontent;
import GUI.menuLeft;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author DELL
 */
public class menuleftBLL implements MouseListener {
    menuLeft lfm;
    public static int flag;

    public menuleftBLL(menuLeft lfm) {
        this.lfm = lfm;
        flag = 0;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
      for (int i = 0; i < lfm.danhmuc.length; i++) {
            lfm.btn[i].setBorder(new EmptyBorder(0, 25, 0, 0));
        }
        if (e.getSource().equals(lfm.btn[0])) {
            flag = 1;
            MenuNhapHang menuNhapHang = new MenuNhapHang(lfm.btn[0]);
            menuNhapHang.show(lfm.btn[0], lfm.btn[0].getWidth(), 0);
            lfm.btn[0].setBorder(new MatteBorder(0, 4, 0, 0, Color.yellow));
//            content.pnl_content.removeAll();
//            new innercontent();
//            content.pnl_content.repaint();
//            content.pnl_content.validate();

        } else if (e.getSource().equals(lfm.btn[1])) {
            lfm.btn[1].setBorder(new MatteBorder(0, 4, 0, 0, Color.yellow));
            flag=2;
            content.pnl_content.removeAll();
            new innercontent();
            content.pnl_content.repaint();
            content.pnl_content.validate();
        } else if (e.getSource().equals(lfm.btn[2])) {
            lfm.btn[2].setBorder(new MatteBorder(0, 4, 0, 0, Color.yellow));
            flag = 3;
            content.pnl_content.removeAll();
            new innercontent();
            content.pnl_content.repaint();
            content.pnl_content.validate();
        } 

    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         for (int i = 0; i < lfm.danhmuc.length; i++) {
            if (e.getSource().equals(lfm.btn[0])) {
                lfm.btn[0].setBackground(new Color(220, 220, 220));
                lfm.btn[0].setOpaque(true);
            } else if (e.getSource().equals(lfm.btn[1])) {
                lfm.btn[1].setBackground(new Color(220, 220, 220));
                lfm.btn[1].setOpaque(true);
            } else if (e.getSource().equals(lfm.btn[2])) {
                lfm.btn[2].setBackground(new Color(220, 220, 220));
                lfm.btn[2].setOpaque(true);
            } else if (e.getSource().equals(lfm.btn[3])) {
                lfm.btn[3].setBackground(new Color(220, 220, 220));
                lfm.btn[3].setOpaque(true);
            } else if (e.getSource().equals(lfm.btn[4])) {
                lfm.btn[4].setBackground(new Color(220, 220, 220));
                lfm.btn[4].setOpaque(true);
            } else if (e.getSource().equals(lfm.btn[5])) {
                lfm.btn[5].setBackground(new Color(220, 220, 220));
                lfm.btn[5].setOpaque(true);
            } else if (e.getSource().equals(lfm.btn[6])) {
                lfm.btn[6].setBackground(new Color(220, 220, 220));
                lfm.btn[6].setOpaque(true);
            } else if (e.getSource().equals(lfm.btn[7])) {
                lfm.btn[7].setBackground(new Color(220, 220, 220));
                lfm.btn[7].setOpaque(true);
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        for (int i = 0; i < lfm.danhmuc.length; i++) {
            if (e.getSource().equals(lfm.btn[0])) {
                lfm.btn[0].setBackground(null);
            } else if (e.getSource().equals(lfm.btn[1])) {
                lfm.btn[1].setBackground(null);
            } else if (e.getSource().equals(lfm.btn[2])) {
                lfm.btn[2].setBackground(null);
            } else if (e.getSource().equals(lfm.btn[3])) {
                lfm.btn[3].setBackground(null);
            } else if (e.getSource().equals(lfm.btn[4])) {
                lfm.btn[4].setBackground(null);
            } else if (e.getSource().equals(lfm.btn[5])) {
                lfm.btn[5].setBackground(null);
            } else if (e.getSource().equals(lfm.btn[6])) {
                lfm.btn[6].setBackground(null);
            } else if (e.getSource().equals(lfm.btn[7])) {
                lfm.btn[7].setBackground(null);
            }
        }
    }
    
}
