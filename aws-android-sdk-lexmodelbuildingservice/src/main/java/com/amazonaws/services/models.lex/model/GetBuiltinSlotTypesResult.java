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

package com.amazonaws.services.models.lex.model;

import java.io.Serializable;

public class GetBuiltinSlotTypesResult implements Serializable {
    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for
     * each slot type returned.
     * </p>
     */
    private java.util.List<BuiltinSlotTypeMetadata> slotTypes;

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token
     * that you can use in your next request to fetch the next page of slot
     * types.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for
     * each slot type returned.
     * </p>
     *
     * @return <p>
     *         An array of <code>BuiltInSlotTypeMetadata</code> objects, one
     *         entry for each slot type returned.
     *         </p>
     */
    public java.util.List<BuiltinSlotTypeMetadata> getSlotTypes() {
        return slotTypes;
    }

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for
     * each slot type returned.
     * </p>
     *
     * @param slotTypes <p>
     *            An array of <code>BuiltInSlotTypeMetadata</code> objects, one
     *            entry for each slot type returned.
     *            </p>
     */
    public void setSlotTypes(java.util.Collection<BuiltinSlotTypeMetadata> slotTypes) {
        if (slotTypes == null) {
            this.slotTypes = null;
            return;
        }

        this.slotTypes = new java.util.ArrayList<BuiltinSlotTypeMetadata>(slotTypes);
    }

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for
     * each slot type returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotTypes <p>
     *            An array of <code>BuiltInSlotTypeMetadata</code> objects, one
     *            entry for each slot type returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinSlotTypesResult withSlotTypes(BuiltinSlotTypeMetadata... slotTypes) {
        if (getSlotTypes() == null) {
            this.slotTypes = new java.util.ArrayList<BuiltinSlotTypeMetadata>(slotTypes.length);
        }
        for (BuiltinSlotTypeMetadata value : slotTypes) {
            this.slotTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuiltInSlotTypeMetadata</code> objects, one entry for
     * each slot type returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotTypes <p>
     *            An array of <code>BuiltInSlotTypeMetadata</code> objects, one
     *            entry for each slot type returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinSlotTypesResult withSlotTypes(
            java.util.Collection<BuiltinSlotTypeMetadata> slotTypes) {
        setSlotTypes(slotTypes);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token
     * that you can use in your next request to fetch the next page of slot
     * types.
     * </p>
     *
     * @return <p>
     *         If the response is truncated, the response includes a pagination
     *         token that you can use in your next request to fetch the next
     *         page of slot types.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token
     * that you can use in your next request to fetch the next page of slot
     * types.
     * </p>
     *
     * @param nextToken <p>
     *            If the response is truncated, the response includes a
     *            pagination token that you can use in your next request to
     *            fetch the next page of slot types.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the response includes a pagination token
     * that you can use in your next request to fetch the next page of slot
     * types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If the response is truncated, the response includes a
     *            pagination token that you can use in your next request to
     *            fetch the next page of slot types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBuiltinSlotTypesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSlotTypes() != null)
            sb.append("slotTypes: " + getSlotTypes() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotTypes() == null) ? 0 : getSlotTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBuiltinSlotTypesResult == false)
            return false;
        GetBuiltinSlotTypesResult other = (GetBuiltinSlotTypesResult) obj;

        if (other.getSlotTypes() == null ^ this.getSlotTypes() == null)
            return false;
        if (other.getSlotTypes() != null
                && other.getSlotTypes().equals(this.getSlotTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
