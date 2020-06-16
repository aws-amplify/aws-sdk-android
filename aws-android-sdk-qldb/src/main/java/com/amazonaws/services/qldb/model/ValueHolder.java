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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * A structure that can contain a value in multiple encoding formats.
 * </p>
 */
public class ValueHolder implements Serializable {
    /**
     * <p>
     * An Amazon Ion plaintext value contained in a <code>ValueHolder</code>
     * structure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1048576<br/>
     */
    private String ionText;

    /**
     * <p>
     * An Amazon Ion plaintext value contained in a <code>ValueHolder</code>
     * structure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1048576<br/>
     *
     * @return <p>
     *         An Amazon Ion plaintext value contained in a
     *         <code>ValueHolder</code> structure.
     *         </p>
     */
    public String getIonText() {
        return ionText;
    }

    /**
     * <p>
     * An Amazon Ion plaintext value contained in a <code>ValueHolder</code>
     * structure.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1048576<br/>
     *
     * @param ionText <p>
     *            An Amazon Ion plaintext value contained in a
     *            <code>ValueHolder</code> structure.
     *            </p>
     */
    public void setIonText(String ionText) {
        this.ionText = ionText;
    }

    /**
     * <p>
     * An Amazon Ion plaintext value contained in a <code>ValueHolder</code>
     * structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1048576<br/>
     *
     * @param ionText <p>
     *            An Amazon Ion plaintext value contained in a
     *            <code>ValueHolder</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValueHolder withIonText(String ionText) {
        this.ionText = ionText;
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
        if (getIonText() != null)
            sb.append("IonText: " + getIonText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIonText() == null) ? 0 : getIonText().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValueHolder == false)
            return false;
        ValueHolder other = (ValueHolder) obj;

        if (other.getIonText() == null ^ this.getIonText() == null)
            return false;
        if (other.getIonText() != null && other.getIonText().equals(this.getIonText()) == false)
            return false;
        return true;
    }
}
