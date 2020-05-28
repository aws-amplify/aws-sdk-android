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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class ListConfigurationsResult implements Serializable {
    /**
     * 
     <p>
     * An array of MSK configurations.
     * </p>
     */
    private java.util.List<Configuration> configurations;

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListConfigurations
     * operation is truncated, the call returns NextToken in the response. To
     * get another batch of configurations, provide this token in your next
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * 
     <p>
     * An array of MSK configurations.
     * </p>
     * 
     * @return <p>
     *         An array of MSK configurations.
     *         </p>
     */
    public java.util.List<Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * 
     <p>
     * An array of MSK configurations.
     * </p>
     * 
     * @param configurations <p>
     *            An array of MSK configurations.
     *            </p>
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<Configuration>(configurations);
    }

    /**
     * 
     <p>
     * An array of MSK configurations.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            An array of MSK configurations.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationsResult withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) {
            this.configurations = new java.util.ArrayList<Configuration>(configurations.length);
        }
        for (Configuration value : configurations) {
            this.configurations.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * An array of MSK configurations.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurations <p>
     *            An array of MSK configurations.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationsResult withConfigurations(
            java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListConfigurations
     * operation is truncated, the call returns NextToken in the response. To
     * get another batch of configurations, provide this token in your next
     * request.
     * </p>
     * 
     * @return <p>
     *         The paginated results marker. When the result of a
     *         ListConfigurations operation is truncated, the call returns
     *         NextToken in the response. To get another batch of
     *         configurations, provide this token in your next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListConfigurations
     * operation is truncated, the call returns NextToken in the response. To
     * get another batch of configurations, provide this token in your next
     * request.
     * </p>
     * 
     * @param nextToken <p>
     *            The paginated results marker. When the result of a
     *            ListConfigurations operation is truncated, the call returns
     *            NextToken in the response. To get another batch of
     *            configurations, provide this token in your next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListConfigurations
     * operation is truncated, the call returns NextToken in the response. To
     * get another batch of configurations, provide this token in your next
     * request.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The paginated results marker. When the result of a
     *            ListConfigurations operation is truncated, the call returns
     *            NextToken in the response. To get another batch of
     *            configurations, provide this token in your next request.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationsResult == false)
            return false;
        ListConfigurationsResult other = (ListConfigurationsResult) obj;

        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
