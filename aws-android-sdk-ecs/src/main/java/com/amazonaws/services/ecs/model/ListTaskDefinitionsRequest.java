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
 * Returns a list of task definitions that are registered to your account. You
 * can filter the results by family name with the <code>familyPrefix</code>
 * parameter or by status with the <code>status</code> parameter.
 * </p>
 */
public class ListTaskDefinitionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The full family name with which to filter the
     * <code>ListTaskDefinitions</code> results. Specifying a
     * <code>familyPrefix</code> limits the listed task definitions to task
     * definition revisions that belong to that family.
     * </p>
     */
    private String familyPrefix;

    /**
     * <p>
     * The task definition status with which to filter the
     * <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this
     * parameter to <code>INACTIVE</code>, you can view task definitions that
     * are <code>INACTIVE</code> as long as an active task or service still
     * references them. If you paginate the resulting output, be sure to keep
     * the <code>status</code> value constant in each subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     */
    private String status;

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code>
     * and <code>DESC</code>. By default (<code>ASC</code>), task definitions
     * are listed lexicographically by family name and in ascending numerical
     * order by revision so that the newest task definitions in a family are
     * listed last. Setting this parameter to <code>DESC</code> reverses the
     * sort order on family name and revision so that the newest task
     * definitions in a family are listed first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     */
    private String sort;

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListTaskDefinitions</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
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
     * The maximum number of task definition results returned by
     * <code>ListTaskDefinitions</code> in paginated output. When this parameter
     * is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitions</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitions</code> returns
     * up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The full family name with which to filter the
     * <code>ListTaskDefinitions</code> results. Specifying a
     * <code>familyPrefix</code> limits the listed task definitions to task
     * definition revisions that belong to that family.
     * </p>
     *
     * @return <p>
     *         The full family name with which to filter the
     *         <code>ListTaskDefinitions</code> results. Specifying a
     *         <code>familyPrefix</code> limits the listed task definitions to
     *         task definition revisions that belong to that family.
     *         </p>
     */
    public String getFamilyPrefix() {
        return familyPrefix;
    }

    /**
     * <p>
     * The full family name with which to filter the
     * <code>ListTaskDefinitions</code> results. Specifying a
     * <code>familyPrefix</code> limits the listed task definitions to task
     * definition revisions that belong to that family.
     * </p>
     *
     * @param familyPrefix <p>
     *            The full family name with which to filter the
     *            <code>ListTaskDefinitions</code> results. Specifying a
     *            <code>familyPrefix</code> limits the listed task definitions
     *            to task definition revisions that belong to that family.
     *            </p>
     */
    public void setFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
    }

    /**
     * <p>
     * The full family name with which to filter the
     * <code>ListTaskDefinitions</code> results. Specifying a
     * <code>familyPrefix</code> limits the listed task definitions to task
     * definition revisions that belong to that family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param familyPrefix <p>
     *            The full family name with which to filter the
     *            <code>ListTaskDefinitions</code> results. Specifying a
     *            <code>familyPrefix</code> limits the listed task definitions
     *            to task definition revisions that belong to that family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskDefinitionsRequest withFamilyPrefix(String familyPrefix) {
        this.familyPrefix = familyPrefix;
        return this;
    }

    /**
     * <p>
     * The task definition status with which to filter the
     * <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this
     * parameter to <code>INACTIVE</code>, you can view task definitions that
     * are <code>INACTIVE</code> as long as an active task or service still
     * references them. If you paginate the resulting output, be sure to keep
     * the <code>status</code> value constant in each subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @return <p>
     *         The task definition status with which to filter the
     *         <code>ListTaskDefinitions</code> results. By default, only
     *         <code>ACTIVE</code> task definitions are listed. By setting this
     *         parameter to <code>INACTIVE</code>, you can view task definitions
     *         that are <code>INACTIVE</code> as long as an active task or
     *         service still references them. If you paginate the resulting
     *         output, be sure to keep the <code>status</code> value constant in
     *         each subsequent request.
     *         </p>
     * @see TaskDefinitionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The task definition status with which to filter the
     * <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this
     * parameter to <code>INACTIVE</code>, you can view task definitions that
     * are <code>INACTIVE</code> as long as an active task or service still
     * references them. If you paginate the resulting output, be sure to keep
     * the <code>status</code> value constant in each subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The task definition status with which to filter the
     *            <code>ListTaskDefinitions</code> results. By default, only
     *            <code>ACTIVE</code> task definitions are listed. By setting
     *            this parameter to <code>INACTIVE</code>, you can view task
     *            definitions that are <code>INACTIVE</code> as long as an
     *            active task or service still references them. If you paginate
     *            the resulting output, be sure to keep the <code>status</code>
     *            value constant in each subsequent request.
     *            </p>
     * @see TaskDefinitionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The task definition status with which to filter the
     * <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this
     * parameter to <code>INACTIVE</code>, you can view task definitions that
     * are <code>INACTIVE</code> as long as an active task or service still
     * references them. If you paginate the resulting output, be sure to keep
     * the <code>status</code> value constant in each subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The task definition status with which to filter the
     *            <code>ListTaskDefinitions</code> results. By default, only
     *            <code>ACTIVE</code> task definitions are listed. By setting
     *            this parameter to <code>INACTIVE</code>, you can view task
     *            definitions that are <code>INACTIVE</code> as long as an
     *            active task or service still references them. If you paginate
     *            the resulting output, be sure to keep the <code>status</code>
     *            value constant in each subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskDefinitionStatus
     */
    public ListTaskDefinitionsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The task definition status with which to filter the
     * <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this
     * parameter to <code>INACTIVE</code>, you can view task definitions that
     * are <code>INACTIVE</code> as long as an active task or service still
     * references them. If you paginate the resulting output, be sure to keep
     * the <code>status</code> value constant in each subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The task definition status with which to filter the
     *            <code>ListTaskDefinitions</code> results. By default, only
     *            <code>ACTIVE</code> task definitions are listed. By setting
     *            this parameter to <code>INACTIVE</code>, you can view task
     *            definitions that are <code>INACTIVE</code> as long as an
     *            active task or service still references them. If you paginate
     *            the resulting output, be sure to keep the <code>status</code>
     *            value constant in each subsequent request.
     *            </p>
     * @see TaskDefinitionStatus
     */
    public void setStatus(TaskDefinitionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The task definition status with which to filter the
     * <code>ListTaskDefinitions</code> results. By default, only
     * <code>ACTIVE</code> task definitions are listed. By setting this
     * parameter to <code>INACTIVE</code>, you can view task definitions that
     * are <code>INACTIVE</code> as long as an active task or service still
     * references them. If you paginate the resulting output, be sure to keep
     * the <code>status</code> value constant in each subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE
     *
     * @param status <p>
     *            The task definition status with which to filter the
     *            <code>ListTaskDefinitions</code> results. By default, only
     *            <code>ACTIVE</code> task definitions are listed. By setting
     *            this parameter to <code>INACTIVE</code>, you can view task
     *            definitions that are <code>INACTIVE</code> as long as an
     *            active task or service still references them. If you paginate
     *            the resulting output, be sure to keep the <code>status</code>
     *            value constant in each subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TaskDefinitionStatus
     */
    public ListTaskDefinitionsRequest withStatus(TaskDefinitionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code>
     * and <code>DESC</code>. By default (<code>ASC</code>), task definitions
     * are listed lexicographically by family name and in ascending numerical
     * order by revision so that the newest task definitions in a family are
     * listed last. Setting this parameter to <code>DESC</code> reverses the
     * sort order on family name and revision so that the newest task
     * definitions in a family are listed first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @return <p>
     *         The order in which to sort the results. Valid values are
     *         <code>ASC</code> and <code>DESC</code>. By default (
     *         <code>ASC</code>), task definitions are listed lexicographically
     *         by family name and in ascending numerical order by revision so
     *         that the newest task definitions in a family are listed last.
     *         Setting this parameter to <code>DESC</code> reverses the sort
     *         order on family name and revision so that the newest task
     *         definitions in a family are listed first.
     *         </p>
     * @see SortOrder
     */
    public String getSort() {
        return sort;
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code>
     * and <code>DESC</code>. By default (<code>ASC</code>), task definitions
     * are listed lexicographically by family name and in ascending numerical
     * order by revision so that the newest task definitions in a family are
     * listed last. Setting this parameter to <code>DESC</code> reverses the
     * sort order on family name and revision so that the newest task
     * definitions in a family are listed first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sort <p>
     *            The order in which to sort the results. Valid values are
     *            <code>ASC</code> and <code>DESC</code>. By default (
     *            <code>ASC</code>), task definitions are listed
     *            lexicographically by family name and in ascending numerical
     *            order by revision so that the newest task definitions in a
     *            family are listed last. Setting this parameter to
     *            <code>DESC</code> reverses the sort order on family name and
     *            revision so that the newest task definitions in a family are
     *            listed first.
     *            </p>
     * @see SortOrder
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code>
     * and <code>DESC</code>. By default (<code>ASC</code>), task definitions
     * are listed lexicographically by family name and in ascending numerical
     * order by revision so that the newest task definitions in a family are
     * listed last. Setting this parameter to <code>DESC</code> reverses the
     * sort order on family name and revision so that the newest task
     * definitions in a family are listed first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sort <p>
     *            The order in which to sort the results. Valid values are
     *            <code>ASC</code> and <code>DESC</code>. By default (
     *            <code>ASC</code>), task definitions are listed
     *            lexicographically by family name and in ascending numerical
     *            order by revision so that the newest task definitions in a
     *            family are listed last. Setting this parameter to
     *            <code>DESC</code> reverses the sort order on family name and
     *            revision so that the newest task definitions in a family are
     *            listed first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListTaskDefinitionsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code>
     * and <code>DESC</code>. By default (<code>ASC</code>), task definitions
     * are listed lexicographically by family name and in ascending numerical
     * order by revision so that the newest task definitions in a family are
     * listed last. Setting this parameter to <code>DESC</code> reverses the
     * sort order on family name and revision so that the newest task
     * definitions in a family are listed first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sort <p>
     *            The order in which to sort the results. Valid values are
     *            <code>ASC</code> and <code>DESC</code>. By default (
     *            <code>ASC</code>), task definitions are listed
     *            lexicographically by family name and in ascending numerical
     *            order by revision so that the newest task definitions in a
     *            family are listed last. Setting this parameter to
     *            <code>DESC</code> reverses the sort order on family name and
     *            revision so that the newest task definitions in a family are
     *            listed first.
     *            </p>
     * @see SortOrder
     */
    public void setSort(SortOrder sort) {
        this.sort = sort.toString();
    }

    /**
     * <p>
     * The order in which to sort the results. Valid values are <code>ASC</code>
     * and <code>DESC</code>. By default (<code>ASC</code>), task definitions
     * are listed lexicographically by family name and in ascending numerical
     * order by revision so that the newest task definitions in a family are
     * listed last. Setting this parameter to <code>DESC</code> reverses the
     * sort order on family name and revision so that the newest task
     * definitions in a family are listed first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASC, DESC
     *
     * @param sort <p>
     *            The order in which to sort the results. Valid values are
     *            <code>ASC</code> and <code>DESC</code>. By default (
     *            <code>ASC</code>), task definitions are listed
     *            lexicographically by family name and in ascending numerical
     *            order by revision so that the newest task definitions in a
     *            family are listed last. Setting this parameter to
     *            <code>DESC</code> reverses the sort order on family name and
     *            revision so that the newest task definitions in a family are
     *            listed first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListTaskDefinitionsRequest withSort(SortOrder sort) {
        this.sort = sort.toString();
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a
     * <code>ListTaskDefinitions</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
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
     *         <code>ListTaskDefinitions</code> request indicating that more
     *         results are available to fulfill the request and further calls
     *         will be needed. If <code>maxResults</code> was provided, it is
     *         possible the number of results to be fewer than
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
     * <code>ListTaskDefinitions</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
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
     *            <code>ListTaskDefinitions</code> request indicating that more
     *            results are available to fulfill the request and further calls
     *            will be needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
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
     * <code>ListTaskDefinitions</code> request indicating that more results are
     * available to fulfill the request and further calls will be needed. If
     * <code>maxResults</code> was provided, it is possible the number of
     * results to be fewer than <code>maxResults</code>.
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
     *            <code>ListTaskDefinitions</code> request indicating that more
     *            results are available to fulfill the request and further calls
     *            will be needed. If <code>maxResults</code> was provided, it is
     *            possible the number of results to be fewer than
     *            <code>maxResults</code>.
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
    public ListTaskDefinitionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of task definition results returned by
     * <code>ListTaskDefinitions</code> in paginated output. When this parameter
     * is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitions</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitions</code> returns
     * up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @return <p>
     *         The maximum number of task definition results returned by
     *         <code>ListTaskDefinitions</code> in paginated output. When this
     *         parameter is used, <code>ListTaskDefinitions</code> only returns
     *         <code>maxResults</code> results in a single page along with a
     *         <code>nextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>ListTaskDefinitions</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and
     *         100. If this parameter is not used, then
     *         <code>ListTaskDefinitions</code> returns up to 100 results and a
     *         <code>nextToken</code> value if applicable.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of task definition results returned by
     * <code>ListTaskDefinitions</code> in paginated output. When this parameter
     * is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitions</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitions</code> returns
     * up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of task definition results returned by
     *            <code>ListTaskDefinitions</code> in paginated output. When
     *            this parameter is used, <code>ListTaskDefinitions</code> only
     *            returns <code>maxResults</code> results in a single page along
     *            with a <code>nextToken</code> response element. The remaining
     *            results of the initial request can be seen by sending another
     *            <code>ListTaskDefinitions</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListTaskDefinitions</code> returns up to 100 results and
     *            a <code>nextToken</code> value if applicable.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of task definition results returned by
     * <code>ListTaskDefinitions</code> in paginated output. When this parameter
     * is used, <code>ListTaskDefinitions</code> only returns
     * <code>maxResults</code> results in a single page along with a
     * <code>nextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>ListTaskDefinitions</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If
     * this parameter is not used, then <code>ListTaskDefinitions</code> returns
     * up to 100 results and a <code>nextToken</code> value if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of task definition results returned by
     *            <code>ListTaskDefinitions</code> in paginated output. When
     *            this parameter is used, <code>ListTaskDefinitions</code> only
     *            returns <code>maxResults</code> results in a single page along
     *            with a <code>nextToken</code> response element. The remaining
     *            results of the initial request can be seen by sending another
     *            <code>ListTaskDefinitions</code> request with the returned
     *            <code>nextToken</code> value. This value can be between 1 and
     *            100. If this parameter is not used, then
     *            <code>ListTaskDefinitions</code> returns up to 100 results and
     *            a <code>nextToken</code> value if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskDefinitionsRequest withMaxResults(Integer maxResults) {
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
        if (getSort() != null)
            sb.append("sort: " + getSort() + ",");
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
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
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

        if (obj instanceof ListTaskDefinitionsRequest == false)
            return false;
        ListTaskDefinitionsRequest other = (ListTaskDefinitionsRequest) obj;

        if (other.getFamilyPrefix() == null ^ this.getFamilyPrefix() == null)
            return false;
        if (other.getFamilyPrefix() != null
                && other.getFamilyPrefix().equals(this.getFamilyPrefix()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
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
