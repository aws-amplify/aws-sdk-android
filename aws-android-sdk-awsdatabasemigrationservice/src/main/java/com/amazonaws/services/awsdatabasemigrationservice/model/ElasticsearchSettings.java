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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information that defines an Elasticsearch endpoint.
 * </p>
 */
public class ElasticsearchSettings implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) used by service to access the IAM role.
     * </p>
     */
    private String serviceAccessRoleArn;

    /**
     * <p>
     * The endpoint for the Elasticsearch cluster.
     * </p>
     */
    private String endpointUri;

    /**
     * <p>
     * The maximum percentage of records that can fail to be written before a
     * full load operation stops.
     * </p>
     */
    private Integer fullLoadErrorPercentage;

    /**
     * <p>
     * The maximum number of seconds for which DMS retries failed API requests
     * to the Elasticsearch cluster.
     * </p>
     */
    private Integer errorRetryDuration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by service to access the IAM role.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) used by service to access the IAM
     *         role.
     *         </p>
     */
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by service to access the IAM role.
     * </p>
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) used by service to access the
     *            IAM role.
     *            </p>
     */
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by service to access the IAM role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceAccessRoleArn <p>
     *            The Amazon Resource Name (ARN) used by service to access the
     *            IAM role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchSettings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * <p>
     * The endpoint for the Elasticsearch cluster.
     * </p>
     *
     * @return <p>
     *         The endpoint for the Elasticsearch cluster.
     *         </p>
     */
    public String getEndpointUri() {
        return endpointUri;
    }

    /**
     * <p>
     * The endpoint for the Elasticsearch cluster.
     * </p>
     *
     * @param endpointUri <p>
     *            The endpoint for the Elasticsearch cluster.
     *            </p>
     */
    public void setEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
    }

    /**
     * <p>
     * The endpoint for the Elasticsearch cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointUri <p>
     *            The endpoint for the Elasticsearch cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchSettings withEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * <p>
     * The maximum percentage of records that can fail to be written before a
     * full load operation stops.
     * </p>
     *
     * @return <p>
     *         The maximum percentage of records that can fail to be written
     *         before a full load operation stops.
     *         </p>
     */
    public Integer getFullLoadErrorPercentage() {
        return fullLoadErrorPercentage;
    }

    /**
     * <p>
     * The maximum percentage of records that can fail to be written before a
     * full load operation stops.
     * </p>
     *
     * @param fullLoadErrorPercentage <p>
     *            The maximum percentage of records that can fail to be written
     *            before a full load operation stops.
     *            </p>
     */
    public void setFullLoadErrorPercentage(Integer fullLoadErrorPercentage) {
        this.fullLoadErrorPercentage = fullLoadErrorPercentage;
    }

    /**
     * <p>
     * The maximum percentage of records that can fail to be written before a
     * full load operation stops.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fullLoadErrorPercentage <p>
     *            The maximum percentage of records that can fail to be written
     *            before a full load operation stops.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchSettings withFullLoadErrorPercentage(Integer fullLoadErrorPercentage) {
        this.fullLoadErrorPercentage = fullLoadErrorPercentage;
        return this;
    }

    /**
     * <p>
     * The maximum number of seconds for which DMS retries failed API requests
     * to the Elasticsearch cluster.
     * </p>
     *
     * @return <p>
     *         The maximum number of seconds for which DMS retries failed API
     *         requests to the Elasticsearch cluster.
     *         </p>
     */
    public Integer getErrorRetryDuration() {
        return errorRetryDuration;
    }

    /**
     * <p>
     * The maximum number of seconds for which DMS retries failed API requests
     * to the Elasticsearch cluster.
     * </p>
     *
     * @param errorRetryDuration <p>
     *            The maximum number of seconds for which DMS retries failed API
     *            requests to the Elasticsearch cluster.
     *            </p>
     */
    public void setErrorRetryDuration(Integer errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
    }

    /**
     * <p>
     * The maximum number of seconds for which DMS retries failed API requests
     * to the Elasticsearch cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorRetryDuration <p>
     *            The maximum number of seconds for which DMS retries failed API
     *            requests to the Elasticsearch cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticsearchSettings withErrorRetryDuration(Integer errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
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
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: " + getServiceAccessRoleArn() + ",");
        if (getEndpointUri() != null)
            sb.append("EndpointUri: " + getEndpointUri() + ",");
        if (getFullLoadErrorPercentage() != null)
            sb.append("FullLoadErrorPercentage: " + getFullLoadErrorPercentage() + ",");
        if (getErrorRetryDuration() != null)
            sb.append("ErrorRetryDuration: " + getErrorRetryDuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointUri() == null) ? 0 : getEndpointUri().hashCode());
        hashCode = prime
                * hashCode
                + ((getFullLoadErrorPercentage() == null) ? 0 : getFullLoadErrorPercentage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getErrorRetryDuration() == null) ? 0 : getErrorRetryDuration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchSettings == false)
            return false;
        ElasticsearchSettings other = (ElasticsearchSettings) obj;

        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null
                && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getEndpointUri() == null ^ this.getEndpointUri() == null)
            return false;
        if (other.getEndpointUri() != null
                && other.getEndpointUri().equals(this.getEndpointUri()) == false)
            return false;
        if (other.getFullLoadErrorPercentage() == null ^ this.getFullLoadErrorPercentage() == null)
            return false;
        if (other.getFullLoadErrorPercentage() != null
                && other.getFullLoadErrorPercentage().equals(this.getFullLoadErrorPercentage()) == false)
            return false;
        if (other.getErrorRetryDuration() == null ^ this.getErrorRetryDuration() == null)
            return false;
        if (other.getErrorRetryDuration() != null
                && other.getErrorRetryDuration().equals(this.getErrorRetryDuration()) == false)
            return false;
        return true;
    }
}
