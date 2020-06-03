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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetDevEndpointsResult implements Serializable {
    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     */
    private java.util.List<DevEndpoint> devEndpoints;

    /**
     * <p>
     * A continuation token, if not all <code>DevEndpoint</code> definitions
     * have yet been returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     *
     * @return <p>
     *         A list of <code>DevEndpoint</code> definitions.
     *         </p>
     */
    public java.util.List<DevEndpoint> getDevEndpoints() {
        return devEndpoints;
    }

    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     *
     * @param devEndpoints <p>
     *            A list of <code>DevEndpoint</code> definitions.
     *            </p>
     */
    public void setDevEndpoints(java.util.Collection<DevEndpoint> devEndpoints) {
        if (devEndpoints == null) {
            this.devEndpoints = null;
            return;
        }

        this.devEndpoints = new java.util.ArrayList<DevEndpoint>(devEndpoints);
    }

    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpoints <p>
     *            A list of <code>DevEndpoint</code> definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevEndpointsResult withDevEndpoints(DevEndpoint... devEndpoints) {
        if (getDevEndpoints() == null) {
            this.devEndpoints = new java.util.ArrayList<DevEndpoint>(devEndpoints.length);
        }
        for (DevEndpoint value : devEndpoints) {
            this.devEndpoints.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DevEndpoint</code> definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param devEndpoints <p>
     *            A list of <code>DevEndpoint</code> definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevEndpointsResult withDevEndpoints(java.util.Collection<DevEndpoint> devEndpoints) {
        setDevEndpoints(devEndpoints);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all <code>DevEndpoint</code> definitions
     * have yet been returned.
     * </p>
     *
     * @return <p>
     *         A continuation token, if not all <code>DevEndpoint</code>
     *         definitions have yet been returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all <code>DevEndpoint</code> definitions
     * have yet been returned.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if not all <code>DevEndpoint</code>
     *            definitions have yet been returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all <code>DevEndpoint</code> definitions
     * have yet been returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if not all <code>DevEndpoint</code>
     *            definitions have yet been returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDevEndpointsResult withNextToken(String nextToken) {
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
        if (getDevEndpoints() != null)
            sb.append("DevEndpoints: " + getDevEndpoints() + ",");
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
                + ((getDevEndpoints() == null) ? 0 : getDevEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevEndpointsResult == false)
            return false;
        GetDevEndpointsResult other = (GetDevEndpointsResult) obj;

        if (other.getDevEndpoints() == null ^ this.getDevEndpoints() == null)
            return false;
        if (other.getDevEndpoints() != null
                && other.getDevEndpoints().equals(this.getDevEndpoints()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
