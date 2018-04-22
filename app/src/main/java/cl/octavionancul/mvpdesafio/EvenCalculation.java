package cl.octavionancul.mvpdesafio;

public class EvenCalculation {

    private EvenCallback callback;

    public EvenCalculation(EvenCallback callback) {
        this.callback = callback;
    }

    public void evenCalculation(String value){

        if(value.trim().length()>0){

            int auxValue = Integer.parseInt(value);

            if(auxValue%2==0){
                value=auxValue+" es par" ;
            }else{
                value=auxValue+" es impar" ;
            }

            callback.evenResult(value);

        }else{
        callback.blankInput();
        }
    }
}
