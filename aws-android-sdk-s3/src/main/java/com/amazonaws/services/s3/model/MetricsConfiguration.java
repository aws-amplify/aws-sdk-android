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
 * Specifies a metrics configuration for the CloudWatch request metrics
 * (specified by the metrics configuration ID) from an Amazon S3 bucket. If
 * you're updating an existing metrics configuration, note that this is a full
 * replacement of the existing metrics configuration. If you don't include the
 * elements you want to keep, they are erased. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html"
 * > PUT Bucket metrics</a> in the <i>Amazon Simple Storage Service API
 * Reference</i>.
 * </p>
 */
public class MetricsConfiguration implements Serializable {
    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Specifies a metrics configuration filter. The metrics configuration will
     * only include objects that meet the filter's criteria. A filter must be a
     * prefix, a tag, or a conjunction (MetricsAndOperator).
     * </p>
     */
    private MetricsFilter filter;

    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     *
     * @return <p>
     *         The ID used to identify the metrics configuration.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     *
     * @param id <p>
     *            The ID used to identify the metrics configuration.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID used to identify the metrics configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The ID used to identify the metrics configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricsConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Specifies a metrics configuration filter. The metrics configuration will
     * only include objects that meet the filter's criteria. A filter must be a
     * prefix, a tag, or a conjunction (MetricsAndOperator).
     * </p>
     *
     * @return <p>
     *         Specifies a metrics configuration filter. The metrics
     *         configuration will only include objects that meet the filter's
     *         criteria. A filter must be a prefix, a tag, or a conjunction
     *         (MetricsAndOperator).
     *         </p>
     */
    public MetricsFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * Specifies a metrics configuration filter. The metrics configuration will
     * only include objects that meet the filter's criteria. A filter must be a
     * prefix, a tag, or a conjunction (MetricsAndOperator).
     * </p>
     *
     * @param filter <p>
     *            Specifies a metrics configuration filter. The metrics
     *            configuration will only include objects that meet the filter's
     *            criteria. A filter must be a prefix, a tag, or a conjunction
     *            (MetricsAndOperator).
     *            </p>
     */
    public void setFilter(MetricsFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Specifies a metrics configuration filter. The metrics configuration will
     * only include objects that meet the filter's criteria. A filter must be a
     * prefix, a tag, or a conjunction (MetricsAndOperator).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            Specifies a metrics configuration filter. The metrics
     *            configuration will only include objects that meet the filter's
     *            criteria. A filter must be a prefix, a tag, or a conjunction
     *            (MetricsAndOperator).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MetricsConfiguration withFilter(MetricsFilter filter) {
        this.filter = filter;
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
            sb.append("Filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricsConfiguration == false)
            return false;
        MetricsConfiguration other = (MetricsConfiguration) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }
}
