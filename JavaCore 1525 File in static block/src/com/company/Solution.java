package com.company;

/*

1525. Level 15 Lection 12. File in a static block
1. Initialize the variable Statics.FILE_NAME with the full path to the data file that contains several lines.
2. In a static block, read all the lines from the file named Statics.FILE_NAME and add them individually to the List lines.

Requirements:
1. The constant FILE_NAME must not be empty.
2. In a static block, all lines from a file named FILE_NAME must be added separately to the lines list.
3. FILE_NAME must NOT be final.
4. The Solution class should contain a list of lines.

 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(Statics.FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "WINDOWS-1251");
            BufferedReader reader = new BufferedReader(inputStreamReader);
            while (true) {
                String s = reader.readLine();
                if (s == null)
                    break;
                lines.add(s);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        System.out.println(lines);
    }
}



class Statics {
    public static String FILE_NAME = "D:\\test"/* add your path to source file here*/;
}


