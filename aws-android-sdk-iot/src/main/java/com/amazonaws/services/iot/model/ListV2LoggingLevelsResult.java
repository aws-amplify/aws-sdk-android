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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListV2LoggingLevelsResult implements Serializable {
    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     */
    private java.util.List<LogTargetConfiguration> logTargetConfigurations;

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     *
     * @return <p>
     *         The logging configuration for a target.
     *         </p>
     */
    public java.util.List<LogTargetConfiguration> getLogTargetConfigurations() {
        return logTargetConfigurations;
    }

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     *
     * @param logTargetConfigurations <p>
     *            The logging configuration for a target.
     *            </p>
     */
    public void setLogTargetConfigurations(
            java.util.Collection<LogTargetConfiguration> logTargetConfigurations) {
        if (logTargetConfigurations == null) {
            this.logTargetConfigurations = null;
            return;
        }

        this.logTargetConfigurations = new java.util.ArrayList<LogTargetConfiguration>(
                logTargetConfigurations);
    }

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logTargetConfigurations <p>
     *            The logging configuration for a target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListV2LoggingLevelsResult withLogTargetConfigurations(
            LogTargetConfiguration... logTargetConfigurations) {
        if (getLogTargetConfigurations() == null) {
            this.logTargetConfigurations = new java.util.ArrayList<LogTargetConfiguration>(
                    logTargetConfigurations.length);
        }
        for (LogTargetConfiguration value : logTargetConfigurations) {
            this.logTargetConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The logging configuration for a target.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logTargetConfigurations <p>
     *            The logging configuration for a target.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListV2LoggingLevelsResult withLogTargetConfigurations(
            java.util.Collection<LogTargetConfiguration> logTargetConfigurations) {
        setLogTargetConfigurations(logTargetConfigurations);
        return this;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @return <p>
     *         The token used to get the next set of results, or <b>null</b> if
     *         there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to get the next set of results, or <b>null</b> if there
     * are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token used to get the next set of results, or <b>null</b>
     *            if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListV2LoggingLevelsResult withNextToken(String nextToken) {
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
        if (getLogTargetConfigurations() != null)
            sb.append("logTargetConfigurations: " + getLogTargetConfigurations() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLogTargetConfigurations() == null) ? 0 : getLogTargetConfigurations()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListV2LoggingLevelsResult == false)
            return false;
        ListV2LoggingLevelsResult other = (ListV2LoggingLevelsResult) obj;

        if (other.getLogTargetConfigurations() == null ^ this.getLogTargetConfigurations() == null)
            return false;
        if (other.getLogTargetConfigurations() != null
                && other.getLogTargetConfigurations().equals(this.getLogTargetConfigurations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
