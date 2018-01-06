/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the provisioned throughput settings for a specified table or
 * index. The settings can be modified using the <i>UpdateTable</i> operation.
 * </p>
 * <p>
 * For current minimum and maximum provisioned throughput values, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
 * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 */
public class ProvisionedThroughput implements Serializable {
    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <i>ThrottlingException</i>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long readCapacityUnits;

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <i>ThrottlingException</i>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long writeCapacityUnits;

    /**
     * Default constructor for ProvisionedThroughput object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     */
    public ProvisionedThroughput() {
    }

    /**
     * Constructs a new ProvisionedThroughput object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param readCapacityUnits <p>
     *            The maximum number of strongly consistent reads consumed per
     *            second before DynamoDB returns a <i>ThrottlingException</i>.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     * @param writeCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <i>ThrottlingException</i>. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     */
    public ProvisionedThroughput(Long readCapacityUnits, Long writeCapacityUnits) {
        setReadCapacityUnits(readCapacityUnits);
        setWriteCapacityUnits(writeCapacityUnits);
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <i>ThrottlingException</i>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of strongly consistent reads consumed per
     *         second before DynamoDB returns a <i>ThrottlingException</i>. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *         >Specifying Read and Write Requirements</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     *         </p>
     */
    public Long getReadCapacityUnits() {
        return readCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <i>ThrottlingException</i>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits <p>
     *            The maximum number of strongly consistent reads consumed per
     *            second before DynamoDB returns a <i>ThrottlingException</i>.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <i>ThrottlingException</i>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits <p>
     *            The maximum number of strongly consistent reads consumed per
     *            second before DynamoDB returns a <i>ThrottlingException</i>.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedThroughput withReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <i>ThrottlingException</i>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of writes consumed per second before DynamoDB
     *         returns a <i>ThrottlingException</i>. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *         >Specifying Read and Write Requirements</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     *         </p>
     */
    public Long getWriteCapacityUnits() {
        return writeCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <i>ThrottlingException</i>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param writeCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <i>ThrottlingException</i>. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setWriteCapacityUnits(Long writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <i>ThrottlingException</i>. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     * >Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param writeCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <i>ThrottlingException</i>. For more
     *            information, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput"
     *            >Specifying Read and Write Requirements</a> in the <i>Amazon
     *            DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedThroughput withWriteCapacityUnits(Long writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
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
        if (getReadCapacityUnits() != null)
            sb.append("ReadCapacityUnits: " + getReadCapacityUnits() + ",");
        if (getWriteCapacityUnits() != null)
            sb.append("WriteCapacityUnits: " + getWriteCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReadCapacityUnits() == null) ? 0 : getReadCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getWriteCapacityUnits() == null) ? 0 : getWriteCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedThroughput == false)
            return false;
        ProvisionedThroughput other = (ProvisionedThroughput) obj;

        if (other.getReadCapacityUnits() == null ^ this.getReadCapacityUnits() == null)
            return false;
        if (other.getReadCapacityUnits() != null
                && other.getReadCapacityUnits().equals(this.getReadCapacityUnits()) == false)
            return false;
        if (other.getWriteCapacityUnits() == null ^ this.getWriteCapacityUnits() == null)
            return false;
        if (other.getWriteCapacityUnits() != null
                && other.getWriteCapacityUnits().equals(this.getWriteCapacityUnits()) == false)
            return false;
        return true;
    }
}
