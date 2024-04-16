package app.nosybe.avis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AvisDTO {
    private final Long id;

    private final String message;

    private final String statut;
}

