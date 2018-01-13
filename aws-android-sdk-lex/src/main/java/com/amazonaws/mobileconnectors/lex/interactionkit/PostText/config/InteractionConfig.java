package com.example.prakritibansal.posttextrequest.config;


import com.amazonaws.mobileconnectors.lex.interactionkit.utils.AudioEncoding;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains configuration for SDK's interaction with the users.
 */
public class InteractionConfig {

    /**
     * The Amazon Lex bot name.
     */
    private String botName;

    /**
     * The Amazon Lex bot Alias
     */
    private String botAlias;

    /**
     * User id.
     */
    private String userId;

    /**
     * Session attributes which are common for all requests.
     */
    private Map<String, String> globalSessionAttributes;

    /**
     * Creates a new instance of this object, with no global attributes.
     *
     * @param botName Name of the bot, should match a bot in set in the service.
     * @param botAlias Bot alias.
     */
    public InteractionConfig(String botName, String botAlias, String userId) {
        this(botName, botAlias, userId, null);
    }

    /**
     * Creates a new instance of this object, with no global attributes.
     *
     * @param botName Name of the bot, should match a bot in set in the service.
     * @param botAlias Bot alias.
     */
    public InteractionConfig(String botName, String botAlias) {
        this(botName, botAlias, null);
    }

    /**
     * Creates a new instance of this object, with global attributes.
     *
     * @param botName Name of the bot, should match a bot in set in the service.
     * @param botAlias Bot alias.
     * @param globalSessionAttributes {@link Map}.
     */
    public InteractionConfig(String botName, String botAlias, String userId,
                             Map<String, String> globalSessionAttributes) {
        this.botName = botName;
        this.botAlias = botAlias;
        this.userId = userId;

        if (globalSessionAttributes == null) {
            this.globalSessionAttributes = new HashMap<String, String>();
        } else {
            this.globalSessionAttributes = globalSessionAttributes;
        }

    }

    /**
     * Returns bot name.
     *
     * @return bot name as a {@link String}.
     */
    public String getBotName() {
        return botName;
    }

    /**
     * Sets bot name.
     *
     * @param botName Bot name as a {@link String}.
     */
    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * Returns bot alias.
     *
     * @return bot alias as a {@link String}.
     */
    public String getBotAlias() {
        return botAlias;
    }

    /**
     * Sets bot alias.
     *
     * @param botAlias Bots alias as a {@link String}.
     */
    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * Get the global SessionAtributes
     *
     * @return the global session attributes
     */
    public Map<String, String> getGlobalSessionAttributes() {
        return globalSessionAttributes;
    }

    /**
     * Set the global SessionAtributes
     *
     * @param globalSessionAttributes the global session attributes.
     */
    public void setGlobalSessionAttributes(Map<String, String> globalSessionAttributes) {
        this.globalSessionAttributes = globalSessionAttributes;
    }

    /**
     * Set the global SessionAtributes
     *
     * @param globalSessionAttributes the global session attributes.
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withGlobalSessionAttributes(
            Map<String, String> globalSessionAttributes) {
        this.globalSessionAttributes = globalSessionAttributes;
        return this;
    }

    /**
     * Get the user id
     *
     * @return the userid
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Sets the user id
     *
     * @param userId
     * @return {@link InteractionConfig}
     */
    public InteractionConfig withUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
