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

public class GetSlotTypeVersionsResult implements Serializable {
    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered
     * version of the slot type plus one for the <code>$LATEST</code> version.
     * </p>
     */
    private java.util.List<SlotTypeMetadata> slotTypes;

    /**
     * <p>
     * A pagination token for fetching the next page of slot type versions. If
     * the response to this call is truncated, Amazon Lex returns a pagination
     * token in the response. To fetch the next page of versions, specify the
     * pagination token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered
     * version of the slot type plus one for the <code>$LATEST</code> version.
     * </p>
     *
     * @return <p>
     *         An array of <code>SlotTypeMetadata</code> objects, one for each
     *         numbered version of the slot type plus one for the
     *         <code>$LATEST</code> version.
     *         </p>
     */
    public java.util.List<SlotTypeMetadata> getSlotTypes() {
        return slotTypes;
    }

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered
     * version of the slot type plus one for the <code>$LATEST</code> version.
     * </p>
     *
     * @param slotTypes <p>
     *            An array of <code>SlotTypeMetadata</code> objects, one for
     *            each numbered version of the slot type plus one for the
     *            <code>$LATEST</code> version.
     *            </p>
     */
    public void setSlotTypes(java.util.Collection<SlotTypeMetadata> slotTypes) {
        if (slotTypes == null) {
            this.slotTypes = null;
            return;
        }

        this.slotTypes = new java.util.ArrayList<SlotTypeMetadata>(slotTypes);
    }

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered
     * version of the slot type plus one for the <code>$LATEST</code> version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotTypes <p>
     *            An array of <code>SlotTypeMetadata</code> objects, one for
     *            each numbered version of the slot type plus one for the
     *            <code>$LATEST</code> version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSlotTypeVersionsResult withSlotTypes(SlotTypeMetadata... slotTypes) {
        if (getSlotTypes() == null) {
            this.slotTypes = new java.util.ArrayList<SlotTypeMetadata>(slotTypes.length);
        }
        for (SlotTypeMetadata value : slotTypes) {
            this.slotTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>SlotTypeMetadata</code> objects, one for each numbered
     * version of the slot type plus one for the <code>$LATEST</code> version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param slotTypes <p>
     *            An array of <code>SlotTypeMetadata</code> objects, one for
     *            each numbered version of the slot type plus one for the
     *            <code>$LATEST</code> version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSlotTypeVersionsResult withSlotTypes(java.util.Collection<SlotTypeMetadata> slotTypes) {
        setSlotTypes(slotTypes);
        return this;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of slot type versions. If
     * the response to this call is truncated, Amazon Lex returns a pagination
     * token in the response. To fetch the next page of versions, specify the
     * pagination token in the next request.
     * </p>
     *
     * @return <p>
     *         A pagination token for fetching the next page of slot type
     *         versions. If the response to this call is truncated, Amazon Lex
     *         returns a pagination token in the response. To fetch the next
     *         page of versions, specify the pagination token in the next
     *         request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of slot type versions. If
     * the response to this call is truncated, Amazon Lex returns a pagination
     * token in the response. To fetch the next page of versions, specify the
     * pagination token in the next request.
     * </p>
     *
     * @param nextToken <p>
     *            A pagination token for fetching the next page of slot type
     *            versions. If the response to this call is truncated, Amazon
     *            Lex returns a pagination token in the response. To fetch the
     *            next page of versions, specify the pagination token in the
     *            next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of slot type versions. If
     * the response to this call is truncated, Amazon Lex returns a pagination
     * token in the response. To fetch the next page of versions, specify the
     * pagination token in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A pagination token for fetching the next page of slot type
     *            versions. If the response to this call is truncated, Amazon
     *            Lex returns a pagination token in the response. To fetch the
     *            next page of versions, specify the pagination token in the
     *            next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSlotTypeVersionsResult withNextToken(String nextToken) {
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

        if (obj instanceof GetSlotTypeVersionsResult == false)
            return false;
        GetSlotTypeVersionsResult other = (GetSlotTypeVersionsResult) obj;

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
