/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.transform;

import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * Collection of StAX unmarshallers for simple data types.
 */
public class SimpleTypeStaxUnmarshallers {
    /** Shared logger */
    private static Log log = LogFactory.getLog(SimpleTypeStaxUnmarshallers.class);

    /**
     * Unmarshaller for String values.
     */
    public static class StringStaxUnmarshaller implements
            Unmarshaller<String, StaxUnmarshallerContext> {
        @Override
        public String unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            return unmarshallerContext.readText();
        }

        private static StringStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static StringStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new StringStaxUnmarshaller();
            return instance;
        }
    }


    /**
     * Unmarshaller for Big Decimal values.
     */
    public static class BigDecimalStaxUnmarshaller implements
            Unmarshaller<BigDecimal, StaxUnmarshallerContext> {
        @Override
        public BigDecimal unmarshall(StaxUnmarshallerContext unmarshallerContext)
                throws Exception {
            String s = unmarshallerContext.readText();
            return (s == null) ? null : new BigDecimal(s);
        }

        private static BigDecimalStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static BigDecimalStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new BigDecimalStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Big Integer values.
     */
    public static class BigIntegerStaxUnmarshaller implements
            Unmarshaller<BigInteger, StaxUnmarshallerContext> {
        @Override
        public BigInteger unmarshall(StaxUnmarshallerContext unmarshallerContext)
                throws Exception {
            String s = unmarshallerContext.readText();
            return (s == null) ? null : new BigInteger(s);
        }

        private static BigIntegerStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static BigIntegerStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new BigIntegerStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Double values.
     */
    public static class DoubleStaxUnmarshaller implements
            Unmarshaller<Double, StaxUnmarshallerContext> {
        @Override
        public Double unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String doubleString = unmarshallerContext.readText();
            return (doubleString == null) ? null : Double.parseDouble(doubleString);
        }

        private static DoubleStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static DoubleStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new DoubleStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Integer values.
     */
    public static class IntegerStaxUnmarshaller implements
            Unmarshaller<Integer, StaxUnmarshallerContext> {
        @Override
        public Integer unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String intString = unmarshallerContext.readText();
            return (intString == null) ? null : Integer.parseInt(intString);
        }

        private static IntegerStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static IntegerStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new IntegerStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Boolean values.
     */
    public static class BooleanStaxUnmarshaller implements
            Unmarshaller<Boolean, StaxUnmarshallerContext> {
        @Override
        public Boolean unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String booleanString = unmarshallerContext.readText();
            return (booleanString == null) ? null : Boolean.parseBoolean(booleanString);
        }

        private static BooleanStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static BooleanStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new BooleanStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Float values.
     */
    public static class FloatStaxUnmarshaller implements
            Unmarshaller<Float, StaxUnmarshallerContext> {
        @Override
        public Float unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String floatString = unmarshallerContext.readText();
            return (floatString == null) ? null : Float.valueOf(floatString);
        }

        private static FloatStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static FloatStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new FloatStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Long values.
     */
    public static class LongStaxUnmarshaller implements Unmarshaller<Long, StaxUnmarshallerContext> {
        @Override
        public Long unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String longString = unmarshallerContext.readText();
            return (longString == null) ? null : Long.parseLong(longString);
        }

        private static LongStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static LongStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new LongStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Byte values.
     */
    public static class ByteStaxUnmarshaller implements Unmarshaller<Byte, StaxUnmarshallerContext> {
        @Override
        public Byte unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String byteString = unmarshallerContext.readText();
            return (byteString == null) ? null : Byte.valueOf(byteString);
        }

        private static ByteStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static ByteStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new ByteStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for Date values.
     */
    public static class DateStaxUnmarshaller implements Unmarshaller<Date, StaxUnmarshallerContext> {
        @Override
        public Date unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String dateString = unmarshallerContext.readText();
            if (dateString == null)
                return null;

            try {
                return DateUtils.parseISO8601Date(dateString);
            } catch (Exception e) {
                log.warn("Unable to parse date '" + dateString + "':  " + e.getMessage(), e);
                return null;
            }
        }

        private static DateStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static DateStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new DateStaxUnmarshaller();
            return instance;
        }
    }

    /**
     * Unmarshaller for ByteBuffer values.
     */
    public static class ByteBufferStaxUnmarshaller implements
            Unmarshaller<ByteBuffer, StaxUnmarshallerContext> {
        @Override
        public ByteBuffer unmarshall(StaxUnmarshallerContext unmarshallerContext) throws Exception {
            String base64EncodedString = unmarshallerContext.readText();
            byte[] decodedBytes = Base64.decode(base64EncodedString);
            return ByteBuffer.wrap(decodedBytes);

        }

        private static ByteBufferStaxUnmarshaller instance;

        /**
         * Constructor.
         * @return the instance.
         */
        public static ByteBufferStaxUnmarshaller getInstance() {
            if (instance == null)
                instance = new ByteBufferStaxUnmarshaller();
            return instance;
        }
    }

}
