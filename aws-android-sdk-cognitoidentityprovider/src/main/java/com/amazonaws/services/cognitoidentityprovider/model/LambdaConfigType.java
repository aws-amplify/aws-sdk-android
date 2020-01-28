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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the configuration for AWS Lambda triggers.
 * </p>
 */
public class LambdaConfigType implements Serializable {
    /**
     * <p>
     * A pre-registration AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String preSignUp;

    /**
     * <p>
     * A custom Message AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String customMessage;

    /**
     * <p>
     * A post-confirmation AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String postConfirmation;

    /**
     * <p>
     * A pre-authentication AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String preAuthentication;

    /**
     * <p>
     * A post-authentication AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String postAuthentication;

    /**
     * <p>
     * Defines the authentication challenge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String defineAuthChallenge;

    /**
     * <p>
     * Creates an authentication challenge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String createAuthChallenge;

    /**
     * <p>
     * Verifies the authentication challenge response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String verifyAuthChallengeResponse;

    /**
     * <p>
     * A Lambda trigger that is invoked before token generation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String preTokenGeneration;

    /**
     * <p>
     * The user migration Lambda config type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String userMigration;

    /**
     * <p>
     * A pre-registration AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         A pre-registration AWS Lambda trigger.
     *         </p>
     */
    public String getPreSignUp() {
        return preSignUp;
    }

    /**
     * <p>
     * A pre-registration AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param preSignUp <p>
     *            A pre-registration AWS Lambda trigger.
     *            </p>
     */
    public void setPreSignUp(String preSignUp) {
        this.preSignUp = preSignUp;
    }

    /**
     * <p>
     * A pre-registration AWS Lambda trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param preSignUp <p>
     *            A pre-registration AWS Lambda trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withPreSignUp(String preSignUp) {
        this.preSignUp = preSignUp;
        return this;
    }

    /**
     * <p>
     * A custom Message AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         A custom Message AWS Lambda trigger.
     *         </p>
     */
    public String getCustomMessage() {
        return customMessage;
    }

    /**
     * <p>
     * A custom Message AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param customMessage <p>
     *            A custom Message AWS Lambda trigger.
     *            </p>
     */
    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    /**
     * <p>
     * A custom Message AWS Lambda trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param customMessage <p>
     *            A custom Message AWS Lambda trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }

    /**
     * <p>
     * A post-confirmation AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         A post-confirmation AWS Lambda trigger.
     *         </p>
     */
    public String getPostConfirmation() {
        return postConfirmation;
    }

    /**
     * <p>
     * A post-confirmation AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param postConfirmation <p>
     *            A post-confirmation AWS Lambda trigger.
     *            </p>
     */
    public void setPostConfirmation(String postConfirmation) {
        this.postConfirmation = postConfirmation;
    }

    /**
     * <p>
     * A post-confirmation AWS Lambda trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param postConfirmation <p>
     *            A post-confirmation AWS Lambda trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withPostConfirmation(String postConfirmation) {
        this.postConfirmation = postConfirmation;
        return this;
    }

    /**
     * <p>
     * A pre-authentication AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         A pre-authentication AWS Lambda trigger.
     *         </p>
     */
    public String getPreAuthentication() {
        return preAuthentication;
    }

    /**
     * <p>
     * A pre-authentication AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param preAuthentication <p>
     *            A pre-authentication AWS Lambda trigger.
     *            </p>
     */
    public void setPreAuthentication(String preAuthentication) {
        this.preAuthentication = preAuthentication;
    }

    /**
     * <p>
     * A pre-authentication AWS Lambda trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param preAuthentication <p>
     *            A pre-authentication AWS Lambda trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withPreAuthentication(String preAuthentication) {
        this.preAuthentication = preAuthentication;
        return this;
    }

    /**
     * <p>
     * A post-authentication AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         A post-authentication AWS Lambda trigger.
     *         </p>
     */
    public String getPostAuthentication() {
        return postAuthentication;
    }

    /**
     * <p>
     * A post-authentication AWS Lambda trigger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param postAuthentication <p>
     *            A post-authentication AWS Lambda trigger.
     *            </p>
     */
    public void setPostAuthentication(String postAuthentication) {
        this.postAuthentication = postAuthentication;
    }

    /**
     * <p>
     * A post-authentication AWS Lambda trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param postAuthentication <p>
     *            A post-authentication AWS Lambda trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withPostAuthentication(String postAuthentication) {
        this.postAuthentication = postAuthentication;
        return this;
    }

    /**
     * <p>
     * Defines the authentication challenge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         Defines the authentication challenge.
     *         </p>
     */
    public String getDefineAuthChallenge() {
        return defineAuthChallenge;
    }

    /**
     * <p>
     * Defines the authentication challenge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param defineAuthChallenge <p>
     *            Defines the authentication challenge.
     *            </p>
     */
    public void setDefineAuthChallenge(String defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
    }

    /**
     * <p>
     * Defines the authentication challenge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param defineAuthChallenge <p>
     *            Defines the authentication challenge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withDefineAuthChallenge(String defineAuthChallenge) {
        this.defineAuthChallenge = defineAuthChallenge;
        return this;
    }

    /**
     * <p>
     * Creates an authentication challenge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         Creates an authentication challenge.
     *         </p>
     */
    public String getCreateAuthChallenge() {
        return createAuthChallenge;
    }

    /**
     * <p>
     * Creates an authentication challenge.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param createAuthChallenge <p>
     *            Creates an authentication challenge.
     *            </p>
     */
    public void setCreateAuthChallenge(String createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
    }

    /**
     * <p>
     * Creates an authentication challenge.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param createAuthChallenge <p>
     *            Creates an authentication challenge.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withCreateAuthChallenge(String createAuthChallenge) {
        this.createAuthChallenge = createAuthChallenge;
        return this;
    }

    /**
     * <p>
     * Verifies the authentication challenge response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         Verifies the authentication challenge response.
     *         </p>
     */
    public String getVerifyAuthChallengeResponse() {
        return verifyAuthChallengeResponse;
    }

    /**
     * <p>
     * Verifies the authentication challenge response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param verifyAuthChallengeResponse <p>
     *            Verifies the authentication challenge response.
     *            </p>
     */
    public void setVerifyAuthChallengeResponse(String verifyAuthChallengeResponse) {
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
    }

    /**
     * <p>
     * Verifies the authentication challenge response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param verifyAuthChallengeResponse <p>
     *            Verifies the authentication challenge response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withVerifyAuthChallengeResponse(String verifyAuthChallengeResponse) {
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
        return this;
    }

    /**
     * <p>
     * A Lambda trigger that is invoked before token generation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         A Lambda trigger that is invoked before token generation.
     *         </p>
     */
    public String getPreTokenGeneration() {
        return preTokenGeneration;
    }

    /**
     * <p>
     * A Lambda trigger that is invoked before token generation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param preTokenGeneration <p>
     *            A Lambda trigger that is invoked before token generation.
     *            </p>
     */
    public void setPreTokenGeneration(String preTokenGeneration) {
        this.preTokenGeneration = preTokenGeneration;
    }

    /**
     * <p>
     * A Lambda trigger that is invoked before token generation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param preTokenGeneration <p>
     *            A Lambda trigger that is invoked before token generation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withPreTokenGeneration(String preTokenGeneration) {
        this.preTokenGeneration = preTokenGeneration;
        return this;
    }

    /**
     * <p>
     * The user migration Lambda config type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The user migration Lambda config type.
     *         </p>
     */
    public String getUserMigration() {
        return userMigration;
    }

    /**
     * <p>
     * The user migration Lambda config type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param userMigration <p>
     *            The user migration Lambda config type.
     *            </p>
     */
    public void setUserMigration(String userMigration) {
        this.userMigration = userMigration;
    }

    /**
     * <p>
     * The user migration Lambda config type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param userMigration <p>
     *            The user migration Lambda config type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfigType withUserMigration(String userMigration) {
        this.userMigration = userMigration;
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
        if (getPreSignUp() != null)
            sb.append("PreSignUp: " + getPreSignUp() + ",");
        if (getCustomMessage() != null)
            sb.append("CustomMessage: " + getCustomMessage() + ",");
        if (getPostConfirmation() != null)
            sb.append("PostConfirmation: " + getPostConfirmation() + ",");
        if (getPreAuthentication() != null)
            sb.append("PreAuthentication: " + getPreAuthentication() + ",");
        if (getPostAuthentication() != null)
            sb.append("PostAuthentication: " + getPostAuthentication() + ",");
        if (getDefineAuthChallenge() != null)
            sb.append("DefineAuthChallenge: " + getDefineAuthChallenge() + ",");
        if (getCreateAuthChallenge() != null)
            sb.append("CreateAuthChallenge: " + getCreateAuthChallenge() + ",");
        if (getVerifyAuthChallengeResponse() != null)
            sb.append("VerifyAuthChallengeResponse: " + getVerifyAuthChallengeResponse() + ",");
        if (getPreTokenGeneration() != null)
            sb.append("PreTokenGeneration: " + getPreTokenGeneration() + ",");
        if (getUserMigration() != null)
            sb.append("UserMigration: " + getUserMigration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreSignUp() == null) ? 0 : getPreSignUp().hashCode());
        hashCode = prime * hashCode
                + ((getCustomMessage() == null) ? 0 : getCustomMessage().hashCode());
        hashCode = prime * hashCode
                + ((getPostConfirmation() == null) ? 0 : getPostConfirmation().hashCode());
        hashCode = prime * hashCode
                + ((getPreAuthentication() == null) ? 0 : getPreAuthentication().hashCode());
        hashCode = prime * hashCode
                + ((getPostAuthentication() == null) ? 0 : getPostAuthentication().hashCode());
        hashCode = prime * hashCode
                + ((getDefineAuthChallenge() == null) ? 0 : getDefineAuthChallenge().hashCode());
        hashCode = prime * hashCode
                + ((getCreateAuthChallenge() == null) ? 0 : getCreateAuthChallenge().hashCode());
        hashCode = prime
                * hashCode
                + ((getVerifyAuthChallengeResponse() == null) ? 0
                        : getVerifyAuthChallengeResponse().hashCode());
        hashCode = prime * hashCode
                + ((getPreTokenGeneration() == null) ? 0 : getPreTokenGeneration().hashCode());
        hashCode = prime * hashCode
                + ((getUserMigration() == null) ? 0 : getUserMigration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaConfigType == false)
            return false;
        LambdaConfigType other = (LambdaConfigType) obj;

        if (other.getPreSignUp() == null ^ this.getPreSignUp() == null)
            return false;
        if (other.getPreSignUp() != null
                && other.getPreSignUp().equals(this.getPreSignUp()) == false)
            return false;
        if (other.getCustomMessage() == null ^ this.getCustomMessage() == null)
            return false;
        if (other.getCustomMessage() != null
                && other.getCustomMessage().equals(this.getCustomMessage()) == false)
            return false;
        if (other.getPostConfirmation() == null ^ this.getPostConfirmation() == null)
            return false;
        if (other.getPostConfirmation() != null
                && other.getPostConfirmation().equals(this.getPostConfirmation()) == false)
            return false;
        if (other.getPreAuthentication() == null ^ this.getPreAuthentication() == null)
            return false;
        if (other.getPreAuthentication() != null
                && other.getPreAuthentication().equals(this.getPreAuthentication()) == false)
            return false;
        if (other.getPostAuthentication() == null ^ this.getPostAuthentication() == null)
            return false;
        if (other.getPostAuthentication() != null
                && other.getPostAuthentication().equals(this.getPostAuthentication()) == false)
            return false;
        if (other.getDefineAuthChallenge() == null ^ this.getDefineAuthChallenge() == null)
            return false;
        if (other.getDefineAuthChallenge() != null
                && other.getDefineAuthChallenge().equals(this.getDefineAuthChallenge()) == false)
            return false;
        if (other.getCreateAuthChallenge() == null ^ this.getCreateAuthChallenge() == null)
            return false;
        if (other.getCreateAuthChallenge() != null
                && other.getCreateAuthChallenge().equals(this.getCreateAuthChallenge()) == false)
            return false;
        if (other.getVerifyAuthChallengeResponse() == null
                ^ this.getVerifyAuthChallengeResponse() == null)
            return false;
        if (other.getVerifyAuthChallengeResponse() != null
                && other.getVerifyAuthChallengeResponse().equals(
                        this.getVerifyAuthChallengeResponse()) == false)
            return false;
        if (other.getPreTokenGeneration() == null ^ this.getPreTokenGeneration() == null)
            return false;
        if (other.getPreTokenGeneration() != null
                && other.getPreTokenGeneration().equals(this.getPreTokenGeneration()) == false)
            return false;
        if (other.getUserMigration() == null ^ this.getUserMigration() == null)
            return false;
        if (other.getUserMigration() != null
                && other.getUserMigration().equals(this.getUserMigration()) == false)
            return false;
        return true;
    }
}
