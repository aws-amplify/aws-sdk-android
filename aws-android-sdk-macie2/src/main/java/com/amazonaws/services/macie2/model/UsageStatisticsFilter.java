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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies criteria for filtering the results of a query for account quotas
 * and usage data.
 * </p>
 */
public class UsageStatisticsFilter implements Serializable {
    /**
     * <p>
     * The field to use to filter the results. The only supported value is
     * accountId.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accountId
     */
    private String key;

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the
     * results.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The field to use to filter the results. The only supported value is
     * accountId.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accountId
     *
     * @return <p>
     *         The field to use to filter the results. The only supported value
     *         is accountId.
     *         </p>
     * @see UsageStatisticsFilterKey
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The field to use to filter the results. The only supported value is
     * accountId.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accountId
     *
     * @param key <p>
     *            The field to use to filter the results. The only supported
     *            value is accountId.
     *            </p>
     * @see UsageStatisticsFilterKey
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The field to use to filter the results. The only supported value is
     * accountId.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accountId
     *
     * @param key <p>
     *            The field to use to filter the results. The only supported
     *            value is accountId.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageStatisticsFilterKey
     */
    public UsageStatisticsFilter withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The field to use to filter the results. The only supported value is
     * accountId.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accountId
     *
     * @param key <p>
     *            The field to use to filter the results. The only supported
     *            value is accountId.
     *            </p>
     * @see UsageStatisticsFilterKey
     */
    public void setKey(UsageStatisticsFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>
     * The field to use to filter the results. The only supported value is
     * accountId.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>accountId
     *
     * @param key <p>
     *            The field to use to filter the results. The only supported
     *            value is accountId.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UsageStatisticsFilterKey
     */
    public UsageStatisticsFilter withKey(UsageStatisticsFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the
     * results.
     * </p>
     *
     * @return <p>
     *         An array that lists the AWS account ID for each account to
     *         include in the results.
     *         </p>
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the
     * results.
     * </p>
     *
     * @param values <p>
     *            An array that lists the AWS account ID for each account to
     *            include in the results.
     *            </p>
     */
    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            An array that lists the AWS account ID for each account to
     *            include in the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageStatisticsFilter withValues(String... values) {
        if (getValues() == null) {
            this.values = new java.util.ArrayList<String>(values.length);
        }
        for (String value : values) {
            this.values.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param values <p>
     *            An array that lists the AWS account ID for each account to
     *            include in the results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UsageStatisticsFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getValues() != null)
            sb.append("values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageStatisticsFilter == false)
            return false;
        UsageStatisticsFilter other = (UsageStatisticsFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }
}
