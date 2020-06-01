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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class ListEndpointConfigsResult implements Serializable {
    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     */
    private java.util.List<EndpointConfigSummary> endpointConfigs;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of endpoint configurations, use it in the
     * subsequent request
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     *
     * @return <p>
     *         An array of endpoint configurations.
     *         </p>
     */
    public java.util.List<EndpointConfigSummary> getEndpointConfigs() {
        return endpointConfigs;
    }

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     *
     * @param endpointConfigs <p>
     *            An array of endpoint configurations.
     *            </p>
     */
    public void setEndpointConfigs(java.util.Collection<EndpointConfigSummary> endpointConfigs) {
        if (endpointConfigs == null) {
            this.endpointConfigs = null;
            return;
        }

        this.endpointConfigs = new java.util.ArrayList<EndpointConfigSummary>(endpointConfigs);
    }

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointConfigs <p>
     *            An array of endpoint configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEndpointConfigsResult withEndpointConfigs(EndpointConfigSummary... endpointConfigs) {
        if (getEndpointConfigs() == null) {
            this.endpointConfigs = new java.util.ArrayList<EndpointConfigSummary>(
                    endpointConfigs.length);
        }
        for (EndpointConfigSummary value : endpointConfigs) {
            this.endpointConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of endpoint configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointConfigs <p>
     *            An array of endpoint configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEndpointConfigsResult withEndpointConfigs(
            java.util.Collection<EndpointConfigSummary> endpointConfigs) {
        setEndpointConfigs(endpointConfigs);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of endpoint configurations, use it in the
     * subsequent request
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of endpoint configurations, use
     *         it in the subsequent request
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of endpoint configurations, use it in the
     * subsequent request
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of endpoint configurations,
     *            use it in the subsequent request
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of endpoint configurations, use it in the
     * subsequent request
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of endpoint configurations,
     *            use it in the subsequent request
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEndpointConfigsResult withNextToken(String nextToken) {
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
        if (getEndpointConfigs() != null)
            sb.append("EndpointConfigs: " + getEndpointConfigs() + ",");
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
                + ((getEndpointConfigs() == null) ? 0 : getEndpointConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEndpointConfigsResult == false)
            return false;
        ListEndpointConfigsResult other = (ListEndpointConfigsResult) obj;

        if (other.getEndpointConfigs() == null ^ this.getEndpointConfigs() == null)
            return false;
        if (other.getEndpointConfigs() != null
                && other.getEndpointConfigs().equals(this.getEndpointConfigs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
