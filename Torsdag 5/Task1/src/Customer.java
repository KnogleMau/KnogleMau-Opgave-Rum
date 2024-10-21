public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    public Customer(String firstName,String lastName,String username){

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        counter++;
        this.id = counter;



    }
public String getFirstName(){
        return firstName;
}
public String getLastName(){
        return lastName;
}
public String getUsername(){
        return username;
}
public int getId(){
        return id;
}

// Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "Customer Details:\n" +
                "ID: " + id + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Username: " + username + "\n";
        }
    }

