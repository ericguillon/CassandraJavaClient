/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandrajavaclient;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author eric
 */
public class SCTHandler extends SepaHandler implements IListener
{

    @Override
    public void onDocumentAvailable(Document document)
    {
        final Element root = document.getDocumentElement();
        if (root != null)
        {
            String rootTagName = root.getTagName();
            String rootName = root.getNodeName();
            String rootValue = root.getNodeValue();
            String rootLocalName = root.getLocalName();
            String rootTextContent = root.getTextContent();
                    
            Node node = root.getFirstChild();
            
            if (node != null)
            {
                String nodeName = node.getNodeName();
                String nodeValue = node.getNodeValue();
                
                String nodeLocalName = node.getLocalName();
                
                int tmp = 0;
                tmp++;
            }
            
            if (node != null && node.getNodeName() != null && node.getNodeName().equals(Constants.FI_TO_FI_CUSTOMER_CREDIT_TRANSFER))
            {
                Node headerNode = node.getFirstChild();
                SepaHeader sepaHeader = SepaHeaderFactory.build(headerNode);
            }
        }
    }
    
}
