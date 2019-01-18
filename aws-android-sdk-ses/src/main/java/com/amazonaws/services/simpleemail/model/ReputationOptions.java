/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the reputation settings for a configuration set.
 * </p>
 */
public class ReputationOptions implements Serializable {
    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set. If the value is <code>true</code>, then Amazon SES
     * will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the
     * configuration set. The default value is <code>true</code>. You can change
     * this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     */
    private Boolean sendingEnabled;

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the
     * configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If
     * the value is <code>false</code>, reputation metrics are not published.
     * The default value is <code>false</code>.
     * </p>
     */
    private Boolean reputationMetricsEnabled;

    /**
     * <p>
     * The date and time at which the reputation metrics for the configuration
     * set were last reset. Resetting these metrics is known as a <i>fresh
     * start</i>.
     * </p>
     * <p>
     * When you disable email sending for a configuration set using
     * <a>UpdateConfigurationSetSendingEnabled</a> and later re-enable it, the
     * reputation metrics for the configuration set (but not for the entire
     * Amazon SES account) are reset.
     * </p>
     * <p>
     * If email sending for the configuration set has never been disabled and
     * later re-enabled, the value of this attribute is <code>null</code>.
     * </p>
     */
    private java.util.Date lastFreshStart;

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set. If the value is <code>true</code>, then Amazon SES
     * will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the
     * configuration set. The default value is <code>true</code>. You can change
     * this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     *
     * @return <p>
     *         Describes whether email sending is enabled or disabled for the
     *         configuration set. If the value is <code>true</code>, then Amazon
     *         SES will send emails that use the configuration set. If the value
     *         is <code>false</code>, Amazon SES will not send emails that use
     *         the configuration set. The default value is <code>true</code>.
     *         You can change this setting using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     *         </p>
     */
    public Boolean isSendingEnabled() {
        return sendingEnabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set. If the value is <code>true</code>, then Amazon SES
     * will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the
     * configuration set. The default value is <code>true</code>. You can change
     * this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     *
     * @return <p>
     *         Describes whether email sending is enabled or disabled for the
     *         configuration set. If the value is <code>true</code>, then Amazon
     *         SES will send emails that use the configuration set. If the value
     *         is <code>false</code>, Amazon SES will not send emails that use
     *         the configuration set. The default value is <code>true</code>.
     *         You can change this setting using
     *         <a>UpdateConfigurationSetSendingEnabled</a>.
     *         </p>
     */
    public Boolean getSendingEnabled() {
        return sendingEnabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set. If the value is <code>true</code>, then Amazon SES
     * will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the
     * configuration set. The default value is <code>true</code>. You can change
     * this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     *
     * @param sendingEnabled <p>
     *            Describes whether email sending is enabled or disabled for the
     *            configuration set. If the value is <code>true</code>, then
     *            Amazon SES will send emails that use the configuration set. If
     *            the value is <code>false</code>, Amazon SES will not send
     *            emails that use the configuration set. The default value is
     *            <code>true</code>. You can change this setting using
     *            <a>UpdateConfigurationSetSendingEnabled</a>.
     *            </p>
     */
    public void setSendingEnabled(Boolean sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for the
     * configuration set. If the value is <code>true</code>, then Amazon SES
     * will send emails that use the configuration set. If the value is
     * <code>false</code>, Amazon SES will not send emails that use the
     * configuration set. The default value is <code>true</code>. You can change
     * this setting using <a>UpdateConfigurationSetSendingEnabled</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sendingEnabled <p>
     *            Describes whether email sending is enabled or disabled for the
     *            configuration set. If the value is <code>true</code>, then
     *            Amazon SES will send emails that use the configuration set. If
     *            the value is <code>false</code>, Amazon SES will not send
     *            emails that use the configuration set. The default value is
     *            <code>true</code>. You can change this setting using
     *            <a>UpdateConfigurationSetSendingEnabled</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReputationOptions withSendingEnabled(Boolean sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
        return this;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the
     * configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If
     * the value is <code>false</code>, reputation metrics are not published.
     * The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Describes whether or not Amazon SES publishes reputation metrics
     *         for the configuration set, such as bounce and complaint rates, to
     *         Amazon CloudWatch.
     *         </p>
     *         <p>
     *         If the value is <code>true</code>, reputation metrics are
     *         published. If the value is <code>false</code>, reputation metrics
     *         are not published. The default value is <code>false</code>.
     *         </p>
     */
    public Boolean isReputationMetricsEnabled() {
        return reputationMetricsEnabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the
     * configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If
     * the value is <code>false</code>, reputation metrics are not published.
     * The default value is <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Describes whether or not Amazon SES publishes reputation metrics
     *         for the configuration set, such as bounce and complaint rates, to
     *         Amazon CloudWatch.
     *         </p>
     *         <p>
     *         If the value is <code>true</code>, reputation metrics are
     *         published. If the value is <code>false</code>, reputation metrics
     *         are not published. The default value is <code>false</code>.
     *         </p>
     */
    public Boolean getReputationMetricsEnabled() {
        return reputationMetricsEnabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the
     * configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If
     * the value is <code>false</code>, reputation metrics are not published.
     * The default value is <code>false</code>.
     * </p>
     *
     * @param reputationMetricsEnabled <p>
     *            Describes whether or not Amazon SES publishes reputation
     *            metrics for the configuration set, such as bounce and
     *            complaint rates, to Amazon CloudWatch.
     *            </p>
     *            <p>
     *            If the value is <code>true</code>, reputation metrics are
     *            published. If the value is <code>false</code>, reputation
     *            metrics are not published. The default value is
     *            <code>false</code>.
     *            </p>
     */
    public void setReputationMetricsEnabled(Boolean reputationMetricsEnabled) {
        this.reputationMetricsEnabled = reputationMetricsEnabled;
    }

    /**
     * <p>
     * Describes whether or not Amazon SES publishes reputation metrics for the
     * configuration set, such as bounce and complaint rates, to Amazon
     * CloudWatch.
     * </p>
     * <p>
     * If the value is <code>true</code>, reputation metrics are published. If
     * the value is <code>false</code>, reputation metrics are not published.
     * The default value is <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reputationMetricsEnabled <p>
     *            Describes whether or not Amazon SES publishes reputation
     *            metrics for the configuration set, such as bounce and
     *            complaint rates, to Amazon CloudWatch.
     *            </p>
     *            <p>
     *            If the value is <code>true</code>, reputation metrics are
     *            published. If the value is <code>false</code>, reputation
     *            metrics are not published. The default value is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReputationOptions withReputationMetricsEnabled(Boolean reputationMetricsEnabled) {
        this.reputationMetricsEnabled = reputationMetricsEnabled;
        return this;
    }

    /**
     * <p>
     * The date and time at which the reputation metrics for the configuration
     * set were last reset. Resetting these metrics is known as a <i>fresh
     * start</i>.
     * </p>
     * <p>
     * When you disable email sending for a configuration set using
     * <a>UpdateConfigurationSetSendingEnabled</a> and later re-enable it, the
     * reputation metrics for the configuration set (but not for the entire
     * Amazon SES account) are reset.
     * </p>
     * <p>
     * If email sending for the configuration set has never been disabled and
     * later re-enabled, the value of this attribute is <code>null</code>.
     * </p>
     *
     * @return <p>
     *         The date and time at which the reputation metrics for the
     *         configuration set were last reset. Resetting these metrics is
     *         known as a <i>fresh start</i>.
     *         </p>
     *         <p>
     *         When you disable email sending for a configuration set using
     *         <a>UpdateConfigurationSetSendingEnabled</a> and later re-enable
     *         it, the reputation metrics for the configuration set (but not for
     *         the entire Amazon SES account) are reset.
     *         </p>
     *         <p>
     *         If email sending for the configuration set has never been
     *         disabled and later re-enabled, the value of this attribute is
     *         <code>null</code>.
     *         </p>
     */
    public java.util.Date getLastFreshStart() {
        return lastFreshStart;
    }

    /**
     * <p>
     * The date and time at which the reputation metrics for the configuration
     * set were last reset. Resetting these metrics is known as a <i>fresh
     * start</i>.
     * </p>
     * <p>
     * When you disable email sending for a configuration set using
     * <a>UpdateConfigurationSetSendingEnabled</a> and later re-enable it, the
     * reputation metrics for the configuration set (but not for the entire
     * Amazon SES account) are reset.
     * </p>
     * <p>
     * If email sending for the configuration set has never been disabled and
     * later re-enabled, the value of this attribute is <code>null</code>.
     * </p>
     *
     * @param lastFreshStart <p>
     *            The date and time at which the reputation metrics for the
     *            configuration set were last reset. Resetting these metrics is
     *            known as a <i>fresh start</i>.
     *            </p>
     *            <p>
     *            When you disable email sending for a configuration set using
     *            <a>UpdateConfigurationSetSendingEnabled</a> and later
     *            re-enable it, the reputation metrics for the configuration set
     *            (but not for the entire Amazon SES account) are reset.
     *            </p>
     *            <p>
     *            If email sending for the configuration set has never been
     *            disabled and later re-enabled, the value of this attribute is
     *            <code>null</code>.
     *            </p>
     */
    public void setLastFreshStart(java.util.Date lastFreshStart) {
        this.lastFreshStart = lastFreshStart;
    }

    /**
     * <p>
     * The date and time at which the reputation metrics for the configuration
     * set were last reset. Resetting these metrics is known as a <i>fresh
     * start</i>.
     * </p>
     * <p>
     * When you disable email sending for a configuration set using
     * <a>UpdateConfigurationSetSendingEnabled</a> and later re-enable it, the
     * reputation metrics for the configuration set (but not for the entire
     * Amazon SES account) are reset.
     * </p>
     * <p>
     * If email sending for the configuration set has never been disabled and
     * later re-enabled, the value of this attribute is <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastFreshStart <p>
     *            The date and time at which the reputation metrics for the
     *            configuration set were last reset. Resetting these metrics is
     *            known as a <i>fresh start</i>.
     *            </p>
     *            <p>
     *            When you disable email sending for a configuration set using
     *            <a>UpdateConfigurationSetSendingEnabled</a> and later
     *            re-enable it, the reputation metrics for the configuration set
     *            (but not for the entire Amazon SES account) are reset.
     *            </p>
     *            <p>
     *            If email sending for the configuration set has never been
     *            disabled and later re-enabled, the value of this attribute is
     *            <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReputationOptions withLastFreshStart(java.util.Date lastFreshStart) {
        this.lastFreshStart = lastFreshStart;
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
        if (getSendingEnabled() != null)
            sb.append("SendingEnabled: " + getSendingEnabled() + ",");
        if (getReputationMetricsEnabled() != null)
            sb.append("ReputationMetricsEnabled: " + getReputationMetricsEnabled() + ",");
        if (getLastFreshStart() != null)
            sb.append("LastFreshStart: " + getLastFreshStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSendingEnabled() == null) ? 0 : getSendingEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getReputationMetricsEnabled() == null) ? 0 : getReputationMetricsEnabled()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastFreshStart() == null) ? 0 : getLastFreshStart().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReputationOptions == false)
            return false;
        ReputationOptions other = (ReputationOptions) obj;

        if (other.getSendingEnabled() == null ^ this.getSendingEnabled() == null)
            return false;
        if (other.getSendingEnabled() != null
                && other.getSendingEnabled().equals(this.getSendingEnabled()) == false)
            return false;
        if (other.getReputationMetricsEnabled() == null
                ^ this.getReputationMetricsEnabled() == null)
            return false;
        if (other.getReputationMetricsEnabled() != null
                && other.getReputationMetricsEnabled().equals(this.getReputationMetricsEnabled()) == false)
            return false;
        if (other.getLastFreshStart() == null ^ this.getLastFreshStart() == null)
            return false;
        if (other.getLastFreshStart() != null
                && other.getLastFreshStart().equals(this.getLastFreshStart()) == false)
            return false;
        return true;
    }
}
