/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a Device Defender detect custom metric.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdateCustomMetric</a> action.
 * </p>
 */
public class UpdateCustomMetricRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom metric. Cannot be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String metricName;

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric, it
     * doesn't have to be unique. Don't use this name as the metric identifier
     * in the device metric report. Can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The name of the custom metric. Cannot be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the custom metric. Cannot be updated.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the custom metric. Cannot be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param metricName <p>
     *            The name of the custom metric. Cannot be updated.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the custom metric. Cannot be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param metricName <p>
     *            The name of the custom metric. Cannot be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomMetricRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric, it
     * doesn't have to be unique. Don't use this name as the metric identifier
     * in the device metric report. Can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         Field represents a friendly name in the console for the custom
     *         metric, it doesn't have to be unique. Don't use this name as the
     *         metric identifier in the device metric report. Can be updated.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric, it
     * doesn't have to be unique. Don't use this name as the metric identifier
     * in the device metric report. Can be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param displayName <p>
     *            Field represents a friendly name in the console for the custom
     *            metric, it doesn't have to be unique. Don't use this name as
     *            the metric identifier in the device metric report. Can be
     *            updated.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric, it
     * doesn't have to be unique. Don't use this name as the metric identifier
     * in the device metric report. Can be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param displayName <p>
     *            Field represents a friendly name in the console for the custom
     *            metric, it doesn't have to be unique. Don't use this name as
     *            the metric identifier in the device metric report. Can be
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCustomMetricRequest withDisplayName(String displayName) {
        this.displayName = displayName;
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
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getDisplayName() != null)
            sb.append("displayName: " + getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomMetricRequest == false)
            return false;
        UpdateCustomMetricRequest other = (UpdateCustomMetricRequest) obj;

        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }
}
