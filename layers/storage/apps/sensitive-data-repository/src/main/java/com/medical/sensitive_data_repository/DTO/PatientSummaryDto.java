package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record PatientSummaryDto(List<EncounterSummaryDto> encounters, String currentObservationStatus, String currentCareStatus, Instant updatedAt) {
    public PatientSummaryDto {
        encounters = DtoLists.immutable(encounters);
    }
}

