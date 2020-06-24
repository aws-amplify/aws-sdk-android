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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the last time an AWS access key was used since IAM
 * began tracking this information on April 22, 2015.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetAccessKeyLastUsed</a> operation.
 * </p>
 */
public class AccessKeyLastUsed implements Serializable {
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the access key was most recently used. This
     * field is null in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date lastUsedDate;

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently
     * used. The value of this field is "N/A" in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM started tracking
     * this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     */
    private String serviceName;

    /**
     * <p>
     * The AWS Region where this access key was most recently used. The value
     * for this field is "N/A" in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about AWS Regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the access key was most recently used. This
     * field is null in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the access key was most recently used. This
     *         field is null in the following situations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The user does not have an access key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An access key exists but has not been used since IAM began
     *         tracking this information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is no sign-in data associated with the user.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Date getLastUsedDate() {
        return lastUsedDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the access key was most recently used. This
     * field is null in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     *
     * @param lastUsedDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the access key was most recently used. This
     *            field is null in the following situations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The user does not have an access key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An access key exists but has not been used since IAM began
     *            tracking this information.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There is no sign-in data associated with the user.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setLastUsedDate(java.util.Date lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the access key was most recently used. This
     * field is null in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUsedDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the access key was most recently used. This
     *            field is null in the following situations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The user does not have an access key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An access key exists but has not been used since IAM began
     *            tracking this information.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There is no sign-in data associated with the user.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessKeyLastUsed withLastUsedDate(java.util.Date lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
        return this;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently
     * used. The value of this field is "N/A" in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM started tracking
     * this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the AWS service with which this access key was most
     *         recently used. The value of this field is "N/A" in the following
     *         situations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The user does not have an access key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An access key exists but has not been used since IAM started
     *         tracking this information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is no sign-in data associated with the user.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently
     * used. The value of this field is "N/A" in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM started tracking
     * this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     *
     * @param serviceName <p>
     *            The name of the AWS service with which this access key was
     *            most recently used. The value of this field is "N/A" in the
     *            following situations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The user does not have an access key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An access key exists but has not been used since IAM started
     *            tracking this information.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There is no sign-in data associated with the user.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently
     * used. The value of this field is "N/A" in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM started tracking
     * this information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the AWS service with which this access key was
     *            most recently used. The value of this field is "N/A" in the
     *            following situations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The user does not have an access key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An access key exists but has not been used since IAM started
     *            tracking this information.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There is no sign-in data associated with the user.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessKeyLastUsed withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The AWS Region where this access key was most recently used. The value
     * for this field is "N/A" in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about AWS Regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     * </p>
     *
     * @return <p>
     *         The AWS Region where this access key was most recently used. The
     *         value for this field is "N/A" in the following situations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The user does not have an access key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An access key exists but has not been used since IAM began
     *         tracking this information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         There is no sign-in data associated with the user.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about AWS Regions, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/rande.html"
     *         >Regions and Endpoints</a> in the Amazon Web Services General
     *         Reference.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region where this access key was most recently used. The value
     * for this field is "N/A" in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about AWS Regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     * </p>
     *
     * @param region <p>
     *            The AWS Region where this access key was most recently used.
     *            The value for this field is "N/A" in the following situations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The user does not have an access key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An access key exists but has not been used since IAM began
     *            tracking this information.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There is no sign-in data associated with the user.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about AWS Regions, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html"
     *            >Regions and Endpoints</a> in the Amazon Web Services General
     *            Reference.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region where this access key was most recently used. The value
     * for this field is "N/A" in the following situations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The user does not have an access key.
     * </p>
     * </li>
     * <li>
     * <p>
     * An access key exists but has not been used since IAM began tracking this
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * There is no sign-in data associated with the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about AWS Regions, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The AWS Region where this access key was most recently used.
     *            The value for this field is "N/A" in the following situations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The user does not have an access key.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            An access key exists but has not been used since IAM began
     *            tracking this information.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            There is no sign-in data associated with the user.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information about AWS Regions, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/rande.html"
     *            >Regions and Endpoints</a> in the Amazon Web Services General
     *            Reference.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessKeyLastUsed withRegion(String region) {
        this.region = region;
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
        if (getLastUsedDate() != null)
            sb.append("LastUsedDate: " + getLastUsedDate() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLastUsedDate() == null) ? 0 : getLastUsedDate().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessKeyLastUsed == false)
            return false;
        AccessKeyLastUsed other = (AccessKeyLastUsed) obj;

        if (other.getLastUsedDate() == null ^ this.getLastUsedDate() == null)
            return false;
        if (other.getLastUsedDate() != null
                && other.getLastUsedDate().equals(this.getLastUsedDate()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }
}
