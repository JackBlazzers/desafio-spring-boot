package co.api.gestiontareas.domain.model.common.exception;

import lombok.Getter;

@Getter
public enum codigoError {
    FOUND(302),
    NOT_FOUND(404);

    private final Integer code;

    codigoError(Integer code) {
        this.code = code;
    }
}
