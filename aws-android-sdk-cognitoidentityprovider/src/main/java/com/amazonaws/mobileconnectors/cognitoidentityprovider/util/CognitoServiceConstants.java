/*
 *  Copyright 2013-2016 Amazon.com,
 *  Inc. or its affiliates. All Rights Reserved.
 *
 *  Licensed under the Amazon Software License (the "License").
 *  You may not use this file except in compliance with the
 *  License. A copy of the License is located at
 *
 *      http://aws.amazon.com/asl/
 *
 *  or in the "license" file accompanying this file. This file is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, express or implied. See the License
 *  for the specific language governing permissions and
 *  limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.util;

/**
 * All key-words for service calls.
 */
public class CognitoServiceConstants {
    public static String AUTH_TYPE_INIT_USER_SRP                   = "USER_SRP_AUTH";
    public static String AUTH_TYPE_REFRESH_TOKEN                   = "REFRESH_TOKEN_AUTH";
    public static String AUTH_TYPE_INIT_CUSTOM_AUTH                = "CUSTOM_AUTH";
    public static String CHLG_TYPE_SMS_MFA                         = "SMS_MFA";
    public static String CHLG_TYPE_USER_PASSWORD_VERIFIER          = "PASSWORD_VERIFIER";
    public static String CHLG_TYPE_CUSTOM_CHALLENGE                = "CUSTOM_CHALLENGE";
    public static String CHLG_TYPE_DEVICE_SRP_AUTH                 = "DEVICE_SRP_AUTH";
    public static String CHLG_TYPE_DEVICE_PASSWORD_VERIFIER        = "DEVICE_PASSWORD_VERIFIER";
    public static String CHLG_TYPE_NEW_PASSWORD_REQUIRED           = "NEW_PASSWORD_REQUIRED";
    public static String AUTH_PARAM_REFRESH_TOKEN                  = "REFRESH_TOKEN";
    public static String AUTH_PARAM_DEVICE_KEY                     = "DEVICE_KEY";
    public static String AUTH_PARAM_SECRET_HASH                    = "SECRET_HASH";
    public static String AUTH_PARAM_USERNAME                       = "USERNAME";
    public static String AUTH_PARAM_SRP_A                          = "SRP_A";
    public static String AUTH_PARAM_VALIDATION_DATA                = "VALIDATION_DATA";
    public static String AUTH_PARAM_CHALLENGE_NAME                 = "CHALLENGE_NAME";
    public static String AUTH_PARAM_PASSWORD                       = "PASSWORD";
    public static String CHLG_PARAM_SALT                           = "SALT";
    public static String CHLG_PARAM_SRP_B                          = "SRP_B";
    public static String CHLG_PARAM_SECRET_BLOCK                   = "SECRET_BLOCK";
    public static String CHLG_PARAM_USERNAME                       = "USERNAME";
    public static String CHLG_PARAM_DEVICE_KEY                     = "DEVICE_KEY";
    public static String CHLG_PARAM_CODE_DEL_MEDIUM                = "CODE_DELIVERY_DELIVERY_MEDIUM";
    public static String CHLG_PARAM_CODE_DEL_DESTINATION           = "CODE_DELIVERY_DESTINATION";
    public static String CHLG_PARAM_USER_ID_FOR_SRP                = "USER_ID_FOR_SRP";
    public static String CHLG_PARAM_USER_ATTRIBUTE                 = "userAttributes";
    public static String CHLG_PARAM_USER_ATTRIBUTE_PREFIX          = "userAttributes.";
    public static String CHLG_PARAM_REQUIRED_ATTRIBUTE             = "requiredAttributes";
    public static String CHLG_RESP_SMS_MFA_CODE                    = "SMS_MFA_CODE";
    public static String CHLG_RESP_TIMESTAMP                       = "TIMESTAMP";
    public static String CHLG_RESP_PASSWORD_CLAIM_SECRET_BLOCK     = "PASSWORD_CLAIM_SECRET_BLOCK";
    public static String CHLG_RESP_PASSWORD_CLAIM_SIGNATURE        = "PASSWORD_CLAIM_SIGNATURE";
    public static String CHLG_RESP_SECRET_HASH                     = "SECRET_HASH";
    public static String CHLG_RESP_USERNAME                        = "USERNAME";
    public static String CHLG_RESP_SRP_A                           = "SRP_A";
    public static String CHLG_RESP_ANSWER                          = "ANSWER";
    public static String CHLG_RESP_DEVICE_KEY                      = "DEVICE_KEY";
    public static String CHLG_RESP_PASSWORD                        = "PASSWORD";
    public static String CHLG_RESP_NEW_PASSWORD                    = "NEW_PASSWORD";
}
