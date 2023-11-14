//Add two complex numbers

public class ComplexNumber {

  int real;
  int imaginar;

  public ComplexNumber(int real, int imaginar){
      this.real = real;
      this.imaginar = imaginar;
  }

  public void ShowNumber(){
      System.out.println("The complex number is: " + real + " + " + imaginar + "i");
  }

  public static ComplexNumber AddComplexNumber(ComplexNumber n1, ComplexNumber n2){

      ComplexNumber res = new ComplexNumber(0, 0);

      res.real = n1.real + n2.real;
      res.imaginar = n1.imaginar + n2.imaginar;

      return res;
  }



    public static void main(String[] args)
    {
        //First complex number
        ComplexNumber C1 = new ComplexNumber(5,6);
        C1.ShowNumber();

        //Second complex number
        ComplexNumber C2 = new ComplexNumber(7,9);
        C2.ShowNumber();

        //Add method
        ComplexNumber res = AddComplexNumber(C1, C2);
        System.out.println("\nThe sum is: ");
        res.ShowNumber();


    }
}


