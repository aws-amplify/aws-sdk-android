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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * This structure contains information about when the canary was created and
 * modified.
 * </p>
 */
public class CanaryTimeline implements Serializable {
    /**
     * <p>
     * The date and time the canary was created.
     * </p>
     */
    private java.util.Date created;

    /**
     * <p>
     * The date and time the canary was most recently modified.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * The date and time that the canary's most recent run started.
     * </p>
     */
    private java.util.Date lastStarted;

    /**
     * <p>
     * The date and time that the canary's most recent run ended.
     * </p>
     */
    private java.util.Date lastStopped;

    /**
     * <p>
     * The date and time the canary was created.
     * </p>
     *
     * @return <p>
     *         The date and time the canary was created.
     *         </p>
     */
    public java.util.Date getCreated() {
        return created;
    }

    /**
     * <p>
     * The date and time the canary was created.
     * </p>
     *
     * @param created <p>
     *            The date and time the canary was created.
     *            </p>
     */
    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time the canary was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param created <p>
     *            The date and time the canary was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryTimeline withCreated(java.util.Date created) {
        this.created = created;
        return this;
    }

    /**
     * <p>
     * The date and time the canary was most recently modified.
     * </p>
     *
     * @return <p>
     *         The date and time the canary was most recently modified.
     *         </p>
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * <p>
     * The date and time the canary was most recently modified.
     * </p>
     *
     * @param lastModified <p>
     *            The date and time the canary was most recently modified.
     *            </p>
     */
    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time the canary was most recently modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModified <p>
     *            The date and time the canary was most recently modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryTimeline withLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run started.
     * </p>
     *
     * @return <p>
     *         The date and time that the canary's most recent run started.
     *         </p>
     */
    public java.util.Date getLastStarted() {
        return lastStarted;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run started.
     * </p>
     *
     * @param lastStarted <p>
     *            The date and time that the canary's most recent run started.
     *            </p>
     */
    public void setLastStarted(java.util.Date lastStarted) {
        this.lastStarted = lastStarted;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastStarted <p>
     *            The date and time that the canary's most recent run started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryTimeline withLastStarted(java.util.Date lastStarted) {
        this.lastStarted = lastStarted;
        return this;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run ended.
     * </p>
     *
     * @return <p>
     *         The date and time that the canary's most recent run ended.
     *         </p>
     */
    public java.util.Date getLastStopped() {
        return lastStopped;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run ended.
     * </p>
     *
     * @param lastStopped <p>
     *            The date and time that the canary's most recent run ended.
     *            </p>
     */
    public void setLastStopped(java.util.Date lastStopped) {
        this.lastStopped = lastStopped;
    }

    /**
     * <p>
     * The date and time that the canary's most recent run ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastStopped <p>
     *            The date and time that the canary's most recent run ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryTimeline withLastStopped(java.util.Date lastStopped) {
        this.lastStopped = lastStopped;
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
        if (getCreated() != null)
            sb.append("Created: " + getCreated() + ",");
        if (getLastModified() != null)
            sb.append("LastModified: " + getLastModified() + ",");
        if (getLastStarted() != null)
            sb.append("LastStarted: " + getLastStarted() + ",");
        if (getLastStopped() != null)
            sb.append("LastStopped: " + getLastStopped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode
                + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode
                + ((getLastStarted() == null) ? 0 : getLastStarted().hashCode());
        hashCode = prime * hashCode
                + ((getLastStopped() == null) ? 0 : getLastStopped().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryTimeline == false)
            return false;
        CanaryTimeline other = (CanaryTimeline) obj;

        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null
                && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getLastStarted() == null ^ this.getLastStarted() == null)
            return false;
        if (other.getLastStarted() != null
                && other.getLastStarted().equals(this.getLastStarted()) == false)
            return false;
        if (other.getLastStopped() == null ^ this.getLastStopped() == null)
            return false;
        if (other.getLastStopped() != null
                && other.getLastStopped().equals(this.getLastStopped()) == false)
            return false;
        return true;
    }
}
