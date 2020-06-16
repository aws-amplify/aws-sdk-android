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

/**
 * <p>
 * A complex type that contains a Lambda function association.
 * </p>
 */
public class LambdaFunctionAssociation implements Serializable {
    /**
     * <p>
     * The ARN of the Lambda function. You must specify the ARN of a function
     * version; you can't specify a Lambda alias or $LATEST.
     * </p>
     */
    private String lambdaFunctionARN;

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You
     * can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront
     * receives a request from a viewer and before it checks to see whether the
     * requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront
     * forwards a request to your origin. When the requested object is in the
     * edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront
     * receives a response from the origin and before it caches the object in
     * the response. When the requested object is in the edge cache, the
     * function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront
     * returns the requested object to the viewer. The function executes
     * regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the
     * function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>viewer-request, viewer-response, origin-request,
     * origin-response
     */
    private String eventType;

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body
     * content. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in
     * the Amazon CloudFront Developer Guide.
     * </p>
     */
    private Boolean includeBody;

    /**
     * <p>
     * The ARN of the Lambda function. You must specify the ARN of a function
     * version; you can't specify a Lambda alias or $LATEST.
     * </p>
     *
     * @return <p>
     *         The ARN of the Lambda function. You must specify the ARN of a
     *         function version; you can't specify a Lambda alias or $LATEST.
     *         </p>
     */
    public String getLambdaFunctionARN() {
        return lambdaFunctionARN;
    }

    /**
     * <p>
     * The ARN of the Lambda function. You must specify the ARN of a function
     * version; you can't specify a Lambda alias or $LATEST.
     * </p>
     *
     * @param lambdaFunctionARN <p>
     *            The ARN of the Lambda function. You must specify the ARN of a
     *            function version; you can't specify a Lambda alias or $LATEST.
     *            </p>
     */
    public void setLambdaFunctionARN(String lambdaFunctionARN) {
        this.lambdaFunctionARN = lambdaFunctionARN;
    }

    /**
     * <p>
     * The ARN of the Lambda function. You must specify the ARN of a function
     * version; you can't specify a Lambda alias or $LATEST.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaFunctionARN <p>
     *            The ARN of the Lambda function. You must specify the ARN of a
     *            function version; you can't specify a Lambda alias or $LATEST.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionAssociation withLambdaFunctionARN(String lambdaFunctionARN) {
        this.lambdaFunctionARN = lambdaFunctionARN;
        return this;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You
     * can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront
     * receives a request from a viewer and before it checks to see whether the
     * requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront
     * forwards a request to your origin. When the requested object is in the
     * edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront
     * receives a response from the origin and before it caches the object in
     * the response. When the requested object is in the edge cache, the
     * function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront
     * returns the requested object to the viewer. The function executes
     * regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the
     * function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>viewer-request, viewer-response, origin-request,
     * origin-response
     *
     * @return <p>
     *         Specifies the event type that triggers a Lambda function
     *         invocation. You can specify the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>viewer-request</code>: The function executes when
     *         CloudFront receives a request from a viewer and before it checks
     *         to see whether the requested object is in the edge cache.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>origin-request</code>: The function executes only when
     *         CloudFront forwards a request to your origin. When the requested
     *         object is in the edge cache, the function doesn't execute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>origin-response</code>: The function executes after
     *         CloudFront receives a response from the origin and before it
     *         caches the object in the response. When the requested object is
     *         in the edge cache, the function doesn't execute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>viewer-response</code>: The function executes before
     *         CloudFront returns the requested object to the viewer. The
     *         function executes regardless of whether the object was already in
     *         the edge cache.
     *         </p>
     *         <p>
     *         If the origin returns an HTTP status code other than HTTP 200
     *         (OK), the function doesn't execute.
     *         </p>
     *         </li>
     *         </ul>
     * @see EventType
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You
     * can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront
     * receives a request from a viewer and before it checks to see whether the
     * requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront
     * forwards a request to your origin. When the requested object is in the
     * edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront
     * receives a response from the origin and before it caches the object in
     * the response. When the requested object is in the edge cache, the
     * function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront
     * returns the requested object to the viewer. The function executes
     * regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the
     * function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>viewer-request, viewer-response, origin-request,
     * origin-response
     *
     * @param eventType <p>
     *            Specifies the event type that triggers a Lambda function
     *            invocation. You can specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>viewer-request</code>: The function executes when
     *            CloudFront receives a request from a viewer and before it
     *            checks to see whether the requested object is in the edge
     *            cache.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>origin-request</code>: The function executes only when
     *            CloudFront forwards a request to your origin. When the
     *            requested object is in the edge cache, the function doesn't
     *            execute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>origin-response</code>: The function executes after
     *            CloudFront receives a response from the origin and before it
     *            caches the object in the response. When the requested object
     *            is in the edge cache, the function doesn't execute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>viewer-response</code>: The function executes before
     *            CloudFront returns the requested object to the viewer. The
     *            function executes regardless of whether the object was already
     *            in the edge cache.
     *            </p>
     *            <p>
     *            If the origin returns an HTTP status code other than HTTP 200
     *            (OK), the function doesn't execute.
     *            </p>
     *            </li>
     *            </ul>
     * @see EventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You
     * can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront
     * receives a request from a viewer and before it checks to see whether the
     * requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront
     * forwards a request to your origin. When the requested object is in the
     * edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront
     * receives a response from the origin and before it caches the object in
     * the response. When the requested object is in the edge cache, the
     * function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront
     * returns the requested object to the viewer. The function executes
     * regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the
     * function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>viewer-request, viewer-response, origin-request,
     * origin-response
     *
     * @param eventType <p>
     *            Specifies the event type that triggers a Lambda function
     *            invocation. You can specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>viewer-request</code>: The function executes when
     *            CloudFront receives a request from a viewer and before it
     *            checks to see whether the requested object is in the edge
     *            cache.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>origin-request</code>: The function executes only when
     *            CloudFront forwards a request to your origin. When the
     *            requested object is in the edge cache, the function doesn't
     *            execute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>origin-response</code>: The function executes after
     *            CloudFront receives a response from the origin and before it
     *            caches the object in the response. When the requested object
     *            is in the edge cache, the function doesn't execute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>viewer-response</code>: The function executes before
     *            CloudFront returns the requested object to the viewer. The
     *            function executes regardless of whether the object was already
     *            in the edge cache.
     *            </p>
     *            <p>
     *            If the origin returns an HTTP status code other than HTTP 200
     *            (OK), the function doesn't execute.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventType
     */
    public LambdaFunctionAssociation withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You
     * can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront
     * receives a request from a viewer and before it checks to see whether the
     * requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront
     * forwards a request to your origin. When the requested object is in the
     * edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront
     * receives a response from the origin and before it caches the object in
     * the response. When the requested object is in the edge cache, the
     * function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront
     * returns the requested object to the viewer. The function executes
     * regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the
     * function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>viewer-request, viewer-response, origin-request,
     * origin-response
     *
     * @param eventType <p>
     *            Specifies the event type that triggers a Lambda function
     *            invocation. You can specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>viewer-request</code>: The function executes when
     *            CloudFront receives a request from a viewer and before it
     *            checks to see whether the requested object is in the edge
     *            cache.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>origin-request</code>: The function executes only when
     *            CloudFront forwards a request to your origin. When the
     *            requested object is in the edge cache, the function doesn't
     *            execute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>origin-response</code>: The function executes after
     *            CloudFront receives a response from the origin and before it
     *            caches the object in the response. When the requested object
     *            is in the edge cache, the function doesn't execute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>viewer-response</code>: The function executes before
     *            CloudFront returns the requested object to the viewer. The
     *            function executes regardless of whether the object was already
     *            in the edge cache.
     *            </p>
     *            <p>
     *            If the origin returns an HTTP status code other than HTTP 200
     *            (OK), the function doesn't execute.
     *            </p>
     *            </li>
     *            </ul>
     * @see EventType
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType.toString();
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. You
     * can specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>: The function executes when CloudFront
     * receives a request from a viewer and before it checks to see whether the
     * requested object is in the edge cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>: The function executes only when CloudFront
     * forwards a request to your origin. When the requested object is in the
     * edge cache, the function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>: The function executes after CloudFront
     * receives a response from the origin and before it caches the object in
     * the response. When the requested object is in the edge cache, the
     * function doesn't execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>: The function executes before CloudFront
     * returns the requested object to the viewer. The function executes
     * regardless of whether the object was already in the edge cache.
     * </p>
     * <p>
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the
     * function doesn't execute.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>viewer-request, viewer-response, origin-request,
     * origin-response
     *
     * @param eventType <p>
     *            Specifies the event type that triggers a Lambda function
     *            invocation. You can specify the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>viewer-request</code>: The function executes when
     *            CloudFront receives a request from a viewer and before it
     *            checks to see whether the requested object is in the edge
     *            cache.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>origin-request</code>: The function executes only when
     *            CloudFront forwards a request to your origin. When the
     *            requested object is in the edge cache, the function doesn't
     *            execute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>origin-response</code>: The function executes after
     *            CloudFront receives a response from the origin and before it
     *            caches the object in the response. When the requested object
     *            is in the edge cache, the function doesn't execute.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>viewer-response</code>: The function executes before
     *            CloudFront returns the requested object to the viewer. The
     *            function executes regardless of whether the object was already
     *            in the edge cache.
     *            </p>
     *            <p>
     *            If the origin returns an HTTP status code other than HTTP 200
     *            (OK), the function doesn't execute.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventType
     */
    public LambdaFunctionAssociation withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body
     * content. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in
     * the Amazon CloudFront Developer Guide.
     * </p>
     *
     * @return <p>
     *         A flag that allows a Lambda function to have read access to the
     *         body content. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     *         >Accessing the Request Body by Choosing the Include Body
     *         Option</a> in the Amazon CloudFront Developer Guide.
     *         </p>
     */
    public Boolean isIncludeBody() {
        return includeBody;
    }

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body
     * content. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in
     * the Amazon CloudFront Developer Guide.
     * </p>
     *
     * @return <p>
     *         A flag that allows a Lambda function to have read access to the
     *         body content. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     *         >Accessing the Request Body by Choosing the Include Body
     *         Option</a> in the Amazon CloudFront Developer Guide.
     *         </p>
     */
    public Boolean getIncludeBody() {
        return includeBody;
    }

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body
     * content. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in
     * the Amazon CloudFront Developer Guide.
     * </p>
     *
     * @param includeBody <p>
     *            A flag that allows a Lambda function to have read access to
     *            the body content. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     *            >Accessing the Request Body by Choosing the Include Body
     *            Option</a> in the Amazon CloudFront Developer Guide.
     *            </p>
     */
    public void setIncludeBody(Boolean includeBody) {
        this.includeBody = includeBody;
    }

    /**
     * <p>
     * A flag that allows a Lambda function to have read access to the body
     * content. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     * >Accessing the Request Body by Choosing the Include Body Option</a> in
     * the Amazon CloudFront Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param includeBody <p>
     *            A flag that allows a Lambda function to have read access to
     *            the body content. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html"
     *            >Accessing the Request Body by Choosing the Include Body
     *            Option</a> in the Amazon CloudFront Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaFunctionAssociation withIncludeBody(Boolean includeBody) {
        this.includeBody = includeBody;
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
        if (getLambdaFunctionARN() != null)
            sb.append("LambdaFunctionARN: " + getLambdaFunctionARN() + ",");
        if (getEventType() != null)
            sb.append("EventType: " + getEventType() + ",");
        if (getIncludeBody() != null)
            sb.append("IncludeBody: " + getIncludeBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLambdaFunctionARN() == null) ? 0 : getLambdaFunctionARN().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeBody() == null) ? 0 : getIncludeBody().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionAssociation == false)
            return false;
        LambdaFunctionAssociation other = (LambdaFunctionAssociation) obj;

        if (other.getLambdaFunctionARN() == null ^ this.getLambdaFunctionARN() == null)
            return false;
        if (other.getLambdaFunctionARN() != null
                && other.getLambdaFunctionARN().equals(this.getLambdaFunctionARN()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null
                && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getIncludeBody() == null ^ this.getIncludeBody() == null)
            return false;
        if (other.getIncludeBody() != null
                && other.getIncludeBody().equals(this.getIncludeBody()) == false)
            return false;
        return true;
    }
}
