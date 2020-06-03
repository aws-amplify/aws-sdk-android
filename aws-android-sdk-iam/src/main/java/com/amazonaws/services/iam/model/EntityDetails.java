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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * An object that contains details about when the IAM entities (users or roles)
 * were last used in an attempt to access the specified AWS service.
 * </p>
 * <p>
 * This data type is a response element in the
 * <a>GetServiceLastAccessedDetailsWithEntities</a> operation.
 * </p>
 */
public class EntityDetails implements Serializable {
    /**
     * <p>
     * The <code>EntityInfo</code> object that contains details about the entity
     * (user or role).
     * </p>
     */
    private EntityInfo entityInfo;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the authenticated entity last attempted to
     * access AWS. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private java.util.Date lastAuthenticated;

    /**
     * <p>
     * The <code>EntityInfo</code> object that contains details about the entity
     * (user or role).
     * </p>
     *
     * @return <p>
     *         The <code>EntityInfo</code> object that contains details about
     *         the entity (user or role).
     *         </p>
     */
    public EntityInfo getEntityInfo() {
        return entityInfo;
    }

    /**
     * <p>
     * The <code>EntityInfo</code> object that contains details about the entity
     * (user or role).
     * </p>
     *
     * @param entityInfo <p>
     *            The <code>EntityInfo</code> object that contains details about
     *            the entity (user or role).
     *            </p>
     */
    public void setEntityInfo(EntityInfo entityInfo) {
        this.entityInfo = entityInfo;
    }

    /**
     * <p>
     * The <code>EntityInfo</code> object that contains details about the entity
     * (user or role).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityInfo <p>
     *            The <code>EntityInfo</code> object that contains details about
     *            the entity (user or role).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityDetails withEntityInfo(EntityInfo entityInfo) {
        this.entityInfo = entityInfo;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the authenticated entity last attempted to
     * access AWS. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the authenticated entity last attempted to
     *         access AWS. AWS does not report unauthenticated requests.
     *         </p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the
     *         service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public java.util.Date getLastAuthenticated() {
        return lastAuthenticated;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the authenticated entity last attempted to
     * access AWS. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @param lastAuthenticated <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the authenticated entity last attempted to
     *            access AWS. AWS does not report unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no IAM entities attempted to access the
     *            service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setLastAuthenticated(java.util.Date lastAuthenticated) {
        this.lastAuthenticated = lastAuthenticated;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the authenticated entity last attempted to
     * access AWS. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAuthenticated <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the authenticated entity last attempted to
     *            access AWS. AWS does not report unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no IAM entities attempted to access the
     *            service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityDetails withLastAuthenticated(java.util.Date lastAuthenticated) {
        this.lastAuthenticated = lastAuthenticated;
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
        if (getEntityInfo() != null)
            sb.append("EntityInfo: " + getEntityInfo() + ",");
        if (getLastAuthenticated() != null)
            sb.append("LastAuthenticated: " + getLastAuthenticated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityInfo() == null) ? 0 : getEntityInfo().hashCode());
        hashCode = prime * hashCode
                + ((getLastAuthenticated() == null) ? 0 : getLastAuthenticated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityDetails == false)
            return false;
        EntityDetails other = (EntityDetails) obj;

        if (other.getEntityInfo() == null ^ this.getEntityInfo() == null)
            return false;
        if (other.getEntityInfo() != null
                && other.getEntityInfo().equals(this.getEntityInfo()) == false)
            return false;
        if (other.getLastAuthenticated() == null ^ this.getLastAuthenticated() == null)
            return false;
        if (other.getLastAuthenticated() != null
                && other.getLastAuthenticated().equals(this.getLastAuthenticated()) == false)
            return false;
        return true;
    }
}
