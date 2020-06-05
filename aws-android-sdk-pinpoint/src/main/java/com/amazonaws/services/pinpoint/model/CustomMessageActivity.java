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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * The settings for a custom message activity. This type of activity calls an
 * AWS Lambda function or web hook that sends messages to participants.
 * </p>
 */
public class CustomMessageActivity implements Serializable {
    /**
     * <p>
     * The destination to send the custom message to. This value can be one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to
     * invoke to handle delivery of the custom message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can
     * receive the message. The URL has to be a full URL, including the HTTPS
     * protocol.
     * </p>
     * </li>
     * </ul>
     */
    private String deliveryUri;

    /**
     * <p>
     * The types of endpoints to send the custom message to. Each valid value
     * maps to a type of channel that you can associate with an endpoint by
     * using the ChannelType property of an endpoint.
     * </p>
     */
    private java.util.List<String> endpointTypes;

    /**
     * <p>
     * Specifies the message data included in a custom channel message that's
     * sent to participants in a journey.
     * </p>
     */
    private JourneyCustomMessage messageConfig;

    /**
     * <p>
     * The unique identifier for the next activity to perform, after Amazon
     * Pinpoint calls the AWS Lambda function or web hook.
     * </p>
     */
    private String nextActivity;

    /**
     * <p>
     * The name of the custom message template to use for the message. If
     * specified, this value must match the name of an existing message
     * template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The unique identifier for the version of the message template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     */
    private String templateVersion;

    /**
     * <p>
     * The destination to send the custom message to. This value can be one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to
     * invoke to handle delivery of the custom message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can
     * receive the message. The URL has to be a full URL, including the HTTPS
     * protocol.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The destination to send the custom message to. This value can be
     *         one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The name or Amazon Resource Name (ARN) of an AWS Lambda function
     *         to invoke to handle delivery of the custom message.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The URL for a web application or service that supports HTTPS and
     *         can receive the message. The URL has to be a full URL, including
     *         the HTTPS protocol.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDeliveryUri() {
        return deliveryUri;
    }

    /**
     * <p>
     * The destination to send the custom message to. This value can be one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to
     * invoke to handle delivery of the custom message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can
     * receive the message. The URL has to be a full URL, including the HTTPS
     * protocol.
     * </p>
     * </li>
     * </ul>
     *
     * @param deliveryUri <p>
     *            The destination to send the custom message to. This value can
     *            be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name or Amazon Resource Name (ARN) of an AWS Lambda
     *            function to invoke to handle delivery of the custom message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The URL for a web application or service that supports HTTPS
     *            and can receive the message. The URL has to be a full URL,
     *            including the HTTPS protocol.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDeliveryUri(String deliveryUri) {
        this.deliveryUri = deliveryUri;
    }

    /**
     * <p>
     * The destination to send the custom message to. This value can be one of
     * the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to
     * invoke to handle delivery of the custom message.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can
     * receive the message. The URL has to be a full URL, including the HTTPS
     * protocol.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryUri <p>
     *            The destination to send the custom message to. This value can
     *            be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The name or Amazon Resource Name (ARN) of an AWS Lambda
     *            function to invoke to handle delivery of the custom message.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The URL for a web application or service that supports HTTPS
     *            and can receive the message. The URL has to be a full URL,
     *            including the HTTPS protocol.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomMessageActivity withDeliveryUri(String deliveryUri) {
        this.deliveryUri = deliveryUri;
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the custom message to. Each valid value
     * maps to a type of channel that you can associate with an endpoint by
     * using the ChannelType property of an endpoint.
     * </p>
     *
     * @return <p>
     *         The types of endpoints to send the custom message to. Each valid
     *         value maps to a type of channel that you can associate with an
     *         endpoint by using the ChannelType property of an endpoint.
     *         </p>
     */
    public java.util.List<String> getEndpointTypes() {
        return endpointTypes;
    }

    /**
     * <p>
     * The types of endpoints to send the custom message to. Each valid value
     * maps to a type of channel that you can associate with an endpoint by
     * using the ChannelType property of an endpoint.
     * </p>
     *
     * @param endpointTypes <p>
     *            The types of endpoints to send the custom message to. Each
     *            valid value maps to a type of channel that you can associate
     *            with an endpoint by using the ChannelType property of an
     *            endpoint.
     *            </p>
     */
    public void setEndpointTypes(java.util.Collection<String> endpointTypes) {
        if (endpointTypes == null) {
            this.endpointTypes = null;
            return;
        }

        this.endpointTypes = new java.util.ArrayList<String>(endpointTypes);
    }

    /**
     * <p>
     * The types of endpoints to send the custom message to. Each valid value
     * maps to a type of channel that you can associate with an endpoint by
     * using the ChannelType property of an endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointTypes <p>
     *            The types of endpoints to send the custom message to. Each
     *            valid value maps to a type of channel that you can associate
     *            with an endpoint by using the ChannelType property of an
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomMessageActivity withEndpointTypes(String... endpointTypes) {
        if (getEndpointTypes() == null) {
            this.endpointTypes = new java.util.ArrayList<String>(endpointTypes.length);
        }
        for (String value : endpointTypes) {
            this.endpointTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the custom message to. Each valid value
     * maps to a type of channel that you can associate with an endpoint by
     * using the ChannelType property of an endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointTypes <p>
     *            The types of endpoints to send the custom message to. Each
     *            valid value maps to a type of channel that you can associate
     *            with an endpoint by using the ChannelType property of an
     *            endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomMessageActivity withEndpointTypes(java.util.Collection<String> endpointTypes) {
        setEndpointTypes(endpointTypes);
        return this;
    }

    /**
     * <p>
     * Specifies the message data included in a custom channel message that's
     * sent to participants in a journey.
     * </p>
     *
     * @return <p>
     *         Specifies the message data included in a custom channel message
     *         that's sent to participants in a journey.
     *         </p>
     */
    public JourneyCustomMessage getMessageConfig() {
        return messageConfig;
    }

    /**
     * <p>
     * Specifies the message data included in a custom channel message that's
     * sent to participants in a journey.
     * </p>
     *
     * @param messageConfig <p>
     *            Specifies the message data included in a custom channel
     *            message that's sent to participants in a journey.
     *            </p>
     */
    public void setMessageConfig(JourneyCustomMessage messageConfig) {
        this.messageConfig = messageConfig;
    }

    /**
     * <p>
     * Specifies the message data included in a custom channel message that's
     * sent to participants in a journey.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageConfig <p>
     *            Specifies the message data included in a custom channel
     *            message that's sent to participants in a journey.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomMessageActivity withMessageConfig(JourneyCustomMessage messageConfig) {
        this.messageConfig = messageConfig;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after Amazon
     * Pinpoint calls the AWS Lambda function or web hook.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the next activity to perform, after
     *         Amazon Pinpoint calls the AWS Lambda function or web hook.
     *         </p>
     */
    public String getNextActivity() {
        return nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after Amazon
     * Pinpoint calls the AWS Lambda function or web hook.
     * </p>
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            Amazon Pinpoint calls the AWS Lambda function or web hook.
     *            </p>
     */
    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after Amazon
     * Pinpoint calls the AWS Lambda function or web hook.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextActivity <p>
     *            The unique identifier for the next activity to perform, after
     *            Amazon Pinpoint calls the AWS Lambda function or web hook.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomMessageActivity withNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
        return this;
    }

    /**
     * <p>
     * The name of the custom message template to use for the message. If
     * specified, this value must match the name of an existing message
     * template.
     * </p>
     *
     * @return <p>
     *         The name of the custom message template to use for the message.
     *         If specified, this value must match the name of an existing
     *         message template.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the custom message template to use for the message. If
     * specified, this value must match the name of an existing message
     * template.
     * </p>
     *
     * @param templateName <p>
     *            The name of the custom message template to use for the
     *            message. If specified, this value must match the name of an
     *            existing message template.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the custom message template to use for the message. If
     * specified, this value must match the name of an existing message
     * template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the custom message template to use for the
     *            message. If specified, this value must match the name of an
     *            existing message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomMessageActivity withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the version of the message template to
     *         use for the message. If specified, this value must match the
     *         identifier for an existing template version. To retrieve a list
     *         of versions and version identifiers for a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template
     *         Versions</link> resource.
     *         </p>
     *         <p>
     *         If you don't specify a value for this property, Amazon Pinpoint
     *         uses the <i>active version</i> of the template. The <i>active
     *         version</i> is typically the version of a template that's been
     *         most recently reviewed and approved for use, depending on your
     *         workflow. It isn't necessarily the latest version of a template.
     *         </p>
     */
    public String getTemplateVersion() {
        return templateVersion;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     *
     * @param templateVersion <p>
     *            The unique identifier for the version of the message template
     *            to use for the message. If specified, this value must match
     *            the identifier for an existing template version. To retrieve a
     *            list of versions and version identifiers for a template, use
     *            the <link
     *            linkend="templates-template-name-template-type-versions"
     *            >Template Versions</link> resource.
     *            </p>
     *            <p>
     *            If you don't specify a value for this property, Amazon
     *            Pinpoint uses the <i>active version</i> of the template. The
     *            <i>active version</i> is typically the version of a template
     *            that's been most recently reviewed and approved for use,
     *            depending on your workflow. It isn't necessarily the latest
     *            version of a template.
     *            </p>
     */
    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for
     * the message. If specified, this value must match the identifier for an
     * existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link
     * linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the
     * <i>active version</i> of the template. The <i>active version</i> is
     * typically the version of a template that's been most recently reviewed
     * and approved for use, depending on your workflow. It isn't necessarily
     * the latest version of a template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateVersion <p>
     *            The unique identifier for the version of the message template
     *            to use for the message. If specified, this value must match
     *            the identifier for an existing template version. To retrieve a
     *            list of versions and version identifiers for a template, use
     *            the <link
     *            linkend="templates-template-name-template-type-versions"
     *            >Template Versions</link> resource.
     *            </p>
     *            <p>
     *            If you don't specify a value for this property, Amazon
     *            Pinpoint uses the <i>active version</i> of the template. The
     *            <i>active version</i> is typically the version of a template
     *            that's been most recently reviewed and approved for use,
     *            depending on your workflow. It isn't necessarily the latest
     *            version of a template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomMessageActivity withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
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
        if (getDeliveryUri() != null)
            sb.append("DeliveryUri: " + getDeliveryUri() + ",");
        if (getEndpointTypes() != null)
            sb.append("EndpointTypes: " + getEndpointTypes() + ",");
        if (getMessageConfig() != null)
            sb.append("MessageConfig: " + getMessageConfig() + ",");
        if (getNextActivity() != null)
            sb.append("NextActivity: " + getNextActivity() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getTemplateVersion() != null)
            sb.append("TemplateVersion: " + getTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeliveryUri() == null) ? 0 : getDeliveryUri().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointTypes() == null) ? 0 : getEndpointTypes().hashCode());
        hashCode = prime * hashCode
                + ((getMessageConfig() == null) ? 0 : getMessageConfig().hashCode());
        hashCode = prime * hashCode
                + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomMessageActivity == false)
            return false;
        CustomMessageActivity other = (CustomMessageActivity) obj;

        if (other.getDeliveryUri() == null ^ this.getDeliveryUri() == null)
            return false;
        if (other.getDeliveryUri() != null
                && other.getDeliveryUri().equals(this.getDeliveryUri()) == false)
            return false;
        if (other.getEndpointTypes() == null ^ this.getEndpointTypes() == null)
            return false;
        if (other.getEndpointTypes() != null
                && other.getEndpointTypes().equals(this.getEndpointTypes()) == false)
            return false;
        if (other.getMessageConfig() == null ^ this.getMessageConfig() == null)
            return false;
        if (other.getMessageConfig() != null
                && other.getMessageConfig().equals(this.getMessageConfig()) == false)
            return false;
        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null
                && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null
                && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        return true;
    }
}
