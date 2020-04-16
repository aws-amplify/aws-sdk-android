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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables Security Hub for your account in the current Region or the Region you
 * specify in the request.
 * </p>
 * <p>
 * When you enable Security Hub, you grant to Security Hub the permissions
 * necessary to gather findings from other services that are integrated with
 * Security Hub.
 * </p>
 * <p>
 * When you use the <code>EnableSecurityHub</code> operation to enable Security
 * Hub, you also automatically enable the CIS AWS Foundations standard. You do
 * not enable the Payment Card Industry Data Security Standard (PCI DSS)
 * standard. To not enable the CIS AWS Foundations standard, set
 * <code>EnableDefaultStandards</code> to <code>false</code>.
 * </p>
 * <p>
 * After you enable Security Hub, to enable a standard, use the
 * <code> <a>BatchEnableStandards</a> </code> operation. To disable a standard,
 * use the <code> <a>BatchDisableStandards</a> </code> operation.
 * </p>
 * <p>
 * To learn more, see <a href=
 * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html"
 * >Setting Up AWS Security Hub</a> in the <i>AWS Security Hub User Guide</i>.
 * </p>
 */
public class EnableSecurityHubRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The tags to add to the Hub resource when you enable Security Hub.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated
     * as automatically enabled. If you do not provide a value for
     * <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To
     * not enable the automatically enabled standards, set
     * <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     */
    private Boolean enableDefaultStandards;

    /**
     * <p>
     * The tags to add to the Hub resource when you enable Security Hub.
     * </p>
     *
     * @return <p>
     *         The tags to add to the Hub resource when you enable Security Hub.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the Hub resource when you enable Security Hub.
     * </p>
     *
     * @param tags <p>
     *            The tags to add to the Hub resource when you enable Security
     *            Hub.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to add to the Hub resource when you enable Security Hub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to add to the Hub resource when you enable Security
     *            Hub.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableSecurityHubRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags to add to the Hub resource when you enable Security Hub.
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
    public EnableSecurityHubRequest addTagsEntry(String key, String value) {
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
    public EnableSecurityHubRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated
     * as automatically enabled. If you do not provide a value for
     * <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To
     * not enable the automatically enabled standards, set
     * <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Whether to enable the security standards that Security Hub has
     *         designated as automatically enabled. If you do not provide a
     *         value for <code>EnableDefaultStandards</code>, it is set to
     *         <code>true</code>. To not enable the automatically enabled
     *         standards, set <code>EnableDefaultStandards</code> to
     *         <code>false</code>.
     *         </p>
     */
    public Boolean isEnableDefaultStandards() {
        return enableDefaultStandards;
    }

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated
     * as automatically enabled. If you do not provide a value for
     * <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To
     * not enable the automatically enabled standards, set
     * <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Whether to enable the security standards that Security Hub has
     *         designated as automatically enabled. If you do not provide a
     *         value for <code>EnableDefaultStandards</code>, it is set to
     *         <code>true</code>. To not enable the automatically enabled
     *         standards, set <code>EnableDefaultStandards</code> to
     *         <code>false</code>.
     *         </p>
     */
    public Boolean getEnableDefaultStandards() {
        return enableDefaultStandards;
    }

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated
     * as automatically enabled. If you do not provide a value for
     * <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To
     * not enable the automatically enabled standards, set
     * <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     *
     * @param enableDefaultStandards <p>
     *            Whether to enable the security standards that Security Hub has
     *            designated as automatically enabled. If you do not provide a
     *            value for <code>EnableDefaultStandards</code>, it is set to
     *            <code>true</code>. To not enable the automatically enabled
     *            standards, set <code>EnableDefaultStandards</code> to
     *            <code>false</code>.
     *            </p>
     */
    public void setEnableDefaultStandards(Boolean enableDefaultStandards) {
        this.enableDefaultStandards = enableDefaultStandards;
    }

    /**
     * <p>
     * Whether to enable the security standards that Security Hub has designated
     * as automatically enabled. If you do not provide a value for
     * <code>EnableDefaultStandards</code>, it is set to <code>true</code>. To
     * not enable the automatically enabled standards, set
     * <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableDefaultStandards <p>
     *            Whether to enable the security standards that Security Hub has
     *            designated as automatically enabled. If you do not provide a
     *            value for <code>EnableDefaultStandards</code>, it is set to
     *            <code>true</code>. To not enable the automatically enabled
     *            standards, set <code>EnableDefaultStandards</code> to
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableSecurityHubRequest withEnableDefaultStandards(Boolean enableDefaultStandards) {
        this.enableDefaultStandards = enableDefaultStandards;
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
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getEnableDefaultStandards() != null)
            sb.append("EnableDefaultStandards: " + getEnableDefaultStandards());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableDefaultStandards() == null) ? 0 : getEnableDefaultStandards()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableSecurityHubRequest == false)
            return false;
        EnableSecurityHubRequest other = (EnableSecurityHubRequest) obj;

        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEnableDefaultStandards() == null ^ this.getEnableDefaultStandards() == null)
            return false;
        if (other.getEnableDefaultStandards() != null
                && other.getEnableDefaultStandards().equals(this.getEnableDefaultStandards()) == false)
            return false;
        return true;
    }
}
