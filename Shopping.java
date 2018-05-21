/*
Cristian Benitez
OOP
My shopping List
5/14/2018
*/


import java.io.IOException;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Shopping

{

    //Array list of strings

    ArrayList<String> ItemsList = new ArrayList<String>();

    //Constructor

    private Shopping()

    {

    }

    //Displays the list of items

    public static void main(String args[]) throws IOException

    {

        int ch;

        String item;

        Shopping sl = new Shopping();

        Scanner input = new Scanner(System.in);

        do

        {
                //A very detail grocery list
            System.out.println("--------Menu--------");

            System.out.println("Remember To add all important food groups ");

            System.out.println("1. Show shopping list.");

            System.out.println("2. Add new item to list.");

            System.out.println("3. Remove an item from the list. ");

            System.out.println("4. Insert an item into the list. ");

            System.out.println("5. Change an item in the list. ");

            System.out.println("6. Clear the list. ");

            System.out.println("7. Exit. ");

            System.out.print("Enter your choice: ");

            ch = input.nextInt();

            switch (ch)

            {
                        //Each case and break is its own argument
                case 1:
                    sl.showList();

                    break;


                case 2:
                    System.out.print("Enter the new item to add: ");

                    input.nextLine();

                    item = input.nextLine();

                    sl.addItem(item);

                    break;

                case 3:
                    sl.showList();

                    System.out.print("Enter the list number of the item: ");

                    int num = input.nextInt();

                    sl.remove(num);

                    break;

                case 4:
                    sl.showList();

                    System.out.print("Enter the new item to add: ");

                    input.nextLine();

                    item = input.nextLine();

                    System.out.print("Enter the insertion position: ");

                    int pos = input.nextInt();

                    sl.insertAt(item, pos);

                    break;

                case 5:
                    sl.showList();

                    System.out.print("Enter the list number: ");

                    int p = input.nextInt();

                    System.out.print("Enter the new item to change: ");

                    input.nextLine();

                    item = input.nextLine();

                    sl.changeItem(item, p);

                    break;

                case 6:
                    sl.clearList();

                    break;

                case 7:

                    System.exit(0);

                    break;

                default:

                    System.out.println("Wrong choice!");

            }

        } while (ch != 7);


    }

    //add an item at the end of the list

    public void showList()

    {

        if (this.isEmpty())

            System.out.println("No items");

        else

        {

            System.out.println("**List of goodies**");

            IntStream.range(0, ItemsList.size()).mapToObj(i -> (i + 1) + ") " + ItemsList.get(i)).forEachOrdered(System.out::println);

        }

    }

    //removes a specified item by list number

    public void addItem(String item)

    {

        ItemsList.add(item);

    }

    //inserts an item by list number

    public void remove(int n)

    {

        ItemsList.remove(n - 1);

    }

    //modifies an item

    public void insertAt(String item, int p)

    {

        ItemsList.add(p - 1, item);

    }

    //clears the list or removes all items

    public void changeItem(String item, int p)

    {

        ItemsList.remove(p - 1);

        ItemsList.add(p - 1, item);

    }

    //if the list is empty, returns true

    //otherwise returns false

    public void clearList()

    {

        ItemsList.clear();

    }

    public boolean isEmpty()

    {

        if (ItemsList.size() <= 0)

        {
            return true;
        } else

            return false;

    }

}
