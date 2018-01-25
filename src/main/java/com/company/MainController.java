package com.company;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class MainController {



    @RequestMapping("/")
    public String fizzbuzz (){
        String output ="This is FizzBuzz.";
        String diffoutput ="This is modified FizzBuzz.";
        String mult23 = "Multiples of 23: ";
        String mult17 = "Multiples of 17: ";
        String mult7 = "Multiples of 7: ";

        for (int i = 1; i <= 100; i++){
            if(i % 15 == 0){
                output = output + "<br>" + "FizzBuzz";
            } else if (i % 3 == 0){
                output = output + "<br>" + "Fizz";
            } else if (i % 5 == 0){
                output = output + "<br>" + "Buzz";
            } else {
                output = output + "<br>" + i;
            }
        }


        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the number of cycles you want modified FizzBuzz to go through and then go to localhost:8080 in the browser");
        int x = reader.nextInt();

        for (int j = 1; j <= x; j++){
            if(j % 23 == 0){
                mult23 = mult23 + " " + j + ",";
                diffoutput = diffoutput + "<br>" + j;
            } else if (j % 17 == 0){
                mult17 = mult17 + " " + j + ",";
                diffoutput = diffoutput + "<br>" + j;
            } else if (j % 7 == 0){
                mult7 = mult7 + " " + j + ",";
                diffoutput = diffoutput + "<br>" + j;
            } else {
                diffoutput = diffoutput + "<br>" + j;
            }
        }
        return output + "<br>" + "<br>" + "<br>" + diffoutput + "<br>" + mult23 + "<br>"+ mult17 + "<br>" + mult7 + "<br>";
    }
}
