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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a case in the AWS Support Center. This operation is similar to how
 * you create a case in the AWS Support Center <a
 * href="https://console.aws.amazon.com/support/home#/case/create">Create
 * Case</a> page.
 * </p>
 * <p>
 * The AWS Support API doesn't support requesting service limit increases. You
 * can submit a service limit increase in the following ways:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Submit a request from the AWS Support Center <a
 * href="https://console.aws.amazon.com/support/home#/case/create">Create
 * Case</a> page.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the Service Quotas <a href=
 * "https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_RequestServiceQuotaIncrease.html"
 * >RequestServiceQuotaIncrease</a> operation.
 * </p>
 * </li>
 * </ul>
 * <p>
 * A successful <code>CreateCase</code> request returns an AWS Support case
 * number. You can use the <a>DescribeCases</a> operation and specify the case
 * number to get existing AWS Support cases. After you create a case, use the
 * <a>AddCommunicationToCase</a> operation to add additional communication or
 * attachments to an existing case.
 * </p>
 * <p>
 * The <code>caseId</code> is separate from the <code>displayId</code> that
 * appears in the <a href="https://console.aws.amazon.com/support">AWS Support
 * Center</a>. Use the <a>DescribeCases</a> operation to get the
 * <code>displayId</code>.
 * </p>
 * <note>
 * <ul>
 * <li>
 * <p>
 * You must have a Business or Enterprise support plan to use the AWS Support
 * API.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you call the AWS Support API from an account that does not have a Business
 * or Enterprise support plan, the <code>SubscriptionRequiredException</code>
 * error message appears. For information about changing your support plan, see
 * <a href="http://aws.amazon.com/premiumsupport/">AWS Support</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class CreateCaseRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The title of the AWS Support case. The title appears in the
     * <b>Subject</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     */
    private String subject;

    /**
     * <p>
     * The code for the AWS service. You can use the <a>DescribeServices</a>
     * operation to get the possible <code>serviceCode</code> values.
     * </p>
     */
    private String serviceCode;

    /**
     * <p>
     * A value that indicates the urgency of the case. This value determines the
     * response time according to your service level agreement with AWS Support.
     * You can use the <a>DescribeSeverityLevels</a> operation to get the
     * possible values for <code>severityCode</code>.
     * </p>
     * <p>
     * For more information, see <a>SeverityLevel</a> and <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#choosing-severity"
     * >Choosing a Severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The availability of severity levels depends on the support plan for the
     * AWS account.
     * </p>
     * </note>
     */
    private String severityCode;

    /**
     * <p>
     * The category of problem for the AWS Support case. You also use the
     * <a>DescribeServices</a> operation to get the category code for a service.
     * Each AWS service defines its own set of category codes.
     * </p>
     */
    private String categoryCode;

    /**
     * <p>
     * The communication body text that describes the issue. This text appears
     * in the <b>Description</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     */
    private String communicationBody;

    /**
     * <p>
     * A list of email addresses that AWS Support copies on case correspondence.
     * AWS Support identifies the account that creates the case when you specify
     * your AWS credentials in an HTTP POST method or use the <a
     * href="http://aws.amazon.com/tools/">AWS SDKs</a>.
     * </p>
     */
    private java.util.List<String> ccEmailAddresses;

    /**
     * <p>
     * The language in which AWS Support handles the case. You must specify the
     * ISO 639-1 code for the <code>language</code> parameter if you want
     * support in that language. Currently, English ("en") and Japanese ("ja")
     * are supported.
     * </p>
     */
    private String language;

    /**
     * <p>
     * The type of issue for the case. You can specify
     * <code>customer-service</code> or <code>technical</code>. If you don't
     * specify a value, the default is <code>technical</code>.
     * </p>
     */
    private String issueType;

    /**
     * <p>
     * The ID of a set of one or more attachments for the case. Create the set
     * by using the <a>AddAttachmentsToSet</a> operation.
     * </p>
     */
    private String attachmentSetId;

    /**
     * <p>
     * The title of the AWS Support case. The title appears in the
     * <b>Subject</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     *
     * @return <p>
     *         The title of the AWS Support case. The title appears in the
     *         <b>Subject</b> field on the AWS Support Center <a
     *         href="https://console.aws.amazon.com/support/home#/case/create"
     *         >Create Case</a> page.
     *         </p>
     */
    public String getSubject() {
        return subject;
    }

    /**
     * <p>
     * The title of the AWS Support case. The title appears in the
     * <b>Subject</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     *
     * @param subject <p>
     *            The title of the AWS Support case. The title appears in the
     *            <b>Subject</b> field on the AWS Support Center <a href=
     *            "https://console.aws.amazon.com/support/home#/case/create"
     *            >Create Case</a> page.
     *            </p>
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The title of the AWS Support case. The title appears in the
     * <b>Subject</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subject <p>
     *            The title of the AWS Support case. The title appears in the
     *            <b>Subject</b> field on the AWS Support Center <a href=
     *            "https://console.aws.amazon.com/support/home#/case/create"
     *            >Create Case</a> page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * <p>
     * The code for the AWS service. You can use the <a>DescribeServices</a>
     * operation to get the possible <code>serviceCode</code> values.
     * </p>
     *
     * @return <p>
     *         The code for the AWS service. You can use the
     *         <a>DescribeServices</a> operation to get the possible
     *         <code>serviceCode</code> values.
     *         </p>
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * <p>
     * The code for the AWS service. You can use the <a>DescribeServices</a>
     * operation to get the possible <code>serviceCode</code> values.
     * </p>
     *
     * @param serviceCode <p>
     *            The code for the AWS service. You can use the
     *            <a>DescribeServices</a> operation to get the possible
     *            <code>serviceCode</code> values.
     *            </p>
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the AWS service. You can use the <a>DescribeServices</a>
     * operation to get the possible <code>serviceCode</code> values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceCode <p>
     *            The code for the AWS service. You can use the
     *            <a>DescribeServices</a> operation to get the possible
     *            <code>serviceCode</code> values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * <p>
     * A value that indicates the urgency of the case. This value determines the
     * response time according to your service level agreement with AWS Support.
     * You can use the <a>DescribeSeverityLevels</a> operation to get the
     * possible values for <code>severityCode</code>.
     * </p>
     * <p>
     * For more information, see <a>SeverityLevel</a> and <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#choosing-severity"
     * >Choosing a Severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The availability of severity levels depends on the support plan for the
     * AWS account.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that indicates the urgency of the case. This value
     *         determines the response time according to your service level
     *         agreement with AWS Support. You can use the
     *         <a>DescribeSeverityLevels</a> operation to get the possible
     *         values for <code>severityCode</code>.
     *         </p>
     *         <p>
     *         For more information, see <a>SeverityLevel</a> and <a href=
     *         "https://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#choosing-severity"
     *         >Choosing a Severity</a> in the <i>AWS Support User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         The availability of severity levels depends on the support plan
     *         for the AWS account.
     *         </p>
     *         </note>
     */
    public String getSeverityCode() {
        return severityCode;
    }

    /**
     * <p>
     * A value that indicates the urgency of the case. This value determines the
     * response time according to your service level agreement with AWS Support.
     * You can use the <a>DescribeSeverityLevels</a> operation to get the
     * possible values for <code>severityCode</code>.
     * </p>
     * <p>
     * For more information, see <a>SeverityLevel</a> and <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#choosing-severity"
     * >Choosing a Severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The availability of severity levels depends on the support plan for the
     * AWS account.
     * </p>
     * </note>
     *
     * @param severityCode <p>
     *            A value that indicates the urgency of the case. This value
     *            determines the response time according to your service level
     *            agreement with AWS Support. You can use the
     *            <a>DescribeSeverityLevels</a> operation to get the possible
     *            values for <code>severityCode</code>.
     *            </p>
     *            <p>
     *            For more information, see <a>SeverityLevel</a> and <a href=
     *            "https://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#choosing-severity"
     *            >Choosing a Severity</a> in the <i>AWS Support User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The availability of severity levels depends on the support
     *            plan for the AWS account.
     *            </p>
     *            </note>
     */
    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }

    /**
     * <p>
     * A value that indicates the urgency of the case. This value determines the
     * response time according to your service level agreement with AWS Support.
     * You can use the <a>DescribeSeverityLevels</a> operation to get the
     * possible values for <code>severityCode</code>.
     * </p>
     * <p>
     * For more information, see <a>SeverityLevel</a> and <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#choosing-severity"
     * >Choosing a Severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     * <note>
     * <p>
     * The availability of severity levels depends on the support plan for the
     * AWS account.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param severityCode <p>
     *            A value that indicates the urgency of the case. This value
     *            determines the response time according to your service level
     *            agreement with AWS Support. You can use the
     *            <a>DescribeSeverityLevels</a> operation to get the possible
     *            values for <code>severityCode</code>.
     *            </p>
     *            <p>
     *            For more information, see <a>SeverityLevel</a> and <a href=
     *            "https://docs.aws.amazon.com/awssupport/latest/user/getting-started.html#choosing-severity"
     *            >Choosing a Severity</a> in the <i>AWS Support User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            The availability of severity levels depends on the support
     *            plan for the AWS account.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withSeverityCode(String severityCode) {
        this.severityCode = severityCode;
        return this;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case. You also use the
     * <a>DescribeServices</a> operation to get the category code for a service.
     * Each AWS service defines its own set of category codes.
     * </p>
     *
     * @return <p>
     *         The category of problem for the AWS Support case. You also use
     *         the <a>DescribeServices</a> operation to get the category code
     *         for a service. Each AWS service defines its own set of category
     *         codes.
     *         </p>
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case. You also use the
     * <a>DescribeServices</a> operation to get the category code for a service.
     * Each AWS service defines its own set of category codes.
     * </p>
     *
     * @param categoryCode <p>
     *            The category of problem for the AWS Support case. You also use
     *            the <a>DescribeServices</a> operation to get the category code
     *            for a service. Each AWS service defines its own set of
     *            category codes.
     *            </p>
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case. You also use the
     * <a>DescribeServices</a> operation to get the category code for a service.
     * Each AWS service defines its own set of category codes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categoryCode <p>
     *            The category of problem for the AWS Support case. You also use
     *            the <a>DescribeServices</a> operation to get the category code
     *            for a service. Each AWS service defines its own set of
     *            category codes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * <p>
     * The communication body text that describes the issue. This text appears
     * in the <b>Description</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @return <p>
     *         The communication body text that describes the issue. This text
     *         appears in the <b>Description</b> field on the AWS Support Center
     *         <a
     *         href="https://console.aws.amazon.com/support/home#/case/create"
     *         >Create Case</a> page.
     *         </p>
     */
    public String getCommunicationBody() {
        return communicationBody;
    }

    /**
     * <p>
     * The communication body text that describes the issue. This text appears
     * in the <b>Description</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody <p>
     *            The communication body text that describes the issue. This
     *            text appears in the <b>Description</b> field on the AWS
     *            Support Center <a href=
     *            "https://console.aws.amazon.com/support/home#/case/create"
     *            >Create Case</a> page.
     *            </p>
     */
    public void setCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
    }

    /**
     * <p>
     * The communication body text that describes the issue. This text appears
     * in the <b>Description</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody <p>
     *            The communication body text that describes the issue. This
     *            text appears in the <b>Description</b> field on the AWS
     *            Support Center <a href=
     *            "https://console.aws.amazon.com/support/home#/case/create"
     *            >Create Case</a> page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
        return this;
    }

    /**
     * <p>
     * A list of email addresses that AWS Support copies on case correspondence.
     * AWS Support identifies the account that creates the case when you specify
     * your AWS credentials in an HTTP POST method or use the <a
     * href="http://aws.amazon.com/tools/">AWS SDKs</a>.
     * </p>
     *
     * @return <p>
     *         A list of email addresses that AWS Support copies on case
     *         correspondence. AWS Support identifies the account that creates
     *         the case when you specify your AWS credentials in an HTTP POST
     *         method or use the <a href="http://aws.amazon.com/tools/">AWS
     *         SDKs</a>.
     *         </p>
     */
    public java.util.List<String> getCcEmailAddresses() {
        return ccEmailAddresses;
    }

    /**
     * <p>
     * A list of email addresses that AWS Support copies on case correspondence.
     * AWS Support identifies the account that creates the case when you specify
     * your AWS credentials in an HTTP POST method or use the <a
     * href="http://aws.amazon.com/tools/">AWS SDKs</a>.
     * </p>
     *
     * @param ccEmailAddresses <p>
     *            A list of email addresses that AWS Support copies on case
     *            correspondence. AWS Support identifies the account that
     *            creates the case when you specify your AWS credentials in an
     *            HTTP POST method or use the <a
     *            href="http://aws.amazon.com/tools/">AWS SDKs</a>.
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
     * A list of email addresses that AWS Support copies on case correspondence.
     * AWS Support identifies the account that creates the case when you specify
     * your AWS credentials in an HTTP POST method or use the <a
     * href="http://aws.amazon.com/tools/">AWS SDKs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ccEmailAddresses <p>
     *            A list of email addresses that AWS Support copies on case
     *            correspondence. AWS Support identifies the account that
     *            creates the case when you specify your AWS credentials in an
     *            HTTP POST method or use the <a
     *            href="http://aws.amazon.com/tools/">AWS SDKs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withCcEmailAddresses(String... ccEmailAddresses) {
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
     * A list of email addresses that AWS Support copies on case correspondence.
     * AWS Support identifies the account that creates the case when you specify
     * your AWS credentials in an HTTP POST method or use the <a
     * href="http://aws.amazon.com/tools/">AWS SDKs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ccEmailAddresses <p>
     *            A list of email addresses that AWS Support copies on case
     *            correspondence. AWS Support identifies the account that
     *            creates the case when you specify your AWS credentials in an
     *            HTTP POST method or use the <a
     *            href="http://aws.amazon.com/tools/">AWS SDKs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        setCcEmailAddresses(ccEmailAddresses);
        return this;
    }

    /**
     * <p>
     * The language in which AWS Support handles the case. You must specify the
     * ISO 639-1 code for the <code>language</code> parameter if you want
     * support in that language. Currently, English ("en") and Japanese ("ja")
     * are supported.
     * </p>
     *
     * @return <p>
     *         The language in which AWS Support handles the case. You must
     *         specify the ISO 639-1 code for the <code>language</code>
     *         parameter if you want support in that language. Currently,
     *         English ("en") and Japanese ("ja") are supported.
     *         </p>
     */
    public String getLanguage() {
        return language;
    }

    /**
     * <p>
     * The language in which AWS Support handles the case. You must specify the
     * ISO 639-1 code for the <code>language</code> parameter if you want
     * support in that language. Currently, English ("en") and Japanese ("ja")
     * are supported.
     * </p>
     *
     * @param language <p>
     *            The language in which AWS Support handles the case. You must
     *            specify the ISO 639-1 code for the <code>language</code>
     *            parameter if you want support in that language. Currently,
     *            English ("en") and Japanese ("ja") are supported.
     *            </p>
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The language in which AWS Support handles the case. You must specify the
     * ISO 639-1 code for the <code>language</code> parameter if you want
     * support in that language. Currently, English ("en") and Japanese ("ja")
     * are supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param language <p>
     *            The language in which AWS Support handles the case. You must
     *            specify the ISO 639-1 code for the <code>language</code>
     *            parameter if you want support in that language. Currently,
     *            English ("en") and Japanese ("ja") are supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * The type of issue for the case. You can specify
     * <code>customer-service</code> or <code>technical</code>. If you don't
     * specify a value, the default is <code>technical</code>.
     * </p>
     *
     * @return <p>
     *         The type of issue for the case. You can specify
     *         <code>customer-service</code> or <code>technical</code>. If you
     *         don't specify a value, the default is <code>technical</code>.
     *         </p>
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * <p>
     * The type of issue for the case. You can specify
     * <code>customer-service</code> or <code>technical</code>. If you don't
     * specify a value, the default is <code>technical</code>.
     * </p>
     *
     * @param issueType <p>
     *            The type of issue for the case. You can specify
     *            <code>customer-service</code> or <code>technical</code>. If
     *            you don't specify a value, the default is
     *            <code>technical</code>.
     *            </p>
     */
    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    /**
     * <p>
     * The type of issue for the case. You can specify
     * <code>customer-service</code> or <code>technical</code>. If you don't
     * specify a value, the default is <code>technical</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param issueType <p>
     *            The type of issue for the case. You can specify
     *            <code>customer-service</code> or <code>technical</code>. If
     *            you don't specify a value, the default is
     *            <code>technical</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the case. Create the set
     * by using the <a>AddAttachmentsToSet</a> operation.
     * </p>
     *
     * @return <p>
     *         The ID of a set of one or more attachments for the case. Create
     *         the set by using the <a>AddAttachmentsToSet</a> operation.
     *         </p>
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the case. Create the set
     * by using the <a>AddAttachmentsToSet</a> operation.
     * </p>
     *
     * @param attachmentSetId <p>
     *            The ID of a set of one or more attachments for the case.
     *            Create the set by using the <a>AddAttachmentsToSet</a>
     *            operation.
     *            </p>
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the case. Create the set
     * by using the <a>AddAttachmentsToSet</a> operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentSetId <p>
     *            The ID of a set of one or more attachments for the case.
     *            Create the set by using the <a>AddAttachmentsToSet</a>
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCaseRequest withAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
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
        if (getSubject() != null)
            sb.append("subject: " + getSubject() + ",");
        if (getServiceCode() != null)
            sb.append("serviceCode: " + getServiceCode() + ",");
        if (getSeverityCode() != null)
            sb.append("severityCode: " + getSeverityCode() + ",");
        if (getCategoryCode() != null)
            sb.append("categoryCode: " + getCategoryCode() + ",");
        if (getCommunicationBody() != null)
            sb.append("communicationBody: " + getCommunicationBody() + ",");
        if (getCcEmailAddresses() != null)
            sb.append("ccEmailAddresses: " + getCcEmailAddresses() + ",");
        if (getLanguage() != null)
            sb.append("language: " + getLanguage() + ",");
        if (getIssueType() != null)
            sb.append("issueType: " + getIssueType() + ",");
        if (getAttachmentSetId() != null)
            sb.append("attachmentSetId: " + getAttachmentSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode
                + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode
                + ((getSeverityCode() == null) ? 0 : getSeverityCode().hashCode());
        hashCode = prime * hashCode
                + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        hashCode = prime * hashCode
                + ((getCommunicationBody() == null) ? 0 : getCommunicationBody().hashCode());
        hashCode = prime * hashCode
                + ((getCcEmailAddresses() == null) ? 0 : getCcEmailAddresses().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getIssueType() == null) ? 0 : getIssueType().hashCode());
        hashCode = prime * hashCode
                + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCaseRequest == false)
            return false;
        CreateCaseRequest other = (CreateCaseRequest) obj;

        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null
                && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getSeverityCode() == null ^ this.getSeverityCode() == null)
            return false;
        if (other.getSeverityCode() != null
                && other.getSeverityCode().equals(this.getSeverityCode()) == false)
            return false;
        if (other.getCategoryCode() == null ^ this.getCategoryCode() == null)
            return false;
        if (other.getCategoryCode() != null
                && other.getCategoryCode().equals(this.getCategoryCode()) == false)
            return false;
        if (other.getCommunicationBody() == null ^ this.getCommunicationBody() == null)
            return false;
        if (other.getCommunicationBody() != null
                && other.getCommunicationBody().equals(this.getCommunicationBody()) == false)
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
        if (other.getIssueType() == null ^ this.getIssueType() == null)
            return false;
        if (other.getIssueType() != null
                && other.getIssueType().equals(this.getIssueType()) == false)
            return false;
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null)
            return false;
        if (other.getAttachmentSetId() != null
                && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false)
            return false;
        return true;
    }
}
