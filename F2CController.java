/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f2c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author barni
 */
public class F2CController {
    private static final NumberFormat temp= NumberFormat.getNumberInstance();
    
    @FXML
    private Slider sliderF2C;

   @FXML
   private TextField fText;
   
   @FXML
   private TextField cText;
   
   BigDecimal fNum ;
   BigDecimal cNum;
   BigDecimal sNum;
   BigDecimal aNum;
  BigDecimal dNum = new BigDecimal(32);
  BigDecimal gNum= new BigDecimal(0.55);
     public void initialize() 
   {
   
      
      
      // listener for changes to tipPercentageSlider's value
      sliderF2C.valueProperty().addListener(
         new ChangeListener<Number>() 
         {
            @Override
            public void changed(ObservableValue<? extends Number> ov, 
               Number oldValue, Number newValue) 
            {
               fNum = 
                  BigDecimal.valueOf(newValue.intValue());
               sNum= BigDecimal.valueOf(newValue.intValue()).subtract(dNum);
               
               aNum=
                       sNum.multiply(gNum);
                       
               cNum=
                       sNum.add(aNum);
               fText.setText(temp.format(fNum));
               cText.setText(temp.format(cNum));
            }
         }
      );
   }
}







