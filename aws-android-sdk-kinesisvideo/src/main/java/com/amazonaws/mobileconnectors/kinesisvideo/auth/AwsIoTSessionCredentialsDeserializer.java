package com.amazonaws.mobileconnectors.kinesisvideo.auth;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class AwsIoTSessionCredentialsDeserializer implements JsonDeserializer<AwsIoTSessionCredentials> {

    private static final String CREDENTIALS_ATTRIBUTE = "credentials";

    public AwsIoTSessionCredentials deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
            throws JsonParseException {
        JsonElement content = jsonElement.getAsJsonObject().get(CREDENTIALS_ATTRIBUTE);

        // Deserialize it. You use a new instance of Gson to avoid infinite recursion
        // to this deserializer
        return new Gson().fromJson(content, AwsIoTSessionCredentials.class);
    }
}