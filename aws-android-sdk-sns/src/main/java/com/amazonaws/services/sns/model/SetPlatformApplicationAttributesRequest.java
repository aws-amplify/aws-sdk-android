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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the attributes of the platform application object for the supported push
 * notification services, such as APNS and GCM. For more information, see <a
 * href="http://docs.aws.amazon.com/sns/latest/dg/SNSMobilePush.html">Using
 * Amazon SNS Mobile Push Notifications</a>. For information on configuring
 * attributes for message delivery status, see <a
 * href="http://docs.aws.amazon.com/sns/latest/dg/sns-msg-status.html">Using
 * Amazon SNS Application Attributes for Message Delivery Status</a>.
 * </p>
 */
public class SetPlatformApplicationAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * </p>
     */
    private String platformApplicationArn;

    /**
     * <p>
     * A map of the platform application attributes. Attributes in this map
     * include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> -- The credential received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformCredential is
     * private key. For GCM, PlatformCredential is "API key". For ADM,
     * PlatformCredential is "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> -- The principal received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is SSL
     * certificate. For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> -- Topic ARN to which EndpointCreated
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> -- Topic ARN to which EndpointDeleted
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> -- Topic ARN to which EndpointUpdate
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> -- Topic ARN to which DeliveryFailure
     * event notifications should be sent upon Direct Publish delivery failure
     * (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> -- Sample rate percentage (0-100)
     * of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> attributes = new java.util.HashMap<String, String>();

    /**
     * <p>
     * PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * </p>
     *
     * @return <p>
     *         PlatformApplicationArn for SetPlatformApplicationAttributes
     *         action.
     *         </p>
     */
    public String getPlatformApplicationArn() {
        return platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * </p>
     *
     * @param platformApplicationArn <p>
     *            PlatformApplicationArn for SetPlatformApplicationAttributes
     *            action.
     *            </p>
     */
    public void setPlatformApplicationArn(String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
    }

    /**
     * <p>
     * PlatformApplicationArn for SetPlatformApplicationAttributes action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformApplicationArn <p>
     *            PlatformApplicationArn for SetPlatformApplicationAttributes
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetPlatformApplicationAttributesRequest withPlatformApplicationArn(
            String platformApplicationArn) {
        this.platformApplicationArn = platformApplicationArn;
        return this;
    }

    /**
     * <p>
     * A map of the platform application attributes. Attributes in this map
     * include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> -- The credential received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformCredential is
     * private key. For GCM, PlatformCredential is "API key". For ADM,
     * PlatformCredential is "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> -- The principal received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is SSL
     * certificate. For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> -- Topic ARN to which EndpointCreated
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> -- Topic ARN to which EndpointDeleted
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> -- Topic ARN to which EndpointUpdate
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> -- Topic ARN to which DeliveryFailure
     * event notifications should be sent upon Direct Publish delivery failure
     * (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> -- Sample rate percentage (0-100)
     * of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A map of the platform application attributes. Attributes in this
     *         map include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PlatformCredential</code> -- The credential received from
     *         the notification service. For APNS/APNS_SANDBOX,
     *         PlatformCredential is private key. For GCM, PlatformCredential is
     *         "API key". For ADM, PlatformCredential is "client secret".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PlatformPrincipal</code> -- The principal received from the
     *         notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is
     *         SSL certificate. For GCM, PlatformPrincipal is not applicable.
     *         For ADM, PlatformPrincipal is "client id".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EventEndpointCreated</code> -- Topic ARN to which
     *         EndpointCreated event notifications should be sent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EventEndpointDeleted</code> -- Topic ARN to which
     *         EndpointDeleted event notifications should be sent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EventEndpointUpdated</code> -- Topic ARN to which
     *         EndpointUpdate event notifications should be sent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EventDeliveryFailure</code> -- Topic ARN to which
     *         DeliveryFailure event notifications should be sent upon Direct
     *         Publish delivery failure (permanent) to one of the application's
     *         endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SuccessFeedbackRoleArn</code> -- IAM role ARN used to give
     *         Amazon SNS write access to use CloudWatch Logs on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FailureFeedbackRoleArn</code> -- IAM role ARN used to give
     *         Amazon SNS write access to use CloudWatch Logs on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SuccessFeedbackSampleRate</code> -- Sample rate percentage
     *         (0-100) of successfully delivered messages.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A map of the platform application attributes. Attributes in this map
     * include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> -- The credential received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformCredential is
     * private key. For GCM, PlatformCredential is "API key". For ADM,
     * PlatformCredential is "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> -- The principal received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is SSL
     * certificate. For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> -- Topic ARN to which EndpointCreated
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> -- Topic ARN to which EndpointDeleted
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> -- Topic ARN to which EndpointUpdate
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> -- Topic ARN to which DeliveryFailure
     * event notifications should be sent upon Direct Publish delivery failure
     * (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> -- Sample rate percentage (0-100)
     * of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     *
     * @param attributes <p>
     *            A map of the platform application attributes. Attributes in
     *            this map include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlatformCredential</code> -- The credential received
     *            from the notification service. For APNS/APNS_SANDBOX,
     *            PlatformCredential is private key. For GCM, PlatformCredential
     *            is "API key". For ADM, PlatformCredential is "client secret".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PlatformPrincipal</code> -- The principal received from
     *            the notification service. For APNS/APNS_SANDBOX,
     *            PlatformPrincipal is SSL certificate. For GCM,
     *            PlatformPrincipal is not applicable. For ADM,
     *            PlatformPrincipal is "client id".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EventEndpointCreated</code> -- Topic ARN to which
     *            EndpointCreated event notifications should be sent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EventEndpointDeleted</code> -- Topic ARN to which
     *            EndpointDeleted event notifications should be sent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EventEndpointUpdated</code> -- Topic ARN to which
     *            EndpointUpdate event notifications should be sent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EventDeliveryFailure</code> -- Topic ARN to which
     *            DeliveryFailure event notifications should be sent upon Direct
     *            Publish delivery failure (permanent) to one of the
     *            application's endpoints.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SuccessFeedbackRoleArn</code> -- IAM role ARN used to
     *            give Amazon SNS write access to use CloudWatch Logs on your
     *            behalf.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FailureFeedbackRoleArn</code> -- IAM role ARN used to
     *            give Amazon SNS write access to use CloudWatch Logs on your
     *            behalf.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SuccessFeedbackSampleRate</code> -- Sample rate
     *            percentage (0-100) of successfully delivered messages.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A map of the platform application attributes. Attributes in this map
     * include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> -- The credential received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformCredential is
     * private key. For GCM, PlatformCredential is "API key". For ADM,
     * PlatformCredential is "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> -- The principal received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is SSL
     * certificate. For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> -- Topic ARN to which EndpointCreated
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> -- Topic ARN to which EndpointDeleted
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> -- Topic ARN to which EndpointUpdate
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> -- Topic ARN to which DeliveryFailure
     * event notifications should be sent upon Direct Publish delivery failure
     * (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> -- Sample rate percentage (0-100)
     * of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A map of the platform application attributes. Attributes in
     *            this map include the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PlatformCredential</code> -- The credential received
     *            from the notification service. For APNS/APNS_SANDBOX,
     *            PlatformCredential is private key. For GCM, PlatformCredential
     *            is "API key". For ADM, PlatformCredential is "client secret".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>PlatformPrincipal</code> -- The principal received from
     *            the notification service. For APNS/APNS_SANDBOX,
     *            PlatformPrincipal is SSL certificate. For GCM,
     *            PlatformPrincipal is not applicable. For ADM,
     *            PlatformPrincipal is "client id".
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EventEndpointCreated</code> -- Topic ARN to which
     *            EndpointCreated event notifications should be sent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EventEndpointDeleted</code> -- Topic ARN to which
     *            EndpointDeleted event notifications should be sent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EventEndpointUpdated</code> -- Topic ARN to which
     *            EndpointUpdate event notifications should be sent.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>EventDeliveryFailure</code> -- Topic ARN to which
     *            DeliveryFailure event notifications should be sent upon Direct
     *            Publish delivery failure (permanent) to one of the
     *            application's endpoints.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SuccessFeedbackRoleArn</code> -- IAM role ARN used to
     *            give Amazon SNS write access to use CloudWatch Logs on your
     *            behalf.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FailureFeedbackRoleArn</code> -- IAM role ARN used to
     *            give Amazon SNS write access to use CloudWatch Logs on your
     *            behalf.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SuccessFeedbackSampleRate</code> -- Sample rate
     *            percentage (0-100) of successfully delivered messages.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetPlatformApplicationAttributesRequest withAttributes(
            java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A map of the platform application attributes. Attributes in this map
     * include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PlatformCredential</code> -- The credential received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformCredential is
     * private key. For GCM, PlatformCredential is "API key". For ADM,
     * PlatformCredential is "client secret".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PlatformPrincipal</code> -- The principal received from the
     * notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is SSL
     * certificate. For GCM, PlatformPrincipal is not applicable. For ADM,
     * PlatformPrincipal is "client id".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointCreated</code> -- Topic ARN to which EndpointCreated
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointDeleted</code> -- Topic ARN to which EndpointDeleted
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventEndpointUpdated</code> -- Topic ARN to which EndpointUpdate
     * event notifications should be sent.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EventDeliveryFailure</code> -- Topic ARN to which DeliveryFailure
     * event notifications should be sent upon Direct Publish delivery failure
     * (permanent) to one of the application's endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FailureFeedbackRoleArn</code> -- IAM role ARN used to give Amazon
     * SNS write access to use CloudWatch Logs on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SuccessFeedbackSampleRate</code> -- Sample rate percentage (0-100)
     * of successfully delivered messages.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetPlatformApplicationAttributesRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SetPlatformApplicationAttributesRequest clearAttributesEntries() {
        this.attributes = null;
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
        if (getPlatformApplicationArn() != null)
            sb.append("PlatformApplicationArn: " + getPlatformApplicationArn() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPlatformApplicationArn() == null) ? 0 : getPlatformApplicationArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetPlatformApplicationAttributesRequest == false)
            return false;
        SetPlatformApplicationAttributesRequest other = (SetPlatformApplicationAttributesRequest) obj;

        if (other.getPlatformApplicationArn() == null ^ this.getPlatformApplicationArn() == null)
            return false;
        if (other.getPlatformApplicationArn() != null
                && other.getPlatformApplicationArn().equals(this.getPlatformApplicationArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
