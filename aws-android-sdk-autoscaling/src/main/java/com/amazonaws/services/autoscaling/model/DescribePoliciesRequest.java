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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the policies for the specified Auto Scaling group.
 * </p>
 */
public class DescribePoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all
     * policies are described. If a group name is provided, the results are
     * limited to that group. This list is limited to 50 items. If you specify
     * an unknown policy name, it is ignored with no error.
     * </p>
     */
    private java.util.List<String> policyNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     */
    private java.util.List<String> policyTypes = new java.util.ArrayList<String>();

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to be returned with each call. The default
     * value is 50 and the maximum value is 100.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePoliciesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all
     * policies are described. If a group name is provided, the results are
     * limited to that group. This list is limited to 50 items. If you specify
     * an unknown policy name, it is ignored with no error.
     * </p>
     *
     * @return <p>
     *         The names of one or more policies. If you omit this parameter,
     *         all policies are described. If a group name is provided, the
     *         results are limited to that group. This list is limited to 50
     *         items. If you specify an unknown policy name, it is ignored with
     *         no error.
     *         </p>
     */
    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all
     * policies are described. If a group name is provided, the results are
     * limited to that group. This list is limited to 50 items. If you specify
     * an unknown policy name, it is ignored with no error.
     * </p>
     *
     * @param policyNames <p>
     *            The names of one or more policies. If you omit this parameter,
     *            all policies are described. If a group name is provided, the
     *            results are limited to that group. This list is limited to 50
     *            items. If you specify an unknown policy name, it is ignored
     *            with no error.
     *            </p>
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new java.util.ArrayList<String>(policyNames);
    }

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all
     * policies are described. If a group name is provided, the results are
     * limited to that group. This list is limited to 50 items. If you specify
     * an unknown policy name, it is ignored with no error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The names of one or more policies. If you omit this parameter,
     *            all policies are described. If a group name is provided, the
     *            results are limited to that group. This list is limited to 50
     *            items. If you specify an unknown policy name, it is ignored
     *            with no error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePoliciesRequest withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) {
            this.policyNames = new java.util.ArrayList<String>(policyNames.length);
        }
        for (String value : policyNames) {
            this.policyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more policies. If you omit this parameter, all
     * policies are described. If a group name is provided, the results are
     * limited to that group. This list is limited to 50 items. If you specify
     * an unknown policy name, it is ignored with no error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            The names of one or more policies. If you omit this parameter,
     *            all policies are described. If a group name is provided, the
     *            results are limited to that group. This list is limited to 50
     *            items. If you specify an unknown policy name, it is ignored
     *            with no error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePoliciesRequest withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
        return this;
    }

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     *
     * @return <p>
     *         One or more policy types. Valid values are
     *         <code>SimpleScaling</code> and <code>StepScaling</code>.
     *         </p>
     */
    public java.util.List<String> getPolicyTypes() {
        return policyTypes;
    }

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     *
     * @param policyTypes <p>
     *            One or more policy types. Valid values are
     *            <code>SimpleScaling</code> and <code>StepScaling</code>.
     *            </p>
     */
    public void setPolicyTypes(java.util.Collection<String> policyTypes) {
        if (policyTypes == null) {
            this.policyTypes = null;
            return;
        }

        this.policyTypes = new java.util.ArrayList<String>(policyTypes);
    }

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyTypes <p>
     *            One or more policy types. Valid values are
     *            <code>SimpleScaling</code> and <code>StepScaling</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePoliciesRequest withPolicyTypes(String... policyTypes) {
        if (getPolicyTypes() == null) {
            this.policyTypes = new java.util.ArrayList<String>(policyTypes.length);
        }
        for (String value : policyTypes) {
            this.policyTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyTypes <p>
     *            One or more policy types. Valid values are
     *            <code>SimpleScaling</code> and <code>StepScaling</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePoliciesRequest withPolicyTypes(java.util.Collection<String> policyTypes) {
        setPolicyTypes(policyTypes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePoliciesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call. The default
     * value is 50 and the maximum value is 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to be returned with each call. The
     *         default value is 50 and the maximum value is 100.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call. The default
     * value is 50 and the maximum value is 100.
     * </p>
     *
     * @param maxRecords <p>
     *            The maximum number of items to be returned with each call. The
     *            default value is 50 and the maximum value is 100.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call. The default
     * value is 50 and the maximum value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            The maximum number of items to be returned with each call. The
     *            default value is 50 and the maximum value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePoliciesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames() + ",");
        if (getPolicyTypes() != null)
            sb.append("PolicyTypes: " + getPolicyTypes() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyTypes() == null) ? 0 : getPolicyTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePoliciesRequest == false)
            return false;
        DescribePoliciesRequest other = (DescribePoliciesRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null
                && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        if (other.getPolicyTypes() == null ^ this.getPolicyTypes() == null)
            return false;
        if (other.getPolicyTypes() != null
                && other.getPolicyTypes().equals(this.getPolicyTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }
}
