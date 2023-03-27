/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the number of days before the <code>AppInstanceUser</code> is
 * automatically deleted.
 * </p>
 * <note>
 * <p>
 * A background process deletes expired <code>AppInstanceUsers</code> within 6
 * hours of expiration. Actual deletion times may vary.
 * </p>
 * <p>
 * Expired <code>AppInstanceUsers</code> that have not yet been deleted appear
 * as active, and you can update their expiration settings. The system honors
 * the new settings.
 * </p>
 * </note>
 */
public class PutAppInstanceUserExpirationSettingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String appInstanceUserArn;

    /**
     * <p>
     * Settings that control the interval after which an
     * <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     */
    private ExpirationSettings expirationSettings;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the <code>AppInstanceUser</code>.
     *         </p>
     */
    public String getAppInstanceUserArn() {
        return appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceUserArn <p>
     *            The ARN of the <code>AppInstanceUser</code>.
     *            </p>
     */
    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceUserArn <p>
     *            The ARN of the <code>AppInstanceUser</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAppInstanceUserExpirationSettingsRequest withAppInstanceUserArn(
            String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
        return this;
    }

    /**
     * <p>
     * Settings that control the interval after which an
     * <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     *
     * @return <p>
     *         Settings that control the interval after which an
     *         <code>AppInstanceUser</code> is automatically deleted.
     *         </p>
     */
    public ExpirationSettings getExpirationSettings() {
        return expirationSettings;
    }

    /**
     * <p>
     * Settings that control the interval after which an
     * <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     *
     * @param expirationSettings <p>
     *            Settings that control the interval after which an
     *            <code>AppInstanceUser</code> is automatically deleted.
     *            </p>
     */
    public void setExpirationSettings(ExpirationSettings expirationSettings) {
        this.expirationSettings = expirationSettings;
    }

    /**
     * <p>
     * Settings that control the interval after which an
     * <code>AppInstanceUser</code> is automatically deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expirationSettings <p>
     *            Settings that control the interval after which an
     *            <code>AppInstanceUser</code> is automatically deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAppInstanceUserExpirationSettingsRequest withExpirationSettings(
            ExpirationSettings expirationSettings) {
        this.expirationSettings = expirationSettings;
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
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: " + getAppInstanceUserArn() + ",");
        if (getExpirationSettings() != null)
            sb.append("ExpirationSettings: " + getExpirationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationSettings() == null) ? 0 : getExpirationSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppInstanceUserExpirationSettingsRequest == false)
            return false;
        PutAppInstanceUserExpirationSettingsRequest other = (PutAppInstanceUserExpirationSettingsRequest) obj;

        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null
                && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        if (other.getExpirationSettings() == null ^ this.getExpirationSettings() == null)
            return false;
        if (other.getExpirationSettings() != null
                && other.getExpirationSettings().equals(this.getExpirationSettings()) == false)
            return false;
        return true;
    }
}
