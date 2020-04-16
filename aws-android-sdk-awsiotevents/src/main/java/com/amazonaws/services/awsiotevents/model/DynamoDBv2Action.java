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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Defines an action to write to the Amazon DynamoDB table that you created. The
 * default action payload contains all attribute-value pairs that have the
 * information about the detector model instance and the event that triggered
 * the action. You can also customize the <a href=
 * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
 * >payload</a>. A separate column of the DynamoDB table receives one
 * attribute-value pair in the payload that you specify.
 * </p>
 * <important>
 * <p>
 * The <code>type</code> value for <code>Payload</code> must be
 * <code>JSON</code>.
 * </p>
 * </important>
 * <p>
 * You can use expressions for parameters that are strings. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html"
 * >Expressions</a> in the <i>AWS IoT Events Developer Guide</i>.
 * </p>
 */
public class DynamoDBv2Action implements Serializable {
    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * Information needed to configure the payload.
     * </p>
     * <p>
     * By default, AWS IoT Events generates a standard payload in JSON for any
     * action. This action payload contains all attribute-value pairs that have
     * the information about the detector model instance and the event triggered
     * the action. To configure the action payload, you can use
     * <code>contentExpression</code>.
     * </p>
     */
    private Payload payload;

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     *
     * @return <p>
     *         The name of the DynamoDB table.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     *
     * @param tableName <p>
     *            The name of the DynamoDB table.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the DynamoDB table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableName <p>
     *            The name of the DynamoDB table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBv2Action withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * Information needed to configure the payload.
     * </p>
     * <p>
     * By default, AWS IoT Events generates a standard payload in JSON for any
     * action. This action payload contains all attribute-value pairs that have
     * the information about the detector model instance and the event triggered
     * the action. To configure the action payload, you can use
     * <code>contentExpression</code>.
     * </p>
     *
     * @return <p>
     *         Information needed to configure the payload.
     *         </p>
     *         <p>
     *         By default, AWS IoT Events generates a standard payload in JSON
     *         for any action. This action payload contains all attribute-value
     *         pairs that have the information about the detector model instance
     *         and the event triggered the action. To configure the action
     *         payload, you can use <code>contentExpression</code>.
     *         </p>
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * <p>
     * Information needed to configure the payload.
     * </p>
     * <p>
     * By default, AWS IoT Events generates a standard payload in JSON for any
     * action. This action payload contains all attribute-value pairs that have
     * the information about the detector model instance and the event triggered
     * the action. To configure the action payload, you can use
     * <code>contentExpression</code>.
     * </p>
     *
     * @param payload <p>
     *            Information needed to configure the payload.
     *            </p>
     *            <p>
     *            By default, AWS IoT Events generates a standard payload in
     *            JSON for any action. This action payload contains all
     *            attribute-value pairs that have the information about the
     *            detector model instance and the event triggered the action. To
     *            configure the action payload, you can use
     *            <code>contentExpression</code>.
     *            </p>
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Information needed to configure the payload.
     * </p>
     * <p>
     * By default, AWS IoT Events generates a standard payload in JSON for any
     * action. This action payload contains all attribute-value pairs that have
     * the information about the detector model instance and the event triggered
     * the action. To configure the action payload, you can use
     * <code>contentExpression</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param payload <p>
     *            Information needed to configure the payload.
     *            </p>
     *            <p>
     *            By default, AWS IoT Events generates a standard payload in
     *            JSON for any action. This action payload contains all
     *            attribute-value pairs that have the information about the
     *            detector model instance and the event triggered the action. To
     *            configure the action payload, you can use
     *            <code>contentExpression</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBv2Action withPayload(Payload payload) {
        this.payload = payload;
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
        if (getTableName() != null)
            sb.append("tableName: " + getTableName() + ",");
        if (getPayload() != null)
            sb.append("payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamoDBv2Action == false)
            return false;
        DynamoDBv2Action other = (DynamoDBv2Action) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
