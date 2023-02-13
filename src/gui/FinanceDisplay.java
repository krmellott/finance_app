package gui;


import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;




/**
 *
 * @author Kyle Mellott
 */
public class FinanceDisplay extends HBox{
    
    public FinanceDisplay(){
        super.setPrefSize(300, 200);
                                     
        relativeButton = new RadioButton("Relative Valuation");
        dcfButton = new RadioButton("DCF Valuation");
        financeInfo = new RadioButton("Financial Info");
        relativeButton.setSelected(true);
        final ToggleGroup group = new ToggleGroup();
        relativeButton.setToggleGroup(group);
        dcfButton.setToggleGroup(group);
        financeInfo.setToggleGroup(group);
        
        
        VBox leftBox = new VBox();
        VBox choices = new VBox(new Label("Choices"));                
        choices.getChildren().add(relativeButton);
        choices.getChildren().add(dcfButton);
        choices.getChildren().add(financeInfo);
        choices.setAlignment(Pos.CENTER_LEFT);
       
        
        
        VBox stock = new VBox(new Label("Please enter stock symbol"));
        tickerField = new TextField();
        stock.getChildren().add(tickerField);
        leftBox.getChildren().add(stock);
        leftBox.getChildren().add(choices);
        leftBox.setSpacing(20);

        super.getChildren().add(leftBox);      
        

    }
    
    private Toggle getToggle(ToggleGroup group){
        return group.getSelectedToggle();
    }
    
    private String getTicker(){
        return tickerField.getText();
    }


    
    
    
    private final RadioButton relativeButton;
    private final RadioButton dcfButton;
    private final RadioButton financeInfo;
    
    private final TextField tickerField;
}
