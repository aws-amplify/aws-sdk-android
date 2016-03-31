/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The <code>tableName</code> ,
 * <code>hashKeyField</code> , and
 * <code>rangeKeyField</code> values must match the values used when you
 * created the table.
 * </p>
 * <p>
 * The <code>hashKeyValue</code> and <code>rangeKeyvalue</code> fields
 * use a substitution template syntax. These templates provide data at
 * runtime. The syntax is as follows: ${ <i>sql-expression</i> }.
 * </p>
 * <p>
 * You can specify any valid expression in a WHERE or SELECT clause,
 * including JSON properties, comparisons, calculations, and functions.
 * For example, the following field uses the third level of the topic:
 * </p>
 * <p>
 * <code>"hashKeyValue": "${topic(3)}"</code>
 * </p>
 * <p>
 * The following field uses the timestamp:
 * </p>
 * <p>
 * <code>"rangeKeyValue": "${timestamp()}"</code>
 * </p>
 */
public class DynamoDBAction implements Serializable {

    /**
     * The name of the DynamoDB table.
     */
    private String tableName;

    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     */
    private String roleArn;

    /**
     * The hash key name.
     */
    private String hashKeyField;

    /**
     * The hash key value.
     */
    private String hashKeyValue;

    /**
     * The range key name.
     */
    private String rangeKeyField;

    /**
     * The range key value.
     */
    private String rangeKeyValue;

    /**
     * The action payload. This name can be customized.
     */
    private String payloadField;

    /**
     * The name of the DynamoDB table.
     *
     * @return The name of the DynamoDB table.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the DynamoDB table.
     *
     * @param tableName The name of the DynamoDB table.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the DynamoDB table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableName The name of the DynamoDB table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DynamoDBAction withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     *
     * @return The ARN of the IAM role that grants access to the DynamoDB table.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     *
     * @param roleArn The ARN of the IAM role that grants access to the DynamoDB table.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The ARN of the IAM role that grants access to the DynamoDB table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn The ARN of the IAM role that grants access to the DynamoDB table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DynamoDBAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The hash key name.
     *
     * @return The hash key name.
     */
    public String getHashKeyField() {
        return hashKeyField;
    }
    
    /**
     * The hash key name.
     *
     * @param hashKeyField The hash key name.
     */
    public void setHashKeyField(String hashKeyField) {
        this.hashKeyField = hashKeyField;
    }
    
    /**
     * The hash key name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKeyField The hash key name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DynamoDBAction withHashKeyField(String hashKeyField) {
        this.hashKeyField = hashKeyField;
        return this;
    }

    /**
     * The hash key value.
     *
     * @return The hash key value.
     */
    public String getHashKeyValue() {
        return hashKeyValue;
    }
    
    /**
     * The hash key value.
     *
     * @param hashKeyValue The hash key value.
     */
    public void setHashKeyValue(String hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }
    
    /**
     * The hash key value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKeyValue The hash key value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DynamoDBAction withHashKeyValue(String hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
        return this;
    }

    /**
     * The range key name.
     *
     * @return The range key name.
     */
    public String getRangeKeyField() {
        return rangeKeyField;
    }
    
    /**
     * The range key name.
     *
     * @param rangeKeyField The range key name.
     */
    public void setRangeKeyField(String rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
    }
    
    /**
     * The range key name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rangeKeyField The range key name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DynamoDBAction withRangeKeyField(String rangeKeyField) {
        this.rangeKeyField = rangeKeyField;
        return this;
    }

    /**
     * The range key value.
     *
     * @return The range key value.
     */
    public String getRangeKeyValue() {
        return rangeKeyValue;
    }
    
    /**
     * The range key value.
     *
     * @param rangeKeyValue The range key value.
     */
    public void setRangeKeyValue(String rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
    }
    
    /**
     * The range key value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rangeKeyValue The range key value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DynamoDBAction withRangeKeyValue(String rangeKeyValue) {
        this.rangeKeyValue = rangeKeyValue;
        return this;
    }

    /**
     * The action payload. This name can be customized.
     *
     * @return The action payload. This name can be customized.
     */
    public String getPayloadField() {
        return payloadField;
    }
    
    /**
     * The action payload. This name can be customized.
     *
     * @param payloadField The action payload. This name can be customized.
     */
    public void setPayloadField(String payloadField) {
        this.payloadField = payloadField;
    }
    
    /**
     * The action payload. This name can be customized.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param payloadField The action payload. This name can be customized.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DynamoDBAction withPayloadField(String payloadField) {
        this.payloadField = payloadField;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getHashKeyField() != null) sb.append("HashKeyField: " + getHashKeyField() + ",");
        if (getHashKeyValue() != null) sb.append("HashKeyValue: " + getHashKeyValue() + ",");
        if (getRangeKeyField() != null) sb.append("RangeKeyField: " + getRangeKeyField() + ",");
        if (getRangeKeyValue() != null) sb.append("RangeKeyValue: " + getRangeKeyValue() + ",");
        if (getPayloadField() != null) sb.append("PayloadField: " + getPayloadField() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getHashKeyField() == null) ? 0 : getHashKeyField().hashCode()); 
        hashCode = prime * hashCode + ((getHashKeyValue() == null) ? 0 : getHashKeyValue().hashCode()); 
        hashCode = prime * hashCode + ((getRangeKeyField() == null) ? 0 : getRangeKeyField().hashCode()); 
        hashCode = prime * hashCode + ((getRangeKeyValue() == null) ? 0 : getRangeKeyValue().hashCode()); 
        hashCode = prime * hashCode + ((getPayloadField() == null) ? 0 : getPayloadField().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DynamoDBAction == false) return false;
        DynamoDBAction other = (DynamoDBAction)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getHashKeyField() == null ^ this.getHashKeyField() == null) return false;
        if (other.getHashKeyField() != null && other.getHashKeyField().equals(this.getHashKeyField()) == false) return false; 
        if (other.getHashKeyValue() == null ^ this.getHashKeyValue() == null) return false;
        if (other.getHashKeyValue() != null && other.getHashKeyValue().equals(this.getHashKeyValue()) == false) return false; 
        if (other.getRangeKeyField() == null ^ this.getRangeKeyField() == null) return false;
        if (other.getRangeKeyField() != null && other.getRangeKeyField().equals(this.getRangeKeyField()) == false) return false; 
        if (other.getRangeKeyValue() == null ^ this.getRangeKeyValue() == null) return false;
        if (other.getRangeKeyValue() != null && other.getRangeKeyValue().equals(this.getRangeKeyValue()) == false) return false; 
        if (other.getPayloadField() == null ^ this.getPayloadField() == null) return false;
        if (other.getPayloadField() != null && other.getPayloadField().equals(this.getPayloadField()) == false) return false; 
        return true;
    }
    
}
    