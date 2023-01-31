package week_03_generics_enum_lambda_lombok.lombok.basics_1.initial;

import week_03_generics_enum_lambda_lombok.lombok.withInheritance.Student;


public class MainBuilder {

    public static void main(String[] args) {
        var student = Student.builder()
                .name("John")
                .surname("Doe")
                .email("email")
                .phoneNumber(123455)
                .year(2)
                .build();

        System.out.println(student);


    }
}
