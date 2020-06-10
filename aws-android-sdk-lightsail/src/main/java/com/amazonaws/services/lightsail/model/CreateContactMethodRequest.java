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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an email or SMS text message contact method.
 * </p>
 * <p>
 * A contact method is used to send you notifications about your Amazon
 * Lightsail resources. You can add one email address and one mobile phone
 * number contact method in each AWS Region. However, SMS text messaging is not
 * supported in some AWS Regions, and SMS text messages cannot be sent to some
 * countries/regions. For more information, see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
 * >Notifications in Amazon Lightsail</a>.
 * </p>
 */
public class CreateContactMethodRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS
     * Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and
     * the latest AWS Regions where SMS text messaging is supported, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     * >Supported Regions and Countries</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     */
    private String protocol;

    /**
     * <p>
     * The destination of the contact method, such as an email address or a
     * mobile phone number.
     * </p>
     * <p>
     * Use the E.164 format when specifying a mobile phone number. E.164 is a
     * standard for the phone number structure used for international
     * telecommunication. Phone numbers that follow this format can have a
     * maximum of 15 digits, and they are prefixed with the plus character (+)
     * and the country code. For example, a U.S. phone number in E.164 format
     * would be specified as +1XXX5550100. For more information, see <a
     * href="https://en.wikipedia.org/wiki/E.164">E.164</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String contactEndpoint;

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS
     * Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and
     * the latest AWS Regions where SMS text messaging is supported, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     * >Supported Regions and Countries</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @return <p>
     *         The protocol of the contact method, such as <code>Email</code> or
     *         <code>SMS</code> (text messaging).
     *         </p>
     *         <p>
     *         The <code>SMS</code> protocol is supported only in the following
     *         AWS Regions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (N. Virginia) (<code>us-east-1</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon) (<code>us-west-2</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Ireland) (<code>eu-west-1</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a list of countries/regions where SMS text messages can be
     *         sent, and the latest AWS Regions where SMS text messaging is
     *         supported, see <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     *         >Supported Regions and Countries</a> in the <i>Amazon SNS
     *         Developer Guide</i>.
     *         </p>
     *         <p>
     *         For more information about notifications in Amazon Lightsail, see
     *         <a href=
     *         "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *         >Notifications in Amazon Lightsail</a>.
     *         </p>
     * @see ContactProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS
     * Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and
     * the latest AWS Regions where SMS text messaging is supported, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     * >Supported Regions and Countries</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @param protocol <p>
     *            The protocol of the contact method, such as <code>Email</code>
     *            or <code>SMS</code> (text messaging).
     *            </p>
     *            <p>
     *            The <code>SMS</code> protocol is supported only in the
     *            following AWS Regions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            US East (N. Virginia) (<code>us-east-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            US West (Oregon) (<code>us-west-2</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Europe (Ireland) (<code>eu-west-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a list of countries/regions where SMS text messages can be
     *            sent, and the latest AWS Regions where SMS text messaging is
     *            supported, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     *            >Supported Regions and Countries</a> in the <i>Amazon SNS
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about notifications in Amazon Lightsail,
     *            see <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *            >Notifications in Amazon Lightsail</a>.
     *            </p>
     * @see ContactProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS
     * Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and
     * the latest AWS Regions where SMS text messaging is supported, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     * >Supported Regions and Countries</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @param protocol <p>
     *            The protocol of the contact method, such as <code>Email</code>
     *            or <code>SMS</code> (text messaging).
     *            </p>
     *            <p>
     *            The <code>SMS</code> protocol is supported only in the
     *            following AWS Regions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            US East (N. Virginia) (<code>us-east-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            US West (Oregon) (<code>us-west-2</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Europe (Ireland) (<code>eu-west-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a list of countries/regions where SMS text messages can be
     *            sent, and the latest AWS Regions where SMS text messaging is
     *            supported, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     *            >Supported Regions and Countries</a> in the <i>Amazon SNS
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about notifications in Amazon Lightsail,
     *            see <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *            >Notifications in Amazon Lightsail</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactProtocol
     */
    public CreateContactMethodRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS
     * Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and
     * the latest AWS Regions where SMS text messaging is supported, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     * >Supported Regions and Countries</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @param protocol <p>
     *            The protocol of the contact method, such as <code>Email</code>
     *            or <code>SMS</code> (text messaging).
     *            </p>
     *            <p>
     *            The <code>SMS</code> protocol is supported only in the
     *            following AWS Regions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            US East (N. Virginia) (<code>us-east-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            US West (Oregon) (<code>us-west-2</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Europe (Ireland) (<code>eu-west-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a list of countries/regions where SMS text messages can be
     *            sent, and the latest AWS Regions where SMS text messaging is
     *            supported, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     *            >Supported Regions and Countries</a> in the <i>Amazon SNS
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about notifications in Amazon Lightsail,
     *            see <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *            >Notifications in Amazon Lightsail</a>.
     *            </p>
     * @see ContactProtocol
     */
    public void setProtocol(ContactProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or
     * <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS
     * Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and
     * the latest AWS Regions where SMS text messaging is supported, see <a
     * href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     * >Supported Regions and Countries</a> in the <i>Amazon SNS Developer
     * Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href=
     * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     * >Notifications in Amazon Lightsail</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Email, SMS
     *
     * @param protocol <p>
     *            The protocol of the contact method, such as <code>Email</code>
     *            or <code>SMS</code> (text messaging).
     *            </p>
     *            <p>
     *            The <code>SMS</code> protocol is supported only in the
     *            following AWS Regions.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            US East (N. Virginia) (<code>us-east-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            US West (Oregon) (<code>us-west-2</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Europe (Ireland) (<code>eu-west-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For a list of countries/regions where SMS text messages can be
     *            sent, and the latest AWS Regions where SMS text messaging is
     *            supported, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html"
     *            >Supported Regions and Countries</a> in the <i>Amazon SNS
     *            Developer Guide</i>.
     *            </p>
     *            <p>
     *            For more information about notifications in Amazon Lightsail,
     *            see <a href=
     *            "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *            >Notifications in Amazon Lightsail</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContactProtocol
     */
    public CreateContactMethodRequest withProtocol(ContactProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a
     * mobile phone number.
     * </p>
     * <p>
     * Use the E.164 format when specifying a mobile phone number. E.164 is a
     * standard for the phone number structure used for international
     * telecommunication. Phone numbers that follow this format can have a
     * maximum of 15 digits, and they are prefixed with the plus character (+)
     * and the country code. For example, a U.S. phone number in E.164 format
     * would be specified as +1XXX5550100. For more information, see <a
     * href="https://en.wikipedia.org/wiki/E.164">E.164</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The destination of the contact method, such as an email address
     *         or a mobile phone number.
     *         </p>
     *         <p>
     *         Use the E.164 format when specifying a mobile phone number. E.164
     *         is a standard for the phone number structure used for
     *         international telecommunication. Phone numbers that follow this
     *         format can have a maximum of 15 digits, and they are prefixed
     *         with the plus character (+) and the country code. For example, a
     *         U.S. phone number in E.164 format would be specified as
     *         +1XXX5550100. For more information, see <a
     *         href="https://en.wikipedia.org/wiki/E.164">E.164</a> on
     *         <i>Wikipedia</i>.
     *         </p>
     */
    public String getContactEndpoint() {
        return contactEndpoint;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a
     * mobile phone number.
     * </p>
     * <p>
     * Use the E.164 format when specifying a mobile phone number. E.164 is a
     * standard for the phone number structure used for international
     * telecommunication. Phone numbers that follow this format can have a
     * maximum of 15 digits, and they are prefixed with the plus character (+)
     * and the country code. For example, a U.S. phone number in E.164 format
     * would be specified as +1XXX5550100. For more information, see <a
     * href="https://en.wikipedia.org/wiki/E.164">E.164</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactEndpoint <p>
     *            The destination of the contact method, such as an email
     *            address or a mobile phone number.
     *            </p>
     *            <p>
     *            Use the E.164 format when specifying a mobile phone number.
     *            E.164 is a standard for the phone number structure used for
     *            international telecommunication. Phone numbers that follow
     *            this format can have a maximum of 15 digits, and they are
     *            prefixed with the plus character (+) and the country code. For
     *            example, a U.S. phone number in E.164 format would be
     *            specified as +1XXX5550100. For more information, see <a
     *            href="https://en.wikipedia.org/wiki/E.164">E.164</a> on
     *            <i>Wikipedia</i>.
     *            </p>
     */
    public void setContactEndpoint(String contactEndpoint) {
        this.contactEndpoint = contactEndpoint;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a
     * mobile phone number.
     * </p>
     * <p>
     * Use the E.164 format when specifying a mobile phone number. E.164 is a
     * standard for the phone number structure used for international
     * telecommunication. Phone numbers that follow this format can have a
     * maximum of 15 digits, and they are prefixed with the plus character (+)
     * and the country code. For example, a U.S. phone number in E.164 format
     * would be specified as +1XXX5550100. For more information, see <a
     * href="https://en.wikipedia.org/wiki/E.164">E.164</a> on <i>Wikipedia</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param contactEndpoint <p>
     *            The destination of the contact method, such as an email
     *            address or a mobile phone number.
     *            </p>
     *            <p>
     *            Use the E.164 format when specifying a mobile phone number.
     *            E.164 is a standard for the phone number structure used for
     *            international telecommunication. Phone numbers that follow
     *            this format can have a maximum of 15 digits, and they are
     *            prefixed with the plus character (+) and the country code. For
     *            example, a U.S. phone number in E.164 format would be
     *            specified as +1XXX5550100. For more information, see <a
     *            href="https://en.wikipedia.org/wiki/E.164">E.164</a> on
     *            <i>Wikipedia</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateContactMethodRequest withContactEndpoint(String contactEndpoint) {
        this.contactEndpoint = contactEndpoint;
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
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol() + ",");
        if (getContactEndpoint() != null)
            sb.append("contactEndpoint: " + getContactEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getContactEndpoint() == null) ? 0 : getContactEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContactMethodRequest == false)
            return false;
        CreateContactMethodRequest other = (CreateContactMethodRequest) obj;

        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getContactEndpoint() == null ^ this.getContactEndpoint() == null)
            return false;
        if (other.getContactEndpoint() != null
                && other.getContactEndpoint().equals(this.getContactEndpoint()) == false)
            return false;
        return true;
    }
}
