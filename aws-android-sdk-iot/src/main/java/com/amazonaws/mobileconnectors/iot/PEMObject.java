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

/**
 * A PEM object in a PEM file.
 * <p>
 * A PEM file can contain one or multiple PEM objects, each with a beginning and
 * ending marker.
 */
class PEMObject {
    /** Marker of the beginning of the PEM Object. i.e. -----BEGIN.... */
    private final String beginMarker;
    /** Bytes of PEM Object (in DER format). */
    private final byte[] derBytes;

    /**
     * Instance of a new PEM object.
     * 
     * @param beginMarker Beginning PEM marker.
     * @param derBytes PEM contents (DER).
     */
    public PEMObject(String beginMarker, byte[] derBytes) {
        this.beginMarker = beginMarker;
        this.derBytes = derBytes.clone();
    }

    /**
     * Returns the beginning PEM marker of this object.
     * 
     * @return beginning marker
     */
    public String getBeginMarker() {
        return beginMarker;
    }

    /**
     * Get the PEM object contents (in DER format).
     * 
     * @return DER bytes
     */
    public byte[] getDerBytes() {
        return derBytes.clone();
    }

    /**
     * Get the PEM type.
     * 
     * @return type
     */
    public PEMObjectType getPEMObjectType() {
        return PEMObjectType.fromBeginMarker(beginMarker);
    }
}
