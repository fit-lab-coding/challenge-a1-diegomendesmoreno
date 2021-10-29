package fit.challenge;

public class ImcCalculator {
    public static String calculate(double weight, double height) {
        double imc = weight / Math.pow(height, 2);
        String imcText = "";
        
        if(imc < 18.5)
        {
            imcText = "Magreza";
        }
        else if(imc >= 18.5 && imc < 24.9)
        {
            imcText = "Normal";
        }
        else if(imc >= 24.9 && imc < 30)
        {
            imcText = "Sobrepeso";
        }
        else if(imc > 30)
        {
            imcText = "Obesidade";
        }
        
        return imcText;
    }
}
