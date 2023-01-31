package week_03_generics_enum_lambda_lombok.lombok.basics_1.singular;

import lombok.*;

import java.util.List;

@Builder
@Setter
class Student_Singular {
    @NonNull                  //   @Nonnull make sure name filed is a mandatory field
    private String name;
    private String surname;
    private String email;
    @Singular   //This singular method enables adding a single item to the collection.
    List<String> courses;

    @Builder.Default   //  if we do not assign the value of school in a new instance, it will be set to “CYDEO.”
    private String school = "CYDEO";

}
