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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Provides UserID metadata along with the confidence in the match of this
 * UserID with the input face.
 * </p>
 */
public class UserMatch implements Serializable {
    /**
     * <p>
     * Describes the UserID metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float similarity;

    /**
     * <p>
     * Confidence in the match of this UserID with the input face.
     * </p>
     */
    private MatchedUser user;

    /**
     * <p>
     * Describes the UserID metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         Describes the UserID metadata.
     *         </p>
     */
    public Float getSimilarity() {
        return similarity;
    }

    /**
     * <p>
     * Describes the UserID metadata.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param similarity <p>
     *            Describes the UserID metadata.
     *            </p>
     */
    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

    /**
     * <p>
     * Describes the UserID metadata.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param similarity <p>
     *            Describes the UserID metadata.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserMatch withSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * <p>
     * Confidence in the match of this UserID with the input face.
     * </p>
     *
     * @return <p>
     *         Confidence in the match of this UserID with the input face.
     *         </p>
     */
    public MatchedUser getUser() {
        return user;
    }

    /**
     * <p>
     * Confidence in the match of this UserID with the input face.
     * </p>
     *
     * @param user <p>
     *            Confidence in the match of this UserID with the input face.
     *            </p>
     */
    public void setUser(MatchedUser user) {
        this.user = user;
    }

    /**
     * <p>
     * Confidence in the match of this UserID with the input face.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param user <p>
     *            Confidence in the match of this UserID with the input face.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserMatch withUser(MatchedUser user) {
        this.user = user;
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
        if (getSimilarity() != null)
            sb.append("Similarity: " + getSimilarity() + ",");
        if (getUser() != null)
            sb.append("User: " + getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimilarity() == null) ? 0 : getSimilarity().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserMatch == false)
            return false;
        UserMatch other = (UserMatch) obj;

        if (other.getSimilarity() == null ^ this.getSimilarity() == null)
            return false;
        if (other.getSimilarity() != null
                && other.getSimilarity().equals(this.getSimilarity()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }
}
