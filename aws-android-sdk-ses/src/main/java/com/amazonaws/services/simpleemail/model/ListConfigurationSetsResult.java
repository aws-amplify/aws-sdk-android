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

/**
 * <p>
 * A list of configuration sets associated with your AWS account. Configuration
 * sets enable you to publish email sending events. For information about using
 * configuration sets, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class ListConfigurationSetsResult implements Serializable {
    /**
     * <p>
     * A list of configuration sets.
     * </p>
     */
    private java.util.List<ConfigurationSet> configurationSets = new java.util.ArrayList<ConfigurationSet>();

    /**
     * <p>
     * A token indicating that there are additional configuration sets available
     * to be listed. Pass this token to successive calls of
     * <code>ListConfigurationSets</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of configuration sets.
     * </p>
     *
     * @return <p>
     *         A list of configuration sets.
     *         </p>
     */
    public java.util.List<ConfigurationSet> getConfigurationSets() {
        return configurationSets;
    }

    /**
     * <p>
     * A list of configuration sets.
     * </p>
     *
     * @param configurationSets <p>
     *            A list of configuration sets.
     *            </p>
     */
    public void setConfigurationSets(java.util.Collection<ConfigurationSet> configurationSets) {
        if (configurationSets == null) {
            this.configurationSets = null;
            return;
        }

        this.configurationSets = new java.util.ArrayList<ConfigurationSet>(configurationSets);
    }

    /**
     * <p>
     * A list of configuration sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSets <p>
     *            A list of configuration sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationSetsResult withConfigurationSets(ConfigurationSet... configurationSets) {
        if (getConfigurationSets() == null) {
            this.configurationSets = new java.util.ArrayList<ConfigurationSet>(
                    configurationSets.length);
        }
        for (ConfigurationSet value : configurationSets) {
            this.configurationSets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationSets <p>
     *            A list of configuration sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationSetsResult withConfigurationSets(
            java.util.Collection<ConfigurationSet> configurationSets) {
        setConfigurationSets(configurationSets);
        return this;
    }

    /**
     * <p>
     * A token indicating that there are additional configuration sets available
     * to be listed. Pass this token to successive calls of
     * <code>ListConfigurationSets</code>.
     * </p>
     *
     * @return <p>
     *         A token indicating that there are additional configuration sets
     *         available to be listed. Pass this token to successive calls of
     *         <code>ListConfigurationSets</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional configuration sets available
     * to be listed. Pass this token to successive calls of
     * <code>ListConfigurationSets</code>.
     * </p>
     *
     * @param nextToken <p>
     *            A token indicating that there are additional configuration
     *            sets available to be listed. Pass this token to successive
     *            calls of <code>ListConfigurationSets</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token indicating that there are additional configuration sets available
     * to be listed. Pass this token to successive calls of
     * <code>ListConfigurationSets</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token indicating that there are additional configuration
     *            sets available to be listed. Pass this token to successive
     *            calls of <code>ListConfigurationSets</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationSetsResult withNextToken(String nextToken) {
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
        if (getConfigurationSets() != null)
            sb.append("ConfigurationSets: " + getConfigurationSets() + ",");
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
                + ((getConfigurationSets() == null) ? 0 : getConfigurationSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationSetsResult == false)
            return false;
        ListConfigurationSetsResult other = (ListConfigurationSetsResult) obj;

        if (other.getConfigurationSets() == null ^ this.getConfigurationSets() == null)
            return false;
        if (other.getConfigurationSets() != null
                && other.getConfigurationSets().equals(this.getConfigurationSets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
