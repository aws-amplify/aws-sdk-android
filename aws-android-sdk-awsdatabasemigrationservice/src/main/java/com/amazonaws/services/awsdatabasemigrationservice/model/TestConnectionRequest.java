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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Tests the connection between the replication instance and the endpoint.
 * </p>
 */
public class TestConnectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     */
    private String endpointArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the replication instance.
     *         </p>
     */
    public String getReplicationInstanceArn() {
        return replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     */
    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationInstanceArn <p>
     *            The Amazon Resource Name (ARN) of the replication instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestConnectionRequest withReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) string that uniquely identifies
     *         the endpoint.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name (ARN) string that uniquely identifies
     *            the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestConnectionRequest withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
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
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn() + ",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceArn() == null) ? 0 : getReplicationInstanceArn()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestConnectionRequest == false)
            return false;
        TestConnectionRequest other = (TestConnectionRequest) obj;

        if (other.getReplicationInstanceArn() == null ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        return true;
    }
}
