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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

public class TransactGetItemsResult implements Serializable {
    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this
     * is an array of <code>ConsumedCapacity</code> objects, one for each table
     * addressed by <code>TransactGetItem</code> objects in the
     * <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code>
     * objects report the read-capacity units consumed by the
     * <code>TransactGetItems</code> call in that table.
     * </p>
     */
    private java.util.List<ConsumedCapacity> consumedCapacity;

    /**
     * <p>
     * An ordered array of up to 25 <code>ItemResponse</code> objects, each of
     * which corresponds to the <code>TransactGetItem</code> object in the same
     * position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs
     * that are the projected attributes of the requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding
     * <code>ItemResponse</code> object is Null, or if the requested item has no
     * projected attributes, the corresponding <code>ItemResponse</code> object
     * is an empty Map.
     * </p>
     */
    private java.util.List<ItemResponse> responses;

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this
     * is an array of <code>ConsumedCapacity</code> objects, one for each table
     * addressed by <code>TransactGetItem</code> objects in the
     * <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code>
     * objects report the read-capacity units consumed by the
     * <code>TransactGetItems</code> call in that table.
     * </p>
     *
     * @return <p>
     *         If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>
     *         , this is an array of <code>ConsumedCapacity</code> objects, one
     *         for each table addressed by <code>TransactGetItem</code> objects
     *         in the <i>TransactItems</i> parameter. These
     *         <code>ConsumedCapacity</code> objects report the read-capacity
     *         units consumed by the <code>TransactGetItems</code> call in that
     *         table.
     *         </p>
     */
    public java.util.List<ConsumedCapacity> getConsumedCapacity() {
        return consumedCapacity;
    }

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this
     * is an array of <code>ConsumedCapacity</code> objects, one for each table
     * addressed by <code>TransactGetItem</code> objects in the
     * <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code>
     * objects report the read-capacity units consumed by the
     * <code>TransactGetItems</code> call in that table.
     * </p>
     *
     * @param consumedCapacity <p>
     *            If the <i>ReturnConsumedCapacity</i> value was
     *            <code>TOTAL</code>, this is an array of
     *            <code>ConsumedCapacity</code> objects, one for each table
     *            addressed by <code>TransactGetItem</code> objects in the
     *            <i>TransactItems</i> parameter. These
     *            <code>ConsumedCapacity</code> objects report the read-capacity
     *            units consumed by the <code>TransactGetItems</code> call in
     *            that table.
     *            </p>
     */
    public void setConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
            return;
        }

        this.consumedCapacity = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity);
    }

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this
     * is an array of <code>ConsumedCapacity</code> objects, one for each table
     * addressed by <code>TransactGetItem</code> objects in the
     * <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code>
     * objects report the read-capacity units consumed by the
     * <code>TransactGetItems</code> call in that table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consumedCapacity <p>
     *            If the <i>ReturnConsumedCapacity</i> value was
     *            <code>TOTAL</code>, this is an array of
     *            <code>ConsumedCapacity</code> objects, one for each table
     *            addressed by <code>TransactGetItem</code> objects in the
     *            <i>TransactItems</i> parameter. These
     *            <code>ConsumedCapacity</code> objects report the read-capacity
     *            units consumed by the <code>TransactGetItems</code> call in
     *            that table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactGetItemsResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
        if (getConsumedCapacity() == null) {
            this.consumedCapacity = new java.util.ArrayList<ConsumedCapacity>(
                    consumedCapacity.length);
        }
        for (ConsumedCapacity value : consumedCapacity) {
            this.consumedCapacity.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If the <i>ReturnConsumedCapacity</i> value was <code>TOTAL</code>, this
     * is an array of <code>ConsumedCapacity</code> objects, one for each table
     * addressed by <code>TransactGetItem</code> objects in the
     * <i>TransactItems</i> parameter. These <code>ConsumedCapacity</code>
     * objects report the read-capacity units consumed by the
     * <code>TransactGetItems</code> call in that table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consumedCapacity <p>
     *            If the <i>ReturnConsumedCapacity</i> value was
     *            <code>TOTAL</code>, this is an array of
     *            <code>ConsumedCapacity</code> objects, one for each table
     *            addressed by <code>TransactGetItem</code> objects in the
     *            <i>TransactItems</i> parameter. These
     *            <code>ConsumedCapacity</code> objects report the read-capacity
     *            units consumed by the <code>TransactGetItems</code> call in
     *            that table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactGetItemsResult withConsumedCapacity(
            java.util.Collection<ConsumedCapacity> consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
        return this;
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>ItemResponse</code> objects, each of
     * which corresponds to the <code>TransactGetItem</code> object in the same
     * position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs
     * that are the projected attributes of the requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding
     * <code>ItemResponse</code> object is Null, or if the requested item has no
     * projected attributes, the corresponding <code>ItemResponse</code> object
     * is an empty Map.
     * </p>
     *
     * @return <p>
     *         An ordered array of up to 25 <code>ItemResponse</code> objects,
     *         each of which corresponds to the <code>TransactGetItem</code>
     *         object in the same position in the <i>TransactItems</i> array.
     *         Each <code>ItemResponse</code> object contains a Map of the
     *         name-value pairs that are the projected attributes of the
     *         requested item.
     *         </p>
     *         <p>
     *         If a requested item could not be retrieved, the corresponding
     *         <code>ItemResponse</code> object is Null, or if the requested
     *         item has no projected attributes, the corresponding
     *         <code>ItemResponse</code> object is an empty Map.
     *         </p>
     */
    public java.util.List<ItemResponse> getResponses() {
        return responses;
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>ItemResponse</code> objects, each of
     * which corresponds to the <code>TransactGetItem</code> object in the same
     * position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs
     * that are the projected attributes of the requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding
     * <code>ItemResponse</code> object is Null, or if the requested item has no
     * projected attributes, the corresponding <code>ItemResponse</code> object
     * is an empty Map.
     * </p>
     *
     * @param responses <p>
     *            An ordered array of up to 25 <code>ItemResponse</code>
     *            objects, each of which corresponds to the
     *            <code>TransactGetItem</code> object in the same position in
     *            the <i>TransactItems</i> array. Each <code>ItemResponse</code>
     *            object contains a Map of the name-value pairs that are the
     *            projected attributes of the requested item.
     *            </p>
     *            <p>
     *            If a requested item could not be retrieved, the corresponding
     *            <code>ItemResponse</code> object is Null, or if the requested
     *            item has no projected attributes, the corresponding
     *            <code>ItemResponse</code> object is an empty Map.
     *            </p>
     */
    public void setResponses(java.util.Collection<ItemResponse> responses) {
        if (responses == null) {
            this.responses = null;
            return;
        }

        this.responses = new java.util.ArrayList<ItemResponse>(responses);
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>ItemResponse</code> objects, each of
     * which corresponds to the <code>TransactGetItem</code> object in the same
     * position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs
     * that are the projected attributes of the requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding
     * <code>ItemResponse</code> object is Null, or if the requested item has no
     * projected attributes, the corresponding <code>ItemResponse</code> object
     * is an empty Map.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responses <p>
     *            An ordered array of up to 25 <code>ItemResponse</code>
     *            objects, each of which corresponds to the
     *            <code>TransactGetItem</code> object in the same position in
     *            the <i>TransactItems</i> array. Each <code>ItemResponse</code>
     *            object contains a Map of the name-value pairs that are the
     *            projected attributes of the requested item.
     *            </p>
     *            <p>
     *            If a requested item could not be retrieved, the corresponding
     *            <code>ItemResponse</code> object is Null, or if the requested
     *            item has no projected attributes, the corresponding
     *            <code>ItemResponse</code> object is an empty Map.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactGetItemsResult withResponses(ItemResponse... responses) {
        if (getResponses() == null) {
            this.responses = new java.util.ArrayList<ItemResponse>(responses.length);
        }
        for (ItemResponse value : responses) {
            this.responses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>ItemResponse</code> objects, each of
     * which corresponds to the <code>TransactGetItem</code> object in the same
     * position in the <i>TransactItems</i> array. Each
     * <code>ItemResponse</code> object contains a Map of the name-value pairs
     * that are the projected attributes of the requested item.
     * </p>
     * <p>
     * If a requested item could not be retrieved, the corresponding
     * <code>ItemResponse</code> object is Null, or if the requested item has no
     * projected attributes, the corresponding <code>ItemResponse</code> object
     * is an empty Map.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param responses <p>
     *            An ordered array of up to 25 <code>ItemResponse</code>
     *            objects, each of which corresponds to the
     *            <code>TransactGetItem</code> object in the same position in
     *            the <i>TransactItems</i> array. Each <code>ItemResponse</code>
     *            object contains a Map of the name-value pairs that are the
     *            projected attributes of the requested item.
     *            </p>
     *            <p>
     *            If a requested item could not be retrieved, the corresponding
     *            <code>ItemResponse</code> object is Null, or if the requested
     *            item has no projected attributes, the corresponding
     *            <code>ItemResponse</code> object is an empty Map.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactGetItemsResult withResponses(java.util.Collection<ItemResponse> responses) {
        setResponses(responses);
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
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: " + getConsumedCapacity() + ",");
        if (getResponses() != null)
            sb.append("Responses: " + getResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactGetItemsResult == false)
            return false;
        TransactGetItemsResult other = (TransactGetItemsResult) obj;

        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null
                && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        if (other.getResponses() == null ^ this.getResponses() == null)
            return false;
        if (other.getResponses() != null
                && other.getResponses().equals(this.getResponses()) == false)
            return false;
        return true;
    }
}
