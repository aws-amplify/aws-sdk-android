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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists details about associated member accounts for the current GuardDuty
 * master account.
 * </p>
 */
public class ListMembersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of the detector the member is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 50. The maximum value is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies what member accounts the response includes based on their
     * relationship status with the master account. The default value is "true".
     * If set to "false" the response includes all existing member accounts
     * (including members who haven't been invited yet or have been
     * disassociated).
     * </p>
     */
    private String onlyAssociated;

    /**
     * <p>
     * The unique ID of the detector the member is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique ID of the detector the member is associated with.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector the member is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector the member is associated with.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector the member is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The unique ID of the detector the member is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 50. The maximum value is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         You can use this parameter to indicate the maximum number of
     *         items you want in the response. The default value is 50. The
     *         maximum value is 50.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 50. The maximum value is 50.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            You can use this parameter to indicate the maximum number of
     *            items you want in the response. The default value is 50. The
     *            maximum value is 50.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * You can use this parameter to indicate the maximum number of items you
     * want in the response. The default value is 50. The maximum value is 50.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            You can use this parameter to indicate the maximum number of
     *            items you want in the response. The default value is 50. The
     *            maximum value is 50.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     *
     * @return <p>
     *         You can use this parameter when paginating results. Set the value
     *         of this parameter to null on your first call to the list action.
     *         For subsequent calls to the action, fill nextToken in the request
     *         with the value of NextToken from the previous response to
     *         continue listing data.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     *
     * @param nextToken <p>
     *            You can use this parameter when paginating results. Set the
     *            value of this parameter to null on your first call to the list
     *            action. For subsequent calls to the action, fill nextToken in
     *            the request with the value of NextToken from the previous
     *            response to continue listing data.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use this parameter when paginating results. Set the value of this
     * parameter to null on your first call to the list action. For subsequent
     * calls to the action, fill nextToken in the request with the value of
     * NextToken from the previous response to continue listing data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            You can use this parameter when paginating results. Set the
     *            value of this parameter to null on your first call to the list
     *            action. For subsequent calls to the action, fill nextToken in
     *            the request with the value of NextToken from the previous
     *            response to continue listing data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Specifies what member accounts the response includes based on their
     * relationship status with the master account. The default value is "true".
     * If set to "false" the response includes all existing member accounts
     * (including members who haven't been invited yet or have been
     * disassociated).
     * </p>
     *
     * @return <p>
     *         Specifies what member accounts the response includes based on
     *         their relationship status with the master account. The default
     *         value is "true". If set to "false" the response includes all
     *         existing member accounts (including members who haven't been
     *         invited yet or have been disassociated).
     *         </p>
     */
    public String getOnlyAssociated() {
        return onlyAssociated;
    }

    /**
     * <p>
     * Specifies what member accounts the response includes based on their
     * relationship status with the master account. The default value is "true".
     * If set to "false" the response includes all existing member accounts
     * (including members who haven't been invited yet or have been
     * disassociated).
     * </p>
     *
     * @param onlyAssociated <p>
     *            Specifies what member accounts the response includes based on
     *            their relationship status with the master account. The default
     *            value is "true". If set to "false" the response includes all
     *            existing member accounts (including members who haven't been
     *            invited yet or have been disassociated).
     *            </p>
     */
    public void setOnlyAssociated(String onlyAssociated) {
        this.onlyAssociated = onlyAssociated;
    }

    /**
     * <p>
     * Specifies what member accounts the response includes based on their
     * relationship status with the master account. The default value is "true".
     * If set to "false" the response includes all existing member accounts
     * (including members who haven't been invited yet or have been
     * disassociated).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onlyAssociated <p>
     *            Specifies what member accounts the response includes based on
     *            their relationship status with the master account. The default
     *            value is "true". If set to "false" the response includes all
     *            existing member accounts (including members who haven't been
     *            invited yet or have been disassociated).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withOnlyAssociated(String onlyAssociated) {
        this.onlyAssociated = onlyAssociated;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOnlyAssociated() != null)
            sb.append("OnlyAssociated: " + getOnlyAssociated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getOnlyAssociated() == null) ? 0 : getOnlyAssociated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMembersRequest == false)
            return false;
        ListMembersRequest other = (ListMembersRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
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
        if (other.getOnlyAssociated() == null ^ this.getOnlyAssociated() == null)
            return false;
        if (other.getOnlyAssociated() != null
                && other.getOnlyAssociated().equals(this.getOnlyAssociated()) == false)
            return false;
        return true;
    }
}
