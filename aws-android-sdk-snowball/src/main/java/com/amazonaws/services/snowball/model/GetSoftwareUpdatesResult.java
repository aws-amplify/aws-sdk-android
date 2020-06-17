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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

public class GetSoftwareUpdatesResult implements Serializable {
    /**
     * <p>
     * The Amazon S3 presigned URL for the update file associated with the
     * specified <code>JobId</code> value. The software update will be available
     * for 2 days after this request is made. To access an update after the 2
     * days have passed, you'll have to make another call to
     * <code>GetSoftwareUpdates</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String updatesURI;

    /**
     * <p>
     * The Amazon S3 presigned URL for the update file associated with the
     * specified <code>JobId</code> value. The software update will be available
     * for 2 days after this request is made. To access an update after the 2
     * days have passed, you'll have to make another call to
     * <code>GetSoftwareUpdates</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The Amazon S3 presigned URL for the update file associated with
     *         the specified <code>JobId</code> value. The software update will
     *         be available for 2 days after this request is made. To access an
     *         update after the 2 days have passed, you'll have to make another
     *         call to <code>GetSoftwareUpdates</code>.
     *         </p>
     */
    public String getUpdatesURI() {
        return updatesURI;
    }

    /**
     * <p>
     * The Amazon S3 presigned URL for the update file associated with the
     * specified <code>JobId</code> value. The software update will be available
     * for 2 days after this request is made. To access an update after the 2
     * days have passed, you'll have to make another call to
     * <code>GetSoftwareUpdates</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param updatesURI <p>
     *            The Amazon S3 presigned URL for the update file associated
     *            with the specified <code>JobId</code> value. The software
     *            update will be available for 2 days after this request is
     *            made. To access an update after the 2 days have passed, you'll
     *            have to make another call to <code>GetSoftwareUpdates</code>.
     *            </p>
     */
    public void setUpdatesURI(String updatesURI) {
        this.updatesURI = updatesURI;
    }

    /**
     * <p>
     * The Amazon S3 presigned URL for the update file associated with the
     * specified <code>JobId</code> value. The software update will be available
     * for 2 days after this request is made. To access an update after the 2
     * days have passed, you'll have to make another call to
     * <code>GetSoftwareUpdates</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param updatesURI <p>
     *            The Amazon S3 presigned URL for the update file associated
     *            with the specified <code>JobId</code> value. The software
     *            update will be available for 2 days after this request is
     *            made. To access an update after the 2 days have passed, you'll
     *            have to make another call to <code>GetSoftwareUpdates</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSoftwareUpdatesResult withUpdatesURI(String updatesURI) {
        this.updatesURI = updatesURI;
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
        if (getUpdatesURI() != null)
            sb.append("UpdatesURI: " + getUpdatesURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdatesURI() == null) ? 0 : getUpdatesURI().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSoftwareUpdatesResult == false)
            return false;
        GetSoftwareUpdatesResult other = (GetSoftwareUpdatesResult) obj;

        if (other.getUpdatesURI() == null ^ this.getUpdatesURI() == null)
            return false;
        if (other.getUpdatesURI() != null
                && other.getUpdatesURI().equals(this.getUpdatesURI()) == false)
            return false;
        return true;
    }
}
