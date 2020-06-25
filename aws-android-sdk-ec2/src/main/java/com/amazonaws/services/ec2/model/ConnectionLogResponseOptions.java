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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the client connection logging options for a Client VPN
 * endpoint.
 * </p>
 */
public class ConnectionLogResponseOptions implements Serializable {
    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN
     * endpoint.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log group to which connection
     * logging data is published.
     * </p>
     */
    private String cloudwatchLogGroup;

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream to which connection
     * logging data is published.
     * </p>
     */
    private String cloudwatchLogStream;

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN
     * endpoint.
     * </p>
     *
     * @return <p>
     *         Indicates whether client connection logging is enabled for the
     *         Client VPN endpoint.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN
     * endpoint.
     * </p>
     *
     * @return <p>
     *         Indicates whether client connection logging is enabled for the
     *         Client VPN endpoint.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN
     * endpoint.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether client connection logging is enabled for the
     *            Client VPN endpoint.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether client connection logging is enabled for the Client VPN
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether client connection logging is enabled for the
     *            Client VPN endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionLogResponseOptions withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log group to which connection
     * logging data is published.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon CloudWatch Logs log group to which
     *         connection logging data is published.
     *         </p>
     */
    public String getCloudwatchLogGroup() {
        return cloudwatchLogGroup;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log group to which connection
     * logging data is published.
     * </p>
     *
     * @param cloudwatchLogGroup <p>
     *            The name of the Amazon CloudWatch Logs log group to which
     *            connection logging data is published.
     *            </p>
     */
    public void setCloudwatchLogGroup(String cloudwatchLogGroup) {
        this.cloudwatchLogGroup = cloudwatchLogGroup;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log group to which connection
     * logging data is published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchLogGroup <p>
     *            The name of the Amazon CloudWatch Logs log group to which
     *            connection logging data is published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionLogResponseOptions withCloudwatchLogGroup(String cloudwatchLogGroup) {
        this.cloudwatchLogGroup = cloudwatchLogGroup;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream to which connection
     * logging data is published.
     * </p>
     *
     * @return <p>
     *         The name of the Amazon CloudWatch Logs log stream to which
     *         connection logging data is published.
     *         </p>
     */
    public String getCloudwatchLogStream() {
        return cloudwatchLogStream;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream to which connection
     * logging data is published.
     * </p>
     *
     * @param cloudwatchLogStream <p>
     *            The name of the Amazon CloudWatch Logs log stream to which
     *            connection logging data is published.
     *            </p>
     */
    public void setCloudwatchLogStream(String cloudwatchLogStream) {
        this.cloudwatchLogStream = cloudwatchLogStream;
    }

    /**
     * <p>
     * The name of the Amazon CloudWatch Logs log stream to which connection
     * logging data is published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchLogStream <p>
     *            The name of the Amazon CloudWatch Logs log stream to which
     *            connection logging data is published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionLogResponseOptions withCloudwatchLogStream(String cloudwatchLogStream) {
        this.cloudwatchLogStream = cloudwatchLogStream;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getCloudwatchLogGroup() != null)
            sb.append("CloudwatchLogGroup: " + getCloudwatchLogGroup() + ",");
        if (getCloudwatchLogStream() != null)
            sb.append("CloudwatchLogStream: " + getCloudwatchLogStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getCloudwatchLogGroup() == null) ? 0 : getCloudwatchLogGroup().hashCode());
        hashCode = prime * hashCode
                + ((getCloudwatchLogStream() == null) ? 0 : getCloudwatchLogStream().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionLogResponseOptions == false)
            return false;
        ConnectionLogResponseOptions other = (ConnectionLogResponseOptions) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getCloudwatchLogGroup() == null ^ this.getCloudwatchLogGroup() == null)
            return false;
        if (other.getCloudwatchLogGroup() != null
                && other.getCloudwatchLogGroup().equals(this.getCloudwatchLogGroup()) == false)
            return false;
        if (other.getCloudwatchLogStream() == null ^ this.getCloudwatchLogStream() == null)
            return false;
        if (other.getCloudwatchLogStream() != null
                && other.getCloudwatchLogStream().equals(this.getCloudwatchLogStream()) == false)
            return false;
        return true;
    }
}
