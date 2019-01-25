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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the existing custom verification email templates for your account in
 * the current AWS Region.
 * </p>
 * <p>
 * For more information about custom verification email templates, see <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/custom-verification-emails.html"
 * >Using Custom Verification Email Templates</a> in the <i>Amazon SES Developer
 * Guide</i>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class ListCustomVerificationEmailTemplatesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of custom verification email templates to return. This
     * value must be at least 1 and less than or equal to 50. If you do not
     * specify a value, or if you specify a value less than 1 or greater than
     * 50, the operation will return up to 50 results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     *
     * @return <p>
     *         An array the contains the name and creation time stamp for each
     *         template in your Amazon SES account.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     *
     * @param nextToken <p>
     *            An array the contains the name and creation time stamp for
     *            each template in your Amazon SES account.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An array the contains the name and creation time stamp for each template
     * in your Amazon SES account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An array the contains the name and creation time stamp for
     *            each template in your Amazon SES account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomVerificationEmailTemplatesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of custom verification email templates to return. This
     * value must be at least 1 and less than or equal to 50. If you do not
     * specify a value, or if you specify a value less than 1 or greater than
     * 50, the operation will return up to 50 results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return <p>
     *         The maximum number of custom verification email templates to
     *         return. This value must be at least 1 and less than or equal to
     *         50. If you do not specify a value, or if you specify a value less
     *         than 1 or greater than 50, the operation will return up to 50
     *         results.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of custom verification email templates to return. This
     * value must be at least 1 and less than or equal to 50. If you do not
     * specify a value, or if you specify a value less than 1 or greater than
     * 50, the operation will return up to 50 results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of custom verification email templates to
     *            return. This value must be at least 1 and less than or equal
     *            to 50. If you do not specify a value, or if you specify a
     *            value less than 1 or greater than 50, the operation will
     *            return up to 50 results.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of custom verification email templates to return. This
     * value must be at least 1 and less than or equal to 50. If you do not
     * specify a value, or if you specify a value less than 1 or greater than
     * 50, the operation will return up to 50 results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxResults <p>
     *            The maximum number of custom verification email templates to
     *            return. This value must be at least 1 and less than or equal
     *            to 50. If you do not specify a value, or if you specify a
     *            value less than 1 or greater than 50, the operation will
     *            return up to 50 results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCustomVerificationEmailTemplatesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomVerificationEmailTemplatesRequest == false)
            return false;
        ListCustomVerificationEmailTemplatesRequest other = (ListCustomVerificationEmailTemplatesRequest) obj;

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
        return true;
    }
}
