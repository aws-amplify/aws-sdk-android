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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>DescribeLimits</code> operation.
 * </p>
 */
public class DescribeLimitsResult implements Serializable {
    /**
     * <p>
     * The maximum total read capacity units that your account allows you to
     * provision across all of your tables in this region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long accountMaxReadCapacityUnits;

    /**
     * <p>
     * The maximum total write capacity units that your account allows you to
     * provision across all of your tables in this region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long accountMaxWriteCapacityUnits;

    /**
     * <p>
     * The maximum read capacity units that your account allows you to provision
     * for a new table that you are creating in this region, including the read
     * capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long tableMaxReadCapacityUnits;

    /**
     * <p>
     * The maximum write capacity units that your account allows you to
     * provision for a new table that you are creating in this region, including
     * the write capacity units provisioned for its global secondary indexes
     * (GSIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long tableMaxWriteCapacityUnits;

    /**
     * <p>
     * The maximum total read capacity units that your account allows you to
     * provision across all of your tables in this region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum total read capacity units that your account allows
     *         you to provision across all of your tables in this region.
     *         </p>
     */
    public Long getAccountMaxReadCapacityUnits() {
        return accountMaxReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum total read capacity units that your account allows you to
     * provision across all of your tables in this region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param accountMaxReadCapacityUnits <p>
     *            The maximum total read capacity units that your account allows
     *            you to provision across all of your tables in this region.
     *            </p>
     */
    public void setAccountMaxReadCapacityUnits(Long accountMaxReadCapacityUnits) {
        this.accountMaxReadCapacityUnits = accountMaxReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum total read capacity units that your account allows you to
     * provision across all of your tables in this region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param accountMaxReadCapacityUnits <p>
     *            The maximum total read capacity units that your account allows
     *            you to provision across all of your tables in this region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLimitsResult withAccountMaxReadCapacityUnits(Long accountMaxReadCapacityUnits) {
        this.accountMaxReadCapacityUnits = accountMaxReadCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The maximum total write capacity units that your account allows you to
     * provision across all of your tables in this region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum total write capacity units that your account allows
     *         you to provision across all of your tables in this region.
     *         </p>
     */
    public Long getAccountMaxWriteCapacityUnits() {
        return accountMaxWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum total write capacity units that your account allows you to
     * provision across all of your tables in this region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param accountMaxWriteCapacityUnits <p>
     *            The maximum total write capacity units that your account
     *            allows you to provision across all of your tables in this
     *            region.
     *            </p>
     */
    public void setAccountMaxWriteCapacityUnits(Long accountMaxWriteCapacityUnits) {
        this.accountMaxWriteCapacityUnits = accountMaxWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum total write capacity units that your account allows you to
     * provision across all of your tables in this region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param accountMaxWriteCapacityUnits <p>
     *            The maximum total write capacity units that your account
     *            allows you to provision across all of your tables in this
     *            region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLimitsResult withAccountMaxWriteCapacityUnits(Long accountMaxWriteCapacityUnits) {
        this.accountMaxWriteCapacityUnits = accountMaxWriteCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The maximum read capacity units that your account allows you to provision
     * for a new table that you are creating in this region, including the read
     * capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum read capacity units that your account allows you to
     *         provision for a new table that you are creating in this region,
     *         including the read capacity units provisioned for its global
     *         secondary indexes (GSIs).
     *         </p>
     */
    public Long getTableMaxReadCapacityUnits() {
        return tableMaxReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum read capacity units that your account allows you to provision
     * for a new table that you are creating in this region, including the read
     * capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param tableMaxReadCapacityUnits <p>
     *            The maximum read capacity units that your account allows you
     *            to provision for a new table that you are creating in this
     *            region, including the read capacity units provisioned for its
     *            global secondary indexes (GSIs).
     *            </p>
     */
    public void setTableMaxReadCapacityUnits(Long tableMaxReadCapacityUnits) {
        this.tableMaxReadCapacityUnits = tableMaxReadCapacityUnits;
    }

    /**
     * <p>
     * The maximum read capacity units that your account allows you to provision
     * for a new table that you are creating in this region, including the read
     * capacity units provisioned for its global secondary indexes (GSIs).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param tableMaxReadCapacityUnits <p>
     *            The maximum read capacity units that your account allows you
     *            to provision for a new table that you are creating in this
     *            region, including the read capacity units provisioned for its
     *            global secondary indexes (GSIs).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLimitsResult withTableMaxReadCapacityUnits(Long tableMaxReadCapacityUnits) {
        this.tableMaxReadCapacityUnits = tableMaxReadCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The maximum write capacity units that your account allows you to
     * provision for a new table that you are creating in this region, including
     * the write capacity units provisioned for its global secondary indexes
     * (GSIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum write capacity units that your account allows you to
     *         provision for a new table that you are creating in this region,
     *         including the write capacity units provisioned for its global
     *         secondary indexes (GSIs).
     *         </p>
     */
    public Long getTableMaxWriteCapacityUnits() {
        return tableMaxWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum write capacity units that your account allows you to
     * provision for a new table that you are creating in this region, including
     * the write capacity units provisioned for its global secondary indexes
     * (GSIs).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param tableMaxWriteCapacityUnits <p>
     *            The maximum write capacity units that your account allows you
     *            to provision for a new table that you are creating in this
     *            region, including the write capacity units provisioned for its
     *            global secondary indexes (GSIs).
     *            </p>
     */
    public void setTableMaxWriteCapacityUnits(Long tableMaxWriteCapacityUnits) {
        this.tableMaxWriteCapacityUnits = tableMaxWriteCapacityUnits;
    }

    /**
     * <p>
     * The maximum write capacity units that your account allows you to
     * provision for a new table that you are creating in this region, including
     * the write capacity units provisioned for its global secondary indexes
     * (GSIs).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param tableMaxWriteCapacityUnits <p>
     *            The maximum write capacity units that your account allows you
     *            to provision for a new table that you are creating in this
     *            region, including the write capacity units provisioned for its
     *            global secondary indexes (GSIs).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLimitsResult withTableMaxWriteCapacityUnits(Long tableMaxWriteCapacityUnits) {
        this.tableMaxWriteCapacityUnits = tableMaxWriteCapacityUnits;
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
        if (getAccountMaxReadCapacityUnits() != null)
            sb.append("AccountMaxReadCapacityUnits: " + getAccountMaxReadCapacityUnits() + ",");
        if (getAccountMaxWriteCapacityUnits() != null)
            sb.append("AccountMaxWriteCapacityUnits: " + getAccountMaxWriteCapacityUnits() + ",");
        if (getTableMaxReadCapacityUnits() != null)
            sb.append("TableMaxReadCapacityUnits: " + getTableMaxReadCapacityUnits() + ",");
        if (getTableMaxWriteCapacityUnits() != null)
            sb.append("TableMaxWriteCapacityUnits: " + getTableMaxWriteCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAccountMaxReadCapacityUnits() == null) ? 0
                        : getAccountMaxReadCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountMaxWriteCapacityUnits() == null) ? 0
                        : getAccountMaxWriteCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getTableMaxReadCapacityUnits() == null) ? 0 : getTableMaxReadCapacityUnits()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTableMaxWriteCapacityUnits() == null) ? 0 : getTableMaxWriteCapacityUnits()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLimitsResult == false)
            return false;
        DescribeLimitsResult other = (DescribeLimitsResult) obj;

        if (other.getAccountMaxReadCapacityUnits() == null
                ^ this.getAccountMaxReadCapacityUnits() == null)
            return false;
        if (other.getAccountMaxReadCapacityUnits() != null
                && other.getAccountMaxReadCapacityUnits().equals(
                        this.getAccountMaxReadCapacityUnits()) == false)
            return false;
        if (other.getAccountMaxWriteCapacityUnits() == null
                ^ this.getAccountMaxWriteCapacityUnits() == null)
            return false;
        if (other.getAccountMaxWriteCapacityUnits() != null
                && other.getAccountMaxWriteCapacityUnits().equals(
                        this.getAccountMaxWriteCapacityUnits()) == false)
            return false;
        if (other.getTableMaxReadCapacityUnits() == null
                ^ this.getTableMaxReadCapacityUnits() == null)
            return false;
        if (other.getTableMaxReadCapacityUnits() != null
                && other.getTableMaxReadCapacityUnits().equals(this.getTableMaxReadCapacityUnits()) == false)
            return false;
        if (other.getTableMaxWriteCapacityUnits() == null
                ^ this.getTableMaxWriteCapacityUnits() == null)
            return false;
        if (other.getTableMaxWriteCapacityUnits() != null
                && other.getTableMaxWriteCapacityUnits().equals(
                        this.getTableMaxWriteCapacityUnits()) == false)
            return false;
        return true;
    }
}
