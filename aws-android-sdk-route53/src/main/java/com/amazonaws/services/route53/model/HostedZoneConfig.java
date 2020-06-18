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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains an optional comment about your hosted zone. If
 * you don't want to specify a comment, omit both the
 * <code>HostedZoneConfig</code> and <code>Comment</code> elements.
 * </p>
 */
public class HostedZoneConfig implements Serializable {
    /**
     * <p>
     * Any comments that you want to include about the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String comment;

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     */
    private Boolean privateZone;

    /**
     * <p>
     * Any comments that you want to include about the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         Any comments that you want to include about the hosted zone.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * Any comments that you want to include about the hosted zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param comment <p>
     *            Any comments that you want to include about the hosted zone.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Any comments that you want to include about the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param comment <p>
     *            Any comments that you want to include about the hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZoneConfig withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether this is a private hosted zone.
     *         </p>
     */
    public Boolean isPrivateZone() {
        return privateZone;
    }

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether this is a private hosted zone.
     *         </p>
     */
    public Boolean getPrivateZone() {
        return privateZone;
    }

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     *
     * @param privateZone <p>
     *            A value that indicates whether this is a private hosted zone.
     *            </p>
     */
    public void setPrivateZone(Boolean privateZone) {
        this.privateZone = privateZone;
    }

    /**
     * <p>
     * A value that indicates whether this is a private hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateZone <p>
     *            A value that indicates whether this is a private hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZoneConfig withPrivateZone(Boolean privateZone) {
        this.privateZone = privateZone;
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
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getPrivateZone() != null)
            sb.append("PrivateZone: " + getPrivateZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateZone() == null) ? 0 : getPrivateZone().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZoneConfig == false)
            return false;
        HostedZoneConfig other = (HostedZoneConfig) obj;

        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getPrivateZone() == null ^ this.getPrivateZone() == null)
            return false;
        if (other.getPrivateZone() != null
                && other.getPrivateZone().equals(this.getPrivateZone()) == false)
            return false;
        return true;
    }
}
