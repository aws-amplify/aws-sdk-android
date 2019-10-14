/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about all the message templates that are associated
 * with your Amazon Pinpoint account.
 * </p>
 */
public class ListTemplatesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response. This parameter is currently not supported by the
     * Application Metrics and Campaign Metrics resources.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is currently not supported by the Application
     * Metrics and Campaign Metrics resources.
     * </p>
     */
    private String pageSize;

    /**
     * <p>
     * The substring to match in the names of the message templates to include
     * in the results. If you specify this value, Amazon Pinpoint returns only
     * those templates whose names begin with the value that you specify.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The type of message template to include in the results. Valid values are:
     * EMAIL, SMS, and PUSH. To include all types of templates in the results,
     * don't include this parameter in your request.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response. This parameter is currently not supported by the
     * Application Metrics and Campaign Metrics resources.
     * </p>
     *
     * @return <p>
     *         The NextToken string that specifies which page of results to
     *         return in a paginated response. This parameter is currently not
     *         supported by the Application Metrics and Campaign Metrics
     *         resources.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response. This parameter is currently not supported by the
     * Application Metrics and Campaign Metrics resources.
     * </p>
     *
     * @param nextToken <p>
     *            The NextToken string that specifies which page of results to
     *            return in a paginated response. This parameter is currently
     *            not supported by the Application Metrics and Campaign Metrics
     *            resources.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a
     * paginated response. This parameter is currently not supported by the
     * Application Metrics and Campaign Metrics resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The NextToken string that specifies which page of results to
     *            return in a paginated response. This parameter is currently
     *            not supported by the Application Metrics and Campaign Metrics
     *            resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is currently not supported by the Application
     * Metrics and Campaign Metrics resources.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to include in each page of a
     *         paginated response. This parameter is currently not supported by
     *         the Application Metrics and Campaign Metrics resources.
     *         </p>
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is currently not supported by the Application
     * Metrics and Campaign Metrics resources.
     * </p>
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is currently not supported
     *            by the Application Metrics and Campaign Metrics resources.
     *            </p>
     */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is currently not supported by the Application
     * Metrics and Campaign Metrics resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is currently not supported
     *            by the Application Metrics and Campaign Metrics resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The substring to match in the names of the message templates to include
     * in the results. If you specify this value, Amazon Pinpoint returns only
     * those templates whose names begin with the value that you specify.
     * </p>
     *
     * @return <p>
     *         The substring to match in the names of the message templates to
     *         include in the results. If you specify this value, Amazon
     *         Pinpoint returns only those templates whose names begin with the
     *         value that you specify.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The substring to match in the names of the message templates to include
     * in the results. If you specify this value, Amazon Pinpoint returns only
     * those templates whose names begin with the value that you specify.
     * </p>
     *
     * @param prefix <p>
     *            The substring to match in the names of the message templates
     *            to include in the results. If you specify this value, Amazon
     *            Pinpoint returns only those templates whose names begin with
     *            the value that you specify.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The substring to match in the names of the message templates to include
     * in the results. If you specify this value, Amazon Pinpoint returns only
     * those templates whose names begin with the value that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The substring to match in the names of the message templates
     *            to include in the results. If you specify this value, Amazon
     *            Pinpoint returns only those templates whose names begin with
     *            the value that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The type of message template to include in the results. Valid values are:
     * EMAIL, SMS, and PUSH. To include all types of templates in the results,
     * don't include this parameter in your request.
     * </p>
     *
     * @return <p>
     *         The type of message template to include in the results. Valid
     *         values are: EMAIL, SMS, and PUSH. To include all types of
     *         templates in the results, don't include this parameter in your
     *         request.
     *         </p>
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * <p>
     * The type of message template to include in the results. Valid values are:
     * EMAIL, SMS, and PUSH. To include all types of templates in the results,
     * don't include this parameter in your request.
     * </p>
     *
     * @param templateType <p>
     *            The type of message template to include in the results. Valid
     *            values are: EMAIL, SMS, and PUSH. To include all types of
     *            templates in the results, don't include this parameter in your
     *            request.
     *            </p>
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of message template to include in the results. Valid values are:
     * EMAIL, SMS, and PUSH. To include all types of templates in the results,
     * don't include this parameter in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateType <p>
     *            The type of message template to include in the results. Valid
     *            values are: EMAIL, SMS, and PUSH. To include all types of
     *            templates in the results, don't include this parameter in your
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesRequest withTemplateType(String templateType) {
        this.templateType = templateType;
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getTemplateType() != null)
            sb.append("TemplateType: " + getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplatesRequest == false)
            return false;
        ListTemplatesRequest other = (ListTemplatesRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null
                && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }
}
