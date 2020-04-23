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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves information about all the versions of a specific message template.
 * </p>
 */
public class ListTemplateVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The string that specifies which page of results to return in a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     */
    private String pageSize;

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The type of channel that the message template is designed for. Valid
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @return <p>
     *         The string that specifies which page of results to return in a
     *         paginated response. This parameter is not supported for
     *         application, campaign, and journey metrics.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @param nextToken <p>
     *            The string that specifies which page of results to return in a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The string that specifies which page of results to return in a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplateVersionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @return <p>
     *         The maximum number of items to include in each page of a
     *         paginated response. This parameter is not supported for
     *         application, campaign, and journey metrics.
     *         </p>
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     */
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated
     * response. This parameter is not supported for application, campaign, and
     * journey metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageSize <p>
     *            The maximum number of items to include in each page of a
     *            paginated response. This parameter is not supported for
     *            application, campaign, and journey metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplateVersionsRequest withPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     *
     * @return <p>
     *         The name of the message template. A template name must start with
     *         an alphanumeric character and can contain a maximum of 128
     *         characters. The characters can be alphanumeric characters,
     *         underscores (_), or hyphens (-). Template names are case
     *         sensitive.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     *
     * @param templateName <p>
     *            The name of the message template. A template name must start
     *            with an alphanumeric character and can contain a maximum of
     *            128 characters. The characters can be alphanumeric characters,
     *            underscores (_), or hyphens (-). Template names are case
     *            sensitive.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the message template. A template name must start
     *            with an alphanumeric character and can contain a maximum of
     *            128 characters. The characters can be alphanumeric characters,
     *            underscores (_), or hyphens (-). Template names are case
     *            sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplateVersionsRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Valid
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     *
     * @return <p>
     *         The type of channel that the message template is designed for.
     *         Valid values are: EMAIL, PUSH, SMS, and VOICE.
     *         </p>
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Valid
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            Valid values are: EMAIL, PUSH, SMS, and VOICE.
     *            </p>
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Valid
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            Valid values are: EMAIL, PUSH, SMS, and VOICE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplateVersionsRequest withTemplateType(String templateType) {
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
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
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
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
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

        if (obj instanceof ListTemplateVersionsRequest == false)
            return false;
        ListTemplateVersionsRequest other = (ListTemplateVersionsRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null
                && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }
}
