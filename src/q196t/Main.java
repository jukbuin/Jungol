package q196t;

import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable {
   private String name;
   private String tel;
   private String adrs;

   public Person(String name, String tel, String adrs) {
      this.name = name;
      this.tel = tel;
      this.adrs = adrs;
   }

   public void print() {
      System.out.println(name + " " + tel + " " + adrs);
   }

   public char getFirstName() {
      return name.charAt(0);
   }

   public int compareTo(Object o) {
      Person p = (Person)o;
      if (this.getFirstName() < p.getFirstName()) {
         return -1;
      } else if (this.getFirstName() == p.getFirstName()) {
         return 0;
      } else {
         return 1;
      }
   }
}

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Person[] p = new Person[3];
      for (int i = 0; i < p.length; i++) {
         String name = sc.next();
         String tel = sc.next();
         String adrs = sc.next();
         p[i] = new Person(name, tel, adrs);
      }
      sc.close();

      for (int i = 0; i < p.length; i++) {
         p[i].print();
      }

      Arrays.sort(p);
      System.out.println("--------------------");
      for (int i = 0; i < p.length; i++) {
         p[i].print();
      }
   }
}