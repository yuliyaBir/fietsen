package be.vdab.fietsen.dto;

import be.vdab.fietsen.domain.Campus;
import be.vdab.fietsen.domain.Geslacht;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record NieuweDocent(@NotBlank String voornaam,
                           @NotBlank String familienaam,
                           @NotNull @PositiveOrZero BigDecimal wedde,
                           @NotNull @Email String emailAdres,
                           @NotNull Geslacht geslacht,
                           @Positive long campusId) {
}
