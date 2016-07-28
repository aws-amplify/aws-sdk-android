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

import android.util.Base64;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

/**
 * Utility class for all operations on JWT.
 */
public class CognitoJWTParser {
    private static int HEADER = 0;
    private static int PAYLOAD = 1;
    private static int SIGNATURE = 2;

    /**
     * Returns header for a JWT as a JSON object.
     *
     * @param JWT       REQUIRED: valid JSON Web Token as String.
     * @return header as a JSONObject.
     */
    public static JSONObject getHeader(String JWT) {
        try {
            validateJWT(JWT);
            byte[] sectionDecoded = Base64.decode(JWT.split("\\.")[HEADER], Base64.URL_SAFE);
            String jwtSection = new String(sectionDecoded, "UTF-8");
            return new JSONObject(jwtSection);
        } catch (UnsupportedEncodingException e) {
            throw new CognitoParameterInvalidException(e.getMessage());
        } catch (JSONException e) {
            throw new CognitoParameterInvalidException(e.getMessage());
        } catch (Exception e) {
            throw new CognitoParameterInvalidException("error in parsing JSON");
        }
    }

    /**
     * Returns payload of a JWT as a JSON object.
     *
     * @param JWT       REQUIRED: valid JSON Web Token as String.
     * @return payload as a JSONObject.
     */
    public static JSONObject getPayload(String JWT) {
        try {
            validateJWT(JWT);
            String payload = JWT.split("\\.")[PAYLOAD];
            byte[] sectionDecoded = Base64.decode(payload, Base64.URL_SAFE);
            String jwtSection = new String(sectionDecoded, "UTF-8");
            return new JSONObject(jwtSection);
        } catch (UnsupportedEncodingException e) {
            throw new CognitoParameterInvalidException(e.getMessage());
        } catch (JSONException e) {
            throw new CognitoParameterInvalidException(e.getMessage());
        } catch (Exception e) {
            throw new CognitoParameterInvalidException("error in parsing JSON");
        }
    }

    /**
     * Returns signature of a JWT as a String.
     *
     * @param JWT       REQUIRED: valid JSON Web Token as String.
     * @return signature as a String.
     */
    public static String getSignature(String JWT) {
        try {
            validateJWT(JWT);
            byte[] sectionDecoded = Base64.decode(JWT.split("\\.")[SIGNATURE], Base64.URL_SAFE);
            return new String(sectionDecoded, "UTF-8");
        } catch (Exception e) {
            throw new CognitoParameterInvalidException("error in parsing JSON");
        }
    }

    /**
     * Returns a claim, from the {@code JWT}s' payload, as a String.
     *
     * @param JWT       REQUIRED: valid JSON Web Token as String.
     * @param claim     REQUIRED: claim name as String.
     * @return  claim from the JWT as a String.
     */
    public static String getClaim(String JWT, String claim) {
        try {
            JSONObject payload = getPayload(JWT);
            Object claimValue = payload.get(claim);

            if (claimValue != null) {
                return claimValue.toString();
            }

        } catch (Exception e) {
            throw new CognitoParameterInvalidException("invalid token");
        }
        return null;
    }


    /**
     *  Checks if {@code JWT} is a valid JSON Web Token.
     *
     * @param JWT
     */
    public static void validateJWT(String JWT) {
        // Check if the the JWT has the three parts
        String[] jwtParts = JWT.split("\\.");
        if(jwtParts.length != 3) {
            throw new CognitoParameterInvalidException("not a JSON Web Token");
        }
    }
}
