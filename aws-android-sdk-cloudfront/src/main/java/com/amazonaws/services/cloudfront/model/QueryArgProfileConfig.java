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
 * Configuration for query argument-profile mapping for field-level encryption.
 * </p>
 */
public class QueryArgProfileConfig implements Serializable {
    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if
     * the profile specified by the field-level encryption query argument,
     * fle-profile, is unknown.
     * </p>
     */
    private Boolean forwardWhenQueryArgProfileIsUnknown;

    /**
     * <p>
     * Profiles specified for query argument-profile mapping for field-level
     * encryption.
     * </p>
     */
    private QueryArgProfiles queryArgProfiles;

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if
     * the profile specified by the field-level encryption query argument,
     * fle-profile, is unknown.
     * </p>
     *
     * @return <p>
     *         Flag to set if you want a request to be forwarded to the origin
     *         even if the profile specified by the field-level encryption query
     *         argument, fle-profile, is unknown.
     *         </p>
     */
    public Boolean isForwardWhenQueryArgProfileIsUnknown() {
        return forwardWhenQueryArgProfileIsUnknown;
    }

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if
     * the profile specified by the field-level encryption query argument,
     * fle-profile, is unknown.
     * </p>
     *
     * @return <p>
     *         Flag to set if you want a request to be forwarded to the origin
     *         even if the profile specified by the field-level encryption query
     *         argument, fle-profile, is unknown.
     *         </p>
     */
    public Boolean getForwardWhenQueryArgProfileIsUnknown() {
        return forwardWhenQueryArgProfileIsUnknown;
    }

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if
     * the profile specified by the field-level encryption query argument,
     * fle-profile, is unknown.
     * </p>
     *
     * @param forwardWhenQueryArgProfileIsUnknown <p>
     *            Flag to set if you want a request to be forwarded to the
     *            origin even if the profile specified by the field-level
     *            encryption query argument, fle-profile, is unknown.
     *            </p>
     */
    public void setForwardWhenQueryArgProfileIsUnknown(Boolean forwardWhenQueryArgProfileIsUnknown) {
        this.forwardWhenQueryArgProfileIsUnknown = forwardWhenQueryArgProfileIsUnknown;
    }

    /**
     * <p>
     * Flag to set if you want a request to be forwarded to the origin even if
     * the profile specified by the field-level encryption query argument,
     * fle-profile, is unknown.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forwardWhenQueryArgProfileIsUnknown <p>
     *            Flag to set if you want a request to be forwarded to the
     *            origin even if the profile specified by the field-level
     *            encryption query argument, fle-profile, is unknown.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryArgProfileConfig withForwardWhenQueryArgProfileIsUnknown(
            Boolean forwardWhenQueryArgProfileIsUnknown) {
        this.forwardWhenQueryArgProfileIsUnknown = forwardWhenQueryArgProfileIsUnknown;
        return this;
    }

    /**
     * <p>
     * Profiles specified for query argument-profile mapping for field-level
     * encryption.
     * </p>
     *
     * @return <p>
     *         Profiles specified for query argument-profile mapping for
     *         field-level encryption.
     *         </p>
     */
    public QueryArgProfiles getQueryArgProfiles() {
        return queryArgProfiles;
    }

    /**
     * <p>
     * Profiles specified for query argument-profile mapping for field-level
     * encryption.
     * </p>
     *
     * @param queryArgProfiles <p>
     *            Profiles specified for query argument-profile mapping for
     *            field-level encryption.
     *            </p>
     */
    public void setQueryArgProfiles(QueryArgProfiles queryArgProfiles) {
        this.queryArgProfiles = queryArgProfiles;
    }

    /**
     * <p>
     * Profiles specified for query argument-profile mapping for field-level
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryArgProfiles <p>
     *            Profiles specified for query argument-profile mapping for
     *            field-level encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public QueryArgProfileConfig withQueryArgProfiles(QueryArgProfiles queryArgProfiles) {
        this.queryArgProfiles = queryArgProfiles;
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
        if (getForwardWhenQueryArgProfileIsUnknown() != null)
            sb.append("ForwardWhenQueryArgProfileIsUnknown: "
                    + getForwardWhenQueryArgProfileIsUnknown() + ",");
        if (getQueryArgProfiles() != null)
            sb.append("QueryArgProfiles: " + getQueryArgProfiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getForwardWhenQueryArgProfileIsUnknown() == null) ? 0
                        : getForwardWhenQueryArgProfileIsUnknown().hashCode());
        hashCode = prime * hashCode
                + ((getQueryArgProfiles() == null) ? 0 : getQueryArgProfiles().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryArgProfileConfig == false)
            return false;
        QueryArgProfileConfig other = (QueryArgProfileConfig) obj;

        if (other.getForwardWhenQueryArgProfileIsUnknown() == null
                ^ this.getForwardWhenQueryArgProfileIsUnknown() == null)
            return false;
        if (other.getForwardWhenQueryArgProfileIsUnknown() != null
                && other.getForwardWhenQueryArgProfileIsUnknown().equals(
                        this.getForwardWhenQueryArgProfileIsUnknown()) == false)
            return false;
        if (other.getQueryArgProfiles() == null ^ this.getQueryArgProfiles() == null)
            return false;
        if (other.getQueryArgProfiles() != null
                && other.getQueryArgProfiles().equals(this.getQueryArgProfiles()) == false)
            return false;
        return true;
    }
}
