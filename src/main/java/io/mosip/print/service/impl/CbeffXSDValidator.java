/**
 * 
 */
package io.mosip.print.service.impl;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.ByteArrayInputStream;

/**
 * @author M1049825
 *
 */
class CbeffXSDValidator {

	public static boolean validateXML(byte[] xsdBytes, byte[] xmlBytes) throws Exception {
		SchemaFactory factory = getSchemaFactory();
		Schema schema = factory.newSchema(new StreamSource(new ByteArrayInputStream(xsdBytes)));
		Validator validator = schema.newValidator();
		validator.validate(new StreamSource(new ByteArrayInputStream(xmlBytes)));
		return true;
	}
	private static SchemaFactory getSchemaFactory(){
		return SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	}

}
