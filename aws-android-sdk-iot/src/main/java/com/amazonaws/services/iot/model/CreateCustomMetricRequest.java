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
 * Use this API to define a Custom Metric published by your devices to Device
 * Defender.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateCustomMetric</a> action.
 * </p>
 */
public class CreateCustomMetricRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the custom metric. This will be used in the metric report
     * submitted from the device/thing. Shouldn't begin with <code>aws:</code>.
     * Cannot be updated once defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String metricName;

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; it
     * doesn't have to be unique. Don't use this name as the metric identifier
     * in the device metric report. Can be updated once defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     */
    private String displayName;

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>,
     * <code>ip-address-list</code>, <code>number-list</code>, and
     * <code>number</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string-list, ip-address-list, number-list, number
     */
    private String metricType;

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Each custom metric must have a unique client request token. If you try to
     * create a new custom metric that already exists with a different token, an
     * exception occurs. If you omit this value, Amazon Web Services SDKs will
     * automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the custom metric. This will be used in the metric report
     * submitted from the device/thing. Shouldn't begin with <code>aws:</code>.
     * Cannot be updated once defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the custom metric. This will be used in the metric
     *         report submitted from the device/thing. Shouldn't begin with
     *         <code>aws:</code>. Cannot be updated once defined.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the custom metric. This will be used in the metric report
     * submitted from the device/thing. Shouldn't begin with <code>aws:</code>.
     * Cannot be updated once defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param metricName <p>
     *            The name of the custom metric. This will be used in the metric
     *            report submitted from the device/thing. Shouldn't begin with
     *            <code>aws:</code>. Cannot be updated once defined.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the custom metric. This will be used in the metric report
     * submitted from the device/thing. Shouldn't begin with <code>aws:</code>.
     * Cannot be updated once defined.
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
     *            The name of the custom metric. This will be used in the metric
     *            report submitted from the device/thing. Shouldn't begin with
     *            <code>aws:</code>. Cannot be updated once defined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomMetricRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; it
     * doesn't have to be unique. Don't use this name as the metric identifier
     * in the device metric report. Can be updated once defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @return <p>
     *         Field represents a friendly name in the console for the custom
     *         metric; it doesn't have to be unique. Don't use this name as the
     *         metric identifier in the device metric report. Can be updated
     *         once defined.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; it
     * doesn't have to be unique. Don't use this name as the metric identifier
     * in the device metric report. Can be updated once defined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 128<br/>
     * <b>Pattern: </b>[\p{Graph}\x20]*<br/>
     *
     * @param displayName <p>
     *            Field represents a friendly name in the console for the custom
     *            metric; it doesn't have to be unique. Don't use this name as
     *            the metric identifier in the device metric report. Can be
     *            updated once defined.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric; it
     * doesn't have to be unique. Don't use this name as the metric identifier
     * in the device metric report. Can be updated once defined.
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
     *            metric; it doesn't have to be unique. Don't use this name as
     *            the metric identifier in the device metric report. Can be
     *            updated once defined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomMetricRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>,
     * <code>ip-address-list</code>, <code>number-list</code>, and
     * <code>number</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string-list, ip-address-list, number-list, number
     *
     * @return <p>
     *         The type of the custom metric. Types include
     *         <code>string-list</code>, <code>ip-address-list</code>,
     *         <code>number-list</code>, and <code>number</code>.
     *         </p>
     * @see CustomMetricType
     */
    public String getMetricType() {
        return metricType;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>,
     * <code>ip-address-list</code>, <code>number-list</code>, and
     * <code>number</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string-list, ip-address-list, number-list, number
     *
     * @param metricType <p>
     *            The type of the custom metric. Types include
     *            <code>string-list</code>, <code>ip-address-list</code>,
     *            <code>number-list</code>, and <code>number</code>.
     *            </p>
     * @see CustomMetricType
     */
    public void setMetricType(String metricType) {
        this.metricType = metricType;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>,
     * <code>ip-address-list</code>, <code>number-list</code>, and
     * <code>number</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string-list, ip-address-list, number-list, number
     *
     * @param metricType <p>
     *            The type of the custom metric. Types include
     *            <code>string-list</code>, <code>ip-address-list</code>,
     *            <code>number-list</code>, and <code>number</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomMetricType
     */
    public CreateCustomMetricRequest withMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>,
     * <code>ip-address-list</code>, <code>number-list</code>, and
     * <code>number</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string-list, ip-address-list, number-list, number
     *
     * @param metricType <p>
     *            The type of the custom metric. Types include
     *            <code>string-list</code>, <code>ip-address-list</code>,
     *            <code>number-list</code>, and <code>number</code>.
     *            </p>
     * @see CustomMetricType
     */
    public void setMetricType(CustomMetricType metricType) {
        this.metricType = metricType.toString();
    }

    /**
     * <p>
     * The type of the custom metric. Types include <code>string-list</code>,
     * <code>ip-address-list</code>, <code>number-list</code>, and
     * <code>number</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string-list, ip-address-list, number-list, number
     *
     * @param metricType <p>
     *            The type of the custom metric. Types include
     *            <code>string-list</code>, <code>ip-address-list</code>,
     *            <code>number-list</code>, and <code>number</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CustomMetricType
     */
    public CreateCustomMetricRequest withMetricType(CustomMetricType metricType) {
        this.metricType = metricType.toString();
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     *
     * @return <p>
     *         Metadata that can be used to manage the custom metric.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     *
     * @param tags <p>
     *            Metadata that can be used to manage the custom metric.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the custom metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomMetricRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the custom metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata that can be used to manage the custom metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomMetricRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Each custom metric must have a unique client request token. If you try to
     * create a new custom metric that already exists with a different token, an
     * exception occurs. If you omit this value, Amazon Web Services SDKs will
     * automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Each custom metric must have a unique client request token. If
     *         you try to create a new custom metric that already exists with a
     *         different token, an exception occurs. If you omit this value,
     *         Amazon Web Services SDKs will automatically generate a unique
     *         client request.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Each custom metric must have a unique client request token. If you try to
     * create a new custom metric that already exists with a different token, an
     * exception occurs. If you omit this value, Amazon Web Services SDKs will
     * automatically generate a unique client request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each custom metric must have a unique client request token. If
     *            you try to create a new custom metric that already exists with
     *            a different token, an exception occurs. If you omit this
     *            value, Amazon Web Services SDKs will automatically generate a
     *            unique client request.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Each custom metric must have a unique client request token. If you try to
     * create a new custom metric that already exists with a different token, an
     * exception occurs. If you omit this value, Amazon Web Services SDKs will
     * automatically generate a unique client request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Each custom metric must have a unique client request token. If
     *            you try to create a new custom metric that already exists with
     *            a different token, an exception occurs. If you omit this
     *            value, Amazon Web Services SDKs will automatically generate a
     *            unique client request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCustomMetricRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
            sb.append("displayName: " + getDisplayName() + ",");
        if (getMetricType() != null)
            sb.append("metricType: " + getMetricType() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getClientRequestToken() != null)
            sb.append("clientRequestToken: " + getClientRequestToken());
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
        hashCode = prime * hashCode + ((getMetricType() == null) ? 0 : getMetricType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomMetricRequest == false)
            return false;
        CreateCustomMetricRequest other = (CreateCustomMetricRequest) obj;

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
        if (other.getMetricType() == null ^ this.getMetricType() == null)
            return false;
        if (other.getMetricType() != null
                && other.getMetricType().equals(this.getMetricType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
