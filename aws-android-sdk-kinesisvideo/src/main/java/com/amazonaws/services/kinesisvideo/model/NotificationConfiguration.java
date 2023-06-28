/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * The structure that contains the notification information for the KVS images
 * delivery. If this parameter is null, the configuration will be deleted from
 * the stream.
 * </p>
 */
public class NotificationConfiguration implements Serializable {
    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String status;

    /**
     * <p>
     * The destination information required to deliver a notification to a
     * customer.
     * </p>
     */
    private NotificationDestinationConfig destinationConfig;

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Indicates if a notification configuration is enabled or disabled.
     *         </p>
     * @see ConfigurationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Indicates if a notification configuration is enabled or
     *            disabled.
     *            </p>
     * @see ConfigurationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Indicates if a notification configuration is enabled or
     *            disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConfigurationStatus
     */
    public NotificationConfiguration withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Indicates if a notification configuration is enabled or
     *            disabled.
     *            </p>
     * @see ConfigurationStatus
     */
    public void setStatus(ConfigurationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Indicates if a notification configuration is enabled or disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Indicates if a notification configuration is enabled or
     *            disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ConfigurationStatus
     */
    public NotificationConfiguration withStatus(ConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The destination information required to deliver a notification to a
     * customer.
     * </p>
     *
     * @return <p>
     *         The destination information required to deliver a notification to
     *         a customer.
     *         </p>
     */
    public NotificationDestinationConfig getDestinationConfig() {
        return destinationConfig;
    }

    /**
     * <p>
     * The destination information required to deliver a notification to a
     * customer.
     * </p>
     *
     * @param destinationConfig <p>
     *            The destination information required to deliver a notification
     *            to a customer.
     *            </p>
     */
    public void setDestinationConfig(NotificationDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * The destination information required to deliver a notification to a
     * customer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationConfig <p>
     *            The destination information required to deliver a notification
     *            to a customer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfiguration withDestinationConfig(
            NotificationDestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: " + getDestinationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfiguration == false)
            return false;
        NotificationConfiguration other = (NotificationConfiguration) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null
                && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        return true;
    }
}
