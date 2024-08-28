public class NameTag 
{
    // NameTag saves a persons name
    String name = "null";

    // Cunstructor, Default
    public NameTag() 
    {
        name = "Unknown";
        // Can leave empty if wanted to
    }
    


    // Cunstructor, Full
    public NameTag(String name) 
    {
        //this. helps to not confuse the program with duplicate variables

        this.name = name;
    }

    public NameTag(NameTag nameTag)
    {
        name = nameTag.name;
    }

    // Getter
    public String GetName()
    {
        return name;
    }
    // Setter
    public void SetName(String newName) 
    {
        name = newName;
    }
    // toString
    public String toString() 
    {
        return name;
    }
    // equals
    public boolean equals(NameTag nameTag)
    {
        // = is assigning a value
        // == is comparing two objects

        //return name == nameTag.name; One way to do this

        //Code provided from Chatgpt
        return name.equals(nameTag.name);
    }

}