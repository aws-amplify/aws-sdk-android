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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class DescribeInterconnectLoaResult implements Serializable {
    /**
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
     * </p>
     */
    private Loa loa;

    /**
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
     * </p>
     *
     * @return <p>
     *         The Letter of Authorization - Connecting Facility Assignment
     *         (LOA-CFA).
     *         </p>
     */
    public Loa getLoa() {
        return loa;
    }

    /**
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
     * </p>
     *
     * @param loa <p>
     *            The Letter of Authorization - Connecting Facility Assignment
     *            (LOA-CFA).
     *            </p>
     */
    public void setLoa(Loa loa) {
        this.loa = loa;
    }

    /**
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loa <p>
     *            The Letter of Authorization - Connecting Facility Assignment
     *            (LOA-CFA).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInterconnectLoaResult withLoa(Loa loa) {
        this.loa = loa;
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
        if (getLoa() != null)
            sb.append("loa: " + getLoa());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoa() == null) ? 0 : getLoa().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInterconnectLoaResult == false)
            return false;
        DescribeInterconnectLoaResult other = (DescribeInterconnectLoaResult) obj;

        if (other.getLoa() == null ^ this.getLoa() == null)
            return false;
        if (other.getLoa() != null && other.getLoa().equals(this.getLoa()) == false)
            return false;
        return true;
    }
}
