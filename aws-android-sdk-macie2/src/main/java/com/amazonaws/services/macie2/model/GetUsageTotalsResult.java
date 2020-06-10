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

public class GetUsageTotalsResult implements Serializable {
    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for a specific usage metric.
     * </p>
     */
    private java.util.List<UsageTotal> usageTotals;

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for a specific usage metric.
     * </p>
     *
     * @return <p>
     *         An array of objects that contains the results of the query. Each
     *         object contains the data for a specific usage metric.
     *         </p>
     */
    public java.util.List<UsageTotal> getUsageTotals() {
        return usageTotals;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for a specific usage metric.
     * </p>
     *
     * @param usageTotals <p>
     *            An array of objects that contains the results of the query.
     *            Each object contains the data for a specific usage metric.
     *            </p>
     */
    public void setUsageTotals(java.util.Collection<UsageTotal> usageTotals) {
        if (usageTotals == null) {
            this.usageTotals = null;
            return;
        }

        this.usageTotals = new java.util.ArrayList<UsageTotal>(usageTotals);
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for a specific usage metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageTotals <p>
     *            An array of objects that contains the results of the query.
     *            Each object contains the data for a specific usage metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageTotalsResult withUsageTotals(UsageTotal... usageTotals) {
        if (getUsageTotals() == null) {
            this.usageTotals = new java.util.ArrayList<UsageTotal>(usageTotals.length);
        }
        for (UsageTotal value : usageTotals) {
            this.usageTotals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object
     * contains the data for a specific usage metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usageTotals <p>
     *            An array of objects that contains the results of the query.
     *            Each object contains the data for a specific usage metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsageTotalsResult withUsageTotals(java.util.Collection<UsageTotal> usageTotals) {
        setUsageTotals(usageTotals);
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
        if (getUsageTotals() != null)
            sb.append("usageTotals: " + getUsageTotals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsageTotals() == null) ? 0 : getUsageTotals().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsageTotalsResult == false)
            return false;
        GetUsageTotalsResult other = (GetUsageTotalsResult) obj;

        if (other.getUsageTotals() == null ^ this.getUsageTotals() == null)
            return false;
        if (other.getUsageTotals() != null
                && other.getUsageTotals().equals(this.getUsageTotals()) == false)
            return false;
        return true;
    }
}
