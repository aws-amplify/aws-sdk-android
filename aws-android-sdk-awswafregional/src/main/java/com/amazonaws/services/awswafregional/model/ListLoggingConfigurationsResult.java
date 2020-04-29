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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

public class ListLoggingConfigurationsResult implements Serializable {
    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     */
    private java.util.List<LoggingConfiguration> loggingConfigurations;

    /**
     * <p>
     * If you have more <code>LoggingConfigurations</code> than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>LoggingConfigurations</code>, submit another
     * <code>ListLoggingConfigurations</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     *
     * @return <p>
     *         An array of <a>LoggingConfiguration</a> objects.
     *         </p>
     */
    public java.util.List<LoggingConfiguration> getLoggingConfigurations() {
        return loggingConfigurations;
    }

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     *
     * @param loggingConfigurations <p>
     *            An array of <a>LoggingConfiguration</a> objects.
     *            </p>
     */
    public void setLoggingConfigurations(
            java.util.Collection<LoggingConfiguration> loggingConfigurations) {
        if (loggingConfigurations == null) {
            this.loggingConfigurations = null;
            return;
        }

        this.loggingConfigurations = new java.util.ArrayList<LoggingConfiguration>(
                loggingConfigurations);
    }

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingConfigurations <p>
     *            An array of <a>LoggingConfiguration</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLoggingConfigurationsResult withLoggingConfigurations(
            LoggingConfiguration... loggingConfigurations) {
        if (getLoggingConfigurations() == null) {
            this.loggingConfigurations = new java.util.ArrayList<LoggingConfiguration>(
                    loggingConfigurations.length);
        }
        for (LoggingConfiguration value : loggingConfigurations) {
            this.loggingConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>LoggingConfiguration</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingConfigurations <p>
     *            An array of <a>LoggingConfiguration</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLoggingConfigurationsResult withLoggingConfigurations(
            java.util.Collection<LoggingConfiguration> loggingConfigurations) {
        setLoggingConfigurations(loggingConfigurations);
        return this;
    }

    /**
     * <p>
     * If you have more <code>LoggingConfigurations</code> than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>LoggingConfigurations</code>, submit another
     * <code>ListLoggingConfigurations</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If you have more <code>LoggingConfigurations</code> than the
     *         number that you specified for <code>Limit</code> in the request,
     *         the response includes a <code>NextMarker</code> value. To list
     *         more <code>LoggingConfigurations</code>, submit another
     *         <code>ListLoggingConfigurations</code> request, and specify the
     *         <code>NextMarker</code> value from the response in the
     *         <code>NextMarker</code> value in the next request.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If you have more <code>LoggingConfigurations</code> than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>LoggingConfigurations</code>, submit another
     * <code>ListLoggingConfigurations</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <code>LoggingConfigurations</code> than the
     *            number that you specified for <code>Limit</code> in the
     *            request, the response includes a <code>NextMarker</code>
     *            value. To list more <code>LoggingConfigurations</code>, submit
     *            another <code>ListLoggingConfigurations</code> request, and
     *            specify the <code>NextMarker</code> value from the response in
     *            the <code>NextMarker</code> value in the next request.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>LoggingConfigurations</code> than the number that
     * you specified for <code>Limit</code> in the request, the response
     * includes a <code>NextMarker</code> value. To list more
     * <code>LoggingConfigurations</code>, submit another
     * <code>ListLoggingConfigurations</code> request, and specify the
     * <code>NextMarker</code> value from the response in the
     * <code>NextMarker</code> value in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextMarker <p>
     *            If you have more <code>LoggingConfigurations</code> than the
     *            number that you specified for <code>Limit</code> in the
     *            request, the response includes a <code>NextMarker</code>
     *            value. To list more <code>LoggingConfigurations</code>, submit
     *            another <code>ListLoggingConfigurations</code> request, and
     *            specify the <code>NextMarker</code> value from the response in
     *            the <code>NextMarker</code> value in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLoggingConfigurationsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getLoggingConfigurations() != null)
            sb.append("LoggingConfigurations: " + getLoggingConfigurations() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLoggingConfigurations() == null) ? 0 : getLoggingConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLoggingConfigurationsResult == false)
            return false;
        ListLoggingConfigurationsResult other = (ListLoggingConfigurationsResult) obj;

        if (other.getLoggingConfigurations() == null ^ this.getLoggingConfigurations() == null)
            return false;
        if (other.getLoggingConfigurations() != null
                && other.getLoggingConfigurations().equals(this.getLoggingConfigurations()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }
}
