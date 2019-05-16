package org.hillel.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JacksonDemo
{
    public static void main(String[] args) throws IOException
    {
        ObjectMapper objMapper = new ObjectMapper();
        Map result = objMapper.readValue(JacksonDemo.class.getResourceAsStream("object.json"), HashMap.class);
        result.entrySet().forEach(System.out::println);
    }
}
