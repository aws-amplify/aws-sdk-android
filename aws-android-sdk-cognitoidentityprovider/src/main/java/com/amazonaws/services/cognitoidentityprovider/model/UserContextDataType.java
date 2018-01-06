/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Base64 encoded string for user context data collected for risk evaluation
 * </p>
 */
public class UserContextDataType implements Serializable {
    /**
     * The new value for the encodedData property for this object.
     */
    private String encodedData;

    /**
     * Returns the value of the encodedData property for this object.
     *
     * @return The value of the encodedData property for this object.
     */
    public String getEncodedData() {
        return encodedData;
    }

    /**
     * Sets the value of encodedData
     *
     * @param encodedData The new value for the encodedData property for this
     *            object.
     */
    public void setEncodedData(String encodedData) {
        this.encodedData = encodedData;
    }

    /**
     * Sets the value of the encodedData property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encodedData The new value for the encodedData property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserContextDataType withEncodedData(String encodedData) {
        this.encodedData = encodedData;
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
        if (getEncodedData() != null)
            sb.append("EncodedData: " + getEncodedData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEncodedData() == null) ? 0 : getEncodedData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserContextDataType == false)
            return false;
        UserContextDataType other = (UserContextDataType) obj;

        if (other.getEncodedData() == null ^ this.getEncodedData() == null)
            return false;
        if (other.getEncodedData() != null
                && other.getEncodedData().equals(this.getEncodedData()) == false)
            return false;
        return true;
    }
}
