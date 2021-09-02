/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a list of all mitigation actions that match the specified filter
 * criteria.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >ListMitigationActions</a> action.
 * </p>
 */
public class ListMitigationActionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specify a value to limit the result to mitigation actions with a specific
     * action type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     */
    private String actionType;

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specify a value to limit the result to mitigation actions with a specific
     * action type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @return <p>
     *         Specify a value to limit the result to mitigation actions with a
     *         specific action type.
     *         </p>
     * @see MitigationActionType
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * <p>
     * Specify a value to limit the result to mitigation actions with a specific
     * action type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @param actionType <p>
     *            Specify a value to limit the result to mitigation actions with
     *            a specific action type.
     *            </p>
     * @see MitigationActionType
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * Specify a value to limit the result to mitigation actions with a specific
     * action type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @param actionType <p>
     *            Specify a value to limit the result to mitigation actions with
     *            a specific action type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MitigationActionType
     */
    public ListMitigationActionsRequest withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * <p>
     * Specify a value to limit the result to mitigation actions with a specific
     * action type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @param actionType <p>
     *            Specify a value to limit the result to mitigation actions with
     *            a specific action type.
     *            </p>
     * @see MitigationActionType
     */
    public void setActionType(MitigationActionType actionType) {
        this.actionType = actionType.toString();
    }

    /**
     * <p>
     * Specify a value to limit the result to mitigation actions with a specific
     * action type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPDATE_DEVICE_CERTIFICATE, UPDATE_CA_CERTIFICATE,
     * ADD_THINGS_TO_THING_GROUP, REPLACE_DEFAULT_POLICY_VERSION,
     * ENABLE_IOT_LOGGING, PUBLISH_FINDING_TO_SNS
     *
     * @param actionType <p>
     *            Specify a value to limit the result to mitigation actions with
     *            a specific action type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MitigationActionType
     */
    public ListMitigationActionsRequest withActionType(MitigationActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time. The default
     *         is 25.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time. The
     *            default is 25.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time. The
     *            default is 25.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMitigationActionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMitigationActionsRequest withNextToken(String nextToken) {
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
        if (getActionType() != null)
            sb.append("actionType: " + getActionType() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
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

        if (obj instanceof ListMitigationActionsRequest == false)
            return false;
        ListMitigationActionsRequest other = (ListMitigationActionsRequest) obj;

        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null
                && other.getActionType().equals(this.getActionType()) == false)
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
