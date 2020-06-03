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
 * An object that contains details about when a principal in the reported AWS
 * Organizations entity last attempted to access an AWS service. A principal can
 * be an IAM user, an IAM role, or the AWS account root user within the reported
 * Organizations entity.
 * </p>
 * <p>
 * This data type is a response element in the
 * <a>GetOrganizationsAccessReport</a> operation.
 * </p>
 */
public class AccessDetail implements Serializable {
    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w-]*<br/>
     */
    private String serviceNamespace;

    /**
     * <p>
     * The Region where the last service access attempt occurred.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The path of the Organizations entity (root, organizational unit, or
     * account) from which an authenticated principal last attempted to access
     * the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no principals (IAM users, IAM roles, or root users)
     * in the reported Organizations entity attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 427<br/>
     * <b>Pattern: </b>^o-[0-9a-z]{10,32}\/r-[0-9a-z]{4,32}[0-9a-z-\/]*<br/>
     */
    private String entityPath;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated principal most recently
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private java.util.Date lastAuthenticatedTime;

    /**
     * <p>
     * The number of accounts with authenticated principals (root users, IAM
     * users, and IAM roles) that attempted to access the service in the
     * reporting period.
     * </p>
     */
    private Integer totalAuthenticatedEntities;

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     *
     * @return <p>
     *         The name of the service in which access was attempted.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     *
     * @param serviceName <p>
     *            The name of the service in which access was attempted.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the service in which access was attempted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessDetail withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w-]*<br/>
     *
     * @return <p>
     *         The namespace of the service in which access was attempted.
     *         </p>
     *         <p>
     *         To learn the service namespace of a service, go to <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *         >Actions, Resources, and Condition Keys for AWS Services</a> in
     *         the <i>IAM User Guide</i>. Choose the name of the service to view
     *         details for that service. In the first paragraph, find the
     *         service prefix. For example, <code>(service prefix: a4b)</code>.
     *         For more information about service namespaces, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     *         </p>
     */
    public String getServiceNamespace() {
        return serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w-]*<br/>
     *
     * @param serviceNamespace <p>
     *            The namespace of the service in which access was attempted.
     *            </p>
     *            <p>
     *            To learn the service namespace of a service, go to <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *            >Actions, Resources, and Condition Keys for AWS Services</a>
     *            in the <i>IAM User Guide</i>. Choose the name of the service
     *            to view details for that service. In the first paragraph, find
     *            the service prefix. For example,
     *            <code>(service prefix: a4b)</code>. For more information about
     *            service namespaces, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a> in the <i>AWS General
     *            Reference</i>.
     *            </p>
     */
    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace of the service in which access was attempted.
     * </p>
     * <p>
     * To learn the service namespace of a service, go to <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     * >Actions, Resources, and Condition Keys for AWS Services</a> in the
     * <i>IAM User Guide</i>. Choose the name of the service to view details for
     * that service. In the first paragraph, find the service prefix. For
     * example, <code>(service prefix: a4b)</code>. For more information about
     * service namespaces, see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w-]*<br/>
     *
     * @param serviceNamespace <p>
     *            The namespace of the service in which access was attempted.
     *            </p>
     *            <p>
     *            To learn the service namespace of a service, go to <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_actions-resources-contextkeys.html"
     *            >Actions, Resources, and Condition Keys for AWS Services</a>
     *            in the <i>IAM User Guide</i>. Choose the name of the service
     *            to view details for that service. In the first paragraph, find
     *            the service prefix. For example,
     *            <code>(service prefix: a4b)</code>. For more information about
     *            service namespaces, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *            >AWS Service Namespaces</a> in the <i>AWS General
     *            Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessDetail withServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * <p>
     * The Region where the last service access attempt occurred.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @return <p>
     *         The Region where the last service access attempt occurred.
     *         </p>
     *         <p>
     *         This field is null if no principals in the reported Organizations
     *         entity attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The Region where the last service access attempt occurred.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @param region <p>
     *            The Region where the last service access attempt occurred.
     *            </p>
     *            <p>
     *            This field is null if no principals in the reported
     *            Organizations entity attempted to access the service within
     *            the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region where the last service access attempt occurred.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The Region where the last service access attempt occurred.
     *            </p>
     *            <p>
     *            This field is null if no principals in the reported
     *            Organizations entity attempted to access the service within
     *            the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The path of the Organizations entity (root, organizational unit, or
     * account) from which an authenticated principal last attempted to access
     * the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no principals (IAM users, IAM roles, or root users)
     * in the reported Organizations entity attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 427<br/>
     * <b>Pattern: </b>^o-[0-9a-z]{10,32}\/r-[0-9a-z]{4,32}[0-9a-z-\/]*<br/>
     *
     * @return <p>
     *         The path of the Organizations entity (root, organizational unit,
     *         or account) from which an authenticated principal last attempted
     *         to access the service. AWS does not report unauthenticated
     *         requests.
     *         </p>
     *         <p>
     *         This field is null if no principals (IAM users, IAM roles, or
     *         root users) in the reported Organizations entity attempted to
     *         access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public String getEntityPath() {
        return entityPath;
    }

    /**
     * <p>
     * The path of the Organizations entity (root, organizational unit, or
     * account) from which an authenticated principal last attempted to access
     * the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no principals (IAM users, IAM roles, or root users)
     * in the reported Organizations entity attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 427<br/>
     * <b>Pattern: </b>^o-[0-9a-z]{10,32}\/r-[0-9a-z]{4,32}[0-9a-z-\/]*<br/>
     *
     * @param entityPath <p>
     *            The path of the Organizations entity (root, organizational
     *            unit, or account) from which an authenticated principal last
     *            attempted to access the service. AWS does not report
     *            unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no principals (IAM users, IAM roles, or
     *            root users) in the reported Organizations entity attempted to
     *            access the service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setEntityPath(String entityPath) {
        this.entityPath = entityPath;
    }

    /**
     * <p>
     * The path of the Organizations entity (root, organizational unit, or
     * account) from which an authenticated principal last attempted to access
     * the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no principals (IAM users, IAM roles, or root users)
     * in the reported Organizations entity attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 427<br/>
     * <b>Pattern: </b>^o-[0-9a-z]{10,32}\/r-[0-9a-z]{4,32}[0-9a-z-\/]*<br/>
     *
     * @param entityPath <p>
     *            The path of the Organizations entity (root, organizational
     *            unit, or account) from which an authenticated principal last
     *            attempted to access the service. AWS does not report
     *            unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no principals (IAM users, IAM roles, or
     *            root users) in the reported Organizations entity attempted to
     *            access the service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessDetail withEntityPath(String entityPath) {
        this.entityPath = entityPath;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated principal most recently
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when an authenticated principal most recently
     *         attempted to access the service. AWS does not report
     *         unauthenticated requests.
     *         </p>
     *         <p>
     *         This field is null if no principals in the reported Organizations
     *         entity attempted to access the service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public java.util.Date getLastAuthenticatedTime() {
        return lastAuthenticatedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated principal most recently
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @param lastAuthenticatedTime <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when an authenticated principal most recently
     *            attempted to access the service. AWS does not report
     *            unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no principals in the reported
     *            Organizations entity attempted to access the service within
     *            the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setLastAuthenticatedTime(java.util.Date lastAuthenticatedTime) {
        this.lastAuthenticatedTime = lastAuthenticatedTime;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated principal most recently
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no principals in the reported Organizations entity
     * attempted to access the service within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastAuthenticatedTime <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when an authenticated principal most recently
     *            attempted to access the service. AWS does not report
     *            unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no principals in the reported
     *            Organizations entity attempted to access the service within
     *            the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessDetail withLastAuthenticatedTime(java.util.Date lastAuthenticatedTime) {
        this.lastAuthenticatedTime = lastAuthenticatedTime;
        return this;
    }

    /**
     * <p>
     * The number of accounts with authenticated principals (root users, IAM
     * users, and IAM roles) that attempted to access the service in the
     * reporting period.
     * </p>
     *
     * @return <p>
     *         The number of accounts with authenticated principals (root users,
     *         IAM users, and IAM roles) that attempted to access the service in
     *         the reporting period.
     *         </p>
     */
    public Integer getTotalAuthenticatedEntities() {
        return totalAuthenticatedEntities;
    }

    /**
     * <p>
     * The number of accounts with authenticated principals (root users, IAM
     * users, and IAM roles) that attempted to access the service in the
     * reporting period.
     * </p>
     *
     * @param totalAuthenticatedEntities <p>
     *            The number of accounts with authenticated principals (root
     *            users, IAM users, and IAM roles) that attempted to access the
     *            service in the reporting period.
     *            </p>
     */
    public void setTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
        this.totalAuthenticatedEntities = totalAuthenticatedEntities;
    }

    /**
     * <p>
     * The number of accounts with authenticated principals (root users, IAM
     * users, and IAM roles) that attempted to access the service in the
     * reporting period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalAuthenticatedEntities <p>
     *            The number of accounts with authenticated principals (root
     *            users, IAM users, and IAM roles) that attempted to access the
     *            service in the reporting period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccessDetail withTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
        this.totalAuthenticatedEntities = totalAuthenticatedEntities;
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
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getEntityPath() != null)
            sb.append("EntityPath: " + getEntityPath() + ",");
        if (getLastAuthenticatedTime() != null)
            sb.append("LastAuthenticatedTime: " + getLastAuthenticatedTime() + ",");
        if (getTotalAuthenticatedEntities() != null)
            sb.append("TotalAuthenticatedEntities: " + getTotalAuthenticatedEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode
                + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getEntityPath() == null) ? 0 : getEntityPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastAuthenticatedTime() == null) ? 0 : getLastAuthenticatedTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalAuthenticatedEntities() == null) ? 0 : getTotalAuthenticatedEntities()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessDetail == false)
            return false;
        AccessDetail other = (AccessDetail) obj;

        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null
                && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getEntityPath() == null ^ this.getEntityPath() == null)
            return false;
        if (other.getEntityPath() != null
                && other.getEntityPath().equals(this.getEntityPath()) == false)
            return false;
        if (other.getLastAuthenticatedTime() == null ^ this.getLastAuthenticatedTime() == null)
            return false;
        if (other.getLastAuthenticatedTime() != null
                && other.getLastAuthenticatedTime().equals(this.getLastAuthenticatedTime()) == false)
            return false;
        if (other.getTotalAuthenticatedEntities() == null
                ^ this.getTotalAuthenticatedEntities() == null)
            return false;
        if (other.getTotalAuthenticatedEntities() != null
                && other.getTotalAuthenticatedEntities().equals(
                        this.getTotalAuthenticatedEntities()) == false)
            return false;
        return true;
    }
}
