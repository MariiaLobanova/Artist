package Library;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BookInfo {

    //. @BookInfo
    //Objective: To annotate a field that stores book-related information.
    //Attributes: title, author, yearPublished
    //Usage: Annotate fields in the Book class.

}
