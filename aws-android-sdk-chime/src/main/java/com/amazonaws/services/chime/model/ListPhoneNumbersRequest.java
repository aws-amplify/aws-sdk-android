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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime
 * user, Amazon Chime Voice Connector, or Amazon Chime Voice Connector group.
 * </p>
 */
public class ListPhoneNumbersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     */
    private String status;

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     */
    private String productType;

    /**
     * <p>
     * The filter to use to limit the number of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     */
    private String filterName;

    /**
     * <p>
     * The value to use for the filter.
     * </p>
     */
    private String filterValue;

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @return <p>
     *         The phone number status.
     *         </p>
     * @see PhoneNumberStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @see PhoneNumberStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberStatus
     */
    public ListPhoneNumbersRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @see PhoneNumberStatus
     */
    public void setStatus(PhoneNumberStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AcquireInProgress, AcquireFailed, Unassigned,
     * Assigned, ReleaseInProgress, DeleteInProgress, ReleaseFailed,
     * DeleteFailed
     *
     * @param status <p>
     *            The phone number status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberStatus
     */
    public ListPhoneNumbersRequest withStatus(PhoneNumberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @return <p>
     *         The phone number product type.
     *         </p>
     * @see PhoneNumberProductType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number product type.
     *            </p>
     * @see PhoneNumberProductType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberProductType
     */
    public ListPhoneNumbersRequest withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number product type.
     *            </p>
     * @see PhoneNumberProductType
     */
    public void setProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The phone number product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberProductType
     */
    public ListPhoneNumbersRequest withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The filter to use to limit the number of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @return <p>
     *         The filter to use to limit the number of results.
     *         </p>
     * @see PhoneNumberAssociationName
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * <p>
     * The filter to use to limit the number of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @param filterName <p>
     *            The filter to use to limit the number of results.
     *            </p>
     * @see PhoneNumberAssociationName
     */
    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * The filter to use to limit the number of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @param filterName <p>
     *            The filter to use to limit the number of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberAssociationName
     */
    public ListPhoneNumbersRequest withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * <p>
     * The filter to use to limit the number of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @param filterName <p>
     *            The filter to use to limit the number of results.
     *            </p>
     * @see PhoneNumberAssociationName
     */
    public void setFilterName(PhoneNumberAssociationName filterName) {
        this.filterName = filterName.toString();
    }

    /**
     * <p>
     * The filter to use to limit the number of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccountId, UserId, VoiceConnectorId,
     * VoiceConnectorGroupId
     *
     * @param filterName <p>
     *            The filter to use to limit the number of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberAssociationName
     */
    public ListPhoneNumbersRequest withFilterName(PhoneNumberAssociationName filterName) {
        this.filterName = filterName.toString();
        return this;
    }

    /**
     * <p>
     * The value to use for the filter.
     * </p>
     *
     * @return <p>
     *         The value to use for the filter.
     *         </p>
     */
    public String getFilterValue() {
        return filterValue;
    }

    /**
     * <p>
     * The value to use for the filter.
     * </p>
     *
     * @param filterValue <p>
     *            The value to use for the filter.
     *            </p>
     */
    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    /**
     * <p>
     * The value to use for the filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterValue <p>
     *            The value to use for the filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 99<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersRequest withNextToken(String nextToken) {
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getProductType() != null)
            sb.append("ProductType: " + getProductType() + ",");
        if (getFilterName() != null)
            sb.append("FilterName: " + getFilterName() + ",");
        if (getFilterValue() != null)
            sb.append("FilterValue: " + getFilterValue() + ",");
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode
                + ((getFilterValue() == null) ? 0 : getFilterValue().hashCode());
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

        if (obj instanceof ListPhoneNumbersRequest == false)
            return false;
        ListPhoneNumbersRequest other = (ListPhoneNumbersRequest) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null
                && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null
                && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getFilterValue() == null ^ this.getFilterValue() == null)
            return false;
        if (other.getFilterValue() != null
                && other.getFilterValue().equals(this.getFilterValue()) == false)
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
