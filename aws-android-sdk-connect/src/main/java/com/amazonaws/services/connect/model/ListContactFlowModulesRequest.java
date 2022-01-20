/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about the contact flow modules for the specified Amazon
 * Connect instance.
 * </p>
 */
public class ListContactFlowModulesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

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
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The state of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     */
    private String contactFlowModuleState;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactFlowModulesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
    public ListContactFlowModulesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
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
     * <b>Range: </b>1 - 1000<br/>
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
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListContactFlowModulesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The state of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @return <p>
     *         The state of the contact flow module.
     *         </p>
     * @see ContactFlowModuleState
     */
    public String getContactFlowModuleState() {
        return contactFlowModuleState;
    }

    /**
     * <p>
     * The state of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param contactFlowModuleState <p>
     *            The state of the contact flow module.
     *            </p>
     * @see ContactFlowModuleState
     */
    public void setContactFlowModuleState(String contactFlowModuleState) {
        this.contactFlowModuleState = contactFlowModuleState;
    }

    /**
     * <p>
     * The state of the contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param contactFlowModuleState <p>
     *            The state of the contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowModuleState
     */
    public ListContactFlowModulesRequest withContactFlowModuleState(String contactFlowModuleState) {
        this.contactFlowModuleState = contactFlowModuleState;
        return this;
    }

    /**
     * <p>
     * The state of the contact flow module.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param contactFlowModuleState <p>
     *            The state of the contact flow module.
     *            </p>
     * @see ContactFlowModuleState
     */
    public void setContactFlowModuleState(ContactFlowModuleState contactFlowModuleState) {
        this.contactFlowModuleState = contactFlowModuleState.toString();
    }

    /**
     * <p>
     * The state of the contact flow module.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, ARCHIVED
     *
     * @param contactFlowModuleState <p>
     *            The state of the contact flow module.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactFlowModuleState
     */
    public ListContactFlowModulesRequest withContactFlowModuleState(
            ContactFlowModuleState contactFlowModuleState) {
        this.contactFlowModuleState = contactFlowModuleState.toString();
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getContactFlowModuleState() != null)
            sb.append("ContactFlowModuleState: " + getContactFlowModuleState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime
                * hashCode
                + ((getContactFlowModuleState() == null) ? 0 : getContactFlowModuleState()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListContactFlowModulesRequest == false)
            return false;
        ListContactFlowModulesRequest other = (ListContactFlowModulesRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getContactFlowModuleState() == null ^ this.getContactFlowModuleState() == null)
            return false;
        if (other.getContactFlowModuleState() != null
                && other.getContactFlowModuleState().equals(this.getContactFlowModuleState()) == false)
            return false;
        return true;
    }
}
