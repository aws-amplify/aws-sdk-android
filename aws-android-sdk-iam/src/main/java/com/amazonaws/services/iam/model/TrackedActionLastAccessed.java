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
 * Contains details about the most recent attempt to access an action within the
 * service.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetServiceLastAccessedDetails</a> operation.
 * </p>
 */
public class TrackedActionLastAccessed implements Serializable {
    /**
     * <p>
     * The name of the tracked action to which access was attempted. Tracked
     * actions are actions that report activity to IAM.
     * </p>
     */
    private String actionName;

    /**
     * <p>
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources.
     * </p>
     * <p>
     * For more information about ARNs, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String lastAccessedEntity;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated entity most recently
     * attempted to access the tracked service. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private java.util.Date lastAccessedTime;

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last
     * attempted to access the tracked action. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private String lastAccessedRegion;

    /**
     * <p>
     * The name of the tracked action to which access was attempted. Tracked
     * actions are actions that report activity to IAM.
     * </p>
     *
     * @return <p>
     *         The name of the tracked action to which access was attempted.
     *         Tracked actions are actions that report activity to IAM.
     *         </p>
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * <p>
     * The name of the tracked action to which access was attempted. Tracked
     * actions are actions that report activity to IAM.
     * </p>
     *
     * @param actionName <p>
     *            The name of the tracked action to which access was attempted.
     *            Tracked actions are actions that report activity to IAM.
     *            </p>
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the tracked action to which access was attempted. Tracked
     * actions are actions that report activity to IAM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionName <p>
     *            The name of the tracked action to which access was attempted.
     *            Tracked actions are actions that report activity to IAM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrackedActionLastAccessed withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources.
     * </p>
     * <p>
     * For more information about ARNs, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN). ARNs are unique identifiers for
     *         AWS resources.
     *         </p>
     *         <p>
     *         For more information about ARNs, go to <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getLastAccessedEntity() {
        return lastAccessedEntity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources.
     * </p>
     * <p>
     * For more information about ARNs, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param lastAccessedEntity <p>
     *            The Amazon Resource Name (ARN). ARNs are unique identifiers
     *            for AWS resources.
     *            </p>
     *            <p>
     *            For more information about ARNs, go to <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setLastAccessedEntity(String lastAccessedEntity) {
        this.lastAccessedEntity = lastAccessedEntity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN). ARNs are unique identifiers for AWS
     * resources.
     * </p>
     * <p>
     * For more information about ARNs, go to <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param lastAccessedEntity <p>
     *            The Amazon Resource Name (ARN). ARNs are unique identifiers
     *            for AWS resources.
     *            </p>
     *            <p>
     *            For more information about ARNs, go to <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrackedActionLastAccessed withLastAccessedEntity(String lastAccessedEntity) {
        this.lastAccessedEntity = lastAccessedEntity;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated entity most recently
     * attempted to access the tracked service. AWS does not report
     * unauthenticated requests.
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
     *         format</a>, when an authenticated entity most recently attempted
     *         to access the tracked service. AWS does not report
     *         unauthenticated requests.
     *         </p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the
     *         service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public java.util.Date getLastAccessedTime() {
        return lastAccessedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated entity most recently
     * attempted to access the tracked service. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @param lastAccessedTime <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when an authenticated entity most recently
     *            attempted to access the tracked service. AWS does not report
     *            unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no IAM entities attempted to access the
     *            service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setLastAccessedTime(java.util.Date lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated entity most recently
     * attempted to access the tracked service. AWS does not report
     * unauthenticated requests.
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
     * @param lastAccessedTime <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when an authenticated entity most recently
     *            attempted to access the tracked service. AWS does not report
     *            unauthenticated requests.
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
    public TrackedActionLastAccessed withLastAccessedTime(java.util.Date lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
        return this;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last
     * attempted to access the tracked action. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @return <p>
     *         The Region from which the authenticated entity (user or role)
     *         last attempted to access the tracked action. AWS does not report
     *         unauthenticated requests.
     *         </p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the
     *         service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public String getLastAccessedRegion() {
        return lastAccessedRegion;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last
     * attempted to access the tracked action. AWS does not report
     * unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @param lastAccessedRegion <p>
     *            The Region from which the authenticated entity (user or role)
     *            last attempted to access the tracked action. AWS does not
     *            report unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no IAM entities attempted to access the
     *            service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setLastAccessedRegion(String lastAccessedRegion) {
        this.lastAccessedRegion = lastAccessedRegion;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last
     * attempted to access the tracked action. AWS does not report
     * unauthenticated requests.
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
     * @param lastAccessedRegion <p>
     *            The Region from which the authenticated entity (user or role)
     *            last attempted to access the tracked action. AWS does not
     *            report unauthenticated requests.
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
    public TrackedActionLastAccessed withLastAccessedRegion(String lastAccessedRegion) {
        this.lastAccessedRegion = lastAccessedRegion;
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
        if (getActionName() != null)
            sb.append("ActionName: " + getActionName() + ",");
        if (getLastAccessedEntity() != null)
            sb.append("LastAccessedEntity: " + getLastAccessedEntity() + ",");
        if (getLastAccessedTime() != null)
            sb.append("LastAccessedTime: " + getLastAccessedTime() + ",");
        if (getLastAccessedRegion() != null)
            sb.append("LastAccessedRegion: " + getLastAccessedRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode
                + ((getLastAccessedEntity() == null) ? 0 : getLastAccessedEntity().hashCode());
        hashCode = prime * hashCode
                + ((getLastAccessedTime() == null) ? 0 : getLastAccessedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastAccessedRegion() == null) ? 0 : getLastAccessedRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrackedActionLastAccessed == false)
            return false;
        TrackedActionLastAccessed other = (TrackedActionLastAccessed) obj;

        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null
                && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getLastAccessedEntity() == null ^ this.getLastAccessedEntity() == null)
            return false;
        if (other.getLastAccessedEntity() != null
                && other.getLastAccessedEntity().equals(this.getLastAccessedEntity()) == false)
            return false;
        if (other.getLastAccessedTime() == null ^ this.getLastAccessedTime() == null)
            return false;
        if (other.getLastAccessedTime() != null
                && other.getLastAccessedTime().equals(this.getLastAccessedTime()) == false)
            return false;
        if (other.getLastAccessedRegion() == null ^ this.getLastAccessedRegion() == null)
            return false;
        if (other.getLastAccessedRegion() != null
                && other.getLastAccessedRegion().equals(this.getLastAccessedRegion()) == false)
            return false;
        return true;
    }
}
