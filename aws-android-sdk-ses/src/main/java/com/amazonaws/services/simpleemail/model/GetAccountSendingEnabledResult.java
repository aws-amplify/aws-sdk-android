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
 * Represents a request to return the email sending status for your Amazon SES
 * account in the current AWS Region.
 * </p>
 */
public class GetAccountSendingEnabledResult implements Serializable {
    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon
     * SES account in the current AWS Region.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon
     * SES account in the current AWS Region.
     * </p>
     *
     * @return <p>
     *         Describes whether email sending is enabled or disabled for your
     *         Amazon SES account in the current AWS Region.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon
     * SES account in the current AWS Region.
     * </p>
     *
     * @return <p>
     *         Describes whether email sending is enabled or disabled for your
     *         Amazon SES account in the current AWS Region.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon
     * SES account in the current AWS Region.
     * </p>
     *
     * @param enabled <p>
     *            Describes whether email sending is enabled or disabled for
     *            your Amazon SES account in the current AWS Region.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Describes whether email sending is enabled or disabled for your Amazon
     * SES account in the current AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Describes whether email sending is enabled or disabled for
     *            your Amazon SES account in the current AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountSendingEnabledResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountSendingEnabledResult == false)
            return false;
        GetAccountSendingEnabledResult other = (GetAccountSendingEnabledResult) obj;

        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
