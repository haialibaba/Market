package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HeaderCTHDGUI {
    JPanel pnl_header;
    JLabel title;
    public String[] img={"shutdown_32px.png"};
    ImageIcon[] ImageIcon=new ImageIcon[img.length];
    Image[] Icon=new Image[img.length];
    public JLabel[] lbl_back=new JLabel[img.length];
    //MouseListener ml=new exit(this);
    
    public HeaderCTHDGUI(JFrame frame){
        imgs im=new imgs();
        
        pnl_header= new JPanel();
        pnl_header.setBackground(new Color(51, 51, 51));
        pnl_header.setPreferredSize(new Dimension(0, 50));
        pnl_header.setLayout(new FlowLayout());
        frame.add(pnl_header,BorderLayout.PAGE_START);
        
        title=new JLabel("Quản Lý Khóa Học");
        title.setForeground(Color.white);
        title.setFont(new Font(Font.SERIF, Font.ITALIC, 20));
        title.setBorder(new EmptyBorder(0, 0, 0, 960));
        pnl_header.add(title);
        
        for(int i=0;i<img.length;i++)
        {
            ImageIcon[i]=new ImageIcon(im.imgs(img[i]));
            Icon[i]= ImageIcon[i].getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING);
            ImageIcon[i]=new ImageIcon(Icon[i]);
            lbl_back[i]=new JLabel("",ImageIcon[i],JLabel.CENTER);
            lbl_back[i].setPreferredSize(new Dimension(40, 40));
            //lbl_back[i].addMouseListener(ml);
            pnl_header.add(lbl_back[i]);
        }
        lbl_back[0].setBorder(new EmptyBorder(0, 0, 0, 10));
        lbl_back[1].setBorder(new EmptyBorder(0, 10, 0, 0));
    }
}
