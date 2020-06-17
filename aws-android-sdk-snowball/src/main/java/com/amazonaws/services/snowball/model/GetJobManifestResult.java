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

public class GetJobManifestResult implements Serializable {
    /**
     * <p>
     * The Amazon S3 presigned URL for the manifest file associated with the
     * specified <code>JobId</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String manifestURI;

    /**
     * <p>
     * The Amazon S3 presigned URL for the manifest file associated with the
     * specified <code>JobId</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The Amazon S3 presigned URL for the manifest file associated with
     *         the specified <code>JobId</code> value.
     *         </p>
     */
    public String getManifestURI() {
        return manifestURI;
    }

    /**
     * <p>
     * The Amazon S3 presigned URL for the manifest file associated with the
     * specified <code>JobId</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param manifestURI <p>
     *            The Amazon S3 presigned URL for the manifest file associated
     *            with the specified <code>JobId</code> value.
     *            </p>
     */
    public void setManifestURI(String manifestURI) {
        this.manifestURI = manifestURI;
    }

    /**
     * <p>
     * The Amazon S3 presigned URL for the manifest file associated with the
     * specified <code>JobId</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param manifestURI <p>
     *            The Amazon S3 presigned URL for the manifest file associated
     *            with the specified <code>JobId</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobManifestResult withManifestURI(String manifestURI) {
        this.manifestURI = manifestURI;
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
        if (getManifestURI() != null)
            sb.append("ManifestURI: " + getManifestURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getManifestURI() == null) ? 0 : getManifestURI().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobManifestResult == false)
            return false;
        GetJobManifestResult other = (GetJobManifestResult) obj;

        if (other.getManifestURI() == null ^ this.getManifestURI() == null)
            return false;
        if (other.getManifestURI() != null
                && other.getManifestURI().equals(this.getManifestURI()) == false)
            return false;
        return true;
    }
}
