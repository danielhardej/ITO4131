public class Student
{
    private String name;
    private String address;
    private String email;
    private String phone;

    public Student()
    {
        this.name = "";
        this.address = "";
        this.email = "";
        this.phone = "";
    }

    public Student(String name, String address, String email, String phone)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String display()
    {
        return "Name: " + name + "\nAddress: " + address + "\nEmail: " + email + "\nPhone: " + phone;
    }

    public String getAddress()
    {
        return address;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phone;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }


    public String toString()
    {
        return "Name: " + name + "\tAddress: " + address + "\tEmail: " + email + "\tPhone: " + phone;
    }

}
