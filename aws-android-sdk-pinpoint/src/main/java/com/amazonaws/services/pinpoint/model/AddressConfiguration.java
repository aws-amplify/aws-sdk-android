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
 * <p>
 * Specifies address-based configuration settings for a message that's sent
 * directly to an endpoint.
 * </p>
 */
public class AddressConfiguration implements Serializable {
    /**
     * <p>
     * The message body to use instead of the default message body. This value
     * overrides the default message body.
     * </p>
     */
    private String bodyOverride;

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     */
    private String channelType;

    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and
     * is attached to the message. For a push notification, this payload is
     * added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
     */
    private java.util.Map<String, String> context;

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides the message.
     * </p>
     */
    private String rawContent;

    /**
     * <p>
     * An object that maps variable values for the message. Amazon Pinpoint
     * merges these values with the variable values specified by properties of
     * the DefaultMessage object. The substitutions in this map take precedence
     * over all other substitutions.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> substitutions;

    /**
     * <p>
     * The message title to use instead of the default message title. This value
     * overrides the default message title.
     * </p>
     */
    private String titleOverride;

    /**
     * <p>
     * The message body to use instead of the default message body. This value
     * overrides the default message body.
     * </p>
     *
     * @return <p>
     *         The message body to use instead of the default message body. This
     *         value overrides the default message body.
     *         </p>
     */
    public String getBodyOverride() {
        return bodyOverride;
    }

    /**
     * <p>
     * The message body to use instead of the default message body. This value
     * overrides the default message body.
     * </p>
     *
     * @param bodyOverride <p>
     *            The message body to use instead of the default message body.
     *            This value overrides the default message body.
     *            </p>
     */
    public void setBodyOverride(String bodyOverride) {
        this.bodyOverride = bodyOverride;
    }

    /**
     * <p>
     * The message body to use instead of the default message body. This value
     * overrides the default message body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bodyOverride <p>
     *            The message body to use instead of the default message body.
     *            This value overrides the default message body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddressConfiguration withBodyOverride(String bodyOverride) {
        this.bodyOverride = bodyOverride;
        return this;
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @return <p>
     *         The channel to use when sending the message.
     *         </p>
     * @see ChannelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel to use when sending the message.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel to use when sending the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public AddressConfiguration withChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel to use when sending the message.
     *            </p>
     * @see ChannelType
     */
    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
    }

    /**
     * <p>
     * The channel to use when sending the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GCM, APNS, APNS_SANDBOX, APNS_VOIP,
     * APNS_VOIP_SANDBOX, ADM, SMS, VOICE, EMAIL, BAIDU, CUSTOM
     *
     * @param channelType <p>
     *            The channel to use when sending the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelType
     */
    public AddressConfiguration withChannelType(ChannelType channelType) {
        this.channelType = channelType.toString();
        return this;
    }

    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and
     * is attached to the message. For a push notification, this payload is
     * added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
     *
     * @return <p>
     *         An object that maps custom attributes to attributes for the
     *         address and is attached to the message. For a push notification,
     *         this payload is added to the data.pinpoint object. For an email
     *         or text message, this payload is added to email/SMS delivery
     *         receipt event attributes.
     *         </p>
     */
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and
     * is attached to the message. For a push notification, this payload is
     * added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
     *
     * @param context <p>
     *            An object that maps custom attributes to attributes for the
     *            address and is attached to the message. For a push
     *            notification, this payload is added to the data.pinpoint
     *            object. For an email or text message, this payload is added to
     *            email/SMS delivery receipt event attributes.
     *            </p>
     */
    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and
     * is attached to the message. For a push notification, this payload is
     * added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param context <p>
     *            An object that maps custom attributes to attributes for the
     *            address and is attached to the message. For a push
     *            notification, this payload is added to the data.pinpoint
     *            object. For an email or text message, this payload is added to
     *            email/SMS delivery receipt event attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddressConfiguration withContext(java.util.Map<String, String> context) {
        this.context = context;
        return this;
    }

    /**
     * <p>
     * An object that maps custom attributes to attributes for the address and
     * is attached to the message. For a push notification, this payload is
     * added to the data.pinpoint object. For an email or text message, this
     * payload is added to email/SMS delivery receipt event attributes.
     * </p>
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
    public AddressConfiguration addContextEntry(String key, String value) {
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
    public AddressConfiguration clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides the message.
     * </p>
     *
     * @return <p>
     *         The raw, JSON-formatted string to use as the payload for the
     *         notification message. This value overrides the message.
     *         </p>
     */
    public String getRawContent() {
        return rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides the message.
     * </p>
     *
     * @param rawContent <p>
     *            The raw, JSON-formatted string to use as the payload for the
     *            notification message. This value overrides the message.
     *            </p>
     */
    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the notification
     * message. This value overrides the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rawContent <p>
     *            The raw, JSON-formatted string to use as the payload for the
     *            notification message. This value overrides the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddressConfiguration withRawContent(String rawContent) {
        this.rawContent = rawContent;
        return this;
    }

    /**
     * <p>
     * An object that maps variable values for the message. Amazon Pinpoint
     * merges these values with the variable values specified by properties of
     * the DefaultMessage object. The substitutions in this map take precedence
     * over all other substitutions.
     * </p>
     *
     * @return <p>
     *         An object that maps variable values for the message. Amazon
     *         Pinpoint merges these values with the variable values specified
     *         by properties of the DefaultMessage object. The substitutions in
     *         this map take precedence over all other substitutions.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getSubstitutions() {
        return substitutions;
    }

    /**
     * <p>
     * An object that maps variable values for the message. Amazon Pinpoint
     * merges these values with the variable values specified by properties of
     * the DefaultMessage object. The substitutions in this map take precedence
     * over all other substitutions.
     * </p>
     *
     * @param substitutions <p>
     *            An object that maps variable values for the message. Amazon
     *            Pinpoint merges these values with the variable values
     *            specified by properties of the DefaultMessage object. The
     *            substitutions in this map take precedence over all other
     *            substitutions.
     *            </p>
     */
    public void setSubstitutions(java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
    }

    /**
     * <p>
     * An object that maps variable values for the message. Amazon Pinpoint
     * merges these values with the variable values specified by properties of
     * the DefaultMessage object. The substitutions in this map take precedence
     * over all other substitutions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param substitutions <p>
     *            An object that maps variable values for the message. Amazon
     *            Pinpoint merges these values with the variable values
     *            specified by properties of the DefaultMessage object. The
     *            substitutions in this map take precedence over all other
     *            substitutions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddressConfiguration withSubstitutions(
            java.util.Map<String, java.util.List<String>> substitutions) {
        this.substitutions = substitutions;
        return this;
    }

    /**
     * <p>
     * An object that maps variable values for the message. Amazon Pinpoint
     * merges these values with the variable values specified by properties of
     * the DefaultMessage object. The substitutions in this map take precedence
     * over all other substitutions.
     * </p>
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
    public AddressConfiguration addSubstitutionsEntry(String key, java.util.List<String> value) {
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
    public AddressConfiguration clearSubstitutionsEntries() {
        this.substitutions = null;
        return this;
    }

    /**
     * <p>
     * The message title to use instead of the default message title. This value
     * overrides the default message title.
     * </p>
     *
     * @return <p>
     *         The message title to use instead of the default message title.
     *         This value overrides the default message title.
     *         </p>
     */
    public String getTitleOverride() {
        return titleOverride;
    }

    /**
     * <p>
     * The message title to use instead of the default message title. This value
     * overrides the default message title.
     * </p>
     *
     * @param titleOverride <p>
     *            The message title to use instead of the default message title.
     *            This value overrides the default message title.
     *            </p>
     */
    public void setTitleOverride(String titleOverride) {
        this.titleOverride = titleOverride;
    }

    /**
     * <p>
     * The message title to use instead of the default message title. This value
     * overrides the default message title.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param titleOverride <p>
     *            The message title to use instead of the default message title.
     *            This value overrides the default message title.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddressConfiguration withTitleOverride(String titleOverride) {
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
        if (getChannelType() != null)
            sb.append("ChannelType: " + getChannelType() + ",");
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
        hashCode = prime * hashCode
                + ((getChannelType() == null) ? 0 : getChannelType().hashCode());
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

        if (obj instanceof AddressConfiguration == false)
            return false;
        AddressConfiguration other = (AddressConfiguration) obj;

        if (other.getBodyOverride() == null ^ this.getBodyOverride() == null)
            return false;
        if (other.getBodyOverride() != null
                && other.getBodyOverride().equals(this.getBodyOverride()) == false)
            return false;
        if (other.getChannelType() == null ^ this.getChannelType() == null)
            return false;
        if (other.getChannelType() != null
                && other.getChannelType().equals(this.getChannelType()) == false)
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
