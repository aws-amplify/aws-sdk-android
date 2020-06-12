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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns drift information for the resources that have been checked for drift
 * in the specified stack. This includes actual and expected configuration
 * values for resources where AWS CloudFormation detects configuration drift.
 * </p>
 * <p>
 * For a given stack, there will be one <code>StackResourceDrift</code> for each
 * stack resource that has been checked for drift. Resources that have not yet
 * been checked for drift are not included. Resources that do not currently
 * support drift detection are not checked, and so not included. For a list of
 * resources that support drift detection, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
 * >Resources that Support Drift Detection</a>.
 * </p>
 * <p>
 * Use <a>DetectStackResourceDrift</a> to detect drift on individual resources,
 * or <a>DetectStackDrift</a> to detect drift on all supported resources for a
 * given stack.
 * </p>
 */
public class DescribeStackResourceDriftsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the stack for which you want drift information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     */
    private String stackName;

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift
     * results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration in that the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> stackResourceDriftStatusFilters;

    /**
     * <p>
     * A string that identifies the next page of stack resource drift results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the stack for which you want drift information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @return <p>
     *         The name of the stack for which you want drift information.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name of the stack for which you want drift information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name of the stack for which you want drift information.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack for which you want drift information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern:
     * </b>([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[
     * -a-zA-Z0-9:/._+]*)<br/>
     *
     * @param stackName <p>
     *            The name of the stack for which you want drift information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackResourceDriftsRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift
     * results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration in that the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The resource drift status values to use as filters for the
     *         resource drift results returned.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The resource differs from its expected
     *         template configuration in that the resource has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED</code>: One or more resource properties differ
     *         from their expected template values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The resources's actual configuration
     *         matches its expected template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation does not currently
     *         return this value.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getStackResourceDriftStatusFilters() {
        return stackResourceDriftStatusFilters;
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift
     * results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration in that the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     *
     * @param stackResourceDriftStatusFilters <p>
     *            The resource drift status values to use as filters for the
     *            resource drift results returned.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            template configuration in that the resource has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: One or more resource properties differ
     *            from their expected template values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation does not
     *            currently return this value.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStackResourceDriftStatusFilters(
            java.util.Collection<String> stackResourceDriftStatusFilters) {
        if (stackResourceDriftStatusFilters == null) {
            this.stackResourceDriftStatusFilters = null;
            return;
        }

        this.stackResourceDriftStatusFilters = new java.util.ArrayList<String>(
                stackResourceDriftStatusFilters);
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift
     * results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration in that the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackResourceDriftStatusFilters <p>
     *            The resource drift status values to use as filters for the
     *            resource drift results returned.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            template configuration in that the resource has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: One or more resource properties differ
     *            from their expected template values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation does not
     *            currently return this value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackResourceDriftsRequest withStackResourceDriftStatusFilters(
            String... stackResourceDriftStatusFilters) {
        if (getStackResourceDriftStatusFilters() == null) {
            this.stackResourceDriftStatusFilters = new java.util.ArrayList<String>(
                    stackResourceDriftStatusFilters.length);
        }
        for (String value : stackResourceDriftStatusFilters) {
            this.stackResourceDriftStatusFilters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift
     * results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template
     * configuration in that the resource has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their
     * expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its
     * expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return
     * this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackResourceDriftStatusFilters <p>
     *            The resource drift status values to use as filters for the
     *            resource drift results returned.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DELETED</code>: The resource differs from its expected
     *            template configuration in that the resource has been deleted.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MODIFIED</code>: One or more resource properties differ
     *            from their expected template values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>IN_SYNC</code>: The resources's actual configuration
     *            matches its expected template configuration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_CHECKED</code>: AWS CloudFormation does not
     *            currently return this value.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackResourceDriftsRequest withStackResourceDriftStatusFilters(
            java.util.Collection<String> stackResourceDriftStatusFilters) {
        setStackResourceDriftStatusFilters(stackResourceDriftStatusFilters);
        return this;
    }

    /**
     * <p>
     * A string that identifies the next page of stack resource drift results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A string that identifies the next page of stack resource drift
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of stack resource drift results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string that identifies the next page of stack resource drift
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of stack resource drift results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A string that identifies the next page of stack resource drift
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackResourceDriftsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to be returned with a single call.
     *         If the number of available results exceeds this maximum, the
     *         response includes a <code>NextToken</code> value that you can
     *         assign to the <code>NextToken</code> request parameter to get the
     *         next set of results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the
     * number of available results exceeds this maximum, the response includes a
     * <code>NextToken</code> value that you can assign to the
     * <code>NextToken</code> request parameter to get the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned with a single
     *            call. If the number of available results exceeds this maximum,
     *            the response includes a <code>NextToken</code> value that you
     *            can assign to the <code>NextToken</code> request parameter to
     *            get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackResourceDriftsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getStackResourceDriftStatusFilters() != null)
            sb.append("StackResourceDriftStatusFilters: " + getStackResourceDriftStatusFilters()
                    + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackResourceDriftStatusFilters() == null) ? 0
                        : getStackResourceDriftStatusFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackResourceDriftsRequest == false)
            return false;
        DescribeStackResourceDriftsRequest other = (DescribeStackResourceDriftsRequest) obj;

        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getStackResourceDriftStatusFilters() == null
                ^ this.getStackResourceDriftStatusFilters() == null)
            return false;
        if (other.getStackResourceDriftStatusFilters() != null
                && other.getStackResourceDriftStatusFilters().equals(
                        this.getStackResourceDriftStatusFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
