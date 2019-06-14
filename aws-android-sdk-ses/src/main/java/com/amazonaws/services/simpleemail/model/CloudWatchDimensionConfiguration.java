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
 * Contains the dimension configuration to use when you publish email sending
 * events to Amazon CloudWatch.
 * </p>
 * <p>
 * For information about publishing email sending events to Amazon CloudWatch,
 * see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class CloudWatchDimensionConfiguration implements Serializable {
    /**
     * <p>
     * The name of an Amazon CloudWatch dimension associated with an email
     * sending metric. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 256 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String dimensionName;

    /**
     * <p>
     * The place where Amazon SES finds the value of a dimension to publish to
     * Amazon CloudWatch. If you want Amazon SES to use the message tags that
     * you specify using an <code>X-SES-MESSAGE-TAGS</code> header or a
     * parameter to the <code>SendEmail</code>/<code>SendRawEmail</code> API,
     * choose <code>messageTag</code>. If you want Amazon SES to use your own
     * email headers, choose <code>emailHeader</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>messageTag, emailHeader, linkTag
     */
    private String dimensionValueSource;

    /**
     * <p>
     * The default value of the dimension that is published to Amazon CloudWatch
     * if you do not provide the value of the dimension when you send an email.
     * The default value must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 256 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String defaultDimensionValue;

    /**
     * <p>
     * The name of an Amazon CloudWatch dimension associated with an email
     * sending metric. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 256 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of an Amazon CloudWatch dimension associated with an
     *         email sending metric. The name must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers
     *         (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 256 characters.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDimensionName() {
        return dimensionName;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch dimension associated with an email
     * sending metric. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 256 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @param dimensionName <p>
     *            The name of an Amazon CloudWatch dimension associated with an
     *            email sending metric. The name must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 256 characters.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch dimension associated with an email
     * sending metric. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 256 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensionName <p>
     *            The name of an Amazon CloudWatch dimension associated with an
     *            email sending metric. The name must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 256 characters.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchDimensionConfiguration withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * <p>
     * The place where Amazon SES finds the value of a dimension to publish to
     * Amazon CloudWatch. If you want Amazon SES to use the message tags that
     * you specify using an <code>X-SES-MESSAGE-TAGS</code> header or a
     * parameter to the <code>SendEmail</code>/<code>SendRawEmail</code> API,
     * choose <code>messageTag</code>. If you want Amazon SES to use your own
     * email headers, choose <code>emailHeader</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>messageTag, emailHeader, linkTag
     *
     * @return <p>
     *         The place where Amazon SES finds the value of a dimension to
     *         publish to Amazon CloudWatch. If you want Amazon SES to use the
     *         message tags that you specify using an
     *         <code>X-SES-MESSAGE-TAGS</code> header or a parameter to the
     *         <code>SendEmail</code>/<code>SendRawEmail</code> API, choose
     *         <code>messageTag</code>. If you want Amazon SES to use your own
     *         email headers, choose <code>emailHeader</code>.
     *         </p>
     * @see DimensionValueSource
     */
    public String getDimensionValueSource() {
        return dimensionValueSource;
    }

    /**
     * <p>
     * The place where Amazon SES finds the value of a dimension to publish to
     * Amazon CloudWatch. If you want Amazon SES to use the message tags that
     * you specify using an <code>X-SES-MESSAGE-TAGS</code> header or a
     * parameter to the <code>SendEmail</code>/<code>SendRawEmail</code> API,
     * choose <code>messageTag</code>. If you want Amazon SES to use your own
     * email headers, choose <code>emailHeader</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>messageTag, emailHeader, linkTag
     *
     * @param dimensionValueSource <p>
     *            The place where Amazon SES finds the value of a dimension to
     *            publish to Amazon CloudWatch. If you want Amazon SES to use
     *            the message tags that you specify using an
     *            <code>X-SES-MESSAGE-TAGS</code> header or a parameter to the
     *            <code>SendEmail</code>/<code>SendRawEmail</code> API, choose
     *            <code>messageTag</code>. If you want Amazon SES to use your
     *            own email headers, choose <code>emailHeader</code>.
     *            </p>
     * @see DimensionValueSource
     */
    public void setDimensionValueSource(String dimensionValueSource) {
        this.dimensionValueSource = dimensionValueSource;
    }

    /**
     * <p>
     * The place where Amazon SES finds the value of a dimension to publish to
     * Amazon CloudWatch. If you want Amazon SES to use the message tags that
     * you specify using an <code>X-SES-MESSAGE-TAGS</code> header or a
     * parameter to the <code>SendEmail</code>/<code>SendRawEmail</code> API,
     * choose <code>messageTag</code>. If you want Amazon SES to use your own
     * email headers, choose <code>emailHeader</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>messageTag, emailHeader, linkTag
     *
     * @param dimensionValueSource <p>
     *            The place where Amazon SES finds the value of a dimension to
     *            publish to Amazon CloudWatch. If you want Amazon SES to use
     *            the message tags that you specify using an
     *            <code>X-SES-MESSAGE-TAGS</code> header or a parameter to the
     *            <code>SendEmail</code>/<code>SendRawEmail</code> API, choose
     *            <code>messageTag</code>. If you want Amazon SES to use your
     *            own email headers, choose <code>emailHeader</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionValueSource
     */
    public CloudWatchDimensionConfiguration withDimensionValueSource(String dimensionValueSource) {
        this.dimensionValueSource = dimensionValueSource;
        return this;
    }

    /**
     * <p>
     * The place where Amazon SES finds the value of a dimension to publish to
     * Amazon CloudWatch. If you want Amazon SES to use the message tags that
     * you specify using an <code>X-SES-MESSAGE-TAGS</code> header or a
     * parameter to the <code>SendEmail</code>/<code>SendRawEmail</code> API,
     * choose <code>messageTag</code>. If you want Amazon SES to use your own
     * email headers, choose <code>emailHeader</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>messageTag, emailHeader, linkTag
     *
     * @param dimensionValueSource <p>
     *            The place where Amazon SES finds the value of a dimension to
     *            publish to Amazon CloudWatch. If you want Amazon SES to use
     *            the message tags that you specify using an
     *            <code>X-SES-MESSAGE-TAGS</code> header or a parameter to the
     *            <code>SendEmail</code>/<code>SendRawEmail</code> API, choose
     *            <code>messageTag</code>. If you want Amazon SES to use your
     *            own email headers, choose <code>emailHeader</code>.
     *            </p>
     * @see DimensionValueSource
     */
    public void setDimensionValueSource(DimensionValueSource dimensionValueSource) {
        this.dimensionValueSource = dimensionValueSource.toString();
    }

    /**
     * <p>
     * The place where Amazon SES finds the value of a dimension to publish to
     * Amazon CloudWatch. If you want Amazon SES to use the message tags that
     * you specify using an <code>X-SES-MESSAGE-TAGS</code> header or a
     * parameter to the <code>SendEmail</code>/<code>SendRawEmail</code> API,
     * choose <code>messageTag</code>. If you want Amazon SES to use your own
     * email headers, choose <code>emailHeader</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>messageTag, emailHeader, linkTag
     *
     * @param dimensionValueSource <p>
     *            The place where Amazon SES finds the value of a dimension to
     *            publish to Amazon CloudWatch. If you want Amazon SES to use
     *            the message tags that you specify using an
     *            <code>X-SES-MESSAGE-TAGS</code> header or a parameter to the
     *            <code>SendEmail</code>/<code>SendRawEmail</code> API, choose
     *            <code>messageTag</code>. If you want Amazon SES to use your
     *            own email headers, choose <code>emailHeader</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DimensionValueSource
     */
    public CloudWatchDimensionConfiguration withDimensionValueSource(
            DimensionValueSource dimensionValueSource) {
        this.dimensionValueSource = dimensionValueSource.toString();
        return this;
    }

    /**
     * <p>
     * The default value of the dimension that is published to Amazon CloudWatch
     * if you do not provide the value of the dimension when you send an email.
     * The default value must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 256 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The default value of the dimension that is published to Amazon
     *         CloudWatch if you do not provide the value of the dimension when
     *         you send an email. The default value must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers
     *         (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 256 characters.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDefaultDimensionValue() {
        return defaultDimensionValue;
    }

    /**
     * <p>
     * The default value of the dimension that is published to Amazon CloudWatch
     * if you do not provide the value of the dimension when you send an email.
     * The default value must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 256 characters.
     * </p>
     * </li>
     * </ul>
     *
     * @param defaultDimensionValue <p>
     *            The default value of the dimension that is published to Amazon
     *            CloudWatch if you do not provide the value of the dimension
     *            when you send an email. The default value must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 256 characters.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDefaultDimensionValue(String defaultDimensionValue) {
        this.defaultDimensionValue = defaultDimensionValue;
    }

    /**
     * <p>
     * The default value of the dimension that is published to Amazon CloudWatch
     * if you do not provide the value of the dimension when you send an email.
     * The default value must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9),
     * underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 256 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultDimensionValue <p>
     *            The default value of the dimension that is published to Amazon
     *            CloudWatch if you do not provide the value of the dimension
     *            when you send an email. The default value must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            This value can only contain ASCII letters (a-z, A-Z), numbers
     *            (0-9), underscores (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain less than 256 characters.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchDimensionConfiguration withDefaultDimensionValue(String defaultDimensionValue) {
        this.defaultDimensionValue = defaultDimensionValue;
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
        if (getDimensionName() != null)
            sb.append("DimensionName: " + getDimensionName() + ",");
        if (getDimensionValueSource() != null)
            sb.append("DimensionValueSource: " + getDimensionValueSource() + ",");
        if (getDefaultDimensionValue() != null)
            sb.append("DefaultDimensionValue: " + getDefaultDimensionValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDimensionName() == null) ? 0 : getDimensionName().hashCode());
        hashCode = prime * hashCode
                + ((getDimensionValueSource() == null) ? 0 : getDimensionValueSource().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultDimensionValue() == null) ? 0 : getDefaultDimensionValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchDimensionConfiguration == false)
            return false;
        CloudWatchDimensionConfiguration other = (CloudWatchDimensionConfiguration) obj;

        if (other.getDimensionName() == null ^ this.getDimensionName() == null)
            return false;
        if (other.getDimensionName() != null
                && other.getDimensionName().equals(this.getDimensionName()) == false)
            return false;
        if (other.getDimensionValueSource() == null ^ this.getDimensionValueSource() == null)
            return false;
        if (other.getDimensionValueSource() != null
                && other.getDimensionValueSource().equals(this.getDimensionValueSource()) == false)
            return false;
        if (other.getDefaultDimensionValue() == null ^ this.getDefaultDimensionValue() == null)
            return false;
        if (other.getDefaultDimensionValue() != null
                && other.getDefaultDimensionValue().equals(this.getDefaultDimensionValue()) == false)
            return false;
        return true;
    }
}
