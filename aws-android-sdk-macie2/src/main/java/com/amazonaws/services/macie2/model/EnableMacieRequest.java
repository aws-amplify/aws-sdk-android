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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables Amazon Macie and specifies the configuration settings for a Macie
 * account.
 * </p>
 */
public class EnableMacieRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     */
    private String clientToken;

    /**
     * Specifies how often to publish findings for the account. This includes
     * adding findings to AWS Security Hub and exporting finding events to
     * Amazon CloudWatch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     */
    private String findingPublishingFrequency;

    /**
     * <p>
     * Specifies the status for the account. To enable Amazon Macie and start
     * all Amazon Macie activities for the account, set this value to ENABLED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     */
    private String status;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     *
     * @return <p>
     *         A unique, case-sensitive token that you provide to ensure the
     *         idempotency of the request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive token that you provide to ensure the
     *            idempotency of the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency
     * of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            A unique, case-sensitive token that you provide to ensure the
     *            idempotency of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableMacieRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * Specifies how often to publish findings for the account. This includes
     * adding findings to AWS Security Hub and exporting finding events to
     * Amazon CloudWatch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @return Specifies how often to publish findings for the account. This
     *         includes adding findings to AWS Security Hub and exporting
     *         finding events to Amazon CloudWatch.
     * @see FindingPublishingFrequency
     */
    public String getFindingPublishingFrequency() {
        return findingPublishingFrequency;
    }

    /**
     * Specifies how often to publish findings for the account. This includes
     * adding findings to AWS Security Hub and exporting finding events to
     * Amazon CloudWatch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency Specifies how often to publish findings
     *            for the account. This includes adding findings to AWS Security
     *            Hub and exporting finding events to Amazon CloudWatch.
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * Specifies how often to publish findings for the account. This includes
     * adding findings to AWS Security Hub and exporting finding events to
     * Amazon CloudWatch.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency Specifies how often to publish findings
     *            for the account. This includes adding findings to AWS Security
     *            Hub and exporting finding events to Amazon CloudWatch.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public EnableMacieRequest withFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
        return this;
    }

    /**
     * Specifies how often to publish findings for the account. This includes
     * adding findings to AWS Security Hub and exporting finding events to
     * Amazon CloudWatch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency Specifies how often to publish findings
     *            for the account. This includes adding findings to AWS Security
     *            Hub and exporting finding events to Amazon CloudWatch.
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
    }

    /**
     * Specifies how often to publish findings for the account. This includes
     * adding findings to AWS Security Hub and exporting finding events to
     * Amazon CloudWatch.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency Specifies how often to publish findings
     *            for the account. This includes adding findings to AWS Security
     *            Hub and exporting finding events to Amazon CloudWatch.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public EnableMacieRequest withFindingPublishingFrequency(
            FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the status for the account. To enable Amazon Macie and start
     * all Amazon Macie activities for the account, set this value to ENABLED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @return <p>
     *         Specifies the status for the account. To enable Amazon Macie and
     *         start all Amazon Macie activities for the account, set this value
     *         to ENABLED.
     *         </p>
     * @see MacieStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the status for the account. To enable Amazon Macie and start
     * all Amazon Macie activities for the account, set this value to ENABLED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies the status for the account. To enable Amazon Macie
     *            and start all Amazon Macie activities for the account, set
     *            this value to ENABLED.
     *            </p>
     * @see MacieStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status for the account. To enable Amazon Macie and start
     * all Amazon Macie activities for the account, set this value to ENABLED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies the status for the account. To enable Amazon Macie
     *            and start all Amazon Macie activities for the account, set
     *            this value to ENABLED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacieStatus
     */
    public EnableMacieRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the status for the account. To enable Amazon Macie and start
     * all Amazon Macie activities for the account, set this value to ENABLED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies the status for the account. To enable Amazon Macie
     *            and start all Amazon Macie activities for the account, set
     *            this value to ENABLED.
     *            </p>
     * @see MacieStatus
     */
    public void setStatus(MacieStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies the status for the account. To enable Amazon Macie and start
     * all Amazon Macie activities for the account, set this value to ENABLED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies the status for the account. To enable Amazon Macie
     *            and start all Amazon Macie activities for the account, set
     *            this value to ENABLED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacieStatus
     */
    public EnableMacieRequest withStatus(MacieStatus status) {
        this.status = status.toString();
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
        if (getClientToken() != null)
            sb.append("clientToken: " + getClientToken() + ",");
        if (getFindingPublishingFrequency() != null)
            sb.append("findingPublishingFrequency: " + getFindingPublishingFrequency() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableMacieRequest == false)
            return false;
        EnableMacieRequest other = (EnableMacieRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null
                ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null
                && other.getFindingPublishingFrequency().equals(
                        this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
