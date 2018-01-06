/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the name and additional information about a celebrity based on his or
 * her Rekognition ID. The additional information is returned as an array of
 * URLs. If there is no additional information about the celebrity, this list is
 * empty. For more information, see <a>get-celebrity-info-procedure</a>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:GetCelebrityInfo</code> action.
 * </p>
 */
public class GetCelebrityInfoRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID for the celebrity. You get the celebrity ID from a call to the
     * operation, which recognizes celebrities in an image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     */
    private String id;

    /**
     * <p>
     * The ID for the celebrity. You get the celebrity ID from a call to the
     * operation, which recognizes celebrities in an image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @return <p>
     *         The ID for the celebrity. You get the celebrity ID from a call to
     *         the operation, which recognizes celebrities in an image.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID for the celebrity. You get the celebrity ID from a call to the
     * operation, which recognizes celebrities in an image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @param id <p>
     *            The ID for the celebrity. You get the celebrity ID from a call
     *            to the operation, which recognizes celebrities in an image.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the celebrity. You get the celebrity ID from a call to the
     * operation, which recognizes celebrities in an image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9A-Za-z]*<br/>
     *
     * @param id <p>
     *            The ID for the celebrity. You get the celebrity ID from a call
     *            to the operation, which recognizes celebrities in an image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCelebrityInfoRequest withId(String id) {
        this.id = id;
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
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCelebrityInfoRequest == false)
            return false;
        GetCelebrityInfoRequest other = (GetCelebrityInfoRequest) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
