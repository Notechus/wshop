package com.notechus.wshop.domain.type;

/**
 * @author notechus.
 */
public enum ParcelStatus {

    RECEIVED("R"),
    IN_PROGRESS("P"),
    NOT_RECEIVED("N");

    //TODO FIXME: consult Logistyka for this

    private String acronym;

    ParcelStatus(String acronym) {
        this.acronym = acronym;
    }
}
