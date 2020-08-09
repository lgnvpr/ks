/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author ADMIN
 */
public class MyComBoBox {
    String value;
    String text;
    public MyComBoBox(String value, String text){
        this.value = value;
        this.text = text;
    }
    
    @Override
    public String toString(){
        return text;
    }
    
    
    public int maInt(){
        return Integer.parseInt(value);
    }
    
    public String MaString(){
        return value;
    }
    
    public static void ChonCBB(String text, JComboBox cbb) {
        DefaultComboBoxModel cbbModel;

        cbbModel = (DefaultComboBoxModel) cbb.getModel();

        for (int i = 0; i < cbb.getItemCount(); i++) {
            MyComBoBox myCbb2 = (MyComBoBox) cbbModel.getElementAt(i);
            //System.out.println(myCbb.text.equals(SoPhong));

            if (myCbb2.text.equals(text)) {

                cbb.setSelectedIndex(i);
                break;
            }
        }

    }
}
