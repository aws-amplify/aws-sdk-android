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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.transform.LegacyErrorUnmarshaller;
import org.apache.xerces.dom.DocumentImpl;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.transform.TransformerFactoryConfigurationError;

public class LegacyErrorUnmarshallerTest {

    @Test
    public void testUnmarshall() throws TransformerFactoryConfigurationError, Exception {

        Document xmlDoc = new DocumentImpl();
        Element root = xmlDoc.createElement("Response");

        Element requestId = xmlDoc.createElement("RequestID");

        requestId.appendChild(xmlDoc.createTextNode("TestId"));

        Element errors = xmlDoc.createElement("Errors");
        Element error = xmlDoc.createElement("Error");
        Element message = xmlDoc.createElement("Message");
        message.appendChild(xmlDoc.createTextNode("TestMessage"));
        Element type = xmlDoc.createElement("Type");
        type.appendChild(xmlDoc.createTextNode("server"));
        Element code = xmlDoc.createElement("Code");
        code.appendChild(xmlDoc.createTextNode("TestCode"));

        error.appendChild(message);
        error.appendChild(type);
        error.appendChild(code);
        errors.appendChild(error);
        root.appendChild(errors);
        root.appendChild(requestId);

        xmlDoc.appendChild(root);

        LegacyErrorUnmarshaller leu = new LegacyErrorUnmarshaller();
        AmazonServiceException ase = leu.unmarshall(xmlDoc);
        assertEquals(ase.getErrorCode(), "TestCode");
        assertEquals(ase.getErrorMessage(), "TestMessage");
        assertEquals(ase.getErrorType(), ErrorType.Service);
        assertEquals(ase.getRequestId(), "TestId");
    }

    @Test
    public void testGetErrorPropertyPath() {
        LegacyErrorUnmarshaller leu = new LegacyErrorUnmarshaller();
        assertEquals(leu.getErrorPropertyPath("Property"), "Response/Errors/Error/Property");
    }
}
