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
 * Contains information about the last time that an IAM role was used. This
 * includes the date and time and the Region in which the role was last used.
 * Activity is only reported for the trailing 400 days. This period can be
 * shorter if your Region began supporting these features within the last year.
 * The role might have been used more than 400 days ago. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
 * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * This data type is returned as a response element in the <a>GetRole</a> and
 * <a>GetAccountAuthorizationDetails</a> operations.
 * </p>
 */
public class RoleLastUsed implements Serializable {
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a> that the role was last used.
     * </p>
     * <p>
     * This field is null if the role has not been used within the IAM tracking
     * period. For more information about the tracking period, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.Date lastUsedDate;

    /**
     * <p>
     * The name of the AWS Region in which the role was last used.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a> that the role was last used.
     * </p>
     * <p>
     * This field is null if the role has not been used within the IAM tracking
     * period. For more information about the tracking period, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a> that the role was last used.
     *         </p>
     *         <p>
     *         This field is null if the role has not been used within the IAM
     *         tracking period. For more information about the tracking period,
     *         see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     *         >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public java.util.Date getLastUsedDate() {
        return lastUsedDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a> that the role was last used.
     * </p>
     * <p>
     * This field is null if the role has not been used within the IAM tracking
     * period. For more information about the tracking period, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param lastUsedDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a> that the role was last used.
     *            </p>
     *            <p>
     *            This field is null if the role has not been used within the
     *            IAM tracking period. For more information about the tracking
     *            period, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     *            >Regions Where Data Is Tracked</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     */
    public void setLastUsedDate(java.util.Date lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a> that the role was last used.
     * </p>
     * <p>
     * This field is null if the role has not been used within the IAM tracking
     * period. For more information about the tracking period, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     * >Regions Where Data Is Tracked</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUsedDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a> that the role was last used.
     *            </p>
     *            <p>
     *            This field is null if the role has not been used within the
     *            IAM tracking period. For more information about the tracking
     *            period, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#access-advisor_tracking-period"
     *            >Regions Where Data Is Tracked</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleLastUsed withLastUsedDate(java.util.Date lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
        return this;
    }

    /**
     * <p>
     * The name of the AWS Region in which the role was last used.
     * </p>
     *
     * @return <p>
     *         The name of the AWS Region in which the role was last used.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The name of the AWS Region in which the role was last used.
     * </p>
     *
     * @param region <p>
     *            The name of the AWS Region in which the role was last used.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the AWS Region in which the role was last used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The name of the AWS Region in which the role was last used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RoleLastUsed withRegion(String region) {
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
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoleLastUsed == false)
            return false;
        RoleLastUsed other = (RoleLastUsed) obj;

        if (other.getLastUsedDate() == null ^ this.getLastUsedDate() == null)
            return false;
        if (other.getLastUsedDate() != null
                && other.getLastUsedDate().equals(this.getLastUsedDate()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }
}
