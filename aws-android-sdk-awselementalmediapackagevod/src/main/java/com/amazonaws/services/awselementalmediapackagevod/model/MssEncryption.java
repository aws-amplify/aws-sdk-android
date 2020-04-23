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

package com.amazonaws.services.awselementalmediapackagevod.model;

import java.io.Serializable;

/**
 * A Microsoft Smooth Streaming (MSS) encryption configuration.
 */
public class MssEncryption implements Serializable {
    /**
     * A configuration for accessing an external Secure Packager and Encoder Key
     * Exchange (SPEKE) service that will provide encryption keys.
     */
    private SpekeKeyProvider spekeKeyProvider;

    /**
     * A configuration for accessing an external Secure Packager and Encoder Key
     * Exchange (SPEKE) service that will provide encryption keys.
     *
     * @return A configuration for accessing an external Secure Packager and
     *         Encoder Key Exchange (SPEKE) service that will provide encryption
     *         keys.
     */
    public SpekeKeyProvider getSpekeKeyProvider() {
        return spekeKeyProvider;
    }

    /**
     * A configuration for accessing an external Secure Packager and Encoder Key
     * Exchange (SPEKE) service that will provide encryption keys.
     *
     * @param spekeKeyProvider A configuration for accessing an external Secure
     *            Packager and Encoder Key Exchange (SPEKE) service that will
     *            provide encryption keys.
     */
    public void setSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * A configuration for accessing an external Secure Packager and Encoder Key
     * Exchange (SPEKE) service that will provide encryption keys.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spekeKeyProvider A configuration for accessing an external Secure
     *            Packager and Encoder Key Exchange (SPEKE) service that will
     *            provide encryption keys.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MssEncryption withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
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
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: " + getSpekeKeyProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MssEncryption == false)
            return false;
        MssEncryption other = (MssEncryption) obj;

        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null
                && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
            return false;
        return true;
    }
}
