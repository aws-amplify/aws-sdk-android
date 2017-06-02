/*
 * Copyright 2013-2017 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoauth.util;

import android.util.Base64;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

import android.util.Base64;
import android.util.Log;

import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidParameterException;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;

/**
 * Utility class for all operations on JWT.
 */
public class JWTParser {
    private static int HEADER = 0;
    private static int PAYLOAD = 1;
    private static int SIGNATURE = 2;
    private static int JWT_PARTS = 3;

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
        } catch (Exception e) {
            throw new AuthInvalidParameterException("error while parsing JSON", e);
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
        } catch (Exception e) {
            throw new AuthInvalidParameterException("error while parsing JSON", e);
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
            throw new AuthInvalidParameterException("error while parsing JSON", e);
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
            throw new AuthInvalidParameterException("error while parsing JSON", e);
        }
        return null;
    }

    /**
     * Checks if {@code JWT} is a valid JSON Web Token.
     * @param JWT Required: JWT for validation.
     */
    public static void validateJWT(String JWT) {
        // JWT have atleast three parts
        String[] jwtParts = JWT.split("\\.");

        if(jwtParts.length < JWT_PARTS) {
            throw new AuthInvalidParameterException("Not a JSON Web Token");
        }
    }
}

