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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes one or more launch configurations.
 * </p>
 */
public class DescribeLaunchConfigurationsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch
     * configurations are described.
     * </p>
     */
    private java.util.List<String> launchConfigurationNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 50 and the maximum value is 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch
     * configurations are described.
     * </p>
     *
     * @return <p>
     *         The launch configuration names. If you omit this parameter, all
     *         launch configurations are described.
     *         </p>
     */
    public java.util.List<String> getLaunchConfigurationNames() {
        return launchConfigurationNames;
    }

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch
     * configurations are described.
     * </p>
     *
     * @param launchConfigurationNames <p>
     *            The launch configuration names. If you omit this parameter,
     *            all launch configurations are described.
     *            </p>
     */
    public void setLaunchConfigurationNames(java.util.Collection<String> launchConfigurationNames) {
        if (launchConfigurationNames == null) {
            this.launchConfigurationNames = null;
            return;
        }

        this.launchConfigurationNames = new java.util.ArrayList<String>(launchConfigurationNames);
    }

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch
     * configurations are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchConfigurationNames <p>
     *            The launch configuration names. If you omit this parameter,
     *            all launch configurations are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchConfigurationsRequest withLaunchConfigurationNames(
            String... launchConfigurationNames) {
        if (getLaunchConfigurationNames() == null) {
            this.launchConfigurationNames = new java.util.ArrayList<String>(
                    launchConfigurationNames.length);
        }
        for (String value : launchConfigurationNames) {
            this.launchConfigurationNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The launch configuration names. If you omit this parameter, all launch
     * configurations are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchConfigurationNames <p>
     *            The launch configuration names. If you omit this parameter,
     *            all launch configurations are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchConfigurationsRequest withLaunchConfigurationNames(
            java.util.Collection<String> launchConfigurationNames) {
        setLaunchConfigurationNames(launchConfigurationNames);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchConfigurationsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 50 and the maximum value is 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to return with this call. The default
     *         value is 50 and the maximum value is 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 50 and the maximum value is 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of items to return with this call. The
     *            default value is 50 and the maximum value is 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value
     * is 50 and the maximum value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of items to return with this call. The
     *            default value is 50 and the maximum value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLaunchConfigurationsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        if (getLaunchConfigurationNames() != null)
            sb.append("LaunchConfigurationNames: " + getLaunchConfigurationNames() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationNames() == null) ? 0 : getLaunchConfigurationNames()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLaunchConfigurationsRequest == false)
            return false;
        DescribeLaunchConfigurationsRequest other = (DescribeLaunchConfigurationsRequest) obj;

        if (other.getLaunchConfigurationNames() == null
                ^ this.getLaunchConfigurationNames() == null)
            return false;
        if (other.getLaunchConfigurationNames() != null
                && other.getLaunchConfigurationNames().equals(this.getLaunchConfigurationNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }
}
