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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the trial components in your account. You can sort the list by trial
 * component name or creation time. You can filter the list to show only
 * components that were created in a specific time range. You can also filter on
 * one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ExperimentName</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SourceArn</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TrialName</code>
 * </p>
 * </li>
 * </ul>
 */
public class ListTrialComponentsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A filter that returns only components that are part of the specified
     * experiment. If you specify <code>ExperimentName</code>, you can't filter
     * by <code>SourceArn</code> or <code>TrialName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String experimentName;

    /**
     * <p>
     * A filter that returns only components that are part of the specified
     * trial. If you specify <code>TrialName</code>, you can't filter by
     * <code>ExperimentName</code> or <code>SourceArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String trialName;

    /**
     * <p>
     * A filter that returns only components that have the specified source
     * Amazon Resource Name (ARN). If you specify <code>SourceArn</code>, you
     * can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String sourceArn;

    /**
     * <p>
     * A filter that returns only components created after the specified time.
     * </p>
     */
    private java.util.Date createdAfter;

    /**
     * <p>
     * A filter that returns only components created before the specified time.
     * </p>
     */
    private java.util.Date createdBefore;

    /**
     * <p>
     * The property used to sort results. The default value is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     */
    private String sortBy;

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     */
    private String sortOrder;

    /**
     * <p>
     * The maximum number of components to return in the response. The default
     * value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the previous call to <code>ListTrialComponents</code> didn't return
     * the full set of components, the call returns a token for getting the next
     * set of components.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A filter that returns only components that are part of the specified
     * experiment. If you specify <code>ExperimentName</code>, you can't filter
     * by <code>SourceArn</code> or <code>TrialName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         A filter that returns only components that are part of the
     *         specified experiment. If you specify <code>ExperimentName</code>,
     *         you can't filter by <code>SourceArn</code> or
     *         <code>TrialName</code>.
     *         </p>
     */
    public String getExperimentName() {
        return experimentName;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified
     * experiment. If you specify <code>ExperimentName</code>, you can't filter
     * by <code>SourceArn</code> or <code>TrialName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param experimentName <p>
     *            A filter that returns only components that are part of the
     *            specified experiment. If you specify
     *            <code>ExperimentName</code>, you can't filter by
     *            <code>SourceArn</code> or <code>TrialName</code>.
     *            </p>
     */
    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified
     * experiment. If you specify <code>ExperimentName</code>, you can't filter
     * by <code>SourceArn</code> or <code>TrialName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param experimentName <p>
     *            A filter that returns only components that are part of the
     *            specified experiment. If you specify
     *            <code>ExperimentName</code>, you can't filter by
     *            <code>SourceArn</code> or <code>TrialName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsRequest withExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified
     * trial. If you specify <code>TrialName</code>, you can't filter by
     * <code>ExperimentName</code> or <code>SourceArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         A filter that returns only components that are part of the
     *         specified trial. If you specify <code>TrialName</code>, you can't
     *         filter by <code>ExperimentName</code> or <code>SourceArn</code>.
     *         </p>
     */
    public String getTrialName() {
        return trialName;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified
     * trial. If you specify <code>TrialName</code>, you can't filter by
     * <code>ExperimentName</code> or <code>SourceArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            A filter that returns only components that are part of the
     *            specified trial. If you specify <code>TrialName</code>, you
     *            can't filter by <code>ExperimentName</code> or
     *            <code>SourceArn</code>.
     *            </p>
     */
    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified
     * trial. If you specify <code>TrialName</code>, you can't filter by
     * <code>ExperimentName</code> or <code>SourceArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 82<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param trialName <p>
     *            A filter that returns only components that are part of the
     *            specified trial. If you specify <code>TrialName</code>, you
     *            can't filter by <code>ExperimentName</code> or
     *            <code>SourceArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsRequest withTrialName(String trialName) {
        this.trialName = trialName;
        return this;
    }

    /**
     * <p>
     * A filter that returns only components that have the specified source
     * Amazon Resource Name (ARN). If you specify <code>SourceArn</code>, you
     * can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         A filter that returns only components that have the specified
     *         source Amazon Resource Name (ARN). If you specify
     *         <code>SourceArn</code>, you can't filter by
     *         <code>ExperimentName</code> or <code>TrialName</code>.
     *         </p>
     */
    public String getSourceArn() {
        return sourceArn;
    }

    /**
     * <p>
     * A filter that returns only components that have the specified source
     * Amazon Resource Name (ARN). If you specify <code>SourceArn</code>, you
     * can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param sourceArn <p>
     *            A filter that returns only components that have the specified
     *            source Amazon Resource Name (ARN). If you specify
     *            <code>SourceArn</code>, you can't filter by
     *            <code>ExperimentName</code> or <code>TrialName</code>.
     *            </p>
     */
    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * A filter that returns only components that have the specified source
     * Amazon Resource Name (ARN). If you specify <code>SourceArn</code>, you
     * can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param sourceArn <p>
     *            A filter that returns only components that have the specified
     *            source Amazon Resource Name (ARN). If you specify
     *            <code>SourceArn</code>, you can't filter by
     *            <code>ExperimentName</code> or <code>TrialName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsRequest withSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }

    /**
     * <p>
     * A filter that returns only components created after the specified time.
     * </p>
     *
     * @return <p>
     *         A filter that returns only components created after the specified
     *         time.
     *         </p>
     */
    public java.util.Date getCreatedAfter() {
        return createdAfter;
    }

    /**
     * <p>
     * A filter that returns only components created after the specified time.
     * </p>
     *
     * @param createdAfter <p>
     *            A filter that returns only components created after the
     *            specified time.
     *            </p>
     */
    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * A filter that returns only components created after the specified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAfter <p>
     *            A filter that returns only components created after the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsRequest withCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }

    /**
     * <p>
     * A filter that returns only components created before the specified time.
     * </p>
     *
     * @return <p>
     *         A filter that returns only components created before the
     *         specified time.
     *         </p>
     */
    public java.util.Date getCreatedBefore() {
        return createdBefore;
    }

    /**
     * <p>
     * A filter that returns only components created before the specified time.
     * </p>
     *
     * @param createdBefore <p>
     *            A filter that returns only components created before the
     *            specified time.
     *            </p>
     */
    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * A filter that returns only components created before the specified time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBefore <p>
     *            A filter that returns only components created before the
     *            specified time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsRequest withCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @return <p>
     *         The property used to sort results. The default value is
     *         <code>CreationTime</code>.
     *         </p>
     * @see SortTrialComponentsBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @param sortBy <p>
     *            The property used to sort results. The default value is
     *            <code>CreationTime</code>.
     *            </p>
     * @see SortTrialComponentsBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @param sortBy <p>
     *            The property used to sort results. The default value is
     *            <code>CreationTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortTrialComponentsBy
     */
    public ListTrialComponentsRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @param sortBy <p>
     *            The property used to sort results. The default value is
     *            <code>CreationTime</code>.
     *            </p>
     * @see SortTrialComponentsBy
     */
    public void setSortBy(SortTrialComponentsBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * The property used to sort results. The default value is
     * <code>CreationTime</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Name, CreationTime
     *
     * @param sortBy <p>
     *            The property used to sort results. The default value is
     *            <code>CreationTime</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortTrialComponentsBy
     */
    public ListTrialComponentsRequest withSortBy(SortTrialComponentsBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @return <p>
     *         The sort order. The default value is <code>Descending</code>.
     *         </p>
     * @see SortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order. The default value is <code>Descending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order. The default value is <code>Descending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListTrialComponentsRequest withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order. The default value is <code>Descending</code>.
     *            </p>
     * @see SortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ascending, Descending
     *
     * @param sortOrder <p>
     *            The sort order. The default value is <code>Descending</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SortOrder
     */
    public ListTrialComponentsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of components to return in the response. The default
     * value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of components to return in the response. The
     *         default value is 10.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of components to return in the response. The default
     * value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of components to return in the response.
     *            The default value is 10.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of components to return in the response. The default
     * value is 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of components to return in the response.
     *            The default value is 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrialComponents</code> didn't return
     * the full set of components, the call returns a token for getting the next
     * set of components.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the previous call to <code>ListTrialComponents</code> didn't
     *         return the full set of components, the call returns a token for
     *         getting the next set of components.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrialComponents</code> didn't return
     * the full set of components, the call returns a token for getting the next
     * set of components.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the previous call to <code>ListTrialComponents</code>
     *            didn't return the full set of components, the call returns a
     *            token for getting the next set of components.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrialComponents</code> didn't return
     * the full set of components, the call returns a token for getting the next
     * set of components.
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
     *            If the previous call to <code>ListTrialComponents</code>
     *            didn't return the full set of components, the call returns a
     *            token for getting the next set of components.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrialComponentsRequest withNextToken(String nextToken) {
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
        if (getExperimentName() != null)
            sb.append("ExperimentName: " + getExperimentName() + ",");
        if (getTrialName() != null)
            sb.append("TrialName: " + getTrialName() + ",");
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: " + getCreatedAfter() + ",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: " + getCreatedBefore() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy() + ",");
        if (getSortOrder() != null)
            sb.append("SortOrder: " + getSortOrder() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
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
                + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrialComponentsRequest == false)
            return false;
        ListTrialComponentsRequest other = (ListTrialComponentsRequest) obj;

        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null
                && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null
                && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null
                && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null
                && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null
                && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null
                && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
