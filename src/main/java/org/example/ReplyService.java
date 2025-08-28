package org.example;

import java.util.Locale;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        // TODO: Implement mapping according to README canonical expectations.
        // Requirements:
        // - null or blank -> "Please say something."
        // - For known messages, return exact string for each ReplyType.
        // - For unknown messages, return the 'any other text' mapping.
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }

        String newMessage = message.trim().toLowerCase();
        switch (type) {
            case FORMAL:
                if (newMessage.equals("hi") || newMessage.equals("hello")) {
                    return "Hello. How may I assist you today?";
                } else if (newMessage.equals("how are you")) {
                    return "I am functioning properly. How may I assist you?";
                } else if (newMessage.equals("i need help")) {
                    return "I can assist with that. Please provide more details.";
                } else if (newMessage.equals("can you help me with my account")) {
                    return "Certainly. Please describe the account issue.";
                } else if (newMessage.equals("thanks")) {
                    return "You are welcome.";
                } else if (newMessage.equals("bye")) {
                    return "Goodbye.";
                } else if (newMessage.equals("what is your name")) {
                    return "I am your virtual assistant.";
                } else {
                    return "Could you clarify your request?";
                }
            case FRIENDLY:
                if (newMessage.equals("hi")) {
                    return "Hey there! 😊 How can I help?";
                } else if (newMessage.equals("hello")) {
                    return "Hi! 👋 What’s up?";
                } else if (newMessage.equals("how are you")) {
                    return "Doing great! 😄 How can I help?";
                } else if (newMessage.equals("i need help")) {
                    return "I’ve got you! 🙂 Tell me a bit more.";
                } else if (newMessage.equals("can you help me with my account")) {
                    return "Sure thing! 😊 What’s wrong with the account?";
                } else if (newMessage.equals("thanks")) {
                    return "Anytime! 🙌";
                } else if (newMessage.equals("bye")) {
                    return "See you later! 👋";
                } else if (newMessage.equals("what is your name")) {
                    return "I’m your helper bot 🤖";
                } else {
                    return "Could you tell me more?";
                }
            case CONCISE:
                if (newMessage.equals("hi") || newMessage.equals("hello")) {
                    return "Hello. How can I help?";
                } else if (newMessage.equals("how are you")) {
                    return "I’m good. How can I help?";
                } else if (newMessage.equals("i need help")) {
                    return "Share details; I’ll help.";
                } else if (newMessage.equals("can you help me with my account")) {
                    return "Describe the account issue…";
                } else if (newMessage.equals("thanks")) {
                    return "You’re welcome.";
                } else if (newMessage.equals("bye")) {
                    return "Goodbye.";
                } else if (newMessage.equals("what is your name")) {
                    return "I’m your assistant.";
                } else {
                    return "Please clarify.";
                }
            default:
                return "Please say something.";
        }
//        throw new UnsupportedOperationException("Not implemented yet");
    }}

