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
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.JsonErrorResponseHandler.JsonErrorResponse;
import com.amazonaws.transform.JsonErrorUnmarshaller;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class JsonExceptionUnmarshallerTest {

    String errorResponse = "{\"__type\":\"com.amazonaws.javaSDK#InternalServerError\",\"message\":\"Requested resource not found\",\"field1\":\"value1\",\"Field2\":\"value2\"}";

    @Test
    public void testJsonExceptionUnmarshallerWithAdditionalFields() throws Exception {
        HttpResponse response = HttpResponse.builder()
                .content(new ByteArrayInputStream(errorResponse.getBytes("UTF-8")))
                .build();

        JsonErrorResponse error = JsonErrorResponse.fromResponse(response);
        AmazonServiceException ase = new InternalServerErrorExceptionUnmarshaller()
                .unmarshall(error);

        assertTrue(ase instanceof InternalServerErrorException);
        assertEquals("value1", ((InternalServerErrorException) ase).getField1());
        assertEquals("value2", ((InternalServerErrorException) ase).getField2());
        assertEquals("InternalServerError", ase.getErrorCode());

        assertEquals("Requested resource not found "
                + "(Service: null; "
                + "Status Code: 0; "
                + "Error Code: InternalServerError; "
                + "Request ID: null)",
                ase.getMessage());

    }

    public static class InternalServerErrorExceptionUnmarshaller extends JsonErrorUnmarshaller {

        public InternalServerErrorExceptionUnmarshaller() {
            super(InternalServerErrorException.class);
        }

        @Override
        public AmazonServiceException unmarshall(JsonErrorResponse error) throws Exception {
            // Bail out if this isn't the right error code that this
            // marshaller understands.
            String errorCode = error.getErrorCode();
            if (errorCode == null || !errorCode.equals("InternalServerError"))
                return null;

            InternalServerErrorException e = (InternalServerErrorException) super.unmarshall(error);

            e.setField1(error.get("field1"));

            e.setField2(error.get("field2"));

            return e;
        }
    }

    public static class InternalServerErrorException extends AmazonServiceException {
        private static final long serialVersionUID = 1L;

        private String field1;

        private String field2;

        /**
         * Constructs a new InternalServerErrorException with the specified
         * error message.
         *
         * @param message Describes the error encountered.
         */
        public InternalServerErrorException(String message) {
            super(message);
        }

        /**
         * Returns the value of the Field1 property for this object.
         *
         * @return The value of the Field1 property for this object.
         */
        public String getField1() {
            return field1;
        }

        /**
         * Sets the value of the Field1 property for this object.
         *
         * @param field1 The new value for this object's Field1 property.
         */
        public void setField1(String field1) {
            this.field1 = field1;
        }

        /**
         * Returns the value of the Field2 property for this object.
         *
         * @return The value of the Field2 property for this object.
         */
        public String getField2() {
            return field2;
        }

        /**
         * Sets the value of the Field2 property for this object.
         *
         * @param field2 The new value for this object's Field2 property.
         */
        public void setField2(String field2) {
            this.field2 = field2;
        }
    }

}
