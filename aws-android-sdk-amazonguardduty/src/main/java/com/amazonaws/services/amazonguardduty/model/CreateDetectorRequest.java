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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a single Amazon GuardDuty detector. A detector is a resource that
 * represents the GuardDuty service. To start using GuardDuty, you must create a
 * detector in each Region where you enable the service. You can have only one
 * detector per account per Region.
 * </p>
 */
public class CreateDetectorRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A Boolean value that specifies whether the detector is to be enabled.
     * </p>
     */
    private Boolean enable;

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * An enum value that specifies how frequently updated findings are
     * exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     */
    private String findingPublishingFrequency;

    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A Boolean value that specifies whether the detector is to be enabled.
     * </p>
     *
     * @return <p>
     *         A Boolean value that specifies whether the detector is to be
     *         enabled.
     *         </p>
     */
    public Boolean isEnable() {
        return enable;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the detector is to be enabled.
     * </p>
     *
     * @return <p>
     *         A Boolean value that specifies whether the detector is to be
     *         enabled.
     *         </p>
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the detector is to be enabled.
     * </p>
     *
     * @param enable <p>
     *            A Boolean value that specifies whether the detector is to be
     *            enabled.
     *            </p>
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the detector is to be enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enable <p>
     *            A Boolean value that specifies whether the detector is to be
     *            enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorRequest withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return <p>
     *         The idempotency token for the create request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param clientToken <p>
     *            The idempotency token for the create request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param clientToken <p>
     *            The idempotency token for the create request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * An enum value that specifies how frequently updated findings are
     * exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @return <p>
     *         An enum value that specifies how frequently updated findings are
     *         exported.
     *         </p>
     * @see FindingPublishingFrequency
     */
    public String getFindingPublishingFrequency() {
        return findingPublishingFrequency;
    }

    /**
     * <p>
     * An enum value that specifies how frequently updated findings are
     * exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            An enum value that specifies how frequently updated findings
     *            are exported.
     *            </p>
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * An enum value that specifies how frequently updated findings are
     * exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            An enum value that specifies how frequently updated findings
     *            are exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public CreateDetectorRequest withFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
        return this;
    }

    /**
     * <p>
     * An enum value that specifies how frequently updated findings are
     * exported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            An enum value that specifies how frequently updated findings
     *            are exported.
     *            </p>
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
    }

    /**
     * <p>
     * An enum value that specifies how frequently updated findings are
     * exported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency <p>
     *            An enum value that specifies how frequently updated findings
     *            are exported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public CreateDetectorRequest withFindingPublishingFrequency(
            FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     *
     * @return <p>
     *         The tags to be added to a new detector resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     *
     * @param tags <p>
     *            The tags to be added to a new detector resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be added to a new detector resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDetectorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateDetectorRequest clearTagsEntries() {
        this.tags = null;
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
        if (getEnable() != null)
            sb.append("Enable: " + getEnable() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: " + getFindingPublishingFrequency() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDetectorRequest == false)
            return false;
        CreateDetectorRequest other = (CreateDetectorRequest) obj;

        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
