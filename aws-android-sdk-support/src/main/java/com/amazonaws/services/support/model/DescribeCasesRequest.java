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
 * Returns a list of cases that you specify by passing one or more case IDs. In
 * addition, you can filter the cases by date by setting values for the
 * <code>afterTime</code> and <code>beforeTime</code> request parameters. You
 * can set values for the <code>includeResolvedCases</code> and
 * <code>includeCommunications</code> request parameters to control how much
 * information is returned.
 * </p>
 * <p>
 * Case data is available for 12 months after creation. If a case was created
 * more than 12 months ago, a request for data might cause an error.
 * </p>
 * <p>
 * The response returns the following in JSON format:
 * </p>
 * <ul>
 * <li>
 * <p>
 * One or more <a>CaseDetails</a> data types.
 * </p>
 * </li>
 * <li>
 * <p>
 * One or more <code>nextToken</code> values, which specify where to paginate
 * the returned records represented by the <code>CaseDetails</code> objects.
 * </p>
 * </li>
 * </ul>
 */
public class DescribeCasesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum
     * number of cases is 100.
     * </p>
     */
    private java.util.List<String> caseIdList;

    /**
     * <p>
     * The ID displayed for a case in the AWS Support Center user interface.
     * </p>
     */
    private String displayId;

    /**
     * <p>
     * The start date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     */
    private String afterTime;

    /**
     * <p>
     * The end date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     */
    private String beforeTime;

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the
     * <a>DescribeCases</a> results. The default is <i>false</i>.
     * </p>
     */
    private Boolean includeResolvedCases;

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     */
    private Integer maxResults;

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
     * Specifies whether communications should be included in the
     * <a>DescribeCases</a> results. The default is <i>true</i>.
     * </p>
     */
    private Boolean includeCommunications;

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum
     * number of cases is 100.
     * </p>
     *
     * @return <p>
     *         A list of ID numbers of the support cases you want returned. The
     *         maximum number of cases is 100.
     *         </p>
     */
    public java.util.List<String> getCaseIdList() {
        return caseIdList;
    }

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum
     * number of cases is 100.
     * </p>
     *
     * @param caseIdList <p>
     *            A list of ID numbers of the support cases you want returned.
     *            The maximum number of cases is 100.
     *            </p>
     */
    public void setCaseIdList(java.util.Collection<String> caseIdList) {
        if (caseIdList == null) {
            this.caseIdList = null;
            return;
        }

        this.caseIdList = new java.util.ArrayList<String>(caseIdList);
    }

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum
     * number of cases is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caseIdList <p>
     *            A list of ID numbers of the support cases you want returned.
     *            The maximum number of cases is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withCaseIdList(String... caseIdList) {
        if (getCaseIdList() == null) {
            this.caseIdList = new java.util.ArrayList<String>(caseIdList.length);
        }
        for (String value : caseIdList) {
            this.caseIdList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of ID numbers of the support cases you want returned. The maximum
     * number of cases is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param caseIdList <p>
     *            A list of ID numbers of the support cases you want returned.
     *            The maximum number of cases is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withCaseIdList(java.util.Collection<String> caseIdList) {
        setCaseIdList(caseIdList);
        return this;
    }

    /**
     * <p>
     * The ID displayed for a case in the AWS Support Center user interface.
     * </p>
     *
     * @return <p>
     *         The ID displayed for a case in the AWS Support Center user
     *         interface.
     *         </p>
     */
    public String getDisplayId() {
        return displayId;
    }

    /**
     * <p>
     * The ID displayed for a case in the AWS Support Center user interface.
     * </p>
     *
     * @param displayId <p>
     *            The ID displayed for a case in the AWS Support Center user
     *            interface.
     *            </p>
     */
    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    /**
     * <p>
     * The ID displayed for a case in the AWS Support Center user interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayId <p>
     *            The ID displayed for a case in the AWS Support Center user
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     *
     * @return <p>
     *         The start date for a filtered date search on support case
     *         communications. Case communications are available for 12 months
     *         after creation.
     *         </p>
     */
    public String getAfterTime() {
        return afterTime;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     *
     * @param afterTime <p>
     *            The start date for a filtered date search on support case
     *            communications. Case communications are available for 12
     *            months after creation.
     *            </p>
     */
    public void setAfterTime(String afterTime) {
        this.afterTime = afterTime;
    }

    /**
     * <p>
     * The start date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterTime <p>
     *            The start date for a filtered date search on support case
     *            communications. Case communications are available for 12
     *            months after creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withAfterTime(String afterTime) {
        this.afterTime = afterTime;
        return this;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     *
     * @return <p>
     *         The end date for a filtered date search on support case
     *         communications. Case communications are available for 12 months
     *         after creation.
     *         </p>
     */
    public String getBeforeTime() {
        return beforeTime;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     *
     * @param beforeTime <p>
     *            The end date for a filtered date search on support case
     *            communications. Case communications are available for 12
     *            months after creation.
     *            </p>
     */
    public void setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
    }

    /**
     * <p>
     * The end date for a filtered date search on support case communications.
     * Case communications are available for 12 months after creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeTime <p>
     *            The end date for a filtered date search on support case
     *            communications. Case communications are available for 12
     *            months after creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the
     * <a>DescribeCases</a> results. The default is <i>false</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether resolved support cases should be included in
     *         the <a>DescribeCases</a> results. The default is <i>false</i>.
     *         </p>
     */
    public Boolean isIncludeResolvedCases() {
        return includeResolvedCases;
    }

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the
     * <a>DescribeCases</a> results. The default is <i>false</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether resolved support cases should be included in
     *         the <a>DescribeCases</a> results. The default is <i>false</i>.
     *         </p>
     */
    public Boolean getIncludeResolvedCases() {
        return includeResolvedCases;
    }

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the
     * <a>DescribeCases</a> results. The default is <i>false</i>.
     * </p>
     *
     * @param includeResolvedCases <p>
     *            Specifies whether resolved support cases should be included in
     *            the <a>DescribeCases</a> results. The default is <i>false</i>.
     *            </p>
     */
    public void setIncludeResolvedCases(Boolean includeResolvedCases) {
        this.includeResolvedCases = includeResolvedCases;
    }

    /**
     * <p>
     * Specifies whether resolved support cases should be included in the
     * <a>DescribeCases</a> results. The default is <i>false</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeResolvedCases <p>
     *            Specifies whether resolved support cases should be included in
     *            the <a>DescribeCases</a> results. The default is <i>false</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withIncludeResolvedCases(Boolean includeResolvedCases) {
        this.includeResolvedCases = includeResolvedCases;
        return this;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     *
     * @return <p>
     *         A resumption point for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     *
     * @param nextToken <p>
     *            A resumption point for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A resumption point for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A resumption point for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return before paginating.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return before paginating.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return before paginating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return before paginating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
    public DescribeCasesRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * <p>
     * Specifies whether communications should be included in the
     * <a>DescribeCases</a> results. The default is <i>true</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether communications should be included in the
     *         <a>DescribeCases</a> results. The default is <i>true</i>.
     *         </p>
     */
    public Boolean isIncludeCommunications() {
        return includeCommunications;
    }

    /**
     * <p>
     * Specifies whether communications should be included in the
     * <a>DescribeCases</a> results. The default is <i>true</i>.
     * </p>
     *
     * @return <p>
     *         Specifies whether communications should be included in the
     *         <a>DescribeCases</a> results. The default is <i>true</i>.
     *         </p>
     */
    public Boolean getIncludeCommunications() {
        return includeCommunications;
    }

    /**
     * <p>
     * Specifies whether communications should be included in the
     * <a>DescribeCases</a> results. The default is <i>true</i>.
     * </p>
     *
     * @param includeCommunications <p>
     *            Specifies whether communications should be included in the
     *            <a>DescribeCases</a> results. The default is <i>true</i>.
     *            </p>
     */
    public void setIncludeCommunications(Boolean includeCommunications) {
        this.includeCommunications = includeCommunications;
    }

    /**
     * <p>
     * Specifies whether communications should be included in the
     * <a>DescribeCases</a> results. The default is <i>true</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeCommunications <p>
     *            Specifies whether communications should be included in the
     *            <a>DescribeCases</a> results. The default is <i>true</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCasesRequest withIncludeCommunications(Boolean includeCommunications) {
        this.includeCommunications = includeCommunications;
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
        if (getCaseIdList() != null)
            sb.append("caseIdList: " + getCaseIdList() + ",");
        if (getDisplayId() != null)
            sb.append("displayId: " + getDisplayId() + ",");
        if (getAfterTime() != null)
            sb.append("afterTime: " + getAfterTime() + ",");
        if (getBeforeTime() != null)
            sb.append("beforeTime: " + getBeforeTime() + ",");
        if (getIncludeResolvedCases() != null)
            sb.append("includeResolvedCases: " + getIncludeResolvedCases() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getLanguage() != null)
            sb.append("language: " + getLanguage() + ",");
        if (getIncludeCommunications() != null)
            sb.append("includeCommunications: " + getIncludeCommunications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseIdList() == null) ? 0 : getCaseIdList().hashCode());
        hashCode = prime * hashCode + ((getDisplayId() == null) ? 0 : getDisplayId().hashCode());
        hashCode = prime * hashCode + ((getAfterTime() == null) ? 0 : getAfterTime().hashCode());
        hashCode = prime * hashCode + ((getBeforeTime() == null) ? 0 : getBeforeTime().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeResolvedCases() == null) ? 0 : getIncludeResolvedCases().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeCommunications() == null) ? 0 : getIncludeCommunications().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCasesRequest == false)
            return false;
        DescribeCasesRequest other = (DescribeCasesRequest) obj;

        if (other.getCaseIdList() == null ^ this.getCaseIdList() == null)
            return false;
        if (other.getCaseIdList() != null
                && other.getCaseIdList().equals(this.getCaseIdList()) == false)
            return false;
        if (other.getDisplayId() == null ^ this.getDisplayId() == null)
            return false;
        if (other.getDisplayId() != null
                && other.getDisplayId().equals(this.getDisplayId()) == false)
            return false;
        if (other.getAfterTime() == null ^ this.getAfterTime() == null)
            return false;
        if (other.getAfterTime() != null
                && other.getAfterTime().equals(this.getAfterTime()) == false)
            return false;
        if (other.getBeforeTime() == null ^ this.getBeforeTime() == null)
            return false;
        if (other.getBeforeTime() != null
                && other.getBeforeTime().equals(this.getBeforeTime()) == false)
            return false;
        if (other.getIncludeResolvedCases() == null ^ this.getIncludeResolvedCases() == null)
            return false;
        if (other.getIncludeResolvedCases() != null
                && other.getIncludeResolvedCases().equals(this.getIncludeResolvedCases()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getIncludeCommunications() == null ^ this.getIncludeCommunications() == null)
            return false;
        if (other.getIncludeCommunications() != null
                && other.getIncludeCommunications().equals(this.getIncludeCommunications()) == false)
            return false;
        return true;
    }
}
