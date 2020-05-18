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
 * <code>TransactWriteItems</code> is a synchronous write operation that groups
 * up to 25 action requests. These actions can target items in different tables,
 * but not in different AWS accounts or Regions, and no two actions can target
 * the same item. For example, you cannot both <code>ConditionCheck</code> and
 * <code>Update</code> the same item. The aggregate size of the items in the
 * transaction cannot exceed 4 MB.
 * </p>
 * <p>
 * The actions are completed atomically so that either all of them succeed, or
 * all of them fail. They are defined by the following objects:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Put</code>  &#x97;   Initiates a <code>PutItem</code> operation to
 * write a new item. This structure specifies the primary key of the item to be
 * written, the name of the table to write it in, an optional condition
 * expression that must be satisfied for the write to succeed, a list of the
 * item's attributes, and a field indicating whether to retrieve the item's
 * attributes if the condition is not met.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Update</code>  &#x97;   Initiates an <code>UpdateItem</code> operation
 * to update an existing item. This structure specifies the primary key of the
 * item to be updated, the name of the table where it resides, an optional
 * condition expression that must be satisfied for the update to succeed, an
 * expression that defines one or more attributes to be updated, and a field
 * indicating whether to retrieve the item's attributes if the condition is not
 * met.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Delete</code>  &#x97;   Initiates a <code>DeleteItem</code> operation
 * to delete an existing item. This structure specifies the primary key of the
 * item to be deleted, the name of the table where it resides, an optional
 * condition expression that must be satisfied for the deletion to succeed, and
 * a field indicating whether to retrieve the item's attributes if the condition
 * is not met.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ConditionCheck</code>  &#x97;   Applies a condition to an item that is
 * not being modified by the transaction. This structure specifies the primary
 * key of the item to be checked, the name of the table where it resides, a
 * condition expression that must be satisfied for the transaction to succeed,
 * and a field indicating whether to retrieve the item's attributes if the
 * condition is not met.
 * </p>
 * </li>
 * </ul>
 * <p>
 * DynamoDB rejects the entire <code>TransactWriteItems</code> request if any of
 * the following is true:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A condition in one of the condition expressions is not met.
 * </p>
 * </li>
 * <li>
 * <p>
 * An ongoing operation is in the process of updating the same item.
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
 * An item size becomes too large (bigger than 400 KB), a local secondary index
 * (LSI) becomes too large, or a similar validation error occurs because of
 * changes made by the transaction.
 * </p>
 * </li>
 * <li>
 * <p>
 * The aggregate size of the items in the transaction exceeds 4 MB.
 * </p>
 * </li>
 * <li>
 * <p>
 * There is a user error, such as an invalid data format.
 * </p>
 * </li>
 * </ul>
 */
public class TransactWriteItemsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An ordered array of up to 25 <code>TransactWriteItem</code> objects, each
     * of which contains a <code>ConditionCheck</code>, <code>Put</code>,
     * <code>Update</code>, or <code>Delete</code> object. These can operate on
     * items in different tables, but the tables must reside in the same AWS
     * account and Region, and no two of them can operate on the same item.
     * </p>
     */
    private java.util.List<TransactWriteItem> transactItems;

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     */
    private String returnConsumedCapacity;

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections (if any), that were modified during the operation and are
     * returned in the response. If set to <code>NONE</code> (the default), no
     * statistics are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     */
    private String returnItemCollectionMetrics;

    /**
     * <p>
     * Providing a <code>ClientRequestToken</code> makes the call to
     * <code>TransactWriteItems</code> idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Although multiple identical calls using the same client request token
     * produce the same result on the server (no side effects), the responses to
     * the calls might not be the same. If the
     * <code>ReturnConsumedCapacity&gt;</code> parameter is set, then the
     * initial <code>TransactWriteItems</code> call returns the amount of write
     * capacity units consumed in making the changes. Subsequent
     * <code>TransactWriteItems</code> calls with the same client token return
     * the number of read capacity units consumed in reading the item.
     * </p>
     * <p>
     * A client request token is valid for 10 minutes after the first request
     * that uses it is completed. After 10 minutes, any request with the same
     * client token is treated as a new request. Do not resubmit the same
     * request with the same client token for more than 10 minutes, or the
     * result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other
     * parameters within the 10-minute idempotency window, DynamoDB returns an
     * <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * An ordered array of up to 25 <code>TransactWriteItem</code> objects, each
     * of which contains a <code>ConditionCheck</code>, <code>Put</code>,
     * <code>Update</code>, or <code>Delete</code> object. These can operate on
     * items in different tables, but the tables must reside in the same AWS
     * account and Region, and no two of them can operate on the same item.
     * </p>
     *
     * @return <p>
     *         An ordered array of up to 25 <code>TransactWriteItem</code>
     *         objects, each of which contains a <code>ConditionCheck</code>,
     *         <code>Put</code>, <code>Update</code>, or <code>Delete</code>
     *         object. These can operate on items in different tables, but the
     *         tables must reside in the same AWS account and Region, and no two
     *         of them can operate on the same item.
     *         </p>
     */
    public java.util.List<TransactWriteItem> getTransactItems() {
        return transactItems;
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>TransactWriteItem</code> objects, each
     * of which contains a <code>ConditionCheck</code>, <code>Put</code>,
     * <code>Update</code>, or <code>Delete</code> object. These can operate on
     * items in different tables, but the tables must reside in the same AWS
     * account and Region, and no two of them can operate on the same item.
     * </p>
     *
     * @param transactItems <p>
     *            An ordered array of up to 25 <code>TransactWriteItem</code>
     *            objects, each of which contains a <code>ConditionCheck</code>,
     *            <code>Put</code>, <code>Update</code>, or <code>Delete</code>
     *            object. These can operate on items in different tables, but
     *            the tables must reside in the same AWS account and Region, and
     *            no two of them can operate on the same item.
     *            </p>
     */
    public void setTransactItems(java.util.Collection<TransactWriteItem> transactItems) {
        if (transactItems == null) {
            this.transactItems = null;
            return;
        }

        this.transactItems = new java.util.ArrayList<TransactWriteItem>(transactItems);
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>TransactWriteItem</code> objects, each
     * of which contains a <code>ConditionCheck</code>, <code>Put</code>,
     * <code>Update</code>, or <code>Delete</code> object. These can operate on
     * items in different tables, but the tables must reside in the same AWS
     * account and Region, and no two of them can operate on the same item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transactItems <p>
     *            An ordered array of up to 25 <code>TransactWriteItem</code>
     *            objects, each of which contains a <code>ConditionCheck</code>,
     *            <code>Put</code>, <code>Update</code>, or <code>Delete</code>
     *            object. These can operate on items in different tables, but
     *            the tables must reside in the same AWS account and Region, and
     *            no two of them can operate on the same item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItemsRequest withTransactItems(TransactWriteItem... transactItems) {
        if (getTransactItems() == null) {
            this.transactItems = new java.util.ArrayList<TransactWriteItem>(transactItems.length);
        }
        for (TransactWriteItem value : transactItems) {
            this.transactItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An ordered array of up to 25 <code>TransactWriteItem</code> objects, each
     * of which contains a <code>ConditionCheck</code>, <code>Put</code>,
     * <code>Update</code>, or <code>Delete</code> object. These can operate on
     * items in different tables, but the tables must reside in the same AWS
     * account and Region, and no two of them can operate on the same item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transactItems <p>
     *            An ordered array of up to 25 <code>TransactWriteItem</code>
     *            objects, each of which contains a <code>ConditionCheck</code>,
     *            <code>Put</code>, <code>Update</code>, or <code>Delete</code>
     *            object. These can operate on items in different tables, but
     *            the tables must reside in the same AWS account and Region, and
     *            no two of them can operate on the same item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItemsRequest withTransactItems(
            java.util.Collection<TransactWriteItem> transactItems) {
        setTransactItems(transactItems);
        return this;
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @return <p>
     *         Determines the level of detail about provisioned throughput
     *         consumption that is returned in the response:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INDEXES</code> - The response includes the aggregate
     *         <code>ConsumedCapacity</code> for the operation, together with
     *         <code>ConsumedCapacity</code> for each table and secondary index
     *         that was accessed.
     *         </p>
     *         <p>
     *         Note that some operations, such as <code>GetItem</code> and
     *         <code>BatchGetItem</code>, do not access any indexes at all. In
     *         these cases, specifying <code>INDEXES</code> will only return
     *         <code>ConsumedCapacity</code> information for table(s).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOTAL</code> - The response includes only the aggregate
     *         <code>ConsumedCapacity</code> for the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code> - No <code>ConsumedCapacity</code> details are
     *         included in the response.
     *         </p>
     *         </li>
     *         </ul>
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            Determines the level of detail about provisioned throughput
     *            consumption that is returned in the response:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INDEXES</code> - The response includes the aggregate
     *            <code>ConsumedCapacity</code> for the operation, together with
     *            <code>ConsumedCapacity</code> for each table and secondary
     *            index that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <code>GetItem</code> and
     *            <code>BatchGetItem</code>, do not access any indexes at all.
     *            In these cases, specifying <code>INDEXES</code> will only
     *            return <code>ConsumedCapacity</code> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code> - The response includes only the aggregate
     *            <code>ConsumedCapacity</code> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - No <code>ConsumedCapacity</code> details
     *            are included in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            Determines the level of detail about provisioned throughput
     *            consumption that is returned in the response:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INDEXES</code> - The response includes the aggregate
     *            <code>ConsumedCapacity</code> for the operation, together with
     *            <code>ConsumedCapacity</code> for each table and secondary
     *            index that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <code>GetItem</code> and
     *            <code>BatchGetItem</code>, do not access any indexes at all.
     *            In these cases, specifying <code>INDEXES</code> will only
     *            return <code>ConsumedCapacity</code> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code> - The response includes only the aggregate
     *            <code>ConsumedCapacity</code> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - No <code>ConsumedCapacity</code> details
     *            are included in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */
    public TransactWriteItemsRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            Determines the level of detail about provisioned throughput
     *            consumption that is returned in the response:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INDEXES</code> - The response includes the aggregate
     *            <code>ConsumedCapacity</code> for the operation, together with
     *            <code>ConsumedCapacity</code> for each table and secondary
     *            index that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <code>GetItem</code> and
     *            <code>BatchGetItem</code>, do not access any indexes at all.
     *            In these cases, specifying <code>INDEXES</code> will only
     *            return <code>ConsumedCapacity</code> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code> - The response includes only the aggregate
     *            <code>ConsumedCapacity</code> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - No <code>ConsumedCapacity</code> details
     *            are included in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    /**
     * <p>
     * Determines the level of detail about provisioned throughput consumption
     * that is returned in the response:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INDEXES</code> - The response includes the aggregate
     * <code>ConsumedCapacity</code> for the operation, together with
     * <code>ConsumedCapacity</code> for each table and secondary index that was
     * accessed.
     * </p>
     * <p>
     * Note that some operations, such as <code>GetItem</code> and
     * <code>BatchGetItem</code>, do not access any indexes at all. In these
     * cases, specifying <code>INDEXES</code> will only return
     * <code>ConsumedCapacity</code> information for table(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code> - The response includes only the aggregate
     * <code>ConsumedCapacity</code> for the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code> - No <code>ConsumedCapacity</code> details are included
     * in the response.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity <p>
     *            Determines the level of detail about provisioned throughput
     *            consumption that is returned in the response:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INDEXES</code> - The response includes the aggregate
     *            <code>ConsumedCapacity</code> for the operation, together with
     *            <code>ConsumedCapacity</code> for each table and secondary
     *            index that was accessed.
     *            </p>
     *            <p>
     *            Note that some operations, such as <code>GetItem</code> and
     *            <code>BatchGetItem</code>, do not access any indexes at all.
     *            In these cases, specifying <code>INDEXES</code> will only
     *            return <code>ConsumedCapacity</code> information for table(s).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TOTAL</code> - The response includes only the aggregate
     *            <code>ConsumedCapacity</code> for the operation.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NONE</code> - No <code>ConsumedCapacity</code> details
     *            are included in the response.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnConsumedCapacity
     */
    public TransactWriteItemsRequest withReturnConsumedCapacity(
            ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections (if any), that were modified during the operation and are
     * returned in the response. If set to <code>NONE</code> (the default), no
     * statistics are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @return <p>
     *         Determines whether item collection metrics are returned. If set
     *         to <code>SIZE</code>, the response includes statistics about item
     *         collections (if any), that were modified during the operation and
     *         are returned in the response. If set to <code>NONE</code> (the
     *         default), no statistics are returned.
     *         </p>
     * @see ReturnItemCollectionMetrics
     */
    public String getReturnItemCollectionMetrics() {
        return returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections (if any), that were modified during the operation and are
     * returned in the response. If set to <code>NONE</code> (the default), no
     * statistics are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics <p>
     *            Determines whether item collection metrics are returned. If
     *            set to <code>SIZE</code>, the response includes statistics
     *            about item collections (if any), that were modified during the
     *            operation and are returned in the response. If set to
     *            <code>NONE</code> (the default), no statistics are returned.
     *            </p>
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections (if any), that were modified during the operation and are
     * returned in the response. If set to <code>NONE</code> (the default), no
     * statistics are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics <p>
     *            Determines whether item collection metrics are returned. If
     *            set to <code>SIZE</code>, the response includes statistics
     *            about item collections (if any), that were modified during the
     *            operation and are returned in the response. If set to
     *            <code>NONE</code> (the default), no statistics are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnItemCollectionMetrics
     */
    public TransactWriteItemsRequest withReturnItemCollectionMetrics(
            String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections (if any), that were modified during the operation and are
     * returned in the response. If set to <code>NONE</code> (the default), no
     * statistics are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics <p>
     *            Determines whether item collection metrics are returned. If
     *            set to <code>SIZE</code>, the response includes statistics
     *            about item collections (if any), that were modified during the
     *            operation and are returned in the response. If set to
     *            <code>NONE</code> (the default), no statistics are returned.
     *            </p>
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(
            ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to
     * <code>SIZE</code>, the response includes statistics about item
     * collections (if any), that were modified during the operation and are
     * returned in the response. If set to <code>NONE</code> (the default), no
     * statistics are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics <p>
     *            Determines whether item collection metrics are returned. If
     *            set to <code>SIZE</code>, the response includes statistics
     *            about item collections (if any), that were modified during the
     *            operation and are returned in the response. If set to
     *            <code>NONE</code> (the default), no statistics are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnItemCollectionMetrics
     */
    public TransactWriteItemsRequest withReturnItemCollectionMetrics(
            ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
        return this;
    }

    /**
     * <p>
     * Providing a <code>ClientRequestToken</code> makes the call to
     * <code>TransactWriteItems</code> idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Although multiple identical calls using the same client request token
     * produce the same result on the server (no side effects), the responses to
     * the calls might not be the same. If the
     * <code>ReturnConsumedCapacity&gt;</code> parameter is set, then the
     * initial <code>TransactWriteItems</code> call returns the amount of write
     * capacity units consumed in making the changes. Subsequent
     * <code>TransactWriteItems</code> calls with the same client token return
     * the number of read capacity units consumed in reading the item.
     * </p>
     * <p>
     * A client request token is valid for 10 minutes after the first request
     * that uses it is completed. After 10 minutes, any request with the same
     * client token is treated as a new request. Do not resubmit the same
     * request with the same client token for more than 10 minutes, or the
     * result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other
     * parameters within the 10-minute idempotency window, DynamoDB returns an
     * <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         Providing a <code>ClientRequestToken</code> makes the call to
     *         <code>TransactWriteItems</code> idempotent, meaning that multiple
     *         identical calls have the same effect as one single call.
     *         </p>
     *         <p>
     *         Although multiple identical calls using the same client request
     *         token produce the same result on the server (no side effects),
     *         the responses to the calls might not be the same. If the
     *         <code>ReturnConsumedCapacity&gt;</code> parameter is set, then
     *         the initial <code>TransactWriteItems</code> call returns the
     *         amount of write capacity units consumed in making the changes.
     *         Subsequent <code>TransactWriteItems</code> calls with the same
     *         client token return the number of read capacity units consumed in
     *         reading the item.
     *         </p>
     *         <p>
     *         A client request token is valid for 10 minutes after the first
     *         request that uses it is completed. After 10 minutes, any request
     *         with the same client token is treated as a new request. Do not
     *         resubmit the same request with the same client token for more
     *         than 10 minutes, or the result might not be idempotent.
     *         </p>
     *         <p>
     *         If you submit a request with the same client token but a change
     *         in other parameters within the 10-minute idempotency window,
     *         DynamoDB returns an <code>IdempotentParameterMismatch</code>
     *         exception.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Providing a <code>ClientRequestToken</code> makes the call to
     * <code>TransactWriteItems</code> idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Although multiple identical calls using the same client request token
     * produce the same result on the server (no side effects), the responses to
     * the calls might not be the same. If the
     * <code>ReturnConsumedCapacity&gt;</code> parameter is set, then the
     * initial <code>TransactWriteItems</code> call returns the amount of write
     * capacity units consumed in making the changes. Subsequent
     * <code>TransactWriteItems</code> calls with the same client token return
     * the number of read capacity units consumed in reading the item.
     * </p>
     * <p>
     * A client request token is valid for 10 minutes after the first request
     * that uses it is completed. After 10 minutes, any request with the same
     * client token is treated as a new request. Do not resubmit the same
     * request with the same client token for more than 10 minutes, or the
     * result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other
     * parameters within the 10-minute idempotency window, DynamoDB returns an
     * <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientRequestToken <p>
     *            Providing a <code>ClientRequestToken</code> makes the call to
     *            <code>TransactWriteItems</code> idempotent, meaning that
     *            multiple identical calls have the same effect as one single
     *            call.
     *            </p>
     *            <p>
     *            Although multiple identical calls using the same client
     *            request token produce the same result on the server (no side
     *            effects), the responses to the calls might not be the same. If
     *            the <code>ReturnConsumedCapacity&gt;</code> parameter is set,
     *            then the initial <code>TransactWriteItems</code> call returns
     *            the amount of write capacity units consumed in making the
     *            changes. Subsequent <code>TransactWriteItems</code> calls with
     *            the same client token return the number of read capacity units
     *            consumed in reading the item.
     *            </p>
     *            <p>
     *            A client request token is valid for 10 minutes after the first
     *            request that uses it is completed. After 10 minutes, any
     *            request with the same client token is treated as a new
     *            request. Do not resubmit the same request with the same client
     *            token for more than 10 minutes, or the result might not be
     *            idempotent.
     *            </p>
     *            <p>
     *            If you submit a request with the same client token but a
     *            change in other parameters within the 10-minute idempotency
     *            window, DynamoDB returns an
     *            <code>IdempotentParameterMismatch</code> exception.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Providing a <code>ClientRequestToken</code> makes the call to
     * <code>TransactWriteItems</code> idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * </p>
     * <p>
     * Although multiple identical calls using the same client request token
     * produce the same result on the server (no side effects), the responses to
     * the calls might not be the same. If the
     * <code>ReturnConsumedCapacity&gt;</code> parameter is set, then the
     * initial <code>TransactWriteItems</code> call returns the amount of write
     * capacity units consumed in making the changes. Subsequent
     * <code>TransactWriteItems</code> calls with the same client token return
     * the number of read capacity units consumed in reading the item.
     * </p>
     * <p>
     * A client request token is valid for 10 minutes after the first request
     * that uses it is completed. After 10 minutes, any request with the same
     * client token is treated as a new request. Do not resubmit the same
     * request with the same client token for more than 10 minutes, or the
     * result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other
     * parameters within the 10-minute idempotency window, DynamoDB returns an
     * <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param clientRequestToken <p>
     *            Providing a <code>ClientRequestToken</code> makes the call to
     *            <code>TransactWriteItems</code> idempotent, meaning that
     *            multiple identical calls have the same effect as one single
     *            call.
     *            </p>
     *            <p>
     *            Although multiple identical calls using the same client
     *            request token produce the same result on the server (no side
     *            effects), the responses to the calls might not be the same. If
     *            the <code>ReturnConsumedCapacity&gt;</code> parameter is set,
     *            then the initial <code>TransactWriteItems</code> call returns
     *            the amount of write capacity units consumed in making the
     *            changes. Subsequent <code>TransactWriteItems</code> calls with
     *            the same client token return the number of read capacity units
     *            consumed in reading the item.
     *            </p>
     *            <p>
     *            A client request token is valid for 10 minutes after the first
     *            request that uses it is completed. After 10 minutes, any
     *            request with the same client token is treated as a new
     *            request. Do not resubmit the same request with the same client
     *            token for more than 10 minutes, or the result might not be
     *            idempotent.
     *            </p>
     *            <p>
     *            If you submit a request with the same client token but a
     *            change in other parameters within the 10-minute idempotency
     *            window, DynamoDB returns an
     *            <code>IdempotentParameterMismatch</code> exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransactWriteItemsRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
            sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null)
            sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
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
        hashCode = prime
                * hashCode
                + ((getReturnItemCollectionMetrics() == null) ? 0
                        : getReturnItemCollectionMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransactWriteItemsRequest == false)
            return false;
        TransactWriteItemsRequest other = (TransactWriteItemsRequest) obj;

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
        if (other.getReturnItemCollectionMetrics() == null
                ^ this.getReturnItemCollectionMetrics() == null)
            return false;
        if (other.getReturnItemCollectionMetrics() != null
                && other.getReturnItemCollectionMetrics().equals(
                        this.getReturnItemCollectionMetrics()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
