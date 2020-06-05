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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed health information about the Amazon EC2 instances in an AWS Elastic
 * Beanstalk environment.
 * </p>
 */
public class DescribeInstancesHealthResult implements Serializable {
    /**
     * <p>
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There
     * is a difference in the members that are supported under the
     * <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     */
    private java.util.List<SingleInstanceHealth> instanceHealthList;

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     */
    private java.util.Date refreshedAt;

    /**
     * <p>
     * Pagination token for the next page of results, if available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There
     * is a difference in the members that are supported under the
     * <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     *
     * @return <p>
     *         Detailed health information about each instance.
     *         </p>
     *         <p>
     *         The output differs slightly between Linux and Windows
     *         environments. There is a difference in the members that are
     *         supported under the <code>&lt;CPUUtilization&gt;</code> type.
     *         </p>
     */
    public java.util.List<SingleInstanceHealth> getInstanceHealthList() {
        return instanceHealthList;
    }

    /**
     * <p>
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There
     * is a difference in the members that are supported under the
     * <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     *
     * @param instanceHealthList <p>
     *            Detailed health information about each instance.
     *            </p>
     *            <p>
     *            The output differs slightly between Linux and Windows
     *            environments. There is a difference in the members that are
     *            supported under the <code>&lt;CPUUtilization&gt;</code> type.
     *            </p>
     */
    public void setInstanceHealthList(java.util.Collection<SingleInstanceHealth> instanceHealthList) {
        if (instanceHealthList == null) {
            this.instanceHealthList = null;
            return;
        }

        this.instanceHealthList = new java.util.ArrayList<SingleInstanceHealth>(instanceHealthList);
    }

    /**
     * <p>
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There
     * is a difference in the members that are supported under the
     * <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceHealthList <p>
     *            Detailed health information about each instance.
     *            </p>
     *            <p>
     *            The output differs slightly between Linux and Windows
     *            environments. There is a difference in the members that are
     *            supported under the <code>&lt;CPUUtilization&gt;</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesHealthResult withInstanceHealthList(
            SingleInstanceHealth... instanceHealthList) {
        if (getInstanceHealthList() == null) {
            this.instanceHealthList = new java.util.ArrayList<SingleInstanceHealth>(
                    instanceHealthList.length);
        }
        for (SingleInstanceHealth value : instanceHealthList) {
            this.instanceHealthList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Detailed health information about each instance.
     * </p>
     * <p>
     * The output differs slightly between Linux and Windows environments. There
     * is a difference in the members that are supported under the
     * <code>&lt;CPUUtilization&gt;</code> type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceHealthList <p>
     *            Detailed health information about each instance.
     *            </p>
     *            <p>
     *            The output differs slightly between Linux and Windows
     *            environments. There is a difference in the members that are
     *            supported under the <code>&lt;CPUUtilization&gt;</code> type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesHealthResult withInstanceHealthList(
            java.util.Collection<SingleInstanceHealth> instanceHealthList) {
        setInstanceHealthList(instanceHealthList);
        return this;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     *
     * @return <p>
     *         The date and time that the health information was retrieved.
     *         </p>
     */
    public java.util.Date getRefreshedAt() {
        return refreshedAt;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     *
     * @param refreshedAt <p>
     *            The date and time that the health information was retrieved.
     *            </p>
     */
    public void setRefreshedAt(java.util.Date refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * <p>
     * The date and time that the health information was retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param refreshedAt <p>
     *            The date and time that the health information was retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesHealthResult withRefreshedAt(java.util.Date refreshedAt) {
        this.refreshedAt = refreshedAt;
        return this;
    }

    /**
     * <p>
     * Pagination token for the next page of results, if available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         Pagination token for the next page of results, if available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Pagination token for the next page of results, if available.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param nextToken <p>
     *            Pagination token for the next page of results, if available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token for the next page of results, if available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param nextToken <p>
     *            Pagination token for the next page of results, if available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancesHealthResult withNextToken(String nextToken) {
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
        if (getInstanceHealthList() != null)
            sb.append("InstanceHealthList: " + getInstanceHealthList() + ",");
        if (getRefreshedAt() != null)
            sb.append("RefreshedAt: " + getRefreshedAt() + ",");
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
                + ((getInstanceHealthList() == null) ? 0 : getInstanceHealthList().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshedAt() == null) ? 0 : getRefreshedAt().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancesHealthResult == false)
            return false;
        DescribeInstancesHealthResult other = (DescribeInstancesHealthResult) obj;

        if (other.getInstanceHealthList() == null ^ this.getInstanceHealthList() == null)
            return false;
        if (other.getInstanceHealthList() != null
                && other.getInstanceHealthList().equals(this.getInstanceHealthList()) == false)
            return false;
        if (other.getRefreshedAt() == null ^ this.getRefreshedAt() == null)
            return false;
        if (other.getRefreshedAt() != null
                && other.getRefreshedAt().equals(this.getRefreshedAt()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
