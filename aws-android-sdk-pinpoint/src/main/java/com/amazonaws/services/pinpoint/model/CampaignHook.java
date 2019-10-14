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

/**
 * <p>
 * Specifies the AWS Lambda function to use as a code hook for a campaign.
 * </p>
 */
public class CampaignHook implements Serializable {
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function that
     * Amazon Pinpoint invokes to send messages for a campaign.
     * </p>
     */
    private String lambdaFunctionName;

    /**
     * <p>
     * Specifies which Lambda mode to use when invoking the AWS Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELIVERY, FILTER
     */
    private String mode;

    /**
     * <p>
     * The web URL that Amazon Pinpoint calls to invoke the AWS Lambda function
     * over HTTPS.
     * </p>
     */
    private String webUrl;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function that
     * Amazon Pinpoint invokes to send messages for a campaign.
     * </p>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of the AWS Lambda function
     *         that Amazon Pinpoint invokes to send messages for a campaign.
     *         </p>
     */
    public String getLambdaFunctionName() {
        return lambdaFunctionName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function that
     * Amazon Pinpoint invokes to send messages for a campaign.
     * </p>
     *
     * @param lambdaFunctionName <p>
     *            The name or Amazon Resource Name (ARN) of the AWS Lambda
     *            function that Amazon Pinpoint invokes to send messages for a
     *            campaign.
     *            </p>
     */
    public void setLambdaFunctionName(String lambdaFunctionName) {
        this.lambdaFunctionName = lambdaFunctionName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the AWS Lambda function that
     * Amazon Pinpoint invokes to send messages for a campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctionName <p>
     *            The name or Amazon Resource Name (ARN) of the AWS Lambda
     *            function that Amazon Pinpoint invokes to send messages for a
     *            campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignHook withLambdaFunctionName(String lambdaFunctionName) {
        this.lambdaFunctionName = lambdaFunctionName;
        return this;
    }

    /**
     * <p>
     * Specifies which Lambda mode to use when invoking the AWS Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELIVERY, FILTER
     *
     * @return <p>
     *         Specifies which Lambda mode to use when invoking the AWS Lambda
     *         function.
     *         </p>
     * @see Mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * <p>
     * Specifies which Lambda mode to use when invoking the AWS Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELIVERY, FILTER
     *
     * @param mode <p>
     *            Specifies which Lambda mode to use when invoking the AWS
     *            Lambda function.
     *            </p>
     * @see Mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Specifies which Lambda mode to use when invoking the AWS Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELIVERY, FILTER
     *
     * @param mode <p>
     *            Specifies which Lambda mode to use when invoking the AWS
     *            Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mode
     */
    public CampaignHook withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * <p>
     * Specifies which Lambda mode to use when invoking the AWS Lambda function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELIVERY, FILTER
     *
     * @param mode <p>
     *            Specifies which Lambda mode to use when invoking the AWS
     *            Lambda function.
     *            </p>
     * @see Mode
     */
    public void setMode(Mode mode) {
        this.mode = mode.toString();
    }

    /**
     * <p>
     * Specifies which Lambda mode to use when invoking the AWS Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DELIVERY, FILTER
     *
     * @param mode <p>
     *            Specifies which Lambda mode to use when invoking the AWS
     *            Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mode
     */
    public CampaignHook withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * The web URL that Amazon Pinpoint calls to invoke the AWS Lambda function
     * over HTTPS.
     * </p>
     *
     * @return <p>
     *         The web URL that Amazon Pinpoint calls to invoke the AWS Lambda
     *         function over HTTPS.
     *         </p>
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * <p>
     * The web URL that Amazon Pinpoint calls to invoke the AWS Lambda function
     * over HTTPS.
     * </p>
     *
     * @param webUrl <p>
     *            The web URL that Amazon Pinpoint calls to invoke the AWS
     *            Lambda function over HTTPS.
     *            </p>
     */
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * <p>
     * The web URL that Amazon Pinpoint calls to invoke the AWS Lambda function
     * over HTTPS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webUrl <p>
     *            The web URL that Amazon Pinpoint calls to invoke the AWS
     *            Lambda function over HTTPS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CampaignHook withWebUrl(String webUrl) {
        this.webUrl = webUrl;
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
        if (getLambdaFunctionName() != null)
            sb.append("LambdaFunctionName: " + getLambdaFunctionName() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode() + ",");
        if (getWebUrl() != null)
            sb.append("WebUrl: " + getWebUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLambdaFunctionName() == null) ? 0 : getLambdaFunctionName().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getWebUrl() == null) ? 0 : getWebUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignHook == false)
            return false;
        CampaignHook other = (CampaignHook) obj;

        if (other.getLambdaFunctionName() == null ^ this.getLambdaFunctionName() == null)
            return false;
        if (other.getLambdaFunctionName() != null
                && other.getLambdaFunctionName().equals(this.getLambdaFunctionName()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getWebUrl() == null ^ this.getWebUrl() == null)
            return false;
        if (other.getWebUrl() != null && other.getWebUrl().equals(this.getWebUrl()) == false)
            return false;
        return true;
    }
}
