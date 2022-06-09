package edu.escuelaing.arsw;

import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        FileReader fr = new FileReader(args[0]);
        Calculos calculos = new Calculos();
        calculos.readFile(fr);
    }
}
