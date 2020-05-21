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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the configuration and any analyses for the analytics filter of an
 * Amazon S3 bucket.
 * </p>
 */
public class AnalyticsConfiguration implements Serializable {
    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The filter used to describe a set of objects for analyses. A filter must
     * have exactly one prefix, one tag, or one conjunction
     * (AnalyticsAndOperator). If no filter is provided, all objects will be
     * considered in any analysis.
     * </p>
     */
    private AnalyticsFilter filter;

    /**
     * <p>
     * Contains data related to access patterns to be collected and made
     * available to analyze the tradeoffs between different storage classes.
     * </p>
     */
    private StorageClassAnalysis storageClassAnalysis;

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     *
     * @return <p>
     *         The ID that identifies the analytics configuration.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     *
     * @param id <p>
     *            The ID that identifies the analytics configuration.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that identifies the analytics configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID that identifies the analytics configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The filter used to describe a set of objects for analyses. A filter must
     * have exactly one prefix, one tag, or one conjunction
     * (AnalyticsAndOperator). If no filter is provided, all objects will be
     * considered in any analysis.
     * </p>
     *
     * @return <p>
     *         The filter used to describe a set of objects for analyses. A
     *         filter must have exactly one prefix, one tag, or one conjunction
     *         (AnalyticsAndOperator). If no filter is provided, all objects
     *         will be considered in any analysis.
     *         </p>
     */
    public AnalyticsFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * The filter used to describe a set of objects for analyses. A filter must
     * have exactly one prefix, one tag, or one conjunction
     * (AnalyticsAndOperator). If no filter is provided, all objects will be
     * considered in any analysis.
     * </p>
     *
     * @param filter <p>
     *            The filter used to describe a set of objects for analyses. A
     *            filter must have exactly one prefix, one tag, or one
     *            conjunction (AnalyticsAndOperator). If no filter is provided,
     *            all objects will be considered in any analysis.
     *            </p>
     */
    public void setFilter(AnalyticsFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter used to describe a set of objects for analyses. A filter must
     * have exactly one prefix, one tag, or one conjunction
     * (AnalyticsAndOperator). If no filter is provided, all objects will be
     * considered in any analysis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The filter used to describe a set of objects for analyses. A
     *            filter must have exactly one prefix, one tag, or one
     *            conjunction (AnalyticsAndOperator). If no filter is provided,
     *            all objects will be considered in any analysis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsConfiguration withFilter(AnalyticsFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * Contains data related to access patterns to be collected and made
     * available to analyze the tradeoffs between different storage classes.
     * </p>
     *
     * @return <p>
     *         Contains data related to access patterns to be collected and made
     *         available to analyze the tradeoffs between different storage
     *         classes.
     *         </p>
     */
    public StorageClassAnalysis getStorageClassAnalysis() {
        return storageClassAnalysis;
    }

    /**
     * <p>
     * Contains data related to access patterns to be collected and made
     * available to analyze the tradeoffs between different storage classes.
     * </p>
     *
     * @param storageClassAnalysis <p>
     *            Contains data related to access patterns to be collected and
     *            made available to analyze the tradeoffs between different
     *            storage classes.
     *            </p>
     */
    public void setStorageClassAnalysis(StorageClassAnalysis storageClassAnalysis) {
        this.storageClassAnalysis = storageClassAnalysis;
    }

    /**
     * <p>
     * Contains data related to access patterns to be collected and made
     * available to analyze the tradeoffs between different storage classes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageClassAnalysis <p>
     *            Contains data related to access patterns to be collected and
     *            made available to analyze the tradeoffs between different
     *            storage classes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnalyticsConfiguration withStorageClassAnalysis(StorageClassAnalysis storageClassAnalysis) {
        this.storageClassAnalysis = storageClassAnalysis;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getStorageClassAnalysis() != null)
            sb.append("StorageClassAnalysis: " + getStorageClassAnalysis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClassAnalysis() == null) ? 0 : getStorageClassAnalysis().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsConfiguration == false)
            return false;
        AnalyticsConfiguration other = (AnalyticsConfiguration) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getStorageClassAnalysis() == null ^ this.getStorageClassAnalysis() == null)
            return false;
        if (other.getStorageClassAnalysis() != null
                && other.getStorageClassAnalysis().equals(this.getStorageClassAnalysis()) == false)
            return false;
        return true;
    }
}
