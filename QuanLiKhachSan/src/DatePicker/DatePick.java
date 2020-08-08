 package DatePicker;
 
 import java.awt.Color;
 import java.awt.Component;
 import java.awt.Cursor;
 import java.awt.Dimension;
 import java.awt.Font;
 import java.awt.Graphics;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.awt.event.KeyAdapter;
 import java.awt.event.KeyEvent;
 import java.awt.event.MouseAdapter;
 import java.awt.event.MouseEvent;
 import java.text.DecimalFormat;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Calendar;
 import java.util.Date;
 import javax.swing.GroupLayout;
 import javax.swing.ImageIcon;
 import javax.swing.JButton;
 import javax.swing.JLabel;
 import javax.swing.JLayeredPane;
 import javax.swing.JPanel;
 import javax.swing.JPopupMenu;
 import javax.swing.JTextField;
 import javax.swing.LayoutStyle;
 import javax.swing.border.Border;
 
 public class DatePick extends JPanel
 {
   private ArrayList<JLabel> arr;
   private int day;
   private int month;
   private int year;
   private int d;
   private int m;
   private int y;
   private String type;
   private String selectedDate;
   private int lenYear;
   private JButton txt;
   private JPopupMenu pp;
   private Color bg;
   private final String[] allMonth;
   private String dateFormat;
   private JLayeredPane body;
   private JButton cmdBack;
   private JButton cmdDown;
   private JButton cmdNext;
   private JButton cmdToday;
   private JButton cmdUp;
   private JLabel labelChuNhat;
   private JLabel labelThuHai;
   private JLabel labelThuBa;
   private JLabel labelThuTu;
   private JLabel labelThuNam;
   private JLabel labelThuSau;
   private JLabel labelThuBay;
   private JLabel lbText;
   private JLabel txtMounth;
   private JTextField txtYear;
   public static final int GET_DAY = 1;
   public static final int GET_MONTH = 2;
   public static final int GET_YEAR = 3;
   
   private void initComponents() {
     this.txtMounth = new JLabel();
     this.labelChuNhat = new JLabel();
     this.labelThuSau = new JLabel();
     this.labelThuBay = new JLabel();
     this.labelThuHai = new JLabel();
     this.labelThuBa = new JLabel();
     this.labelThuTu = new JLabel();
     this.labelThuNam = new JLabel();
     this.cmdNext = new JButton();
     this.cmdBack = new JButton();
     this.cmdDown = new JButton();
     this.cmdUp = new JButton();
     this.lbText = new JLabel();
     this.txtYear = new JTextField();
     this.cmdToday = new JButton();
     this.body = new JLayeredPane();
     this.txtMounth.setForeground(new Color(68, 68, 68));
     
     this.labelChuNhat.setFont(new Font("Tahoma", 1, 11));
     this.labelChuNhat.setForeground(new Color(225, 51, 51));
     this.labelChuNhat.setHorizontalAlignment(0);
     this.labelChuNhat.setText("CN");
     
     this.labelThuSau.setFont(new Font("Tahoma", 1, 11));
     this.labelThuSau.setForeground(new Color(52, 51, 51));
     this.labelThuSau.setHorizontalAlignment(0);
     this.labelThuSau.setText("Sáu");
     
     
     this.labelThuBay.setFont(new Font("Tahoma", 1, 11));
     this.labelThuBay.setForeground(new Color(52, 51, 51));
     this.labelThuBay.setHorizontalAlignment(0);
     this.labelThuBay.setText("Bảy");
     
     
     this.labelThuHai.setFont(new Font("Tahoma", 1, 11));
     this.labelThuHai.setForeground(new Color(52, 51, 51));
     this.labelThuHai.setHorizontalAlignment(0);
     this.labelThuHai.setText("  Hai  ");
     
     
     this.labelThuBa.setFont(new Font("Tahoma", 1, 11));
     this.labelThuBa.setForeground(new Color(52, 51, 51));
     this.labelThuBa.setHorizontalAlignment(0);
     this.labelThuBa.setText("Ba");
     
     this.labelThuTu.setFont(new Font("Tahoma", 1, 11));
     this.labelThuTu.setForeground(new Color(52, 51, 51));
     this.labelThuTu.setHorizontalAlignment(0);
     this.labelThuTu.setText("Tư");
     
     this.labelThuNam.setFont(new Font("Tahoma", 1, 11));
     this.labelThuNam.setForeground(new Color(52, 51, 51));
     this.labelThuNam.setHorizontalAlignment(0);
     this.labelThuNam.setText("Năm");
     
     this.cmdNext.setIcon(new ImageIcon(getClass().getResource("next.png")));
     this.cmdNext.setContentAreaFilled(false);
     this.cmdNext.setCursor(new Cursor(12));
     this.cmdNext.setFocusable(false);
     
     this.cmdNext.addMouseListener(new MouseAdapter()
         {
           public void mousePressed(MouseEvent evt) {
             DatePick.this.cmdNextMousePressed(evt);
           }
           
           public void mouseReleased(MouseEvent evt) {
             DatePick.this.cmdNextMouseReleased(evt);
           }
         });
     this.cmdNext.addActionListener(new ActionListener()
         {
           public void actionPerformed(ActionEvent evt) {
             DatePick.this.cmdNextActionPerformed(evt);
           }
         });
     this.cmdBack.setIcon(new ImageIcon(getClass().getResource("back.png")));
     this.cmdBack.setContentAreaFilled(false);
     this.cmdBack.setCursor(new Cursor(12));
     this.cmdBack.setFocusable(false);
     this.cmdBack.addMouseListener(new MouseAdapter()
         {
           public void mousePressed(MouseEvent evt) {
             DatePick.this.cmdBackMousePressed(evt);
           }
           
           public void mouseReleased(MouseEvent evt) {
             DatePick.this.cmdBackMouseReleased(evt);
           }
         });
     this.cmdBack.addActionListener(new ActionListener()
         {
           public void actionPerformed(ActionEvent evt) {
             DatePick.this.cmdBackActionPerformed(evt);
           }
         });
     this.cmdDown.setIcon(new ImageIcon(getClass().getResource("icon_down.png")));
     this.cmdDown.setContentAreaFilled(false);
     this.cmdDown.setCursor(new Cursor(12));
     this.cmdDown.setFocusable(false);
     this.cmdDown.addActionListener(new ActionListener()
         {
           public void actionPerformed(ActionEvent evt) {
             DatePick.this.cmdDownActionPerformed(evt);
           }
         });
     this.cmdUp.setIcon(new ImageIcon(getClass().getResource("icon_up.PNG")));
     this.cmdUp.setContentAreaFilled(false);
     this.cmdUp.setCursor(new Cursor(12));
     this.cmdUp.setFocusable(false);
     this.cmdUp.addActionListener(new ActionListener()
         {
           public void actionPerformed(ActionEvent evt) {
             DatePick.this.cmdUpActionPerformed(evt);
           }
         });
     this.lbText.setIcon(new ImageIcon(getClass().getResource("text.PNG")));
     this.txtYear.setBackground(new Color(251, 251, 251));
     this.txtYear.setForeground(new Color(68, 68, 68));
     this.txtYear.setHorizontalAlignment(0);
     this.txtYear.setBorder((Border)null);
     this.txtYear.addKeyListener(new KeyAdapter()
         {
           public void keyTyped(KeyEvent evt) {
             DatePick.this.txtYearKeyTyped(evt);
           }
         });
     this.cmdToday.setFont(new Font("sansserif", 1, 12));
     this.cmdToday.setIcon(new ImageIcon(getClass().getResource("today.png")));
     this.cmdToday.setContentAreaFilled(false);
     this.cmdToday.setCursor(new Cursor(12));
     this.cmdToday.setFocusable(false);
     this.cmdToday.addMouseListener(new MouseAdapter()
         {
           public void mousePressed(MouseEvent evt) {
             DatePick.this.cmdTodayMousePressed(evt);
           }
           
           public void mouseReleased(MouseEvent evt) {
             DatePick.this.cmdTodayMouseReleased(evt);
           }
         });
     this.cmdToday.addActionListener(new ActionListener()
         {
           public void actionPerformed(ActionEvent evt) {
             DatePick.this.cmdTodayActionPerformed(evt);
           }
         });
     GroupLayout bodyLayout = new GroupLayout(this.body);
     this.body.setLayout(bodyLayout);
     bodyLayout.setHorizontalGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 0, 32767));
     bodyLayout.setVerticalGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 163, 32767));
     GroupLayout layout = new GroupLayout(this);
     setLayout(layout);
     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.txtMounth, -2, 62, -2).addGap(6, 6, 6).addComponent(this.cmdBack, -2, 25, -2).addGap(6, 6, 6).addComponent(this.cmdNext, -2, 25, -2).addGap(6, 6, 6).addComponent(this.cmdToday, -2, 20, -2).addGap(7, 7, 7).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(63, 63, 63).addComponent(this.cmdUp, -2, 9, -2)).addGroup(layout.createSequentialGroup().addGap(13, 13, 13).addComponent(this.txtYear, -2, 50, -2)).addGroup(layout.createSequentialGroup().addGap(63, 63, 63).addComponent(this.cmdDown, -2, 10, -2)).addComponent(this.lbText)).addGap(0, 13, 32767)).addGroup(layout.createSequentialGroup().addGap(7, 7, 7).addComponent(this.labelChuNhat, -2, 30, -2).addGap(6, 6, 6).addComponent(this.labelThuHai).addGap(6, 6, 6).addComponent(this.labelThuBa, -2, 30, -2).addGap(6, 6, 6).addComponent(this.labelThuTu, -2, 30, -2).addGap(6, 6, 6).addComponent(this.labelThuNam, -2, 30, -2).addGap(6, 6, 6).addComponent(this.labelThuSau, -2, 30, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.labelThuBay, -1, -1, 32767)).addComponent(this.body));
     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addComponent(this.txtMounth, -2, 20, -2)).addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addComponent(this.cmdBack, -2, 20, -2)).addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addComponent(this.cmdNext, -2, 20, -2)).addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addComponent(this.cmdToday, -2, 20, -2)).addComponent(this.cmdUp, -2, 10, -2).addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addComponent(this.txtYear, -2, 20, -2)).addGroup(layout.createSequentialGroup().addGap(12, 12, 12).addComponent(this.cmdDown, -2, 10, -2)).addGroup(layout.createSequentialGroup().addGap(1, 1, 1).addComponent(this.lbText))).addGap(10, 10, 10).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.labelChuNhat).addComponent(this.labelThuHai).addComponent(this.labelThuBa).addComponent(this.labelThuTu).addComponent(this.labelThuNam).addComponent(this.labelThuSau).addComponent(this.labelThuBay, -2, -1, -2)).addGap(6, 6, 6).addComponent(this.body)));
   }
   
   public DatePick() {
       
     this.type = "-";
     this.bg = getBackground();
     this.allMonth = new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" };
     this.dateFormat = "dd-MM-YYYY";
     initComponents();
     execute(); } private void execute() { this.lenYear = 4;
     Date date = new Date();
     SimpleDateFormat df = new SimpleDateFormat(this.dateFormat);
     String[] data = df.format(date).split("-");
     this.d = this.day = Integer.valueOf(data[0]);
     this.m = this.month = Integer.valueOf(data[1]);
     this.y = this.year = Integer.valueOf(data[2]);
     this.txtMounth.setText(this.allMonth[this.month - 1]);
     this.txtYear.setText(this.year + "");
     this.arr = new ArrayList<>();
     this.txt = new JButton();
     this.pp = new JPopupMenu()
       {
         protected void paintComponent(Graphics grphcs) {
           grphcs.setColor(new Color(114, 113, 113));
           grphcs.fillRect(0, 0, getWidth(), getHeight());
           grphcs.setColor(DatePick.this.bg);
           grphcs.fillRect(1, 1, getWidth() - 2, getHeight() - 2);
         }
       };
     for (int i = 0; i < 31; i++) {
       SubLabel obj = new SubLabel((i + 1) + "");
       obj.setSize(35, 25);
       obj.setHorizontalAlignment(0);
       obj.setOpaque(true);
       obj.setCursor(new Cursor(12));
       this.arr.add(obj);
     } 
     setDate();
     DecimalFormat f = new DecimalFormat("00");
     this.selectedDate = f.format(this.day) + this.type + f.format(this.month) + this.type + this.year;
     this.txt.setText(this.selectedDate); }
   
   private void showDate(Component obj, int x, int y) {
     this.pp.add(this);
     this.pp.show(obj, x, y);
   }
   public void showPopup() {
     if (this.pp.isVisible()) {
       this.pp.setVisible(false);
     } else {
       showDate(this.txt, 1, this.txt.getHeight());
     } 
   }
   private void setDate() {
     this.body.removeAll();
     Calendar cd = Calendar.getInstance();
     cd.set(this.year, this.month - 1, 1);
     int start = cd.get(7);
     int max = cd.getActualMaximum(5);
     int x = 4, yy = 4; int i;
     for (i = 1; i < start; i++) {
       x += 36;
     }
     for (i = 1; i <= max; i++) {
       JLabel obj = this.arr.get(i - 1);
       obj.setLocation(x, yy);
       if (start % 2 == 0) {
         obj.setBackground(new Color(229, 229, 229));
         obj.setForeground(new Color(72, 72, 72));
       } else {
         obj.setBackground(new Color(202, 202, 202));
         obj.setForeground(new Color(72, 72, 72));
       } 
       if (start == 1) {
         obj.setBackground(new Color(211, 139, 150));
         obj.setForeground(new Color(189, 33, 33));
       } 
       if (i == this.d && this.month == this.m && this.year == this.y) {
         obj.setBackground(new Color(95, 105, 99));
         obj.setForeground(new Color(236, 236, 236));
       } 
       start++;
       x += 36;
       if (start == 8) {
         start = 1;
         x = 4;
         yy += 26;
       } 
       this.body.add(obj);
     } 
     this.body.revalidate();
     this.body.repaint();
   }
   private void cmdNextActionPerformed(ActionEvent evt) {
     if (this.month == 12) {
       this.month = 1;
       this.txtYear.setText((this.year + 1) + "");
     } else {
       this.month++;
     } 
     this.txtYear.setText(this.year + "");
     this.txtMounth.setText(this.allMonth[this.month - 1]);
     setDate();
   }
   
   private void setIcon(JButton cmd, String icon) {
     cmd.setIcon(new ImageIcon(getClass().getResource(icon)));
   }
   private void cmdBackActionPerformed(ActionEvent evt) {
     if (this.month == 1) {
       this.month = 12;
       this.txtYear.setText((this.year - 1) + "");
     } else {
       this.month--;
     } 
     this.txtYear.setText(this.year + "");
     this.txtMounth.setText(this.allMonth[this.month - 1]);
     setDate();
   }
 
   
   private void cmdDownActionPerformed(ActionEvent evt) {
     this.txtYear.setText((Integer.valueOf(this.txtYear.getText())- 1) + "");
     if (this.arr != null) {
       this.year = Integer.valueOf(this.txtYear.getText());
       setDate();
     } 
   }
 
   
   private void cmdUpActionPerformed(ActionEvent evt) {
     this.txtYear.setText((Integer.valueOf(this.txtYear.getText())+ 1) + "");
     if (this.arr != null) {
       this.year = Integer.valueOf(this.txtYear.getText());
       setDate();
     } 
   }
 
   
   private void txtYearKeyTyped(KeyEvent evt) {
     if (evt.getKeyChar() == '\n') {
       this.pp.setVisible(false);
       return;
     } 
     if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '\b') {
       evt.consume();
     } else if (this.txtYear.getText().length() >= 4) {
       evt.consume();
     }
     else if (!this.txtYear.getText().trim().equals("")) {
       if (evt.getKeyChar() == '\b') {
         this.year = Integer.valueOf(this.txtYear.getText());
       } else {
         this.year = Integer.valueOf(this.txtYear.getText() + evt.getKeyChar());
       } 
       setDate();
     } 
   }
   
   private void cmdTodayActionPerformed(ActionEvent evt) {
     Date date = new Date();
     SimpleDateFormat df = new SimpleDateFormat("dd" + this.type + "MM" + this.type + "YYYY");
     String[] data = df.format(date).split(this.type);
     this.d = this.day = Integer.valueOf(data[0]);
     this.m = this.month = Integer.valueOf(data[1]);
     this.y = this.year = Integer.valueOf(data[2]);
     this.txtMounth.setText(this.allMonth[this.month - 1]);
     this.txtYear.setText(this.year + "");
     setDate();
     this.txt.setText(df.format(date));
   }
 
   
   private void cmdNextMouseReleased(MouseEvent evt) {
     setIcon(this.cmdNext, "next.png");
   }
 
   
   private void cmdBackMouseReleased(MouseEvent evt) {
     setIcon(this.cmdBack, "back.png");
   }
 
   
   private void cmdBackMousePressed(MouseEvent evt) {
     setIcon(this.cmdBack, "back_click.png");
   }
 
 
   
   private void cmdNextMousePressed(MouseEvent evt) {
     setIcon(this.cmdNext, "next_click.png");
   }
 
   
   private void cmdTodayMousePressed(MouseEvent evt) {
     setIcon(this.cmdToday, "today_click.png");
   }
 
   
   private void cmdTodayMouseReleased(MouseEvent evt) {
     setIcon(this.cmdToday, "today.png");
   }
   
   // Label các ngày
   private class SubLabel extends JLabel
   {
     public SubLabel() {}

     public SubLabel(String text) {
       super(text);
       addMouseListener(new MouseAdapter()
           {
             public void mousePressed(MouseEvent e)
             {
               DatePick.SubLabel.this.evenMousePressed(e);
             }
 
             
             public void mouseClicked(MouseEvent e) {
               DatePick.SubLabel.this.evenMouseClicked(e);
             }
           });
     }
     
     private void evenMousePressed(MouseEvent e) {
       DatePick.this.setDate();
       DecimalFormat f = new DecimalFormat("00");
       setBackground(new Color(138, 165, 186));
       DatePick.this.day = Integer.valueOf(getText());
       DatePick.this.selectedDate = f.format(DatePick.this.day) + DatePick.this.type + f.format(DatePick.this.month) + DatePick.this.type + DatePick.this.year;
       DatePick.this.txt.setText(DatePick.this.selectedDate);
     }
     private void evenMouseClicked(MouseEvent e) {
       if (e.getClickCount() == 2) {
         DatePick.this.pp.setVisible(false);
       }
     }
   }
 
   public void setBackground(Color color) {
     super.setBackground(color);
     this.bg = color;
   }
   
   public void setGrabFocus() {
     this.txt.grabFocus();
   }
   public void setTextFocusable(boolean focusable) {
     this.txt.setFocusable(focusable);
   }
   public void showDialog(Component com, int x, int y) {
     showDate(com, x, y);
   }
   
   public void setButton(JButton btn) {
     btn.addActionListener(new ActionListener()
         {
           public void actionPerformed(ActionEvent ae) {
             DatePick.this.showPopup();
           }
         });
    this.txt = btn;
    this.txt.setText(this.selectedDate);
   }
   public void setIntervalType(String type) {
     this.type = type;
     this.selectedDate = this.day + type + this.month + type + this.year;
     this.txt.setText(this.selectedDate);
   }
   
   public String getSelectedDate() {
     return this.selectedDate;
   }
   
   public void setSelectDate(String date){
       
     String[] data = date.split(this.type);
     this.d = this.day = Integer.valueOf(data[0]);
     this.m = this.month = Integer.valueOf(data[1]);
     this.y = this.year = Integer.valueOf(data[2]);
     this.txtMounth.setText(this.allMonth[this.month - 1]);
     this.txtYear.setText(this.year + "");
     setDate();
     this.txt.setText(date);
     this.selectedDate = date;
   }
   
   public String getSelectedDate(int type) {
     if (type == 1)
       return this.day + ""; 
     if (type == 2)
       return this.month + ""; 
     if (type == 3) {
       return this.year + "";
     }
     return getSelectedDate();
   }
   
   public int getLenYear() {
     return this.lenYear;
   }
   public void setLenYear(int lenYear) {
     this.lenYear = lenYear;
   }
   public String getText() {
     return this.txt.getText();
   }
 }


/* Location:              D:\Poly\java swing\DatePick.jar!\cambodia\dateChosse\DatePick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */