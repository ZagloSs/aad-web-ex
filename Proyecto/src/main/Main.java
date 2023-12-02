package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import obj.Cita;
import obj.Mascota;

public class Main {

	public static void main(String[] args) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
		DocumentBuilder db;
		
		File  file;
		Document doc;
		XPath xpath;
		
		NodeList nodeList;
		
		String path;
		
		ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
		ArrayList<Cita> citas = new ArrayList<Cita>();
		
		
		try {
			
			db = dbf.newDocumentBuilder();
			file = new File("mascotas.xml");
			
			doc = db.parse(file);
			
			doc.normalizeDocument();
			
			xpath = XPathFactory.newInstance().newXPath();
			
			path = "//mascota";
			
			nodeList = (NodeList) xpath.compile(path).evaluate(doc, XPathConstants.NODESET);
			
			for(int i = 0; i<nodeList.getLength(); i++) {
				Element elemento = (Element) nodeList.item(i);
				
				mascotas.add(new Mascota(elemento.getElementsByTagName("id").item(0).getTextContent(), elemento.getElementsByTagName("nombre").item(0).getTextContent(), 
						elemento.getElementsByTagName("especie").item(0).getTextContent(), elemento.getElementsByTagName("sexo").item(0).getTextContent(), 
						elemento.getElementsByTagName("edad").item(0).getTextContent(), 
						
						for(int i = 0; ele
								)
						
						));
				
			}
			
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
