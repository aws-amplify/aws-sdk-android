/****************************************************************************
 * Amazon Modifications: Copyright 2016 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *****************************************************************************
 * Copyright (c) 1998-2010 AOL Inc. 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ****************************************************************************/
// http://oauth.googlecode.com/svn/code/branches/jmeter/jmeter/src/main/java/org/apache/jmeter/protocol/oauth/sampler/PrivateKeyReader.java

// http://www.itu.int/ITU-T/studygroups/com17/languages/X.690-0207.pdf
// http://en.wikipedia.org/wiki/Distinguished_Encoding_Rules#DER_encoding

package com.amazonaws.mobileconnectors.iot;

import java.io.IOException;
import java.math.BigInteger;

/**
 * An ASN.1 TLV. The object is not parsed. It can only handle integers and
 * strings.
 */
class Asn1Object {
    /**
     * Type: This is actually called tag in ASN.1. It indicates data type
     * (Integer, String) or a construct (sequence, choice, set).
     */
    private final int type;
    /** Length of the field. */
    private final int length;
    /** Encoded octet string for the field. */
    private final byte[] value;
    /** Tag or identifier. */
    private final int tag;

    /** Bitwise mask used for type. */
    private static final byte LOWER_5_BITS = (byte) 0x1F;

    /**
     * Construct a ASN.1 TLV. The TLV could be either a constructed or primitive
     * entity.
     * <p/>
     * The first byte in DER encoding is made of following fields,
     * 
     * <pre>
     * -------------------------------------------------
     * |Bit 8|Bit 7|Bit 6|Bit 5|Bit 4|Bit 3|Bit 2|Bit 1|
     * -------------------------------------------------
     * |  Class    | CF  |     +      Type             |
     * -------------------------------------------------
     * </pre>
     * 
     * <ul>
     * <li>Class: Universal, Application, Context or Private
     * <li>CF: Constructed flag. If 1, the field is constructed.
     * <li>Type: This is actually called tag in ASN.1. It indicates data type
     * (Integer, String) or a construct (sequence, choice, set).
     * </ul>
     * 
     * @param tag Tag or Identifier
     * @param length Length of the field
     * @param value Encoded octet string for the field.
     */
    public Asn1Object(int tag, int length, byte[] value) {
        this.tag = tag;
        this.type = tag & LOWER_5_BITS;
        this.length = length;
        this.value = value;
    }

    /**
     * getType returns the Asn1Object type.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }

    /**
     * getLength returns the field length.
     * 
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * getValue returns the value (encoded octet string).
     * 
     * @return value
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * isConstructed returns true = object has been constructed, false
     * otherwise.
     * 
     * @return value
     */
    public boolean isConstructed() {
        return (tag & DerParser.CONSTRUCTED) == DerParser.CONSTRUCTED;
    }

    /**
     * For constructed field, return a parser for its content.
     * 
     * @return A parser for the construct.
     * @throws IOException if DER cannot be parsed.
     */
    public DerParser getParser() throws IOException {
        if (!isConstructed()) {
            throw new IOException("Invalid DER: can't parse primitive entity"); //$NON-NLS-1$
        }

        return new DerParser(value);
    }

    /**
     * Get the value as integer.
     *
     * @return value
     * @throws IOException if DER is not an integer.
     */
    public BigInteger getInteger() throws IOException {
        if (type != DerParser.INTEGER) {
            throw new IOException("Invalid DER: object is not integer"); //$NON-NLS-1$
        }

        return new BigInteger(value);
    }

    /**
     * Get value as string. Most strings are treated as Latin-1.
     *
     * @return value
     * @throws IOException if string encoding is not supported.
     */
    public String getString() throws IOException {

        String encoding;

        switch (type) {

        // Not all are Latin-1 but it's the closest thing
            case DerParser.NUMERIC_STRING:
            case DerParser.PRINTABLE_STRING:
            case DerParser.VIDEOTEX_STRING:
            case DerParser.IA5_STRING:
            case DerParser.GRAPHIC_STRING:
            case DerParser.ISO646_STRING:
            case DerParser.GENERAL_STRING:
                encoding = "ISO-8859-1"; //$NON-NLS-1$
                break;

            case DerParser.BMP_STRING:
                encoding = "UTF-16BE"; //$NON-NLS-1$
                break;

            case DerParser.UTF8_STRING:
                encoding = "UTF-8"; //$NON-NLS-1$
                break;

            case DerParser.UNIVERSAL_STRING:
                throw new IOException("Invalid DER: can't handle UCS-4 string"); //$NON-NLS-1$

            default:
                throw new IOException("Invalid DER: object is not a string"); //$NON-NLS-1$
        }

        return new String(value, encoding);
    }
}
