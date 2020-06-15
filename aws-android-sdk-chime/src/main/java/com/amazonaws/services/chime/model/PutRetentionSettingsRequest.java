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
 * Puts retention settings for the specified Amazon Chime Enterprise account. We
 * recommend using AWS CloudTrail to monitor usage of this API for your account.
 * For more information, see <a
 * href="https://docs.aws.amazon.com/chime/latest/ag/cloudtrail.html">Logging
 * Amazon Chime API Calls with AWS CloudTrail</a> in the <i>Amazon Chime
 * Administration Guide</i>.
 * </p>
 * <p>
 * To turn off existing retention settings, remove the number of days from the
 * corresponding <b>RetentionDays</b> field in the <b>RetentionSettings</b>
 * object. For more information about retention settings, see <a
 * href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html"
 * >Managing Chat Retention Policies</a> in the <i>Amazon Chime Administration
 * Guide</i>.
 * </p>
 */
public class PutRetentionSettingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String accountId;

    /**
     * <p>
     * The retention settings.
     * </p>
     */
    private RetentionSettings retentionSettings;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Chime account ID.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRetentionSettingsRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     *
     * @return <p>
     *         The retention settings.
     *         </p>
     */
    public RetentionSettings getRetentionSettings() {
        return retentionSettings;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     *
     * @param retentionSettings <p>
     *            The retention settings.
     *            </p>
     */
    public void setRetentionSettings(RetentionSettings retentionSettings) {
        this.retentionSettings = retentionSettings;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retentionSettings <p>
     *            The retention settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRetentionSettingsRequest withRetentionSettings(RetentionSettings retentionSettings) {
        this.retentionSettings = retentionSettings;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getRetentionSettings() != null)
            sb.append("RetentionSettings: " + getRetentionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getRetentionSettings() == null) ? 0 : getRetentionSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRetentionSettingsRequest == false)
            return false;
        PutRetentionSettingsRequest other = (PutRetentionSettingsRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRetentionSettings() == null ^ this.getRetentionSettings() == null)
            return false;
        if (other.getRetentionSettings() != null
                && other.getRetentionSettings().equals(this.getRetentionSettings()) == false)
            return false;
        return true;
    }
}
