/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetKeyPairResult implements Serializable {
    /**
     * <p>
     * An array of key-value pairs containing information about the key pair.
     * </p>
     */
    private KeyPair keyPair;

    /**
     * <p>
     * An array of key-value pairs containing information about the key pair.
     * </p>
     *
     * @return <p>
     *         An array of key-value pairs containing information about the key
     *         pair.
     *         </p>
     */
    public KeyPair getKeyPair() {
        return keyPair;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the key pair.
     * </p>
     *
     * @param keyPair <p>
     *            An array of key-value pairs containing information about the
     *            key pair.
     *            </p>
     */
    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the key pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPair <p>
     *            An array of key-value pairs containing information about the
     *            key pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetKeyPairResult withKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
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
        if (getKeyPair() != null)
            sb.append("keyPair: " + getKeyPair());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyPairResult == false)
            return false;
        GetKeyPairResult other = (GetKeyPairResult) obj;

        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        return true;
    }
}
