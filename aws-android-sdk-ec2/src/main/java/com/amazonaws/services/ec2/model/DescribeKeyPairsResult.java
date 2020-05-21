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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeKeyPairsResult implements Serializable {
    /**
     * <p>
     * Information about the key pairs.
     * </p>
     */
    private java.util.List<KeyPairInfo> keyPairs;

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     *
     * @return <p>
     *         Information about the key pairs.
     *         </p>
     */
    public java.util.List<KeyPairInfo> getKeyPairs() {
        return keyPairs;
    }

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     *
     * @param keyPairs <p>
     *            Information about the key pairs.
     *            </p>
     */
    public void setKeyPairs(java.util.Collection<KeyPairInfo> keyPairs) {
        if (keyPairs == null) {
            this.keyPairs = null;
            return;
        }

        this.keyPairs = new java.util.ArrayList<KeyPairInfo>(keyPairs);
    }

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPairs <p>
     *            Information about the key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyPairsResult withKeyPairs(KeyPairInfo... keyPairs) {
        if (getKeyPairs() == null) {
            this.keyPairs = new java.util.ArrayList<KeyPairInfo>(keyPairs.length);
        }
        for (KeyPairInfo value : keyPairs) {
            this.keyPairs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyPairs <p>
     *            Information about the key pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeKeyPairsResult withKeyPairs(java.util.Collection<KeyPairInfo> keyPairs) {
        setKeyPairs(keyPairs);
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
        if (getKeyPairs() != null)
            sb.append("KeyPairs: " + getKeyPairs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPairs() == null) ? 0 : getKeyPairs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyPairsResult == false)
            return false;
        DescribeKeyPairsResult other = (DescribeKeyPairsResult) obj;

        if (other.getKeyPairs() == null ^ this.getKeyPairs() == null)
            return false;
        if (other.getKeyPairs() != null && other.getKeyPairs().equals(this.getKeyPairs()) == false)
            return false;
        return true;
    }
}
