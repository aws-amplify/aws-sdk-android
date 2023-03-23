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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

/**
 * <p>
 * Determines the interval after which an <code>AppInstanceUser</code> is
 * automatically deleted.
 * </p>
 */
public class ExpirationSettings implements Serializable {
    /**
     * <p>
     * The period in days after which an <code>AppInstanceUser</code> will be
     * automatically deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5475<br/>
     */
    private Integer expirationDays;

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will
     * expire.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_TIMESTAMP
     */
    private String expirationCriterion;

    /**
     * <p>
     * The period in days after which an <code>AppInstanceUser</code> will be
     * automatically deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5475<br/>
     *
     * @return <p>
     *         The period in days after which an <code>AppInstanceUser</code>
     *         will be automatically deleted.
     *         </p>
     */
    public Integer getExpirationDays() {
        return expirationDays;
    }

    /**
     * <p>
     * The period in days after which an <code>AppInstanceUser</code> will be
     * automatically deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5475<br/>
     *
     * @param expirationDays <p>
     *            The period in days after which an <code>AppInstanceUser</code>
     *            will be automatically deleted.
     *            </p>
     */
    public void setExpirationDays(Integer expirationDays) {
        this.expirationDays = expirationDays;
    }

    /**
     * <p>
     * The period in days after which an <code>AppInstanceUser</code> will be
     * automatically deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 5475<br/>
     *
     * @param expirationDays <p>
     *            The period in days after which an <code>AppInstanceUser</code>
     *            will be automatically deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExpirationSettings withExpirationDays(Integer expirationDays) {
        this.expirationDays = expirationDays;
        return this;
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will
     * expire.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_TIMESTAMP
     *
     * @return <p>
     *         Specifies the conditions under which an
     *         <code>AppInstanceUser</code> will expire.
     *         </p>
     * @see ExpirationCriterion
     */
    public String getExpirationCriterion() {
        return expirationCriterion;
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will
     * expire.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_TIMESTAMP
     *
     * @param expirationCriterion <p>
     *            Specifies the conditions under which an
     *            <code>AppInstanceUser</code> will expire.
     *            </p>
     * @see ExpirationCriterion
     */
    public void setExpirationCriterion(String expirationCriterion) {
        this.expirationCriterion = expirationCriterion;
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will
     * expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_TIMESTAMP
     *
     * @param expirationCriterion <p>
     *            Specifies the conditions under which an
     *            <code>AppInstanceUser</code> will expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationCriterion
     */
    public ExpirationSettings withExpirationCriterion(String expirationCriterion) {
        this.expirationCriterion = expirationCriterion;
        return this;
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will
     * expire.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_TIMESTAMP
     *
     * @param expirationCriterion <p>
     *            Specifies the conditions under which an
     *            <code>AppInstanceUser</code> will expire.
     *            </p>
     * @see ExpirationCriterion
     */
    public void setExpirationCriterion(ExpirationCriterion expirationCriterion) {
        this.expirationCriterion = expirationCriterion.toString();
    }

    /**
     * <p>
     * Specifies the conditions under which an <code>AppInstanceUser</code> will
     * expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED_TIMESTAMP
     *
     * @param expirationCriterion <p>
     *            Specifies the conditions under which an
     *            <code>AppInstanceUser</code> will expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationCriterion
     */
    public ExpirationSettings withExpirationCriterion(ExpirationCriterion expirationCriterion) {
        this.expirationCriterion = expirationCriterion.toString();
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
        if (getExpirationDays() != null)
            sb.append("ExpirationDays: " + getExpirationDays() + ",");
        if (getExpirationCriterion() != null)
            sb.append("ExpirationCriterion: " + getExpirationCriterion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExpirationDays() == null) ? 0 : getExpirationDays().hashCode());
        hashCode = prime * hashCode
                + ((getExpirationCriterion() == null) ? 0 : getExpirationCriterion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpirationSettings == false)
            return false;
        ExpirationSettings other = (ExpirationSettings) obj;

        if (other.getExpirationDays() == null ^ this.getExpirationDays() == null)
            return false;
        if (other.getExpirationDays() != null
                && other.getExpirationDays().equals(this.getExpirationDays()) == false)
            return false;
        if (other.getExpirationCriterion() == null ^ this.getExpirationCriterion() == null)
            return false;
        if (other.getExpirationCriterion() != null
                && other.getExpirationCriterion().equals(this.getExpirationCriterion()) == false)
            return false;
        return true;
    }
}
