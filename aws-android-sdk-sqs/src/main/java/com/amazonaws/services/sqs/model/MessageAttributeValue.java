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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * The user-specified message attribute value. For string data types, the value
 * attribute has the same restrictions on the content as the message body. For
 * more information, see <a>SendMessage</a>.
 * </p>
 * <p>
 * Name, type, and value must not be empty or null. In addition, the message
 * body should not be empty or null. All parts of the message attribute,
 * including name, type, and value, are included in the message size
 * restriction, which is currently 256 KB (262,144 bytes).
 * </p>
 */
public class MessageAttributeValue implements Serializable {
    /**
     * <p>
     * Strings are Unicode with UTF8 binary encoding. For a list of code values,
     * see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >ASCII Printable Characters</a>.
     * </p>
     */
    private String stringValue;

    /**
     * <p>
     * Binary type attributes can store any binary data, for example, compressed
     * data, encrypted data, or images.
     * </p>
     */
    private java.nio.ByteBuffer binaryValue;

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     */
    private java.util.List<String> stringListValues = new java.util.ArrayList<String>();

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     */
    private java.util.List<java.nio.ByteBuffer> binaryListValues = new java.util.ArrayList<java.nio.ByteBuffer>();

    /**
     * <p>
     * Amazon SQS supports the following logical data types: String, Number, and
     * Binary. For the Number data type, you must use StringValue.
     * </p>
     * <p>
     * You can also append custom labels. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributes.DataTypes"
     * >Message Attribute Data Types</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     */
    private String dataType;

    /**
     * <p>
     * Strings are Unicode with UTF8 binary encoding. For a list of code values,
     * see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >ASCII Printable Characters</a>.
     * </p>
     *
     * @return <p>
     *         Strings are Unicode with UTF8 binary encoding. For a list of code
     *         values, see <a href=
     *         "http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *         >ASCII Printable Characters</a>.
     *         </p>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * <p>
     * Strings are Unicode with UTF8 binary encoding. For a list of code values,
     * see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >ASCII Printable Characters</a>.
     * </p>
     *
     * @param stringValue <p>
     *            Strings are Unicode with UTF8 binary encoding. For a list of
     *            code values, see <a href=
     *            "http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *            >ASCII Printable Characters</a>.
     *            </p>
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * <p>
     * Strings are Unicode with UTF8 binary encoding. For a list of code values,
     * see <a
     * href="http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     * >ASCII Printable Characters</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringValue <p>
     *            Strings are Unicode with UTF8 binary encoding. For a list of
     *            code values, see <a href=
     *            "http://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters"
     *            >ASCII Printable Characters</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, for example, compressed
     * data, encrypted data, or images.
     * </p>
     *
     * @return <p>
     *         Binary type attributes can store any binary data, for example,
     *         compressed data, encrypted data, or images.
     *         </p>
     */
    public java.nio.ByteBuffer getBinaryValue() {
        return binaryValue;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, for example, compressed
     * data, encrypted data, or images.
     * </p>
     *
     * @param binaryValue <p>
     *            Binary type attributes can store any binary data, for example,
     *            compressed data, encrypted data, or images.
     *            </p>
     */
    public void setBinaryValue(java.nio.ByteBuffer binaryValue) {
        this.binaryValue = binaryValue;
    }

    /**
     * <p>
     * Binary type attributes can store any binary data, for example, compressed
     * data, encrypted data, or images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param binaryValue <p>
     *            Binary type attributes can store any binary data, for example,
     *            compressed data, encrypted data, or images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withBinaryValue(java.nio.ByteBuffer binaryValue) {
        this.binaryValue = binaryValue;
        return this;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Not implemented. Reserved for future use.
     *         </p>
     */
    public java.util.List<String> getStringListValues() {
        return stringListValues;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     *
     * @param stringListValues <p>
     *            Not implemented. Reserved for future use.
     *            </p>
     */
    public void setStringListValues(java.util.Collection<String> stringListValues) {
        if (stringListValues == null) {
            this.stringListValues = null;
            return;
        }

        this.stringListValues = new java.util.ArrayList<String>(stringListValues);
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringListValues <p>
     *            Not implemented. Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withStringListValues(String... stringListValues) {
        if (getStringListValues() == null) {
            this.stringListValues = new java.util.ArrayList<String>(stringListValues.length);
        }
        for (String value : stringListValues) {
            this.stringListValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stringListValues <p>
     *            Not implemented. Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withStringListValues(java.util.Collection<String> stringListValues) {
        setStringListValues(stringListValues);
        return this;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     *
     * @return <p>
     *         Not implemented. Reserved for future use.
     *         </p>
     */
    public java.util.List<java.nio.ByteBuffer> getBinaryListValues() {
        return binaryListValues;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     *
     * @param binaryListValues <p>
     *            Not implemented. Reserved for future use.
     *            </p>
     */
    public void setBinaryListValues(java.util.Collection<java.nio.ByteBuffer> binaryListValues) {
        if (binaryListValues == null) {
            this.binaryListValues = null;
            return;
        }

        this.binaryListValues = new java.util.ArrayList<java.nio.ByteBuffer>(binaryListValues);
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param binaryListValues <p>
     *            Not implemented. Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withBinaryListValues(java.nio.ByteBuffer... binaryListValues) {
        if (getBinaryListValues() == null) {
            this.binaryListValues = new java.util.ArrayList<java.nio.ByteBuffer>(
                    binaryListValues.length);
        }
        for (java.nio.ByteBuffer value : binaryListValues) {
            this.binaryListValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Not implemented. Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param binaryListValues <p>
     *            Not implemented. Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withBinaryListValues(
            java.util.Collection<java.nio.ByteBuffer> binaryListValues) {
        setBinaryListValues(binaryListValues);
        return this;
    }

    /**
     * <p>
     * Amazon SQS supports the following logical data types: String, Number, and
     * Binary. For the Number data type, you must use StringValue.
     * </p>
     * <p>
     * You can also append custom labels. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributes.DataTypes"
     * >Message Attribute Data Types</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     *
     * @return <p>
     *         Amazon SQS supports the following logical data types: String,
     *         Number, and Binary. For the Number data type, you must use
     *         StringValue.
     *         </p>
     *         <p>
     *         You can also append custom labels. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributes.DataTypes"
     *         >Message Attribute Data Types</a> in the <i>Amazon SQS Developer
     *         Guide</i>.
     *         </p>
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * <p>
     * Amazon SQS supports the following logical data types: String, Number, and
     * Binary. For the Number data type, you must use StringValue.
     * </p>
     * <p>
     * You can also append custom labels. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributes.DataTypes"
     * >Message Attribute Data Types</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     *
     * @param dataType <p>
     *            Amazon SQS supports the following logical data types: String,
     *            Number, and Binary. For the Number data type, you must use
     *            StringValue.
     *            </p>
     *            <p>
     *            You can also append custom labels. For more information, see
     *            <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributes.DataTypes"
     *            >Message Attribute Data Types</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * Amazon SQS supports the following logical data types: String, Number, and
     * Binary. For the Number data type, you must use StringValue.
     * </p>
     * <p>
     * You can also append custom labels. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributes.DataTypes"
     * >Message Attribute Data Types</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataType <p>
     *            Amazon SQS supports the following logical data types: String,
     *            Number, and Binary. For the Number data type, you must use
     *            StringValue.
     *            </p>
     *            <p>
     *            You can also append custom labels. For more information, see
     *            <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributes.DataTypes"
     *            >Message Attribute Data Types</a> in the <i>Amazon SQS
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageAttributeValue withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStringValue() != null)
            sb.append("StringValue: " + getStringValue() + ",");
        if (getBinaryValue() != null)
            sb.append("BinaryValue: " + getBinaryValue() + ",");
        if (getStringListValues() != null)
            sb.append("StringListValues: " + getStringListValues() + ",");
        if (getBinaryListValues() != null)
            sb.append("BinaryListValues: " + getBinaryListValues() + ",");
        if (getDataType() != null)
            sb.append("DataType: " + getDataType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStringValue() == null) ? 0 : getStringValue().hashCode());
        hashCode = prime * hashCode
                + ((getBinaryValue() == null) ? 0 : getBinaryValue().hashCode());
        hashCode = prime * hashCode
                + ((getStringListValues() == null) ? 0 : getStringListValues().hashCode());
        hashCode = prime * hashCode
                + ((getBinaryListValues() == null) ? 0 : getBinaryListValues().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageAttributeValue == false)
            return false;
        MessageAttributeValue other = (MessageAttributeValue) obj;

        if (other.getStringValue() == null ^ this.getStringValue() == null)
            return false;
        if (other.getStringValue() != null
                && other.getStringValue().equals(this.getStringValue()) == false)
            return false;
        if (other.getBinaryValue() == null ^ this.getBinaryValue() == null)
            return false;
        if (other.getBinaryValue() != null
                && other.getBinaryValue().equals(this.getBinaryValue()) == false)
            return false;
        if (other.getStringListValues() == null ^ this.getStringListValues() == null)
            return false;
        if (other.getStringListValues() != null
                && other.getStringListValues().equals(this.getStringListValues()) == false)
            return false;
        if (other.getBinaryListValues() == null ^ this.getBinaryListValues() == null)
            return false;
        if (other.getBinaryListValues() != null
                && other.getBinaryListValues().equals(this.getBinaryListValues()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        return true;
    }
}
