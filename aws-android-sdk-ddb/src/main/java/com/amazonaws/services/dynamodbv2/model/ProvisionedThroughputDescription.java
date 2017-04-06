/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the provisioned throughput settings for the table, consisting of
 * read and write capacity units, along with data about increases and decreases.
 * </p>
 */
public class ProvisionedThroughputDescription implements Serializable {
    /**
     * <p>
     * The date and time of the last provisioned throughput increase for this
     * table.
     * </p>
     */
    private java.util.Date lastIncreaseDateTime;

    /**
     * <p>
     * The date and time of the last provisioned throughput decrease for this
     * table.
     * </p>
     */
    private java.util.Date lastDecreaseDateTime;

    /**
     * <p>
     * The number of provisioned throughput decreases for this table during this
     * UTC calendar day. For current maximums on provisioned throughput
     * decreases, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long numberOfDecreasesToday;

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <i>ThrottlingException</i>. Eventually
     * consistent reads require less effort than strongly consistent reads, so a
     * setting of 50 <i>ReadCapacityUnits</i> per second provides 100 eventually
     * consistent <i>ReadCapacityUnits</i> per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long readCapacityUnits;

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <i>ThrottlingException</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long writeCapacityUnits;

    /**
     * <p>
     * The date and time of the last provisioned throughput increase for this
     * table.
     * </p>
     *
     * @return <p>
     *         The date and time of the last provisioned throughput increase for
     *         this table.
     *         </p>
     */
    public java.util.Date getLastIncreaseDateTime() {
        return lastIncreaseDateTime;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput increase for this
     * table.
     * </p>
     *
     * @param lastIncreaseDateTime <p>
     *            The date and time of the last provisioned throughput increase
     *            for this table.
     *            </p>
     */
    public void setLastIncreaseDateTime(java.util.Date lastIncreaseDateTime) {
        this.lastIncreaseDateTime = lastIncreaseDateTime;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput increase for this
     * table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastIncreaseDateTime <p>
     *            The date and time of the last provisioned throughput increase
     *            for this table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedThroughputDescription withLastIncreaseDateTime(
            java.util.Date lastIncreaseDateTime) {
        this.lastIncreaseDateTime = lastIncreaseDateTime;
        return this;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput decrease for this
     * table.
     * </p>
     *
     * @return <p>
     *         The date and time of the last provisioned throughput decrease for
     *         this table.
     *         </p>
     */
    public java.util.Date getLastDecreaseDateTime() {
        return lastDecreaseDateTime;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput decrease for this
     * table.
     * </p>
     *
     * @param lastDecreaseDateTime <p>
     *            The date and time of the last provisioned throughput decrease
     *            for this table.
     *            </p>
     */
    public void setLastDecreaseDateTime(java.util.Date lastDecreaseDateTime) {
        this.lastDecreaseDateTime = lastDecreaseDateTime;
    }

    /**
     * <p>
     * The date and time of the last provisioned throughput decrease for this
     * table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastDecreaseDateTime <p>
     *            The date and time of the last provisioned throughput decrease
     *            for this table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedThroughputDescription withLastDecreaseDateTime(
            java.util.Date lastDecreaseDateTime) {
        this.lastDecreaseDateTime = lastDecreaseDateTime;
        return this;
    }

    /**
     * <p>
     * The number of provisioned throughput decreases for this table during this
     * UTC calendar day. For current maximums on provisioned throughput
     * decreases, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of provisioned throughput decreases for this table
     *         during this UTC calendar day. For current maximums on provisioned
     *         throughput decreases, see <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     *         >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *         </p>
     */
    public Long getNumberOfDecreasesToday() {
        return numberOfDecreasesToday;
    }

    /**
     * <p>
     * The number of provisioned throughput decreases for this table during this
     * UTC calendar day. For current maximums on provisioned throughput
     * decreases, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfDecreasesToday <p>
     *            The number of provisioned throughput decreases for this table
     *            during this UTC calendar day. For current maximums on
     *            provisioned throughput decreases, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     *            >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     */
    public void setNumberOfDecreasesToday(Long numberOfDecreasesToday) {
        this.numberOfDecreasesToday = numberOfDecreasesToday;
    }

    /**
     * <p>
     * The number of provisioned throughput decreases for this table during this
     * UTC calendar day. For current maximums on provisioned throughput
     * decreases, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param numberOfDecreasesToday <p>
     *            The number of provisioned throughput decreases for this table
     *            during this UTC calendar day. For current maximums on
     *            provisioned throughput decreases, see <a href=
     *            "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     *            >Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedThroughputDescription withNumberOfDecreasesToday(Long numberOfDecreasesToday) {
        this.numberOfDecreasesToday = numberOfDecreasesToday;
        return this;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <i>ThrottlingException</i>. Eventually
     * consistent reads require less effort than strongly consistent reads, so a
     * setting of 50 <i>ReadCapacityUnits</i> per second provides 100 eventually
     * consistent <i>ReadCapacityUnits</i> per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of strongly consistent reads consumed per
     *         second before DynamoDB returns a <i>ThrottlingException</i>.
     *         Eventually consistent reads require less effort than strongly
     *         consistent reads, so a setting of 50 <i>ReadCapacityUnits</i> per
     *         second provides 100 eventually consistent
     *         <i>ReadCapacityUnits</i> per second.
     *         </p>
     */
    public Long getReadCapacityUnits() {
        return readCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <i>ThrottlingException</i>. Eventually
     * consistent reads require less effort than strongly consistent reads, so a
     * setting of 50 <i>ReadCapacityUnits</i> per second provides 100 eventually
     * consistent <i>ReadCapacityUnits</i> per second.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param readCapacityUnits <p>
     *            The maximum number of strongly consistent reads consumed per
     *            second before DynamoDB returns a <i>ThrottlingException</i>.
     *            Eventually consistent reads require less effort than strongly
     *            consistent reads, so a setting of 50 <i>ReadCapacityUnits</i>
     *            per second provides 100 eventually consistent
     *            <i>ReadCapacityUnits</i> per second.
     *            </p>
     */
    public void setReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of strongly consistent reads consumed per second
     * before DynamoDB returns a <i>ThrottlingException</i>. Eventually
     * consistent reads require less effort than strongly consistent reads, so a
     * setting of 50 <i>ReadCapacityUnits</i> per second provides 100 eventually
     * consistent <i>ReadCapacityUnits</i> per second.
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
     *            Eventually consistent reads require less effort than strongly
     *            consistent reads, so a setting of 50 <i>ReadCapacityUnits</i>
     *            per second provides 100 eventually consistent
     *            <i>ReadCapacityUnits</i> per second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedThroughputDescription withReadCapacityUnits(Long readCapacityUnits) {
        this.readCapacityUnits = readCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <i>ThrottlingException</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of writes consumed per second before DynamoDB
     *         returns a <i>ThrottlingException</i>.
     *         </p>
     */
    public Long getWriteCapacityUnits() {
        return writeCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <i>ThrottlingException</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param writeCapacityUnits <p>
     *            The maximum number of writes consumed per second before
     *            DynamoDB returns a <i>ThrottlingException</i>.
     *            </p>
     */
    public void setWriteCapacityUnits(Long writeCapacityUnits) {
        this.writeCapacityUnits = writeCapacityUnits;
    }

    /**
     * <p>
     * The maximum number of writes consumed per second before DynamoDB returns
     * a <i>ThrottlingException</i>.
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
     *            DynamoDB returns a <i>ThrottlingException</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisionedThroughputDescription withWriteCapacityUnits(Long writeCapacityUnits) {
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
        if (getLastIncreaseDateTime() != null)
            sb.append("LastIncreaseDateTime: " + getLastIncreaseDateTime() + ",");
        if (getLastDecreaseDateTime() != null)
            sb.append("LastDecreaseDateTime: " + getLastDecreaseDateTime() + ",");
        if (getNumberOfDecreasesToday() != null)
            sb.append("NumberOfDecreasesToday: " + getNumberOfDecreasesToday() + ",");
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
                + ((getLastIncreaseDateTime() == null) ? 0 : getLastIncreaseDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastDecreaseDateTime() == null) ? 0 : getLastDecreaseDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfDecreasesToday() == null) ? 0 : getNumberOfDecreasesToday()
                        .hashCode());
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

        if (obj instanceof ProvisionedThroughputDescription == false)
            return false;
        ProvisionedThroughputDescription other = (ProvisionedThroughputDescription) obj;

        if (other.getLastIncreaseDateTime() == null ^ this.getLastIncreaseDateTime() == null)
            return false;
        if (other.getLastIncreaseDateTime() != null
                && other.getLastIncreaseDateTime().equals(this.getLastIncreaseDateTime()) == false)
            return false;
        if (other.getLastDecreaseDateTime() == null ^ this.getLastDecreaseDateTime() == null)
            return false;
        if (other.getLastDecreaseDateTime() != null
                && other.getLastDecreaseDateTime().equals(this.getLastDecreaseDateTime()) == false)
            return false;
        if (other.getNumberOfDecreasesToday() == null ^ this.getNumberOfDecreasesToday() == null)
            return false;
        if (other.getNumberOfDecreasesToday() != null
                && other.getNumberOfDecreasesToday().equals(this.getNumberOfDecreasesToday()) == false)
            return false;
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
