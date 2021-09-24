// Assignment : Sort elements based on Id , in case id is sample then sort based on name for the user

import java.io.*;
import java.util.*;
class User {
    int id;
    String name;
  
    public User(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
  
    public String toString()
    {
        return this.id + " " + this.name;
    }
}
  
class SortbyID implements Comparator<User> {
    public int compare(User a, User b)
    {
        return a.id - b.id;
    }
}
  
class Sortbyname implements Comparator<User> {
    public int compare(User a, User b)
    {
        return a.name.compareTo(b.name);
    }
}
  
public class Main {
    public static void main(String[] args)
    {
        ArrayList<User> ar = new ArrayList<User>();
        ar.add(new User(111, "Varun"));
        ar.add(new User(131, "Aniket"));
        ar.add(new User(121, "Ravi"));
        ar.add(new User(34, "Anmol"));
  
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new SortbyID());
  
        System.out.println("\nSorted by ID");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyname());
  
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}



