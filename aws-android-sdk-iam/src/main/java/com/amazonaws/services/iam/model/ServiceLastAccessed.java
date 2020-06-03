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
 * Contains details about the most recent attempt to access the service.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetServiceLastAccessedDetails</a> operation.
 * </p>
 */
public class ServiceLastAccessed implements Serializable {
    /**
     * <p>
     * The name of the service in which access was attempted.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated entity most recently
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
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
     * The ARN of the authenticated entity (user or role) that last attempted to
     * access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String lastAuthenticatedEntity;

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private String lastAuthenticatedRegion;

    /**
     * <p>
     * The total number of authenticated principals (root user, IAM users, or
     * IAM roles) that have attempted to access the service.
     * </p>
     * <p>
     * This field is null if no principals attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     */
    private Integer totalAuthenticatedEntities;

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a
     * tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did
     * not use the tracked actions within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was
     * generated at the service level and not the action level. For more
     * information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     */
    private java.util.List<TrackedActionLastAccessed> trackedActionsLastAccessed;

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
    public ServiceLastAccessed withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when an authenticated entity most recently
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
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
     *         to access the service. AWS does not report unauthenticated
     *         requests.
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
     * date-time format</a>, when an authenticated entity most recently
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
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
     *            format</a>, when an authenticated entity most recently
     *            attempted to access the service. AWS does not report
     *            unauthenticated requests.
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
     * date-time format</a>, when an authenticated entity most recently
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
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
     *            format</a>, when an authenticated entity most recently
     *            attempted to access the service. AWS does not report
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
    public ServiceLastAccessed withLastAuthenticated(java.util.Date lastAuthenticated) {
        this.lastAuthenticated = lastAuthenticated;
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
    public ServiceLastAccessed withServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
        return this;
    }

    /**
     * <p>
     * The ARN of the authenticated entity (user or role) that last attempted to
     * access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the authenticated entity (user or role) that last
     *         attempted to access the service. AWS does not report
     *         unauthenticated requests.
     *         </p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the
     *         service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public String getLastAuthenticatedEntity() {
        return lastAuthenticatedEntity;
    }

    /**
     * <p>
     * The ARN of the authenticated entity (user or role) that last attempted to
     * access the service. AWS does not report unauthenticated requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param lastAuthenticatedEntity <p>
     *            The ARN of the authenticated entity (user or role) that last
     *            attempted to access the service. AWS does not report
     *            unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no IAM entities attempted to access the
     *            service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setLastAuthenticatedEntity(String lastAuthenticatedEntity) {
        this.lastAuthenticatedEntity = lastAuthenticatedEntity;
    }

    /**
     * <p>
     * The ARN of the authenticated entity (user or role) that last attempted to
     * access the service. AWS does not report unauthenticated requests.
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param lastAuthenticatedEntity <p>
     *            The ARN of the authenticated entity (user or role) that last
     *            attempted to access the service. AWS does not report
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
    public ServiceLastAccessed withLastAuthenticatedEntity(String lastAuthenticatedEntity) {
        this.lastAuthenticatedEntity = lastAuthenticatedEntity;
        return this;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
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
     *         last attempted to access the service. AWS does not report
     *         unauthenticated requests.
     *         </p>
     *         <p>
     *         This field is null if no IAM entities attempted to access the
     *         service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public String getLastAuthenticatedRegion() {
        return lastAuthenticatedRegion;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
     * </p>
     * <p>
     * This field is null if no IAM entities attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @param lastAuthenticatedRegion <p>
     *            The Region from which the authenticated entity (user or role)
     *            last attempted to access the service. AWS does not report
     *            unauthenticated requests.
     *            </p>
     *            <p>
     *            This field is null if no IAM entities attempted to access the
     *            service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setLastAuthenticatedRegion(String lastAuthenticatedRegion) {
        this.lastAuthenticatedRegion = lastAuthenticatedRegion;
    }

    /**
     * <p>
     * The Region from which the authenticated entity (user or role) last
     * attempted to access the service. AWS does not report unauthenticated
     * requests.
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
     * @param lastAuthenticatedRegion <p>
     *            The Region from which the authenticated entity (user or role)
     *            last attempted to access the service. AWS does not report
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
    public ServiceLastAccessed withLastAuthenticatedRegion(String lastAuthenticatedRegion) {
        this.lastAuthenticatedRegion = lastAuthenticatedRegion;
        return this;
    }

    /**
     * <p>
     * The total number of authenticated principals (root user, IAM users, or
     * IAM roles) that have attempted to access the service.
     * </p>
     * <p>
     * This field is null if no principals attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @return <p>
     *         The total number of authenticated principals (root user, IAM
     *         users, or IAM roles) that have attempted to access the service.
     *         </p>
     *         <p>
     *         This field is null if no principals attempted to access the
     *         service within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>.
     *         </p>
     */
    public Integer getTotalAuthenticatedEntities() {
        return totalAuthenticatedEntities;
    }

    /**
     * <p>
     * The total number of authenticated principals (root user, IAM users, or
     * IAM roles) that have attempted to access the service.
     * </p>
     * <p>
     * This field is null if no principals attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     *
     * @param totalAuthenticatedEntities <p>
     *            The total number of authenticated principals (root user, IAM
     *            users, or IAM roles) that have attempted to access the
     *            service.
     *            </p>
     *            <p>
     *            This field is null if no principals attempted to access the
     *            service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     */
    public void setTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
        this.totalAuthenticatedEntities = totalAuthenticatedEntities;
    }

    /**
     * <p>
     * The total number of authenticated principals (root user, IAM users, or
     * IAM roles) that have attempted to access the service.
     * </p>
     * <p>
     * This field is null if no principals attempted to access the service
     * within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalAuthenticatedEntities <p>
     *            The total number of authenticated principals (root user, IAM
     *            users, or IAM roles) that have attempted to access the
     *            service.
     *            </p>
     *            <p>
     *            This field is null if no principals attempted to access the
     *            service within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceLastAccessed withTotalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
        this.totalAuthenticatedEntities = totalAuthenticatedEntities;
        return this;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a
     * tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did
     * not use the tracked actions within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was
     * generated at the service level and not the action level. For more
     * information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     *
     * @return <p>
     *         An object that contains details about the most recent attempt to
     *         access a tracked action within the service.
     *         </p>
     *         <p>
     *         This field is null if there no tracked actions or if the
     *         principal did not use the tracked actions within the <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *         >reporting period</a>. This field is also null if the report was
     *         generated at the service level and not the action level. For more
     *         information, see the <code>Granularity</code> field in
     *         <a>GenerateServiceLastAccessedDetails</a>.
     *         </p>
     */
    public java.util.List<TrackedActionLastAccessed> getTrackedActionsLastAccessed() {
        return trackedActionsLastAccessed;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a
     * tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did
     * not use the tracked actions within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was
     * generated at the service level and not the action level. For more
     * information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     *
     * @param trackedActionsLastAccessed <p>
     *            An object that contains details about the most recent attempt
     *            to access a tracked action within the service.
     *            </p>
     *            <p>
     *            This field is null if there no tracked actions or if the
     *            principal did not use the tracked actions within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>. This field is also null if the report
     *            was generated at the service level and not the action level.
     *            For more information, see the <code>Granularity</code> field
     *            in <a>GenerateServiceLastAccessedDetails</a>.
     *            </p>
     */
    public void setTrackedActionsLastAccessed(
            java.util.Collection<TrackedActionLastAccessed> trackedActionsLastAccessed) {
        if (trackedActionsLastAccessed == null) {
            this.trackedActionsLastAccessed = null;
            return;
        }

        this.trackedActionsLastAccessed = new java.util.ArrayList<TrackedActionLastAccessed>(
                trackedActionsLastAccessed);
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a
     * tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did
     * not use the tracked actions within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was
     * generated at the service level and not the action level. For more
     * information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trackedActionsLastAccessed <p>
     *            An object that contains details about the most recent attempt
     *            to access a tracked action within the service.
     *            </p>
     *            <p>
     *            This field is null if there no tracked actions or if the
     *            principal did not use the tracked actions within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>. This field is also null if the report
     *            was generated at the service level and not the action level.
     *            For more information, see the <code>Granularity</code> field
     *            in <a>GenerateServiceLastAccessedDetails</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceLastAccessed withTrackedActionsLastAccessed(
            TrackedActionLastAccessed... trackedActionsLastAccessed) {
        if (getTrackedActionsLastAccessed() == null) {
            this.trackedActionsLastAccessed = new java.util.ArrayList<TrackedActionLastAccessed>(
                    trackedActionsLastAccessed.length);
        }
        for (TrackedActionLastAccessed value : trackedActionsLastAccessed) {
            this.trackedActionsLastAccessed.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains details about the most recent attempt to access a
     * tracked action within the service.
     * </p>
     * <p>
     * This field is null if there no tracked actions or if the principal did
     * not use the tracked actions within the <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     * >reporting period</a>. This field is also null if the report was
     * generated at the service level and not the action level. For more
     * information, see the <code>Granularity</code> field in
     * <a>GenerateServiceLastAccessedDetails</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trackedActionsLastAccessed <p>
     *            An object that contains details about the most recent attempt
     *            to access a tracked action within the service.
     *            </p>
     *            <p>
     *            This field is null if there no tracked actions or if the
     *            principal did not use the tracked actions within the <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html#service-last-accessed-reporting-period"
     *            >reporting period</a>. This field is also null if the report
     *            was generated at the service level and not the action level.
     *            For more information, see the <code>Granularity</code> field
     *            in <a>GenerateServiceLastAccessedDetails</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceLastAccessed withTrackedActionsLastAccessed(
            java.util.Collection<TrackedActionLastAccessed> trackedActionsLastAccessed) {
        setTrackedActionsLastAccessed(trackedActionsLastAccessed);
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
        if (getLastAuthenticated() != null)
            sb.append("LastAuthenticated: " + getLastAuthenticated() + ",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getLastAuthenticatedEntity() != null)
            sb.append("LastAuthenticatedEntity: " + getLastAuthenticatedEntity() + ",");
        if (getLastAuthenticatedRegion() != null)
            sb.append("LastAuthenticatedRegion: " + getLastAuthenticatedRegion() + ",");
        if (getTotalAuthenticatedEntities() != null)
            sb.append("TotalAuthenticatedEntities: " + getTotalAuthenticatedEntities() + ",");
        if (getTrackedActionsLastAccessed() != null)
            sb.append("TrackedActionsLastAccessed: " + getTrackedActionsLastAccessed());
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
                + ((getLastAuthenticated() == null) ? 0 : getLastAuthenticated().hashCode());
        hashCode = prime * hashCode
                + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastAuthenticatedEntity() == null) ? 0 : getLastAuthenticatedEntity()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastAuthenticatedRegion() == null) ? 0 : getLastAuthenticatedRegion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalAuthenticatedEntities() == null) ? 0 : getTotalAuthenticatedEntities()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrackedActionsLastAccessed() == null) ? 0 : getTrackedActionsLastAccessed()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceLastAccessed == false)
            return false;
        ServiceLastAccessed other = (ServiceLastAccessed) obj;

        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getLastAuthenticated() == null ^ this.getLastAuthenticated() == null)
            return false;
        if (other.getLastAuthenticated() != null
                && other.getLastAuthenticated().equals(this.getLastAuthenticated()) == false)
            return false;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null
                && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getLastAuthenticatedEntity() == null ^ this.getLastAuthenticatedEntity() == null)
            return false;
        if (other.getLastAuthenticatedEntity() != null
                && other.getLastAuthenticatedEntity().equals(this.getLastAuthenticatedEntity()) == false)
            return false;
        if (other.getLastAuthenticatedRegion() == null ^ this.getLastAuthenticatedRegion() == null)
            return false;
        if (other.getLastAuthenticatedRegion() != null
                && other.getLastAuthenticatedRegion().equals(this.getLastAuthenticatedRegion()) == false)
            return false;
        if (other.getTotalAuthenticatedEntities() == null
                ^ this.getTotalAuthenticatedEntities() == null)
            return false;
        if (other.getTotalAuthenticatedEntities() != null
                && other.getTotalAuthenticatedEntities().equals(
                        this.getTotalAuthenticatedEntities()) == false)
            return false;
        if (other.getTrackedActionsLastAccessed() == null
                ^ this.getTrackedActionsLastAccessed() == null)
            return false;
        if (other.getTrackedActionsLastAccessed() != null
                && other.getTrackedActionsLastAccessed().equals(
                        this.getTrackedActionsLastAccessed()) == false)
            return false;
        return true;
    }
}
