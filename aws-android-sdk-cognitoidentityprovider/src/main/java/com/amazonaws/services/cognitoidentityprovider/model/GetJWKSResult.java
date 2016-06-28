/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response from the server to get JSON Web keys.
 * </p>
 */
public class GetJWKSResult implements Serializable {
    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     */
    private java.util.List<KeyType> keys;

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     *
     * @return <p>
     *         The keys in a get JSON Web keys response.
     *         </p>
     */
    public java.util.List<KeyType> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     *
     * @param keys <p>
     *            The keys in a get JSON Web keys response.
     *            </p>
     */
    public void setKeys(java.util.Collection<KeyType> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<KeyType>(keys);
    }

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keys <p>
     *            The keys in a get JSON Web keys response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJWKSResult withKeys(KeyType... keys) {
        if (getKeys() == null) {
            this.keys = new java.util.ArrayList<KeyType>(keys.length);
        }
        for (KeyType value : keys) {
            this.keys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keys <p>
     *            The keys in a get JSON Web keys response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJWKSResult withKeys(java.util.Collection<KeyType> keys) {
        setKeys(keys);
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
        if (getKeys() != null)
            sb.append("keys: " + getKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJWKSResult == false)
            return false;
        GetJWKSResult other = (GetJWKSResult) obj;

        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        return true;
    }
}
