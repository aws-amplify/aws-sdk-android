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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * Query argument-profile mapping for field-level encryption.
 * </p>
 */
public class QueryArgProfile implements Serializable {
    /**
     * <p>
     * Query argument for field-level encryption query argument-profile mapping.
     * </p>
     */
    private String queryArg;

    /**
     * <p>
     * ID of profile to use for field-level encryption query argument-profile
     * mapping
     * </p>
     */
    private String profileId;

    /**
     * <p>
     * Query argument for field-level encryption query argument-profile mapping.
     * </p>
     *
     * @return <p>
     *         Query argument for field-level encryption query argument-profile
     *         mapping.
     *         </p>
     */
    public String getQueryArg() {
        return queryArg;
    }

    /**
     * <p>
     * Query argument for field-level encryption query argument-profile mapping.
     * </p>
     *
     * @param queryArg <p>
     *            Query argument for field-level encryption query
     *            argument-profile mapping.
     *            </p>
     */
    public void setQueryArg(String queryArg) {
        this.queryArg = queryArg;
    }

    /**
     * <p>
     * Query argument for field-level encryption query argument-profile mapping.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryArg <p>
     *            Query argument for field-level encryption query
     *            argument-profile mapping.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryArgProfile withQueryArg(String queryArg) {
        this.queryArg = queryArg;
        return this;
    }

    /**
     * <p>
     * ID of profile to use for field-level encryption query argument-profile
     * mapping
     * </p>
     *
     * @return <p>
     *         ID of profile to use for field-level encryption query
     *         argument-profile mapping
     *         </p>
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * <p>
     * ID of profile to use for field-level encryption query argument-profile
     * mapping
     * </p>
     *
     * @param profileId <p>
     *            ID of profile to use for field-level encryption query
     *            argument-profile mapping
     *            </p>
     */
    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * ID of profile to use for field-level encryption query argument-profile
     * mapping
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param profileId <p>
     *            ID of profile to use for field-level encryption query
     *            argument-profile mapping
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryArgProfile withProfileId(String profileId) {
        this.profileId = profileId;
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
        if (getQueryArg() != null)
            sb.append("QueryArg: " + getQueryArg() + ",");
        if (getProfileId() != null)
            sb.append("ProfileId: " + getProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryArg() == null) ? 0 : getQueryArg().hashCode());
        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryArgProfile == false)
            return false;
        QueryArgProfile other = (QueryArgProfile) obj;

        if (other.getQueryArg() == null ^ this.getQueryArg() == null)
            return false;
        if (other.getQueryArg() != null && other.getQueryArg().equals(this.getQueryArg()) == false)
            return false;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null
                && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        return true;
    }
}
