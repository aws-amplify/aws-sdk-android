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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of task definition families that are registered to your
 * account (which may include task definition families that no longer have any
 * <code>ACTIVE</code> task definition revisions).
 * </p>
 * <p>
 * You can filter out task definition families that do not contain any
 * <code>ACTIVE</code> task definition revisions by setting the
 * <code>status</code> parameter to <code>ACTIVE</code>. You can also filter the
 * results with the <code>familyPrefix</code> parameter.
 * </p>
 */
public class ListTaskDefinitionFamiliesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The <code>familyPrefix</code> is a string that is used to filter the
     * results of <code>ListTaskDefinitionFamilies</code>. If you specify a
     * <code>familyPrefix</code>, only task definition family names that begin
     * with the <code>familyPrefix</code> string are returned.
     * </p>
     */
    private String familyPrefix;

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, ALL
     */
    private String status;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListTaskDefinitionFamilies</code> request indicating that more
     * results are available to fulfill the request and further calls will be
     * needed. If <code>maxResults</code> was provided, it is possible the
     * number of results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of task definition family results returned by
     * <code>ListTaskDefinitionFamilies</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitionFamilies</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitionFamilies</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The <code>familyPrefix</code> is a string that is used to filter the
     * results of <code>ListTaskDefinitionFamilies</code>. If you specify a
     * <code>familyPrefix</code>, only task definition family names that begin
     * with the <code>familyPrefix</code> string are returned.
     * </p>
     *
     * @return <p>
     *         The <code>familyPrefix</code> is a string that is used to filter
     *         the results of <code>ListTaskDefinitionFamilies</code>. If you
     *         specify a <code>familyPrefix</code>, only task definition family
     *         names that begin with the <code>familyPrefix</code> string are
     *         returned.
     *         </p>
     */
    public String getFamilyPrefix() {
        return familyPrefix;
    }

    /**
     * <p>
     * The <code>familyPrefix</code> is a string that is used to filter the
     * results of <code>ListTaskDefinitionFamilies</code>. If you specify a
     * <code>familyPrefix</code>, only task definition family names that begin
     * with the <code>familyPrefix</code> string are returned.
     * </p>
     *
     * @param familyPrefix <p>
     *            The <code>familyPrefix</code> is a string that is used to
     *            filter the results of <code>ListTaskDefinitionFamilies</code>.
     *            If you specify a <code>familyPrefix</code>, only task
     *            definition family names that begin with the
     *            <code>familyPrefix</code> string are returned.
     *            </p>
     */
    public void setFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
    }

    /**
     * <p>
     * The <code>familyPrefix</code> is a string that is used to filter the
     * results of <code>ListTaskDefinitionFamilies</code>. If you specify a
     * <code>familyPrefix</code>, only task definition family names that begin
     * with the <code>familyPrefix</code> string are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param familyPrefix <p>
     *            The <code>familyPrefix</code> is a string that is used to
     *            filter the results of <code>ListTaskDefinitionFamilies</code>.
     *            If you specify a <code>familyPrefix</code>, only task
     *            definition family names that begin with the
     *            <code>familyPrefix</code> string are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskDefinitionFamiliesRequest withFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
        return this;
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, ALL
     *
     * @return <p>
     *         The task definition family status with which to filter the
     *         <code>ListTaskDefinitionFamilies</code> results. By default, both
     *         <code>ACTIVE</code> and <code>INACTIVE</code> task definition
     *         families are listed. If this parameter is set to
     *         <code>ACTIVE</code>, only task definition families that have an
     *         <code>ACTIVE</code> task definition revision are returned. If
     *         this parameter is set to <code>INACTIVE</code>, only task
     *         definition families that do not have any <code>ACTIVE</code> task
     *         definition revisions are returned. If you paginate the resulting
     *         output, be sure to keep the <code>status</code> value constant in
     *         each subsequent request.
     *         </p>
     * @see TaskDefinitionFamilyStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, ALL
     *
     * @param status <p>
     *            The task definition family status with which to filter the
     *            <code>ListTaskDefinitionFamilies</code> results. By default,
     *            both <code>ACTIVE</code> and <code>INACTIVE</code> task
     *            definition families are listed. If this parameter is set to
     *            <code>ACTIVE</code>, only task definition families that have
     *            an <code>ACTIVE</code> task definition revision are returned.
     *            If this parameter is set to <code>INACTIVE</code>, only task
     *            definition families that do not have any <code>ACTIVE</code>
     *            task definition revisions are returned. If you paginate the
     *            resulting output, be sure to keep the <code>status</code>
     *            value constant in each subsequent request.
     *            </p>
     * @see TaskDefinitionFamilyStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, ALL
     *
     * @param status <p>
     *            The task definition family status with which to filter the
     *            <code>ListTaskDefinitionFamilies</code> results. By default,
     *            both <code>ACTIVE</code> and <code>INACTIVE</code> task
     *            definition families are listed. If this parameter is set to
     *            <code>ACTIVE</code>, only task definition families that have
     *            an <code>ACTIVE</code> task definition revision are returned.
     *            If this parameter is set to <code>INACTIVE</code>, only task
     *            definition families that do not have any <code>ACTIVE</code>
     *            task definition revisions are returned. If you paginate the
     *            resulting output, be sure to keep the <code>status</code>
     *            value constant in each subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskDefinitionFamilyStatus
     */
    public ListTaskDefinitionFamiliesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, ALL
     *
     * @param status <p>
     *            The task definition family status with which to filter the
     *            <code>ListTaskDefinitionFamilies</code> results. By default,
     *            both <code>ACTIVE</code> and <code>INACTIVE</code> task
     *            definition families are listed. If this parameter is set to
     *            <code>ACTIVE</code>, only task definition families that have
     *            an <code>ACTIVE</code> task definition revision are returned.
     *            If this parameter is set to <code>INACTIVE</code>, only task
     *            definition families that do not have any <code>ACTIVE</code>
     *            task definition revisions are returned. If you paginate the
     *            resulting output, be sure to keep the <code>status</code>
     *            value constant in each subsequent request.
     *            </p>
     * @see TaskDefinitionFamilyStatus
     */
    public void setStatus(TaskDefinitionFamilyStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The task definition family status with which to filter the
     * <code>ListTaskDefinitionFamilies</code> results. By default, both
     * <code>ACTIVE</code> and <code>INACTIVE</code> task definition families
     * are listed. If this parameter is set to <code>ACTIVE</code>, only task
     * definition families that have an <code>ACTIVE</code> task definition
     * revision are returned. If this parameter is set to <code>INACTIVE</code>,
     * only task definition families that do not have any <code>ACTIVE</code>
     * task definition revisions are returned. If you paginate the resulting
     * output, be sure to keep the <code>status</code> value constant in each
     * subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, ALL
     *
     * @param status <p>
     *            The task definition family status with which to filter the
     *            <code>ListTaskDefinitionFamilies</code> results. By default,
     *            both <code>ACTIVE</code> and <code>INACTIVE</code> task
     *            definition families are listed. If this parameter is set to
     *            <code>ACTIVE</code>, only task definition families that have
     *            an <code>ACTIVE</code> task definition revision are returned.
     *            If this parameter is set to <code>INACTIVE</code>, only task
     *            definition families that do not have any <code>ACTIVE</code>
     *            task definition revisions are returned. If you paginate the
     *            resulting output, be sure to keep the <code>status</code>
     *            value constant in each subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskDefinitionFamilyStatus
     */
    public ListTaskDefinitionFamiliesRequest withStatus(TaskDefinitionFamilyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListTaskDefinitionFamilies</code> request indicating that more
     * results are available to fulfill the request and further calls will be
     * needed. If <code>maxResults</code> was provided, it is possible the
     * number of results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @return <p>
     *         The <code>nextToken</code> value returned from a
     *         <code>ListTaskDefinitionFamilies</code> request indicating that
     *         more results are available to fulfill the request and further
     *         calls will be needed. If <code>maxResults</code> was provided, it
     *         is possible the number of results to be fewer than
     *         <code>maxResults</code>.
     *         </p>
     *         <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only
     *         used to retrieve the next items in a list and not for other
     *         programmatic purposes.
     *         </p>
     *         </note>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListTaskDefinitionFamilies</code> request indicating that more
     * results are available to fulfill the request and further calls will be
     * needed. If <code>maxResults</code> was provided, it is possible the
     * number of results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListTaskDefinitionFamilies</code> request indicating
     *            that more results are available to fulfill the request and
     *            further calls will be needed. If <code>maxResults</code> was
     *            provided, it is possible the number of results to be fewer
     *            than <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListTaskDefinitionFamilies</code> request indicating that more
     * results are available to fulfill the request and further calls will be
     * needed. If <code>maxResults</code> was provided, it is possible the
     * number of results to be fewer than <code>maxResults</code>.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to
     * retrieve the next items in a list and not for other programmatic
     * purposes.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value returned from a
     *            <code>ListTaskDefinitionFamilies</code> request indicating
     *            that more results are available to fulfill the request and
     *            further calls will be needed. If <code>maxResults</code> was
     *            provided, it is possible the number of results to be fewer
     *            than <code>maxResults</code>.
     *            </p>
     *            <note>
     *            <p>
     *            This token should be treated as an opaque identifier that is
     *            only used to retrieve the next items in a list and not for
     *            other programmatic purposes.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskDefinitionFamiliesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of task definition family results returned by
     * <code>ListTaskDefinitionFamilies</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitionFamilies</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitionFamilies</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     *
     * @return <p>
     *         The maximum number of task definition family results returned by
     *         <code>ListTaskDefinitionFamilies</code> in paginated output. When
     *         this parameter is used, <code>ListTaskDefinitions</code> only
     *         returns <code>maxResults</code> results in a single page along
     *         with a <code>nextToken</code> response element. The remaining
     *         results of the initial request can be seen by sending another
     *         <code>ListTaskDefinitionFamilies</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If this parameter is not used, then
     *         <code>ListTaskDefinitionFamilies</code> returns up to 100 results
     *         and a <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of task definition family results returned by
     * <code>ListTaskDefinitionFamilies</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitionFamilies</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitionFamilies</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of task definition family results returned
     *            by <code>ListTaskDefinitionFamilies</code> in paginated
     *            output. When this parameter is used,
     *            <code>ListTaskDefinitions</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListTaskDefinitionFamilies</code> request with the
     *            returned <code>nextToken</code> value. This value can be
     *            between 1 and 100. If this parameter is not used, then
     *            <code>ListTaskDefinitionFamilies</code> returns up to 100
     *            results and a <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of task definition family results returned by
     * <code>ListTaskDefinitionFamilies</code> in paginated output. When this
     * parameter is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitionFamilies</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitionFamilies</code>
     * returns up to 100 results and a <code>nextToken</code> value if
     * applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of task definition family results returned
     *            by <code>ListTaskDefinitionFamilies</code> in paginated
     *            output. When this parameter is used,
     *            <code>ListTaskDefinitions</code> only returns
     *            <code>maxResults</code> results in a single page along with a
     *            <code>nextToken</code> response element. The remaining results
     *            of the initial request can be seen by sending another
     *            <code>ListTaskDefinitionFamilies</code> request with the
     *            returned <code>nextToken</code> value. This value can be
     *            between 1 and 100. If this parameter is not used, then
     *            <code>ListTaskDefinitionFamilies</code> returns up to 100
     *            results and a <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskDefinitionFamiliesRequest withMaxResults(Integer maxResults) {
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
        if (getFamilyPrefix() != null)
            sb.append("familyPrefix: " + getFamilyPrefix() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFamilyPrefix() == null) ? 0 : getFamilyPrefix().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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

        if (obj instanceof ListTaskDefinitionFamiliesRequest == false)
            return false;
        ListTaskDefinitionFamiliesRequest other = (ListTaskDefinitionFamiliesRequest) obj;

        if (other.getFamilyPrefix() == null ^ this.getFamilyPrefix() == null)
            return false;
        if (other.getFamilyPrefix() != null
                && other.getFamilyPrefix().equals(this.getFamilyPrefix()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
