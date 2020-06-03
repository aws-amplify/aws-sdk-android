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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Optional. Have MediaConvert automatically apply Amazon S3 access control for
 * the outputs in this output group. When you don't use this setting, S3
 * automatically applies the default access control list PRIVATE.
 */
public class S3DestinationAccessControl implements Serializable {
    /**
     * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_READ, AUTHENTICATED_READ,
     * BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL
     */
    private String cannedAcl;

    /**
     * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_READ, AUTHENTICATED_READ,
     * BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL
     *
     * @return Choose an Amazon S3 canned ACL for MediaConvert to apply to this
     *         output.
     * @see S3ObjectCannedAcl
     */
    public String getCannedAcl() {
        return cannedAcl;
    }

    /**
     * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_READ, AUTHENTICATED_READ,
     * BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL
     *
     * @param cannedAcl Choose an Amazon S3 canned ACL for MediaConvert to apply
     *            to this output.
     * @see S3ObjectCannedAcl
     */
    public void setCannedAcl(String cannedAcl) {
        this.cannedAcl = cannedAcl;
    }

    /**
     * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_READ, AUTHENTICATED_READ,
     * BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL
     *
     * @param cannedAcl Choose an Amazon S3 canned ACL for MediaConvert to apply
     *            to this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3ObjectCannedAcl
     */
    public S3DestinationAccessControl withCannedAcl(String cannedAcl) {
        this.cannedAcl = cannedAcl;
        return this;
    }

    /**
     * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_READ, AUTHENTICATED_READ,
     * BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL
     *
     * @param cannedAcl Choose an Amazon S3 canned ACL for MediaConvert to apply
     *            to this output.
     * @see S3ObjectCannedAcl
     */
    public void setCannedAcl(S3ObjectCannedAcl cannedAcl) {
        this.cannedAcl = cannedAcl.toString();
    }

    /**
     * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC_READ, AUTHENTICATED_READ,
     * BUCKET_OWNER_READ, BUCKET_OWNER_FULL_CONTROL
     *
     * @param cannedAcl Choose an Amazon S3 canned ACL for MediaConvert to apply
     *            to this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3ObjectCannedAcl
     */
    public S3DestinationAccessControl withCannedAcl(S3ObjectCannedAcl cannedAcl) {
        this.cannedAcl = cannedAcl.toString();
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
        if (getCannedAcl() != null)
            sb.append("CannedAcl: " + getCannedAcl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCannedAcl() == null) ? 0 : getCannedAcl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DestinationAccessControl == false)
            return false;
        S3DestinationAccessControl other = (S3DestinationAccessControl) obj;

        if (other.getCannedAcl() == null ^ this.getCannedAcl() == null)
            return false;
        if (other.getCannedAcl() != null
                && other.getCannedAcl().equals(this.getCannedAcl()) == false)
            return false;
        return true;
    }
}
