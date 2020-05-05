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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * A JSON-formatted object that contains the metadata for a support case. It is
 * contained the response from a <a>DescribeCases</a> request.
 * <b>CaseDetails</b> contains the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>caseId.</b> The AWS Support case ID requested or returned in the call. The
 * case ID is an alphanumeric string formatted as shown in this example:
 * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>categoryCode.</b> The category of problem for the AWS Support case.
 * Corresponds to the CategoryCode values returned by a call to
 * <a>DescribeServices</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>displayId.</b> The identifier for the case on pages in the AWS Support
 * Center.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>language.</b> The ISO 639-1 code for the language in which AWS provides
 * support. AWS Support currently supports English ("en") and Japanese ("ja").
 * Language parameters must be passed explicitly for operations that take them.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>recentCommunications.</b> One or more <a>Communication</a> objects. Fields
 * of these objects are <code>attachments</code>, <code>body</code>,
 * <code>caseId</code>, <code>submittedBy</code>, and <code>timeCreated</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>nextToken.</b> A resumption point for pagination.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>serviceCode.</b> The identifier for the AWS service that corresponds to
 * the service code defined in the call to <a>DescribeServices</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>severityCode.</b> The severity code assigned to the case. Contains one of
 * the values returned by the call to <a>DescribeSeverityLevels</a>. The
 * possible values are: <code>low</code>, <code>normal</code>, <code>high</code>, <code>urgent</code>, and <code>critical</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>status.</b> The status of the case in the AWS Support Center. Valid
 * values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>opened</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>pending-customer-action</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>reopened</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>resolved</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>unassigned</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>work-in-progress</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>subject.</b> The subject line of the case.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>submittedBy.</b> The email address of the account that submitted the case.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>timeCreated.</b> The time the case was created, in ISO-8601 format.
 * </p>
 * </li>
 * </ul>
 */
public class CaseDetails implements Serializable {
    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;

    /**
     * <p>
     * The ID displayed for the case in the AWS Support Center. This is a
     * numeric string.
     * </p>
     */
    private String displayId;

    /**
     * <p>
     * The subject line for the case in the AWS Support Center.
     * </p>
     */
    private String subject;

    /**
     * <p>
     * The status of the case.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>opened</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-customer-action</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reopened</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unassigned</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>work-in-progress</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The code for the AWS service. You can get a list of codes and the
     * corresponding service names by calling <a>DescribeServices</a>.
     * </p>
     */
    private String serviceCode;

    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     */
    private String categoryCode;

    /**
     * <p>
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>.
     * </p>
     */
    private String severityCode;

    /**
     * <p>
     * The email address of the account that submitted the case.
     * </p>
     */
    private String submittedBy;

    /**
     * <p>
     * The time that the case was case created in the AWS Support Center.
     * </p>
     */
    private String timeCreated;

    /**
     * <p>
     * The five most recent communications between you and AWS Support Center,
     * including the IDs of any attachments to the communications. Also includes
     * a <code>nextToken</code> that you can use to retrieve earlier
     * communications.
     * </p>
     */
    private RecentCaseCommunications recentCommunications;

    /**
     * <p>
     * The email addresses that receive copies of communication about the case.
     * </p>
     */
    private java.util.List<String> ccEmailAddresses;

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja"). Language
     * parameters must be passed explicitly for operations that take them.
     * </p>
     */
    private String language;

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     *
     * @return <p>
     *         The AWS Support case ID requested or returned in the call. The
     *         case ID is an alphanumeric string formatted as shown in this
     *         example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *         </p>
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     *
     * @param caseId <p>
     *            The AWS Support case ID requested or returned in the call. The
     *            case ID is an alphanumeric string formatted as shown in this
     *            example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *            </p>
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is
     * an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caseId <p>
     *            The AWS Support case ID requested or returned in the call. The
     *            case ID is an alphanumeric string formatted as shown in this
     *            example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * <p>
     * The ID displayed for the case in the AWS Support Center. This is a
     * numeric string.
     * </p>
     *
     * @return <p>
     *         The ID displayed for the case in the AWS Support Center. This is
     *         a numeric string.
     *         </p>
     */
    public String getDisplayId() {
        return displayId;
    }

    /**
     * <p>
     * The ID displayed for the case in the AWS Support Center. This is a
     * numeric string.
     * </p>
     *
     * @param displayId <p>
     *            The ID displayed for the case in the AWS Support Center. This
     *            is a numeric string.
     *            </p>
     */
    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    /**
     * <p>
     * The ID displayed for the case in the AWS Support Center. This is a
     * numeric string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayId <p>
     *            The ID displayed for the case in the AWS Support Center. This
     *            is a numeric string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }

    /**
     * <p>
     * The subject line for the case in the AWS Support Center.
     * </p>
     *
     * @return <p>
     *         The subject line for the case in the AWS Support Center.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * The subject line for the case in the AWS Support Center.
     * </p>
     *
     * @param subject <p>
     *            The subject line for the case in the AWS Support Center.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line for the case in the AWS Support Center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject <p>
     *            The subject line for the case in the AWS Support Center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * The status of the case.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>opened</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-customer-action</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reopened</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unassigned</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>work-in-progress</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of the case.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>opened</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending-customer-action</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>reopened</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resolved</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unassigned</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>work-in-progress</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the case.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>opened</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-customer-action</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reopened</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unassigned</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>work-in-progress</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            The status of the case.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>opened</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending-customer-action</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reopened</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resolved</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unassigned</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>work-in-progress</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the case.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>opened</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending-customer-action</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>reopened</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unassigned</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>work-in-progress</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the case.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>opened</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pending-customer-action</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>reopened</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>resolved</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>unassigned</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>work-in-progress</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The code for the AWS service. You can get a list of codes and the
     * corresponding service names by calling <a>DescribeServices</a>.
     * </p>
     *
     * @return <p>
     *         The code for the AWS service. You can get a list of codes and the
     *         corresponding service names by calling <a>DescribeServices</a>.
     *         </p>
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * <p>
     * The code for the AWS service. You can get a list of codes and the
     * corresponding service names by calling <a>DescribeServices</a>.
     * </p>
     *
     * @param serviceCode <p>
     *            The code for the AWS service. You can get a list of codes and
     *            the corresponding service names by calling
     *            <a>DescribeServices</a>.
     *            </p>
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the AWS service. You can get a list of codes and the
     * corresponding service names by calling <a>DescribeServices</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceCode <p>
     *            The code for the AWS service. You can get a list of codes and
     *            the corresponding service names by calling
     *            <a>DescribeServices</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     *
     * @return <p>
     *         The category of problem for the AWS Support case.
     *         </p>
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     *
     * @param categoryCode <p>
     *            The category of problem for the AWS Support case.
     *            </p>
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categoryCode <p>
     *            The category of problem for the AWS Support case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>.
     * </p>
     *
     * @return <p>
     *         The code for the severity level returned by the call to
     *         <a>DescribeSeverityLevels</a>.
     *         </p>
     */
    public String getSeverityCode() {
        return severityCode;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>.
     * </p>
     *
     * @param severityCode <p>
     *            The code for the severity level returned by the call to
     *            <a>DescribeSeverityLevels</a>.
     *            </p>
     */
    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param severityCode <p>
     *            The code for the severity level returned by the call to
     *            <a>DescribeSeverityLevels</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withSeverityCode(String severityCode) {
        this.severityCode = severityCode;
        return this;
    }

    /**
     * <p>
     * The email address of the account that submitted the case.
     * </p>
     *
     * @return <p>
     *         The email address of the account that submitted the case.
     *         </p>
     */
    public String getSubmittedBy() {
        return submittedBy;
    }

    /**
     * <p>
     * The email address of the account that submitted the case.
     * </p>
     *
     * @param submittedBy <p>
     *            The email address of the account that submitted the case.
     *            </p>
     */
    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    /**
     * <p>
     * The email address of the account that submitted the case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submittedBy <p>
     *            The email address of the account that submitted the case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * <p>
     * The time that the case was case created in the AWS Support Center.
     * </p>
     *
     * @return <p>
     *         The time that the case was case created in the AWS Support
     *         Center.
     *         </p>
     */
    public String getTimeCreated() {
        return timeCreated;
    }

    /**
     * <p>
     * The time that the case was case created in the AWS Support Center.
     * </p>
     *
     * @param timeCreated <p>
     *            The time that the case was case created in the AWS Support
     *            Center.
     *            </p>
     */
    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * The time that the case was case created in the AWS Support Center.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeCreated <p>
     *            The time that the case was case created in the AWS Support
     *            Center.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    /**
     * <p>
     * The five most recent communications between you and AWS Support Center,
     * including the IDs of any attachments to the communications. Also includes
     * a <code>nextToken</code> that you can use to retrieve earlier
     * communications.
     * </p>
     *
     * @return <p>
     *         The five most recent communications between you and AWS Support
     *         Center, including the IDs of any attachments to the
     *         communications. Also includes a <code>nextToken</code> that you
     *         can use to retrieve earlier communications.
     *         </p>
     */
    public RecentCaseCommunications getRecentCommunications() {
        return recentCommunications;
    }

    /**
     * <p>
     * The five most recent communications between you and AWS Support Center,
     * including the IDs of any attachments to the communications. Also includes
     * a <code>nextToken</code> that you can use to retrieve earlier
     * communications.
     * </p>
     *
     * @param recentCommunications <p>
     *            The five most recent communications between you and AWS
     *            Support Center, including the IDs of any attachments to the
     *            communications. Also includes a <code>nextToken</code> that
     *            you can use to retrieve earlier communications.
     *            </p>
     */
    public void setRecentCommunications(RecentCaseCommunications recentCommunications) {
        this.recentCommunications = recentCommunications;
    }

    /**
     * <p>
     * The five most recent communications between you and AWS Support Center,
     * including the IDs of any attachments to the communications. Also includes
     * a <code>nextToken</code> that you can use to retrieve earlier
     * communications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recentCommunications <p>
     *            The five most recent communications between you and AWS
     *            Support Center, including the IDs of any attachments to the
     *            communications. Also includes a <code>nextToken</code> that
     *            you can use to retrieve earlier communications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withRecentCommunications(RecentCaseCommunications recentCommunications) {
        this.recentCommunications = recentCommunications;
        return this;
    }

    /**
     * <p>
     * The email addresses that receive copies of communication about the case.
     * </p>
     *
     * @return <p>
     *         The email addresses that receive copies of communication about
     *         the case.
     *         </p>
     */
    public java.util.List<String> getCcEmailAddresses() {
        return ccEmailAddresses;
    }

    /**
     * <p>
     * The email addresses that receive copies of communication about the case.
     * </p>
     *
     * @param ccEmailAddresses <p>
     *            The email addresses that receive copies of communication about
     *            the case.
     *            </p>
     */
    public void setCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        if (ccEmailAddresses == null) {
            this.ccEmailAddresses = null;
            return;
        }

        this.ccEmailAddresses = new java.util.ArrayList<String>(ccEmailAddresses);
    }

    /**
     * <p>
     * The email addresses that receive copies of communication about the case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ccEmailAddresses <p>
     *            The email addresses that receive copies of communication about
     *            the case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withCcEmailAddresses(String... ccEmailAddresses) {
        if (getCcEmailAddresses() == null) {
            this.ccEmailAddresses = new java.util.ArrayList<String>(ccEmailAddresses.length);
        }
        for (String value : ccEmailAddresses) {
            this.ccEmailAddresses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The email addresses that receive copies of communication about the case.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ccEmailAddresses <p>
     *            The email addresses that receive copies of communication about
     *            the case.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        setCcEmailAddresses(ccEmailAddresses);
        return this;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja"). Language
     * parameters must be passed explicitly for operations that take them.
     * </p>
     *
     * @return <p>
     *         The ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English ("en") and
     *         Japanese ("ja"). Language parameters must be passed explicitly
     *         for operations that take them.
     *         </p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja"). Language
     * parameters must be passed explicitly for operations that take them.
     * </p>
     *
     * @param language <p>
     *            The ISO 639-1 code for the language in which AWS provides
     *            support. AWS Support currently supports English ("en") and
     *            Japanese ("ja"). Language parameters must be passed explicitly
     *            for operations that take them.
     *            </p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja"). Language
     * parameters must be passed explicitly for operations that take them.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param language <p>
     *            The ISO 639-1 code for the language in which AWS provides
     *            support. AWS Support currently supports English ("en") and
     *            Japanese ("ja"). Language parameters must be passed explicitly
     *            for operations that take them.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CaseDetails withLanguage(String language) {
        this.language = language;
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
        if (getCaseId() != null)
            sb.append("caseId: " + getCaseId() + ",");
        if (getDisplayId() != null)
            sb.append("displayId: " + getDisplayId() + ",");
        if (getSubject() != null)
            sb.append("subject: " + getSubject() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getServiceCode() != null)
            sb.append("serviceCode: " + getServiceCode() + ",");
        if (getCategoryCode() != null)
            sb.append("categoryCode: " + getCategoryCode() + ",");
        if (getSeverityCode() != null)
            sb.append("severityCode: " + getSeverityCode() + ",");
        if (getSubmittedBy() != null)
            sb.append("submittedBy: " + getSubmittedBy() + ",");
        if (getTimeCreated() != null)
            sb.append("timeCreated: " + getTimeCreated() + ",");
        if (getRecentCommunications() != null)
            sb.append("recentCommunications: " + getRecentCommunications() + ",");
        if (getCcEmailAddresses() != null)
            sb.append("ccEmailAddresses: " + getCcEmailAddresses() + ",");
        if (getLanguage() != null)
            sb.append("language: " + getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getDisplayId() == null) ? 0 : getDisplayId().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode
                + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        hashCode = prime * hashCode
                + ((getSeverityCode() == null) ? 0 : getSeverityCode().hashCode());
        hashCode = prime * hashCode
                + ((getSubmittedBy() == null) ? 0 : getSubmittedBy().hashCode());
        hashCode = prime * hashCode
                + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
        hashCode = prime * hashCode
                + ((getRecentCommunications() == null) ? 0 : getRecentCommunications().hashCode());
        hashCode = prime * hashCode
                + ((getCcEmailAddresses() == null) ? 0 : getCcEmailAddresses().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaseDetails == false)
            return false;
        CaseDetails other = (CaseDetails) obj;

        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getDisplayId() == null ^ this.getDisplayId() == null)
            return false;
        if (other.getDisplayId() != null
                && other.getDisplayId().equals(this.getDisplayId()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null
                && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getCategoryCode() == null ^ this.getCategoryCode() == null)
            return false;
        if (other.getCategoryCode() != null
                && other.getCategoryCode().equals(this.getCategoryCode()) == false)
            return false;
        if (other.getSeverityCode() == null ^ this.getSeverityCode() == null)
            return false;
        if (other.getSeverityCode() != null
                && other.getSeverityCode().equals(this.getSeverityCode()) == false)
            return false;
        if (other.getSubmittedBy() == null ^ this.getSubmittedBy() == null)
            return false;
        if (other.getSubmittedBy() != null
                && other.getSubmittedBy().equals(this.getSubmittedBy()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null
                && other.getTimeCreated().equals(this.getTimeCreated()) == false)
            return false;
        if (other.getRecentCommunications() == null ^ this.getRecentCommunications() == null)
            return false;
        if (other.getRecentCommunications() != null
                && other.getRecentCommunications().equals(this.getRecentCommunications()) == false)
            return false;
        if (other.getCcEmailAddresses() == null ^ this.getCcEmailAddresses() == null)
            return false;
        if (other.getCcEmailAddresses() != null
                && other.getCcEmailAddresses().equals(this.getCcEmailAddresses()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
    }
}
