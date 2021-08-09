/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * A grouping of tables which contain LineItems, with each table identified by
 * the table's <code>LineItemGroupIndex</code>.
 * </p>
 */
public class LineItemGroup implements Serializable {
    /**
     * <p>
     * The number used to identify a specific table in a document. The first
     * table encountered will have a LineItemGroupIndex of 1, the second 2, etc.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer lineItemGroupIndex;

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     */
    private java.util.List<LineItemFields> lineItems;

    /**
     * <p>
     * The number used to identify a specific table in a document. The first
     * table encountered will have a LineItemGroupIndex of 1, the second 2, etc.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number used to identify a specific table in a document. The
     *         first table encountered will have a LineItemGroupIndex of 1, the
     *         second 2, etc.
     *         </p>
     */
    public Integer getLineItemGroupIndex() {
        return lineItemGroupIndex;
    }

    /**
     * <p>
     * The number used to identify a specific table in a document. The first
     * table encountered will have a LineItemGroupIndex of 1, the second 2, etc.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lineItemGroupIndex <p>
     *            The number used to identify a specific table in a document.
     *            The first table encountered will have a LineItemGroupIndex of
     *            1, the second 2, etc.
     *            </p>
     */
    public void setLineItemGroupIndex(Integer lineItemGroupIndex) {
        this.lineItemGroupIndex = lineItemGroupIndex;
    }

    /**
     * <p>
     * The number used to identify a specific table in a document. The first
     * table encountered will have a LineItemGroupIndex of 1, the second 2, etc.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param lineItemGroupIndex <p>
     *            The number used to identify a specific table in a document.
     *            The first table encountered will have a LineItemGroupIndex of
     *            1, the second 2, etc.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LineItemGroup withLineItemGroupIndex(Integer lineItemGroupIndex) {
        this.lineItemGroupIndex = lineItemGroupIndex;
        return this;
    }

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     *
     * @return <p>
     *         The breakdown of information on a particular line of a table.
     *         </p>
     */
    public java.util.List<LineItemFields> getLineItems() {
        return lineItems;
    }

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     *
     * @param lineItems <p>
     *            The breakdown of information on a particular line of a table.
     *            </p>
     */
    public void setLineItems(java.util.Collection<LineItemFields> lineItems) {
        if (lineItems == null) {
            this.lineItems = null;
            return;
        }

        this.lineItems = new java.util.ArrayList<LineItemFields>(lineItems);
    }

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineItems <p>
     *            The breakdown of information on a particular line of a table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LineItemGroup withLineItems(LineItemFields... lineItems) {
        if (getLineItems() == null) {
            this.lineItems = new java.util.ArrayList<LineItemFields>(lineItems.length);
        }
        for (LineItemFields value : lineItems) {
            this.lineItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The breakdown of information on a particular line of a table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lineItems <p>
     *            The breakdown of information on a particular line of a table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LineItemGroup withLineItems(java.util.Collection<LineItemFields> lineItems) {
        setLineItems(lineItems);
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
        if (getLineItemGroupIndex() != null)
            sb.append("LineItemGroupIndex: " + getLineItemGroupIndex() + ",");
        if (getLineItems() != null)
            sb.append("LineItems: " + getLineItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLineItemGroupIndex() == null) ? 0 : getLineItemGroupIndex().hashCode());
        hashCode = prime * hashCode + ((getLineItems() == null) ? 0 : getLineItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineItemGroup == false)
            return false;
        LineItemGroup other = (LineItemGroup) obj;

        if (other.getLineItemGroupIndex() == null ^ this.getLineItemGroupIndex() == null)
            return false;
        if (other.getLineItemGroupIndex() != null
                && other.getLineItemGroupIndex().equals(this.getLineItemGroupIndex()) == false)
            return false;
        if (other.getLineItems() == null ^ this.getLineItems() == null)
            return false;
        if (other.getLineItems() != null
                && other.getLineItems().equals(this.getLineItems()) == false)
            return false;
        return true;
    }
}
