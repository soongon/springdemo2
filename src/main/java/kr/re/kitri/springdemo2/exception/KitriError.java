package kr.re.kitri.springdemo2.exception;

import lombok.Data;

public @Data class KitriError {
    private int errorId;
    private String errorMessage;
    private String infoMessage;

    public KitriError(int errorId, String errorMessage, String infoMessage) {
        this.errorId = errorId;
        this.errorMessage = errorMessage;
        this.infoMessage = infoMessage;
    }
}
