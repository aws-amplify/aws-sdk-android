/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List all rules for the specified Amazon Connect instance.
 * </p>
 */
public class ListRulesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     */
    private String publishStatus;

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     */
    private String eventSourceName;

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRulesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @return <p>
     *         The publish status of the rule.
     *         </p>
     * @see RulePublishStatus
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @see RulePublishStatus
     */
    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RulePublishStatus
     */
    public ListRulesRequest withPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @see RulePublishStatus
     */
    public void setPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RulePublishStatus
     */
    public ListRulesRequest withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @return <p>
     *         The name of the event source.
     *         </p>
     * @see EventSourceName
     */
    public String getEventSourceName() {
        return eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @param eventSourceName <p>
     *            The name of the event source.
     *            </p>
     * @see EventSourceName
     */
    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @param eventSourceName <p>
     *            The name of the event source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventSourceName
     */
    public ListRulesRequest withEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @param eventSourceName <p>
     *            The name of the event source.
     *            </p>
     * @see EventSourceName
     */
    public void setEventSourceName(EventSourceName eventSourceName) {
        this.eventSourceName = eventSourceName.toString();
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OnPostCallAnalysisAvailable,
     * OnRealTimeCallAnalysisAvailable, OnPostChatAnalysisAvailable,
     * OnZendeskTicketCreate, OnZendeskTicketStatusUpdate,
     * OnSalesforceCaseCreate, OnContactEvaluationSubmit
     *
     * @param eventSourceName <p>
     *            The name of the event source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventSourceName
     */
    public ListRulesRequest withEventSourceName(EventSourceName eventSourceName) {
        this.eventSourceName = eventSourceName.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @return <p>
     *         The maximum number of results to return per page.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 200<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRulesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results. Use the value returned in
     *         the previous response in the next request to retrieve the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the
     * previous response in the next request to retrieve the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results. Use the value returned
     *            in the previous response in the next request to retrieve the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRulesRequest withNextToken(String nextToken) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: " + getPublishStatus() + ",");
        if (getEventSourceName() != null)
            sb.append("EventSourceName: " + getEventSourceName() + ",");
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEventSourceName() == null) ? 0 : getEventSourceName().hashCode());
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

        if (obj instanceof ListRulesRequest == false)
            return false;
        ListRulesRequest other = (ListRulesRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPublishStatus() == null ^ this.getPublishStatus() == null)
            return false;
        if (other.getPublishStatus() != null
                && other.getPublishStatus().equals(this.getPublishStatus()) == false)
            return false;
        if (other.getEventSourceName() == null ^ this.getEventSourceName() == null)
            return false;
        if (other.getEventSourceName() != null
                && other.getEventSourceName().equals(this.getEventSourceName()) == false)
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
