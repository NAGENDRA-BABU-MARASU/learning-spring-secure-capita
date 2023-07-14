package io.learning.securecapita.enumeration;

/*
 * @author: Nagendra
 * version: 1.0.0
 * @created: 13/07/2023 - 14:28
 */
public enum VerificationType {
    ACCOUNT("ACCOUNT"),
    PASSWORD("PASSWORD");

    private final String type;

    VerificationType(String type) { this.type = type; }
    public String getType(){
        return this.type.toLowerCase();
    }
}
