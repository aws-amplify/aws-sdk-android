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

/**
 * <p>
 * Configuration of the topic rule destination.
 * </p>
 */
public class TopicRuleDestinationConfiguration implements Serializable {
    /**
     * <p>
     * Configuration of the HTTP URL.
     * </p>
     */
    private HttpUrlDestinationConfiguration httpUrlConfiguration;

    /**
     * <p>
     * Configuration of the virtual private cloud (VPC) connection.
     * </p>
     */
    private VpcDestinationConfiguration vpcConfiguration;

    /**
     * <p>
     * Configuration of the HTTP URL.
     * </p>
     *
     * @return <p>
     *         Configuration of the HTTP URL.
     *         </p>
     */
    public HttpUrlDestinationConfiguration getHttpUrlConfiguration() {
        return httpUrlConfiguration;
    }

    /**
     * <p>
     * Configuration of the HTTP URL.
     * </p>
     *
     * @param httpUrlConfiguration <p>
     *            Configuration of the HTTP URL.
     *            </p>
     */
    public void setHttpUrlConfiguration(HttpUrlDestinationConfiguration httpUrlConfiguration) {
        this.httpUrlConfiguration = httpUrlConfiguration;
    }

    /**
     * <p>
     * Configuration of the HTTP URL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpUrlConfiguration <p>
     *            Configuration of the HTTP URL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestinationConfiguration withHttpUrlConfiguration(
            HttpUrlDestinationConfiguration httpUrlConfiguration) {
        this.httpUrlConfiguration = httpUrlConfiguration;
        return this;
    }

    /**
     * <p>
     * Configuration of the virtual private cloud (VPC) connection.
     * </p>
     *
     * @return <p>
     *         Configuration of the virtual private cloud (VPC) connection.
     *         </p>
     */
    public VpcDestinationConfiguration getVpcConfiguration() {
        return vpcConfiguration;
    }

    /**
     * <p>
     * Configuration of the virtual private cloud (VPC) connection.
     * </p>
     *
     * @param vpcConfiguration <p>
     *            Configuration of the virtual private cloud (VPC) connection.
     *            </p>
     */
    public void setVpcConfiguration(VpcDestinationConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration of the virtual private cloud (VPC) connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcConfiguration <p>
     *            Configuration of the virtual private cloud (VPC) connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TopicRuleDestinationConfiguration withVpcConfiguration(
            VpcDestinationConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
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
        if (getHttpUrlConfiguration() != null)
            sb.append("httpUrlConfiguration: " + getHttpUrlConfiguration() + ",");
        if (getVpcConfiguration() != null)
            sb.append("vpcConfiguration: " + getVpcConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHttpUrlConfiguration() == null) ? 0 : getHttpUrlConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRuleDestinationConfiguration == false)
            return false;
        TopicRuleDestinationConfiguration other = (TopicRuleDestinationConfiguration) obj;

        if (other.getHttpUrlConfiguration() == null ^ this.getHttpUrlConfiguration() == null)
            return false;
        if (other.getHttpUrlConfiguration() != null
                && other.getHttpUrlConfiguration().equals(this.getHttpUrlConfiguration()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null
                && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        return true;
    }
}
