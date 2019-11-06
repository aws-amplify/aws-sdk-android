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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Endpoint send configuration.
 */
public class EndpointSendConfiguration implements Serializable {
    /**
     * Body override. If specified will override default body.
     */
    private String bodyOverride;

    /**
     * A map of custom attributes to attributes to be attached to the message
     * for this address. This payload is added to the push notification's
     * 'data.pinpoint' object or added to the email/sms delivery receipt event
     * attributes.
     */
    private java.util.Map<String, String> context;

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     */
    private String rawContent;

    /**
     * A map of substitution values for the message to be merged with the
     * DefaultMessage's substitutions. Substitutions on this map take precedence
     * over the all other substitutions.
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * Title override. If specified will override default title if applicable.
     */
    private String titleOverride;

    /**
     * Body override. If specified will override default body.
     *
     * @return Body override. If specified will override default body.
     */
    public String getBodyOverride() {
        return bodyOverride;
    }

    /**
     * Body override. If specified will override default body.
     *
     * @param bodyOverride Body override. If specified will override default
     *            body.
     */
    public void setBodyOverride(String bodyOverride) {
        this.bodyOverride = bodyOverride;
    }

    /**
     * Body override. If specified will override default body.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bodyOverride Body override. If specified will override default
     *            body.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointSendConfiguration withBodyOverride(String bodyOverride) {
        this.bodyOverride = bodyOverride;
        return this;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message
     * for this address. This payload is added to the push notification's
     * 'data.pinpoint' object or added to the email/sms delivery receipt event
     * attributes.
     *
     * @return A map of custom attributes to attributes to be attached to the
     *         message for this address. This payload is added to the push
     *         notification's 'data.pinpoint' object or added to the email/sms
     *         delivery receipt event attributes.
     */
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message
     * for this address. This payload is added to the push notification's
     * 'data.pinpoint' object or added to the email/sms delivery receipt event
     * attributes.
     *
     * @param context A map of custom attributes to attributes to be attached to
     *            the message for this address. This payload is added to the
     *            push notification's 'data.pinpoint' object or added to the
     *            email/sms delivery receipt event attributes.
     */
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message
     * for this address. This payload is added to the push notification's
     * 'data.pinpoint' object or added to the email/sms delivery receipt event
     * attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param context A map of custom attributes to attributes to be attached to
     *            the message for this address. This payload is added to the
     *            push notification's 'data.pinpoint' object or added to the
     *            email/sms delivery receipt event attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointSendConfiguration withContext(java.util.Map<String, String> context) {
        this.context = context;
        return this;
    }

    /**
     * A map of custom attributes to attributes to be attached to the message
     * for this address. This payload is added to the push notification's
     * 'data.pinpoint' object or added to the email/sms delivery receipt event
     * attributes.
     * <p>
     * The method adds a new key-value pair into Context parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Context.
     * @param value The corresponding value of the entry to be added into
     *            Context.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointSendConfiguration addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EndpointSendConfiguration clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     *
     * @return The Raw JSON formatted string to be used as the payload. This
     *         value overrides the message.
     */
    public String getRawContent() {
        return rawContent;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     *
     * @param rawContent The Raw JSON formatted string to be used as the
     *            payload. This value overrides the message.
     */
    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * The Raw JSON formatted string to be used as the payload. This value
     * overrides the message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawContent The Raw JSON formatted string to be used as the
     *            payload. This value overrides the message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointSendConfiguration withRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    /**
     * A map of substitution values for the message to be merged with the
     * DefaultMessage's substitutions. Substitutions on this map take precedence
     * over the all other substitutions.
     *
     * @return A map of substitution values for the message to be merged with
     *         the DefaultMessage's substitutions. Substitutions on this map
     *         take precedence over the all other substitutions.
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * A map of substitution values for the message to be merged with the
     * DefaultMessage's substitutions. Substitutions on this map take precedence
     * over the all other substitutions.
     *
     * @param substitutions A map of substitution values for the message to be
     *            merged with the DefaultMessage's substitutions. Substitutions
     *            on this map take precedence over the all other substitutions.
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * A map of substitution values for the message to be merged with the
     * DefaultMessage's substitutions. Substitutions on this map take precedence
     * over the all other substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions A map of substitution values for the message to be
     *            merged with the DefaultMessage's substitutions. Substitutions
     *            on this map take precedence over the all other substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointSendConfiguration withSubstitutions(
            java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * A map of substitution values for the message to be merged with the
     * DefaultMessage's substitutions. Substitutions on this map take precedence
     * over the all other substitutions.
     * <p>
     * The method adds a new key-value pair into Substitutions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Substitutions.
     * @param value The corresponding value of the entry to be added into
     *            Substitutions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointSendConfiguration addSubstitutionsEntry(String key, java.util.List<String> value) {
        if (null == this.substitutions) {
            this.substitutions = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.substitutions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.substitutions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Substitutions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public EndpointSendConfiguration clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * Title override. If specified will override default title if applicable.
     *
     * @return Title override. If specified will override default title if
     *         applicable.
     */
    public String getTitleOverride() {
        return titleOverride;
    }

    /**
     * Title override. If specified will override default title if applicable.
     *
     * @param titleOverride Title override. If specified will override default
     *            title if applicable.
     */
    public void setTitleOverride(String titleOverride) {
        this.titleOverride = titleOverride;
    }

    /**
     * Title override. If specified will override default title if applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param titleOverride Title override. If specified will override default
     *            title if applicable.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointSendConfiguration withTitleOverride(String titleOverride) {
        this.titleOverride = titleOverride;
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
        if (getBodyOverride() != null)
            sb.append("BodyOverride: " + getBodyOverride() + ",");
        if (getContext() != null)
            sb.append("Context: " + getContext() + ",");
        if (getRawContent() != null)
            sb.append("RawContent: " + getRawContent() + ",");
        if (getSubstitutions() != null)
            sb.append("Substitutions: " + getSubstitutions() + ",");
        if (getTitleOverride() != null)
            sb.append("TitleOverride: " + getTitleOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBodyOverride() == null) ? 0 : getBodyOverride().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getRawContent() == null) ? 0 : getRawContent().hashCode());
        hashCode = prime * hashCode
                + ((getSubstitutions() == null) ? 0 : getSubstitutions().hashCode());
        hashCode = prime * hashCode
                + ((getTitleOverride() == null) ? 0 : getTitleOverride().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointSendConfiguration == false)
            return false;
        EndpointSendConfiguration other = (EndpointSendConfiguration) obj;

        if (other.getBodyOverride() == null ^ this.getBodyOverride() == null)
            return false;
        if (other.getBodyOverride() != null
                && other.getBodyOverride().equals(this.getBodyOverride()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getRawContent() == null ^ this.getRawContent() == null)
            return false;
        if (other.getRawContent() != null
                && other.getRawContent().equals(this.getRawContent()) == false)
            return false;
        if (other.getSubstitutions() == null ^ this.getSubstitutions() == null)
            return false;
        if (other.getSubstitutions() != null
                && other.getSubstitutions().equals(this.getSubstitutions()) == false)
            return false;
        if (other.getTitleOverride() == null ^ this.getTitleOverride() == null)
            return false;
        if (other.getTitleOverride() != null
                && other.getTitleOverride().equals(this.getTitleOverride()) == false)
            return false;
        return true;
    }
}
