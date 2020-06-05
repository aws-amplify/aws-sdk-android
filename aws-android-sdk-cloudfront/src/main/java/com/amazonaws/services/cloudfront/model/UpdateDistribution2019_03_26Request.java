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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the configuration for a web distribution.
 * </p>
 * <important>
 * <p>
 * When you update a distribution, there are more required fields than when you
 * create a distribution. When you update your distribution by using this API
 * action, follow the steps here to get the current configuration and then make
 * your updates, to make sure that you include all of the required fields. To
 * view a summary, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-overview-required-fields.html"
 * >Required Fields for Create Distribution and Update Distribution</a> in the
 * <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * </important>
 * <p>
 * The update process includes getting the current distribution configuration,
 * updating the XML document that is returned to make your changes, and then
 * submitting an <code>UpdateDistribution</code> request to make the updates.
 * </p>
 * <p>
 * For information about updating a distribution using the CloudFront console
 * instead, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-creating-console.html"
 * >Creating a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * <p>
 * <b>To update a web distribution using the CloudFront API</b>
 * </p>
 * <ol>
 * <li>
 * <p>
 * Submit a <a href=
 * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistributionConfig.html"
 * >GetDistributionConfig</a> request to get the current configuration and an
 * <code>Etag</code> header for the distribution.
 * </p>
 * <note>
 * <p>
 * If you update the distribution again, you must get a new <code>Etag</code>
 * header.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * Update the XML document that was returned in the response to your
 * <code>GetDistributionConfig</code> request to include your changes.
 * </p>
 * <important>
 * <p>
 * When you edit the XML file, be aware of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You must strip out the ETag parameter that is returned.
 * </p>
 * </li>
 * <li>
 * <p>
 * Additional fields are required when you update a distribution. There may be
 * fields included in the XML file for features that you haven't configured for
 * your distribution. This is expected and required to successfully update the
 * distribution.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can't change the value of <code>CallerReference</code>. If you try to
 * change this value, CloudFront returns an <code>IllegalUpdate</code> error.
 * </p>
 * </li>
 * <li>
 * <p>
 * The new configuration replaces the existing configuration; the values that
 * you specify in an <code>UpdateDistribution</code> request are not merged into
 * your existing configuration. When you add, delete, or replace values in an
 * element that allows multiple values (for example, <code>CNAME</code>), you
 * must specify all of the values that you want to appear in the updated
 * distribution. In addition, you must update the corresponding
 * <code>Quantity</code> element.
 * </p>
 * </li>
 * </ul>
 * </important></li>
 * <li>
 * <p>
 * Submit an <code>UpdateDistribution</code> request to update the configuration
 * for your distribution:
 * </p>
 * <ul>
 * <li>
 * <p>
 * In the request body, include the XML document that you updated in Step 2. The
 * request body must include an XML document with a
 * <code>DistributionConfig</code> element.
 * </p>
 * </li>
 * <li>
 * <p>
 * Set the value of the HTTP <code>If-Match</code> header to the value of the
 * <code>ETag</code> header that CloudFront returned when you submitted the
 * <code>GetDistributionConfig</code> request in Step 1.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Review the response to the <code>UpdateDistribution</code> request to confirm
 * that the configuration was successfully updated.
 * </p>
 * </li>
 * <li>
 * <p>
 * Optional: Submit a <a href=
 * "https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_GetDistribution.html"
 * >GetDistribution</a> request to confirm that your changes have propagated.
 * When propagation is complete, the value of <code>Status</code> is
 * <code>Deployed</code>.
 * </p>
 * </li>
 * </ol>
 */
public class UpdateDistribution2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     */
    private DistributionConfig distributionConfig;

    /**
     * <p>
     * The distribution's id.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when
     * retrieving the distribution's configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     *
     * @return <p>
     *         The distribution's configuration information.
     *         </p>
     */
    public DistributionConfig getDistributionConfig() {
        return distributionConfig;
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     *
     * @param distributionConfig <p>
     *            The distribution's configuration information.
     *            </p>
     */
    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * <p>
     * The distribution's configuration information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param distributionConfig <p>
     *            The distribution's configuration information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDistribution2019_03_26Request withDistributionConfig(
            DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
        return this;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     *
     * @return <p>
     *         The distribution's id.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     *
     * @param id <p>
     *            The distribution's id.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The distribution's id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The distribution's id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDistribution2019_03_26Request withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when
     * retrieving the distribution's configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @return <p>
     *         The value of the <code>ETag</code> header that you received when
     *         retrieving the distribution's configuration. For example:
     *         <code>E2QWRUHAPOMQZL</code>.
     *         </p>
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when
     * retrieving the distribution's configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     *
     * @param ifMatch <p>
     *            The value of the <code>ETag</code> header that you received
     *            when retrieving the distribution's configuration. For example:
     *            <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     */
    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The value of the <code>ETag</code> header that you received when
     * retrieving the distribution's configuration. For example:
     * <code>E2QWRUHAPOMQZL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ifMatch <p>
     *            The value of the <code>ETag</code> header that you received
     *            when retrieving the distribution's configuration. For example:
     *            <code>E2QWRUHAPOMQZL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDistribution2019_03_26Request withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
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
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: " + getDistributionConfig() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIfMatch() != null)
            sb.append("IfMatch: " + getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDistributionConfig() == null) ? 0 : getDistributionConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDistribution2019_03_26Request == false)
            return false;
        UpdateDistribution2019_03_26Request other = (UpdateDistribution2019_03_26Request) obj;

        if (other.getDistributionConfig() == null ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null
                && other.getDistributionConfig().equals(this.getDistributionConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }
}
