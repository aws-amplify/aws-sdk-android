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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies object key name filtering rules. For information about key name
 * filtering, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html"
 * >Configuring Event Notifications</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 */
public class NotificationConfigurationFilter implements Serializable {
    /**
     * <p>
     * A container for object key name prefix and suffix filtering rules.
     * </p>
     */
    private S3KeyFilter key;

    /**
     * <p>
     * A container for object key name prefix and suffix filtering rules.
     * </p>
     *
     * @return <p>
     *         A container for object key name prefix and suffix filtering
     *         rules.
     *         </p>
     */
    public S3KeyFilter getKey() {
        return key;
    }

    /**
     * <p>
     * A container for object key name prefix and suffix filtering rules.
     * </p>
     *
     * @param key <p>
     *            A container for object key name prefix and suffix filtering
     *            rules.
     *            </p>
     */
    public void setKey(S3KeyFilter key) {
        this.key = key;
    }

    /**
     * <p>
     * A container for object key name prefix and suffix filtering rules.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            A container for object key name prefix and suffix filtering
     *            rules.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NotificationConfigurationFilter withKey(S3KeyFilter key) {
        this.key = key;
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
        if (getKey() != null)
            sb.append("Key: " + getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationConfigurationFilter == false)
            return false;
        NotificationConfigurationFilter other = (NotificationConfigurationFilter) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }
}
