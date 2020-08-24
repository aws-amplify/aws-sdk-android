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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Describes one or more of your instances, including information about the operating system platform, the version of SSM Agent installed on the instance, instance status, and so on.</p> <p>If you specify one or more instance IDs, it returns information for those instances. If you do not specify instance IDs, it returns information for all your instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an error.</p> <note> <p>The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to on-premises instances. This call does not return the IAM role for EC2 instances.</p> </note>
 */
public class DescribeInstanceInformationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     */
    private java.util.List<InstanceInformationFilter> instanceInformationFilterList;

    /**
     * <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     */
    private java.util.List<InstanceInformationStringFilter> filters;

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    private String nextToken;

    /**
     * <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     *
     * @return <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     */
    public java.util.List<InstanceInformationFilter> getInstanceInformationFilterList() {
        return instanceInformationFilterList;
    }

    /**
     * <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     *
     * @param instanceInformationFilterList <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     */
    public void setInstanceInformationFilterList(java.util.Collection<InstanceInformationFilter> instanceInformationFilterList) {
        if (instanceInformationFilterList == null) {
            this.instanceInformationFilterList = null;
            return;
        }

        this.instanceInformationFilterList = new java.util.ArrayList<InstanceInformationFilter>(instanceInformationFilterList);
    }

    /**
     * <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInformationFilterList <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInstanceInformationRequest withInstanceInformationFilterList(InstanceInformationFilter... instanceInformationFilterList) {
        if (getInstanceInformationFilterList() == null) {
            this.instanceInformationFilterList = new java.util.ArrayList<InstanceInformationFilter>(instanceInformationFilterList.length);
        }
        for (InstanceInformationFilter value : instanceInformationFilterList) {
            this.instanceInformationFilterList.add(value);
        }
        return this;
    }

    /**
     * <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInformationFilterList <p>This is a legacy method. We recommend that you don't use this method. Instead, use the <code>Filters</code> data type. <code>Filters</code> enables you to return instance information by filtering based on tags applied to managed instances.</p> <note> <p>Attempting to use <code>InstanceInformationFilterList</code> and <code>Filters</code> leads to an exception error. </p> </note>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInstanceInformationRequest withInstanceInformationFilterList(java.util.Collection<InstanceInformationFilter> instanceInformationFilterList) {
        setInstanceInformationFilterList(instanceInformationFilterList);
        return this;
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     *
     * @return <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     */
    public java.util.List<InstanceInformationStringFilter> getFilters() {
        return filters;
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     *
     * @param filters <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     */
    public void setFilters(java.util.Collection<InstanceInformationStringFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<InstanceInformationStringFilter>(filters);
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInstanceInformationRequest withFilters(InstanceInformationStringFilter... filters) {
        if (getFilters() == null) {
            this.filters = new java.util.ArrayList<InstanceInformationStringFilter>(filters.length);
        }
        for (InstanceInformationStringFilter value : filters) {
            this.filters.add(value);
        }
        return this;
    }

    /**
     * <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters <p>One or more filters. Use a filter to return a more specific list of instances. You can filter based on tags applied to EC2 instances. Use this <code>Filters</code> data type instead of <code>InstanceInformationFilterList</code>, which is deprecated.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInstanceInformationRequest withFilters(java.util.Collection<InstanceInformationStringFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 50<br/>
     *
     * @return <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 50<br/>
     *
     * @param maxResults <p>The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInstanceInformationRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken <p>The token for the next set of items to return. (You received this token from a previous call.)</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeInstanceInformationRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceInformationFilterList() != null) sb.append("InstanceInformationFilterList: " + getInstanceInformationFilterList() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceInformationFilterList() == null) ? 0 : getInstanceInformationFilterList().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstanceInformationRequest == false) return false;
        DescribeInstanceInformationRequest other = (DescribeInstanceInformationRequest)obj;

        if (other.getInstanceInformationFilterList() == null ^ this.getInstanceInformationFilterList() == null) return false;
        if (other.getInstanceInformationFilterList() != null && other.getInstanceInformationFilterList().equals(this.getInstanceInformationFilterList()) == false) return false;
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
