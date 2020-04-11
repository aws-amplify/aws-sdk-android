/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.transform;

import static org.junit.Assert.assertEquals;

import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.transform.StandardErrorUnmarshaller;
import org.apache.xerces.dom.DocumentImpl;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.transform.TransformerFactoryConfigurationError;

public class StandardErrorUnmarshallerTest {

    @Test
    public void testUnmarshall() throws TransformerFactoryConfigurationError, Exception {

        Document xmlDoc = new DocumentImpl();
        Element root = xmlDoc.createElement("ErrorResponse");

        Element requestId = xmlDoc.createElement("RequestId");

        requestId.appendChild(xmlDoc.createTextNode("TestId"));

        Element error = xmlDoc.createElement("Error");
        Element message = xmlDoc.createElement("Message");
        message.appendChild(xmlDoc.createTextNode("TestMessage"));
        Element type = xmlDoc.createElement("Type");
        type.appendChild(xmlDoc.createTextNode("Receiver"));

        error.appendChild(message);
        error.appendChild(type);
        root.appendChild(error);
        root.appendChild(requestId);

        xmlDoc.appendChild(root);

        StandardErrorUnmarshaller seu = new StandardErrorUnmarshaller();
        AmazonServiceException ase = seu.unmarshall(xmlDoc);
        assertEquals(ase.getErrorMessage(), "TestMessage");
        assertEquals(ase.getErrorType(), ErrorType.Service);
        assertEquals(ase.getRequestId(), "TestId");

        Element code = xmlDoc.createElement("Code");
        code.appendChild(xmlDoc.createTextNode("TestCode"));
    }

    @Test
    public void testParseErrorCode() throws Exception {
        Document xmlDoc = new DocumentImpl();
        Element root = xmlDoc.createElement("ErrorResponse");
        Element error = xmlDoc.createElement("Error");
        Element code = xmlDoc.createElement("Code");

        code.appendChild(xmlDoc.createTextNode("TestCode"));

        error.appendChild(code);
        root.appendChild(error);
        xmlDoc.appendChild(root);

        StandardErrorUnmarshaller seu = new StandardErrorUnmarshaller();
        assertEquals("TestCode", seu.parseErrorCode(xmlDoc));
    }

    @Test
    public void testGetPropertyPath() {
        StandardErrorUnmarshaller seu = new StandardErrorUnmarshaller();
        assertEquals(seu.getErrorPropertyPath("Property"), "ErrorResponse/Error/Property");
    }

}
