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

public class GetMacieSessionResult implements Serializable {
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the Amazon
     * Macie account was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The frequency with which Amazon Macie publishes updates to policy
     * findings for the account. This includes publishing updates to AWS
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch
     * Events).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     */
    private String findingPublishingFrequency;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-level role that allows
     * Amazon Macie to monitor and analyze data in AWS resources for the
     * account.
     * </p>
     */
    private String serviceRole;

    /**
     * <p>
     * The current status of the Amazon Macie account. Possible values are:
     * PAUSED, the account is enabled but all Amazon Macie activities are
     * suspended (paused) for the account; and, ENABLED, the account is enabled
     * and all Amazon Macie activities are enabled for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     */
    private String status;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most
     * recent change to the status of the Amazon Macie account.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the Amazon
     * Macie account was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, when the
     *         Amazon Macie account was created.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the Amazon
     * Macie account was created.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the Amazon Macie account was created.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the Amazon
     * Macie account was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, when
     *            the Amazon Macie account was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMacieSessionResult withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The frequency with which Amazon Macie publishes updates to policy
     * findings for the account. This includes publishing updates to AWS
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch
     * Events).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @return <p>
     *         The frequency with which Amazon Macie publishes updates to policy
     *         findings for the account. This includes publishing updates to AWS
     *         Security Hub and Amazon EventBridge (formerly called Amazon
     *         CloudWatch Events).
     *         </p>
     * @see FindingPublishingFrequency
     */
    public String getFindingPublishingFrequency() {
        return findingPublishingFrequency;
    }

    /**
     * <p>
     * The frequency with which Amazon Macie publishes updates to policy
     * findings for the account. This includes publishing updates to AWS
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch
     * Events).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            The frequency with which Amazon Macie publishes updates to
     *            policy findings for the account. This includes publishing
     *            updates to AWS Security Hub and Amazon EventBridge (formerly
     *            called Amazon CloudWatch Events).
     *            </p>
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * The frequency with which Amazon Macie publishes updates to policy
     * findings for the account. This includes publishing updates to AWS
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch
     * Events).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            The frequency with which Amazon Macie publishes updates to
     *            policy findings for the account. This includes publishing
     *            updates to AWS Security Hub and Amazon EventBridge (formerly
     *            called Amazon CloudWatch Events).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public GetMacieSessionResult withFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
        return this;
    }

    /**
     * <p>
     * The frequency with which Amazon Macie publishes updates to policy
     * findings for the account. This includes publishing updates to AWS
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch
     * Events).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            The frequency with which Amazon Macie publishes updates to
     *            policy findings for the account. This includes publishing
     *            updates to AWS Security Hub and Amazon EventBridge (formerly
     *            called Amazon CloudWatch Events).
     *            </p>
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
    }

    /**
     * <p>
     * The frequency with which Amazon Macie publishes updates to policy
     * findings for the account. This includes publishing updates to AWS
     * Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch
     * Events).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            The frequency with which Amazon Macie publishes updates to
     *            policy findings for the account. This includes publishing
     *            updates to AWS Security Hub and Amazon EventBridge (formerly
     *            called Amazon CloudWatch Events).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public GetMacieSessionResult withFindingPublishingFrequency(
            FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-level role that allows
     * Amazon Macie to monitor and analyze data in AWS resources for the
     * account.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the service-level role that
     *         allows Amazon Macie to monitor and analyze data in AWS resources
     *         for the account.
     *         </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-level role that allows
     * Amazon Macie to monitor and analyze data in AWS resources for the
     * account.
     * </p>
     *
     * @param serviceRole <p>
     *            The Amazon Resource Name (ARN) of the service-level role that
     *            allows Amazon Macie to monitor and analyze data in AWS
     *            resources for the account.
     *            </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service-level role that allows
     * Amazon Macie to monitor and analyze data in AWS resources for the
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRole <p>
     *            The Amazon Resource Name (ARN) of the service-level role that
     *            allows Amazon Macie to monitor and analyze data in AWS
     *            resources for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMacieSessionResult withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * The current status of the Amazon Macie account. Possible values are:
     * PAUSED, the account is enabled but all Amazon Macie activities are
     * suspended (paused) for the account; and, ENABLED, the account is enabled
     * and all Amazon Macie activities are enabled for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @return <p>
     *         The current status of the Amazon Macie account. Possible values
     *         are: PAUSED, the account is enabled but all Amazon Macie
     *         activities are suspended (paused) for the account; and, ENABLED,
     *         the account is enabled and all Amazon Macie activities are
     *         enabled for the account.
     *         </p>
     * @see MacieStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the Amazon Macie account. Possible values are:
     * PAUSED, the account is enabled but all Amazon Macie activities are
     * suspended (paused) for the account; and, ENABLED, the account is enabled
     * and all Amazon Macie activities are enabled for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            The current status of the Amazon Macie account. Possible
     *            values are: PAUSED, the account is enabled but all Amazon
     *            Macie activities are suspended (paused) for the account; and,
     *            ENABLED, the account is enabled and all Amazon Macie
     *            activities are enabled for the account.
     *            </p>
     * @see MacieStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the Amazon Macie account. Possible values are:
     * PAUSED, the account is enabled but all Amazon Macie activities are
     * suspended (paused) for the account; and, ENABLED, the account is enabled
     * and all Amazon Macie activities are enabled for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            The current status of the Amazon Macie account. Possible
     *            values are: PAUSED, the account is enabled but all Amazon
     *            Macie activities are suspended (paused) for the account; and,
     *            ENABLED, the account is enabled and all Amazon Macie
     *            activities are enabled for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacieStatus
     */
    public GetMacieSessionResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current status of the Amazon Macie account. Possible values are:
     * PAUSED, the account is enabled but all Amazon Macie activities are
     * suspended (paused) for the account; and, ENABLED, the account is enabled
     * and all Amazon Macie activities are enabled for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            The current status of the Amazon Macie account. Possible
     *            values are: PAUSED, the account is enabled but all Amazon
     *            Macie activities are suspended (paused) for the account; and,
     *            ENABLED, the account is enabled and all Amazon Macie
     *            activities are enabled for the account.
     *            </p>
     * @see MacieStatus
     */
    public void setStatus(MacieStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current status of the Amazon Macie account. Possible values are:
     * PAUSED, the account is enabled but all Amazon Macie activities are
     * suspended (paused) for the account; and, ENABLED, the account is enabled
     * and all Amazon Macie activities are enabled for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            The current status of the Amazon Macie account. Possible
     *            values are: PAUSED, the account is enabled but all Amazon
     *            Macie activities are suspended (paused) for the account; and,
     *            ENABLED, the account is enabled and all Amazon Macie
     *            activities are enabled for the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacieStatus
     */
    public GetMacieSessionResult withStatus(MacieStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most
     * recent change to the status of the Amazon Macie account.
     * </p>
     *
     * @return <p>
     *         The date and time, in UTC and extended ISO 8601 format, of the
     *         most recent change to the status of the Amazon Macie account.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most
     * recent change to the status of the Amazon Macie account.
     * </p>
     *
     * @param updatedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, of the
     *            most recent change to the status of the Amazon Macie account.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most
     * recent change to the status of the Amazon Macie account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The date and time, in UTC and extended ISO 8601 format, of the
     *            most recent change to the status of the Amazon Macie account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMacieSessionResult withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getCreatedAt() != null)
            sb.append("createdAt: " + getCreatedAt() + ",");
        if (getFindingPublishingFrequency() != null)
            sb.append("findingPublishingFrequency: " + getFindingPublishingFrequency() + ",");
        if (getServiceRole() != null)
            sb.append("serviceRole: " + getServiceRole() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getUpdatedAt() != null)
            sb.append("updatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime
                * hashCode
                + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMacieSessionResult == false)
            return false;
        GetMacieSessionResult other = (GetMacieSessionResult) obj;

        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null
                ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null
                && other.getFindingPublishingFrequency().equals(
                        this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null
                && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
