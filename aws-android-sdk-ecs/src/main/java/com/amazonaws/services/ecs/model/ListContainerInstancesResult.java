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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class ListContainerInstancesResult implements Serializable {
    /**
     * <p>
     * The list of container instances with full ARN entries for each container
     * instance associated with the specified cluster.
     * </p>
     */
    private java.util.List<String> containerInstanceArns;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListContainerInstances</code> request. When the results of a
     * <code>ListContainerInstances</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of container instances with full ARN entries for each container
     * instance associated with the specified cluster.
     * </p>
     *
     * @return <p>
     *         The list of container instances with full ARN entries for each
     *         container instance associated with the specified cluster.
     *         </p>
     */
    public java.util.List<String> getContainerInstanceArns() {
        return containerInstanceArns;
    }

    /**
     * <p>
     * The list of container instances with full ARN entries for each container
     * instance associated with the specified cluster.
     * </p>
     *
     * @param containerInstanceArns <p>
     *            The list of container instances with full ARN entries for each
     *            container instance associated with the specified cluster.
     *            </p>
     */
    public void setContainerInstanceArns(java.util.Collection<String> containerInstanceArns) {
        if (containerInstanceArns == null) {
            this.containerInstanceArns = null;
            return;
        }

        this.containerInstanceArns = new java.util.ArrayList<String>(containerInstanceArns);
    }

    /**
     * <p>
     * The list of container instances with full ARN entries for each container
     * instance associated with the specified cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstanceArns <p>
     *            The list of container instances with full ARN entries for each
     *            container instance associated with the specified cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContainerInstancesResult withContainerInstanceArns(String... containerInstanceArns) {
        if (getContainerInstanceArns() == null) {
            this.containerInstanceArns = new java.util.ArrayList<String>(
                    containerInstanceArns.length);
        }
        for (String value : containerInstanceArns) {
            this.containerInstanceArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of container instances with full ARN entries for each container
     * instance associated with the specified cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerInstanceArns <p>
     *            The list of container instances with full ARN entries for each
     *            container instance associated with the specified cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContainerInstancesResult withContainerInstanceArns(
            java.util.Collection<String> containerInstanceArns) {
        setContainerInstanceArns(containerInstanceArns);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListContainerInstances</code> request. When the results of a
     * <code>ListContainerInstances</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>ListContainerInstances</code> request. When the results of
     *         a <code>ListContainerInstances</code> request exceed
     *         <code>maxResults</code>, this value can be used to retrieve the
     *         next page of results. This value is <code>null</code> when there
     *         are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListContainerInstances</code> request. When the results of a
     * <code>ListContainerInstances</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListContainerInstances</code> request. When the results
     *            of a <code>ListContainerInstances</code> request exceed
     *            <code>maxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListContainerInstances</code> request. When the results of a
     * <code>ListContainerInstances</code> request exceed
     * <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListContainerInstances</code> request. When the results
     *            of a <code>ListContainerInstances</code> request exceed
     *            <code>maxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContainerInstancesResult withNextToken(String nextToken) {
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
        if (getContainerInstanceArns() != null)
            sb.append("containerInstanceArns: " + getContainerInstanceArns() + ",");
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
                + ((getContainerInstanceArns() == null) ? 0 : getContainerInstanceArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContainerInstancesResult == false)
            return false;
        ListContainerInstancesResult other = (ListContainerInstancesResult) obj;

        if (other.getContainerInstanceArns() == null ^ this.getContainerInstanceArns() == null)
            return false;
        if (other.getContainerInstanceArns() != null
                && other.getContainerInstanceArns().equals(this.getContainerInstanceArns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
