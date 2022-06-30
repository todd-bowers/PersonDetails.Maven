package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        StringBuilder temp = new StringBuilder();
        int counter = 0;
        while (counter < personArray.length) {
            String currentPerson = String.valueOf(personArray[counter]);
            temp.append(currentPerson);
            counter++;
        }
        return temp.toString();
    }



    public String forLoop() {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < personArray.length; i++) {
            temp.append(personArray[i]);
        }
        return temp.toString();
    }



    public String forEachLoop() {
        StringBuilder temp = new StringBuilder();
        for (Person p : personArray) {
            temp.append(p);
        }
        return temp.toString();

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
