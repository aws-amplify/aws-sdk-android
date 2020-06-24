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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

public class GetPullRequestOverrideStateResult implements Serializable {
    /**
     * <p>
     * A Boolean value that indicates whether a pull request has had its rules
     * set aside (TRUE) or whether all approval rules still apply (FALSE).
     * </p>
     */
    private Boolean overridden;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user or identity that overrode the
     * rules and their requirements for the pull request.
     * </p>
     */
    private String overrider;

    /**
     * <p>
     * A Boolean value that indicates whether a pull request has had its rules
     * set aside (TRUE) or whether all approval rules still apply (FALSE).
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether a pull request has had its
     *         rules set aside (TRUE) or whether all approval rules still apply
     *         (FALSE).
     *         </p>
     */
    public Boolean isOverridden() {
        return overridden;
    }

    /**
     * <p>
     * A Boolean value that indicates whether a pull request has had its rules
     * set aside (TRUE) or whether all approval rules still apply (FALSE).
     * </p>
     *
     * @return <p>
     *         A Boolean value that indicates whether a pull request has had its
     *         rules set aside (TRUE) or whether all approval rules still apply
     *         (FALSE).
     *         </p>
     */
    public Boolean getOverridden() {
        return overridden;
    }

    /**
     * <p>
     * A Boolean value that indicates whether a pull request has had its rules
     * set aside (TRUE) or whether all approval rules still apply (FALSE).
     * </p>
     *
     * @param overridden <p>
     *            A Boolean value that indicates whether a pull request has had
     *            its rules set aside (TRUE) or whether all approval rules still
     *            apply (FALSE).
     *            </p>
     */
    public void setOverridden(Boolean overridden) {
        this.overridden = overridden;
    }

    /**
     * <p>
     * A Boolean value that indicates whether a pull request has had its rules
     * set aside (TRUE) or whether all approval rules still apply (FALSE).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overridden <p>
     *            A Boolean value that indicates whether a pull request has had
     *            its rules set aside (TRUE) or whether all approval rules still
     *            apply (FALSE).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPullRequestOverrideStateResult withOverridden(Boolean overridden) {
        this.overridden = overridden;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user or identity that overrode the
     * rules and their requirements for the pull request.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user or identity that
     *         overrode the rules and their requirements for the pull request.
     *         </p>
     */
    public String getOverrider() {
        return overrider;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user or identity that overrode the
     * rules and their requirements for the pull request.
     * </p>
     *
     * @param overrider <p>
     *            The Amazon Resource Name (ARN) of the user or identity that
     *            overrode the rules and their requirements for the pull
     *            request.
     *            </p>
     */
    public void setOverrider(String overrider) {
        this.overrider = overrider;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user or identity that overrode the
     * rules and their requirements for the pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param overrider <p>
     *            The Amazon Resource Name (ARN) of the user or identity that
     *            overrode the rules and their requirements for the pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPullRequestOverrideStateResult withOverrider(String overrider) {
        this.overrider = overrider;
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
        if (getOverridden() != null)
            sb.append("overridden: " + getOverridden() + ",");
        if (getOverrider() != null)
            sb.append("overrider: " + getOverrider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverridden() == null) ? 0 : getOverridden().hashCode());
        hashCode = prime * hashCode + ((getOverrider() == null) ? 0 : getOverrider().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPullRequestOverrideStateResult == false)
            return false;
        GetPullRequestOverrideStateResult other = (GetPullRequestOverrideStateResult) obj;

        if (other.getOverridden() == null ^ this.getOverridden() == null)
            return false;
        if (other.getOverridden() != null
                && other.getOverridden().equals(this.getOverridden()) == false)
            return false;
        if (other.getOverrider() == null ^ this.getOverrider() == null)
            return false;
        if (other.getOverrider() != null
                && other.getOverrider().equals(this.getOverrider()) == false)
            return false;
        return true;
    }
}
