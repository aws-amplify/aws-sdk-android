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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * <code>TransactGetItems</code> is a synchronous operation that atomically
 * retrieves multiple items from one or more tables (but not from indexes) in a
 * single account and Region. A <code>TransactGetItems</code> call can contain
 * up to 25 <code>TransactGetItem</code> objects, each of which contains a
 * <code>Get</code> structure that specifies an item to retrieve from a table in
 * the account and Region. A call to <code>TransactGetItems</code> cannot
 * retrieve items from tables in more than one AWS account or Region. The
 * aggregate size of the items in the transaction cannot exceed 4 MB.
 * </p>
 * <p>
 * DynamoDB rejects the entire <code>TransactGetItems</code> request if any of
 * the following is true:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A conflicting operation is in the process of updating an item to be read.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is insufficient provisioned capacity for the transaction to be
 * completed.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is a user error, such as an invalid data format.
 * </p>
 * </li>
 * <li>
 * <p>
 * The aggregate size of the items in the transaction cannot exceed 4 MB.
 * </p>
 * </li>
 * </ul>
 */
public class TransactGetItemsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An ordered array of up to 25 <code>TransactGetItem</code> objects, each
     * of which contains a <code>Get</code> structure.
     * </p>
     */
    private java.util.List<TransactGetItem> transactItems;

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be
     * returned, and a value of <code>NONE</code> prevents that information from
     * being returned. No other value is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     */
    private String returnConsumedCapacity;

    /**
     * <p>
     * An ordered array of up to 25 <code>TransactGetItem</code> objects, each
     * of which contains a <code>Get</code> structure.
     * </p>
     *
     * @return <p>
     *         An ordered array of up to 25 <code>TransactGetItem</code>
     *         objects, each of which contains a <code>Get</code> structure.
     *         </p>
     */
    public java.util.List<TransactGetItem> getTransactItems() {
        return transactItems;
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>TransactGetItem</code> objects, each
     * of which contains a <code>Get</code> structure.
     * </p>
     *
     * @param transactItems <p>
     *            An ordered array of up to 25 <code>TransactGetItem</code>
     *            objects, each of which contains a <code>Get</code> structure.
     *            </p>
     */
    public void setTransactItems(java.util.Collection<TransactGetItem> transactItems) {
        if (transactItems == null) {
            this.transactItems = null;
            return;
        }

        this.transactItems = new java.util.ArrayList<TransactGetItem>(transactItems);
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>TransactGetItem</code> objects, each
     * of which contains a <code>Get</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transactItems <p>
     *            An ordered array of up to 25 <code>TransactGetItem</code>
     *            objects, each of which contains a <code>Get</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactGetItemsRequest withTransactItems(TransactGetItem... transactItems) {
        if (getTransactItems() == null) {
            this.transactItems = new java.util.ArrayList<TransactGetItem>(transactItems.length);
        }
        for (TransactGetItem value : transactItems) {
            this.transactItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>TransactGetItem</code> objects, each
     * of which contains a <code>Get</code> structure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transactItems <p>
     *            An ordered array of up to 25 <code>TransactGetItem</code>
     *            objects, each of which contains a <code>Get</code> structure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactGetItemsRequest withTransactItems(
            java.util.Collection<TransactGetItem> transactItems) {
        setTransactItems(transactItems);
        return this;
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be
     * returned, and a value of <code>NONE</code> prevents that information from
     * being returned. No other value is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @return <p>
     *         A value of <code>TOTAL</code> causes consumed capacity
     *         information to be returned, and a value of <code>NONE</code>
     *         prevents that information from being returned. No other value is
     *         valid.
     *         </p>
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be
     * returned, and a value of <code>NONE</code> prevents that information from
     * being returned. No other value is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            A value of <code>TOTAL</code> causes consumed capacity
     *            information to be returned, and a value of <code>NONE</code>
     *            prevents that information from being returned. No other value
     *            is valid.
     *            </p>
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be
     * returned, and a value of <code>NONE</code> prevents that information from
     * being returned. No other value is valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            A value of <code>TOTAL</code> causes consumed capacity
     *            information to be returned, and a value of <code>NONE</code>
     *            prevents that information from being returned. No other value
     *            is valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */
    public TransactGetItemsRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be
     * returned, and a value of <code>NONE</code> prevents that information from
     * being returned. No other value is valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            A value of <code>TOTAL</code> causes consumed capacity
     *            information to be returned, and a value of <code>NONE</code>
     *            prevents that information from being returned. No other value
     *            is valid.
     *            </p>
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    /**
     * <p>
     * A value of <code>TOTAL</code> causes consumed capacity information to be
     * returned, and a value of <code>NONE</code> prevents that information from
     * being returned. No other value is valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            A value of <code>TOTAL</code> causes consumed capacity
     *            information to be returned, and a value of <code>NONE</code>
     *            prevents that information from being returned. No other value
     *            is valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */
    public TransactGetItemsRequest withReturnConsumedCapacity(
            ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
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
        if (getTransactItems() != null)
            sb.append("TransactItems: " + getTransactItems() + ",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransactItems() == null) ? 0 : getTransactItems().hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactGetItemsRequest == false)
            return false;
        TransactGetItemsRequest other = (TransactGetItemsRequest) obj;

        if (other.getTransactItems() == null ^ this.getTransactItems() == null)
            return false;
        if (other.getTransactItems() != null
                && other.getTransactItems().equals(this.getTransactItems()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null
                && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        return true;
    }
}
