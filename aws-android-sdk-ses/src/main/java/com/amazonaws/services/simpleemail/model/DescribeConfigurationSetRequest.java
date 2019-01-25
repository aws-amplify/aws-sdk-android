/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the details of the specified configuration set. For information about
 * using configuration sets, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class DescribeConfigurationSetRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the configuration set to describe.
     * </p>
     */
    private String configurationSetName;

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     */
    private java.util.List<String> configurationSetAttributeNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the configuration set to describe.
     * </p>
     *
     * @return <p>
     *         The name of the configuration set to describe.
     *         </p>
     */
    public String getConfigurationSetName() {
        return configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to describe.
     * </p>
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to describe.
     *            </p>
     */
    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetName <p>
     *            The name of the configuration set to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSetRequest withConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
        return this;
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     *
     * @return <p>
     *         A list of configuration set attributes to return.
     *         </p>
     */
    public java.util.List<String> getConfigurationSetAttributeNames() {
        return configurationSetAttributeNames;
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     *
     * @param configurationSetAttributeNames <p>
     *            A list of configuration set attributes to return.
     *            </p>
     */
    public void setConfigurationSetAttributeNames(
            java.util.Collection<String> configurationSetAttributeNames) {
        if (configurationSetAttributeNames == null) {
            this.configurationSetAttributeNames = null;
            return;
        }

        this.configurationSetAttributeNames = new java.util.ArrayList<String>(
                configurationSetAttributeNames);
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetAttributeNames <p>
     *            A list of configuration set attributes to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSetRequest withConfigurationSetAttributeNames(
            String... configurationSetAttributeNames) {
        if (getConfigurationSetAttributeNames() == null) {
            this.configurationSetAttributeNames = new java.util.ArrayList<String>(
                    configurationSetAttributeNames.length);
        }
        for (String value : configurationSetAttributeNames) {
            this.configurationSetAttributeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration set attributes to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSetAttributeNames <p>
     *            A list of configuration set attributes to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeConfigurationSetRequest withConfigurationSetAttributeNames(
            java.util.Collection<String> configurationSetAttributeNames) {
        setConfigurationSetAttributeNames(configurationSetAttributeNames);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: " + getConfigurationSetName() + ",");
        if (getConfigurationSetAttributeNames() != null)
            sb.append("ConfigurationSetAttributeNames: " + getConfigurationSetAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationSetAttributeNames() == null) ? 0
                        : getConfigurationSetAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationSetRequest == false)
            return false;
        DescribeConfigurationSetRequest other = (DescribeConfigurationSetRequest) obj;

        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null
                && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getConfigurationSetAttributeNames() == null
                ^ this.getConfigurationSetAttributeNames() == null)
            return false;
        if (other.getConfigurationSetAttributeNames() != null
                && other.getConfigurationSetAttributeNames().equals(
                        this.getConfigurationSetAttributeNames()) == false)
            return false;
        return true;
    }
}
