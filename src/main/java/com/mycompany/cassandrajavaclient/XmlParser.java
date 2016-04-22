/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.io.input.ReaderInputStream;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
/**
 *
 * @author eric
 */
public class XmlParser
{
    private final Set<IListener> listeners = new HashSet();
    
    public void connect(IListener listener)
    {
        listeners.add(listener);
    }
    
    private void emit(Document document)
    {
        Iterator<IListener> it = listeners.iterator();
        while (it.hasNext())
        {
            IListener listener = it.next();
            listener.onDocumentAvailable(document);
        }
    }
    
    private void parse(String xmlContent)
    {
        try 
        {
            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = factory.newDocumentBuilder();
            try 
            {
                InputStream inputStream = new BufferedInputStream(new ReaderInputStream(new StringReader(xmlContent)));
                final Document document = builder.parse(inputStream);
                emit(document);
            }
            catch (SAXException | IOException ex)
            {
                Logger.getLogger(XmlParser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (ParserConfigurationException ex) 
        {
            Logger.getLogger(XmlParser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void read(String filename) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null)
            {
                if (line.contains("<?xml"))
                {
                    if (sb.length() >0)
                    {
                        parse(sb.toString());
                        sb.setLength(0);
                    }
                }
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            
            if (sb.length() > 0)
            {
                parse(sb.toString());
            }
        }
    }
    
    public static void main (String[] args)
    {
        try
        {
            Handler handler = new FileHandler();
            Logger.getLogger("Eric").addHandler(handler);
            try
            {
                String filename = "/home/eric/NetBeansProjects/nickel/echantillon/Arkea/Arkea Sepa fichiers entrants/SCTSE_20160304T054638.XML";
                XmlParser parser = new XmlParser();
                SCTHandler sctHandler = new SCTHandler();
                parser.connect(sctHandler);
                parser.read(filename);
            }
            catch (IOException ex)
            {
                Logger.getLogger(XmlParser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (IOException | SecurityException ex)
        {
            Logger.getLogger(XmlParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
