/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an action to write to a DynamoDB table.
 * </p>
 * <p>
 * This DynamoDB action writes each attribute in the message payload into it's
 * own column in the DynamoDB table.
 * </p>
 */
public class DynamoDBv2Action implements Serializable {
    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Specifies the DynamoDB table to which the message data will be written.
     * For example:
     * </p>
     * <p>
     * <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     * </p>
     * <p>
     * Each attribute in the message payload will be written to a separate
     * column in the DynamoDB database.
     * </p>
     */
    private PutItemInput putItem;

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM role that grants access to the DynamoDB table.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access to the DynamoDB
     *            table.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the IAM role that grants access to the DynamoDB
     *            table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBv2Action withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * Specifies the DynamoDB table to which the message data will be written.
     * For example:
     * </p>
     * <p>
     * <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     * </p>
     * <p>
     * Each attribute in the message payload will be written to a separate
     * column in the DynamoDB database.
     * </p>
     *
     * @return <p>
     *         Specifies the DynamoDB table to which the message data will be
     *         written. For example:
     *         </p>
     *         <p>
     *         <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     *         </p>
     *         <p>
     *         Each attribute in the message payload will be written to a
     *         separate column in the DynamoDB database.
     *         </p>
     */
    public PutItemInput getPutItem() {
        return putItem;
    }

    /**
     * <p>
     * Specifies the DynamoDB table to which the message data will be written.
     * For example:
     * </p>
     * <p>
     * <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     * </p>
     * <p>
     * Each attribute in the message payload will be written to a separate
     * column in the DynamoDB database.
     * </p>
     *
     * @param putItem <p>
     *            Specifies the DynamoDB table to which the message data will be
     *            written. For example:
     *            </p>
     *            <p>
     *            <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     *            </p>
     *            <p>
     *            Each attribute in the message payload will be written to a
     *            separate column in the DynamoDB database.
     *            </p>
     */
    public void setPutItem(PutItemInput putItem) {
        this.putItem = putItem;
    }

    /**
     * <p>
     * Specifies the DynamoDB table to which the message data will be written.
     * For example:
     * </p>
     * <p>
     * <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     * </p>
     * <p>
     * Each attribute in the message payload will be written to a separate
     * column in the DynamoDB database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param putItem <p>
     *            Specifies the DynamoDB table to which the message data will be
     *            written. For example:
     *            </p>
     *            <p>
     *            <code>{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }</code>
     *            </p>
     *            <p>
     *            Each attribute in the message payload will be written to a
     *            separate column in the DynamoDB database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DynamoDBv2Action withPutItem(PutItemInput putItem) {
        this.putItem = putItem;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getPutItem() != null)
            sb.append("putItem: " + getPutItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPutItem() == null) ? 0 : getPutItem().hashCode());
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

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPutItem() == null ^ this.getPutItem() == null)
            return false;
        if (other.getPutItem() != null && other.getPutItem().equals(this.getPutItem()) == false)
            return false;
        return true;
    }
}
