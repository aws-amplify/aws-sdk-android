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

package com.amazonaws.mobileconnectors.iot;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/**
 * A bare-minimum ASN.1 DER decoder, just having enough functions to decode
 * PKCS#1 private keys. Especially, it doesn't handle explicitly tagged types
 * with an outer tag. This parser can only handle one layer. To parse nested
 * constructs, get a new parser for each layer using
 * <code>Asn1Object.getParser()</code>. There are many DER decoders in JRE but
 * using them will tie this program to a specific JCE/JVM.
 */
class DerParser {
    // Classes
    /** UNIVERSAL class. */
    public static final int UNIVERSAL = 0x00;
    /** APPLICATION class. */
    public static final int APPLICATION = 0x40;
    /** CONTEXT class. */
    public static final int CONTEXT = 0x80;
    /** PRIVATE class. */
    public static final int PRIVATE = 0xC0;

    /** Constructed Flag. */
    public static final int CONSTRUCTED = 0x20;

    // Tag and data types
    /** ANY tag/type. */
    public static final int ANY = 0x00;
    /** BOOLEAN tag/type. */
    public static final int BOOLEAN = 0x01;
    /** INTEGER tag/type. */
    public static final int INTEGER = 0x02;
    /** BIT_STRING tag/type. */
    public static final int BIT_STRING = 0x03;
    /** OCTET_STRING tag/type. */
    public static final int OCTET_STRING = 0x04;
    /** NULL tag/type. */
    public static final int NULL = 0x05;
    /** OBJECT_IDENTIFIER tag/type. */
    public static final int OBJECT_IDENTIFIER = 0x06;
    /** REAL tag/type. */
    public static final int REAL = 0x09;
    /** ENUMERATED tag/type. */
    public static final int ENUMERATED = 0x0a;
    /** RELATIVE_OID tag/type. */
    public static final int RELATIVE_OID = 0x0d;
    /** v tag/type. */
    public static final int SEQUENCE = 0x10;
    /** SET tag/type. */
    public static final int SET = 0x11;
    /** NUMERIC_STRING tag/type. */
    public static final int NUMERIC_STRING = 0x12;
    /** PRINTABLE_STRING tag/type. */
    public static final int PRINTABLE_STRING = 0x13;
    /** T61_STRING tag/type. */
    public static final int T61_STRING = 0x14;
    /** VIDEOTEX_STRING tag/type. */
    public static final int VIDEOTEX_STRING = 0x15;
    /** IA5_STRING tag/type. */
    public static final int IA5_STRING = 0x16;
    /** GRAPHIC_STRING tag/type. */
    public static final int GRAPHIC_STRING = 0x19;
    /** ISO646_STRING tag/type. */
    public static final int ISO646_STRING = 0x1A;
    /** GENERAL_STRING tag/type. */
    public static final int GENERAL_STRING = 0x1B;
    /** UTF8_STRING tag/type. */
    public static final int UTF8_STRING = 0x0C;
    /** UNIVERSAL_STRING tag/type. */
    public static final int UNIVERSAL_STRING = 0x1C;
    /** BMP_STRING tag/type. */
    public static final int BMP_STRING = 0x1E;
    /** UTC_TIME tag/type. */
    public static final int UTC_TIME = 0x17;
    /** GENERALIZED_TIME tag/type. */
    public static final int GENERALIZED_TIME = 0x18;

    /** Lower 7 bits mask. */
    public static final byte LOWER_7_BITS = (byte) 0x7F;
    /** Byte max value. */
    public static final int BYTE_MAX = (int) 0xFF;
    /** We can't handle length longer than 4 bytes. */
    public static final int MAX_NUMBER_OF_BYTES = 4;

    /** The DER encoded input stream. */
    private final InputStream in;

    /**
     * Create a new DER decoder from an input stream.
     * 
     * @param in DER encoded stream
     */
    public DerParser(InputStream in) {
        this.in = in;
    }

    /**
     * Create a new DER decoder from a byte array.
     * 
     * @param bytes encoded bytes
     */
    public DerParser(byte[] bytes) {
        this(new ByteArrayInputStream(bytes));
    }

    /**
     * Read next object. If it's constructed, the value holds encoded content
     * and it should be parsed by a new parser from
     * <code>Asn1Object.getParser</code>.
     *
     * @return Asn1Object read
     * @throws IOException if DER parsing error (format).
     */
    public Asn1Object read() throws IOException {
        int tag = in.read();

        if (tag == -1) {
            throw new IOException("Invalid DER: stream too short, missing tag"); //$NON-NLS-1$
        }

        int length = getLength();

        byte[] value = new byte[length];
        int n = in.read(value);
        if (n < length) {
            throw new IOException("Invalid DER: stream too short, missing value"); //$NON-NLS-1$
        }

        Asn1Object o = new Asn1Object(tag, length, value);

        return o;
    }

    /**
     * Decode the length of the field. Can only support length encoding up to 4
     * octets.
     * <p/>
     * In BER/DER encoding, length can be encoded in 2 forms,
     * <ul>
     * <li>Short form. One octet. Bit 8 has value "0" and bits 7-1 give the
     * length.
     * <li>Long form. Two to 127 octets (only 4 is supported here). Bit 8 of
     * first octet has value "1" and bits 7-1 give the number of additional
     * length octets. Second and following octets give the length, base 256,
     * most significant digit first.
     * </ul>
     * 
     * @return The length as integer
     * @throws IOException if invalid DER.
     */
    private int getLength() throws IOException {

        int i = in.read();
        if (i == -1) {
            throw new IOException("Invalid DER: length missing"); //$NON-NLS-1$
        }

        // A single byte short length
        if ((i & ~LOWER_7_BITS) == 0) {
            return i;
        }

        int num = i & LOWER_7_BITS;

        if (i >= BYTE_MAX || num > MAX_NUMBER_OF_BYTES) {
            throw new IOException("Invalid DER: length field too big (" + i + ")"); //$NON-NLS-1$
        }

        byte[] bytes = new byte[num];
        int n = in.read(bytes);
        if (n < num) {
            throw new IOException("Invalid DER: length too short"); //$NON-NLS-1$
        }

        return new BigInteger(1, bytes).intValue();
    }
}
