package com.company;

import com.bethecoder.ascii_table.ASCIITable;

public class Main {

    public static void main(String[] args) {
        int dayInMonth = 33;

        /*String [] tableHeaders = new String[dayInMonth];
        for(int i = 0; i < dayInMonth; i++){
            tableHeaders[i] = Integer.toString(i + 1);
        }*/

        String [] tableHeaders = {};
        for(int i = 0; i < dayInMonth; i++){
            if(i < 10) {
                System.out.print("  " + (i + 1) + " ");
            }
            else
            {
                System.out.print(" " + (i + 1) + " ");
            }
        }

        System.out.println();

        String[][] tableData = new String[1][dayInMonth];
        for(int i = 0; i < dayInMonth; i++){
            tableData[0][i] = " ";
        }

        ASCIITable.getInstance().printTable(tableHeaders, tableData);
    }
}
