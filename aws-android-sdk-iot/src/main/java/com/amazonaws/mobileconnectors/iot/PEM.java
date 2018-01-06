/**
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.iot;

import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

/**
 * A PEM utility that can be used to read keys from PEM. With this PEM utility,
 * private keys in either PKCS#1 or PKCS#8 PEM encoded format can be read
 * without the need to depend on the Bouncy Castle library.
 * <p>
 * Some background information:
 * <ul>
 * <li>Unfortunately, the JDK doesn't provide a means to load PEM key encoded in
 * PKCS#1 without adding the Bouncy Castle to the classpath. The JDK can only
 * load PEM key encoded in PKCS#8 encoding.</li>
 * <li>On the other hand, one can use openssl to convert a PEM file from PKCS#1
 * to PKCS#8. Example:
 *
 * <pre>
 * openssl pkcs8 -topk8 -in pk-APKAJM22QV32R3I2XVIQ.pem -inform pem -out pk-APKAJM22QV32R3I2XVIQ_pk8.pem  -outform pem -nocrypt
 * </pre>
 *
 * </li>
 * </ul>
 */
final class PEM {

    /** Marker for beginning of PEM encoded cert/key. */
    private static final String BEGIN_MARKER = "-----BEGIN ";

    /** Utility class. */
    private PEM() {
    }

    /**
     * Returns the first private key that is found from the input stream of a
     * PEM file.
     *
     * @param is input stream of PEM data.
     * @return PrivateKey found in PEM.
     * @throws InvalidKeySpecException if failed to convert the DER bytes into a
     *             private key.
     * @throws IllegalArgumentException if no private key is found.
     * @throws IOException if PEM could not be read.
     */
    public static PrivateKey readPrivateKey(InputStream is)
            throws InvalidKeySpecException, IOException {
        List<PEMObject> objects = readPEMObjects(is);
        for (PEMObject object : objects) {
            switch (object.getPEMObjectType()) {
                case PRIVATE_KEY_PKCS1:
                    return RSA.privateKeyFromPKCS1(object.getDerBytes());
                default:
                    break;
            }
        }
        throw new IllegalArgumentException("Found no private key");
    }

    /**
     * A lower level API used to returns all PEM objects that can be read off
     * from the input stream of a PEM file. This method can be useful if more
     * than one PEM object of different types are embedded in the same PEM file.
     *
     * @param is input stream of PEM data to be read.
     * @return list of PEMObjects found in PEM data.
     * @throws IOException if PEM data could not be read.
     */
    public static List<PEMObject> readPEMObjects(InputStream is) throws IOException {
        List<PEMObject> pemContents = new ArrayList<PEMObject>();
        /*
         * State of reading: set to true if reading content between a
         * begin-marker and end-marker; false otherwise.
         */
        boolean readingContent = false;
        String beginMarker = null;
        String endMarker = null;
        StringBuffer sb = null;
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, StringUtils.UTF8));
        try {
            while ((line = reader.readLine()) != null) {
                if (readingContent) {
                    if (line.indexOf(endMarker) != -1) {
                        // completed reading one PEM object
                        pemContents.add(new PEMObject(beginMarker, Base64.decode(sb.toString())));
                        readingContent = false;
                    } else {
                        sb.append(line.trim());
                    }
                } else {
                    if (line.indexOf(BEGIN_MARKER) != -1) {
                        readingContent = true;
                        beginMarker = line.trim();
                        endMarker = beginMarker.replace("BEGIN", "END");
                        sb = new StringBuffer();
                    }
                }
            }
            return pemContents;
        } finally {
            reader.close();
        }
    }
}
