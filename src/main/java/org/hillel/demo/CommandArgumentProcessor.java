package org.hillel.demo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

public class CommandArgumentProcessor
{
    public static void main(String[] args)
    {
        Options options = new Options();
        options.addOption("a", "arg", false, "Some descr");
        HelpFormatter hf = new HelpFormatter();
        hf.printHelp("sad", options);



    }
}
