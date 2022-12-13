import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controler implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        AlphabetChooseBox.getItems().addAll(languages);
    }
    private final String[]languages = {"English", "Georgian"};
    @FXML
    private ChoiceBox <String> AlphabetChooseBox;
    @FXML
    private Spinner <Integer>NumberOfSentencesSpinner;
    @FXML
    private Spinner <Integer> CharactersMaxSpinner;
    @FXML
    private Spinner<Integer> WordsMinSpinner;
    @FXML
    private Spinner <Integer> WordsMaxSpinner;
    @FXML
    private Spinner <Integer> CharactersMinSpinner;

    @FXML
    private Button GenerateRandomButton;

    @FXML
    private TextArea ResultTextField;


    @FXML
    protected void onGenerateRandomButtonClick(){
        if (AlphabetChooseBox.getValue().equals("Georgian")){
            ResultTextField.setText(generate('ა',33));
        }else {
            ResultTextField.setText(generate('a',26));
        }
    }


    private String generate(char start,int size) {
        Random random = new Random();
        String result = "";
        int sentencesAmount = NumberOfSentencesSpinner.getValue();
        int maxChars = CharactersMaxSpinner.getValue();
        int minChars = CharactersMinSpinner.getValue();
        int minWords = WordsMinSpinner.getValue();
        int maxWords = WordsMaxSpinner.getValue();
        if (maxWords<=100&&maxWords>minWords && minWords>0 && minChars>0&&maxChars<=100&&minChars < maxChars && sentencesAmount<=100) {
            for (int i = 0; i < sentencesAmount; i++) {
                int wordAmount = random.nextInt(minWords, maxWords);
                for (int j = 0; j < wordAmount; j++) {
                    int charAmount = random.nextInt(minChars, maxChars);
                    for (int k = 0; k < charAmount; k++) {
                        char b =(char)(start + random.nextInt(0,size));
                        if (size==26 && random.nextBoolean()){
                            b=Character.toUpperCase(b);
                        }
                        result+=b;

                    }
                    if (j!=wordAmount-1){
                        result += " ";
                    }
                }
                result += "."+"\n";

            }

            return result;
        }
        else throw new RuntimeException("Min and Max Error");
    }
}