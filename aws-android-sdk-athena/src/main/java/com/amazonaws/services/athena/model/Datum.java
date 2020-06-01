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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * A piece of data (a field in the table).
 * </p>
 */
public class Datum implements Serializable {
    /**
     * <p>
     * The value of the datum.
     * </p>
     */
    private String varCharValue;

    /**
     * <p>
     * The value of the datum.
     * </p>
     *
     * @return <p>
     *         The value of the datum.
     *         </p>
     */
    public String getVarCharValue() {
        return varCharValue;
    }

    /**
     * <p>
     * The value of the datum.
     * </p>
     *
     * @param varCharValue <p>
     *            The value of the datum.
     *            </p>
     */
    public void setVarCharValue(String varCharValue) {
        this.varCharValue = varCharValue;
    }

    /**
     * <p>
     * The value of the datum.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param varCharValue <p>
     *            The value of the datum.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Datum withVarCharValue(String varCharValue) {
        this.varCharValue = varCharValue;
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
        if (getVarCharValue() != null)
            sb.append("VarCharValue: " + getVarCharValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVarCharValue() == null) ? 0 : getVarCharValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Datum == false)
            return false;
        Datum other = (Datum) obj;

        if (other.getVarCharValue() == null ^ this.getVarCharValue() == null)
            return false;
        if (other.getVarCharValue() != null
                && other.getVarCharValue().equals(this.getVarCharValue()) == false)
            return false;
        return true;
    }
}
